package homework9;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public void addGreenhouse() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Size: ");
        String size = scanner.nextLine();
        System.out.print("Location: ");
        String location = scanner.nextLine();

        String sql = "INSERT INTO Greenhouse (Name, Size, Location) VALUES (?, ?, ?)";
        try (PreparedStatement statement = CreateConnection.getConnection().prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, size);
            statement.setString(3, location);
            statement.executeUpdate();
            System.out.println("Greenhouse added to the table");
        }
    }

    public void updateGreenhouse() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID of the Greenhouse to update");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("New name: ");
        String name = scanner.nextLine();
        System.out.print("New size: ");
        String size = scanner.nextLine();
        System.out.print("New location: ");
        String location = scanner.nextLine();

        String sql = "UPDATE Greenhouse SET Name = ?, Size = ?, Location = ? WHERE ID = ?";
        try (PreparedStatement statement = CreateConnection.getConnection().prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, size);
            statement.setString(3, location);
            statement.setInt(4, id);
            int res = statement.executeUpdate();
            if (res > 0) {
                System.out.println("Greenhouse updated successfully");
            } else {
                System.out.println("No greenhouse with ID " + id);
            }
        }
    }

    public void deleteGreenhouse() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID of the Greenhouse to delete ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM Greenhouse WHERE ID = ?";
        try (PreparedStatement statement = CreateConnection.getConnection().prepareStatement(sql)) {
            statement.setInt(1, id);
            int res = statement.executeUpdate();
            if (res > 0) {
                System.out.println("Greenhouse deleted successfully");
            } else {
                System.out.println("No greenhouse found with ID " + id);
            }
        }
    }

    public void searchGreenhouse() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name pattern: ");
        String namePattern = scanner.nextLine();
        System.out.print("Enter location from: ");
        String locationFrom = scanner.nextLine();
        System.out.print("Enter location to: ");
        String locationTo = scanner.nextLine();

        String sql = "SELECT ID, Name, Size, Location FROM Greenhouse WHERE " +
                "Name LIKE ? AND Location BETWEEN ? AND ?";
        try (PreparedStatement statement = CreateConnection.getConnection().prepareStatement(sql)) {
            statement.setString(1, "%" + namePattern + "%");
            statement.setString(2, locationFrom);
            statement.setString(3, locationTo);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int id = result.getInt("ID");
                String name = result.getString("Name");
                String size = result.getString("Size");
                String location = result.getString("Location");
                System.out.printf("%d\t%s\t%s\t%s\n", id, name, size, location);
            }
        }
    }

    public void createTable() throws SQLException {
        String sql = "CREATE TABLE New (ID INT PRIMARY KEY IDENTITY, Name VARCHAR(50), Size VARCHAR(50), Location VARCHAR(50))";
        try (PreparedStatement statement = CreateConnection.getConnection().prepareStatement(sql)) {
            statement.execute();
            System.out.println("Table created");
        }
    }

    public void clearTable() throws SQLException {
        String sql = "TRUNCATE TABLE Greenhouse";
        try (PreparedStatement statement = CreateConnection.getConnection().prepareStatement(sql)) {
            int res = statement.executeUpdate();
            System.out.println("Deleted " + res + " records from Greenhouse table");
        }
    }

    public void joinTables() throws SQLException {
        String sql = "SELECT\n" +
                "    p.ID AS [Plant ID],\n" +
                "    p.Name AS [Plant name],\n" +
                "    p.Type AS [Plant type],\n" +
                "    p.Region AS [Plant region],\n" +
                "    g.ID AS [Greenhouse ID],\n" +
                "    g.Name AS [Greenhouse name],\n" +
                "    g.Size AS [Greenhouse size],\n" +
                "    g.Location AS [Greenhouse location],\n" +
                "    gd.[Responsible for greenhouse],\n" +
                "    gd.Name AS [Gardener name],\n" +
                "    gd.Surname AS [Gardener surname],\n" +
                "    gd.Age AS [Gardener age]\n" +
                "FROM\n" +
                "    Greenhouse.dbo.[Plants in Greenhouse] r\n" +
                "    JOIN Greenhouse.dbo.Plant p ON p.ID = r.[Plant ID]\n" +
                "    JOIN Greenhouse.dbo.Greenhouse g ON g.ID = r.[Greenhouse ID]\n" +
                "    JOIN Greenhouse.dbo.Gardener gd ON gd.[Responsible for greenhouse] = r.[Greenhouse ID]\n" +
                "\tORDER BY [Greenhouse Name] DESC;";
        try (PreparedStatement statement = CreateConnection.getConnection().prepareStatement(sql)) {
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                String id = result.getString("Plant ID");
                String name = result.getString("Plant name");
                String type = result.getString("Plant type");
                String region = result.getString("Plant region");
                String greenhouseId = result.getString("Greenhouse ID");
                String greenhouseName = result.getString("Greenhouse name");
                String greenhouseSize = result.getString("Greenhouse size");
                String location = result.getString("Greenhouse location");
                String responsible = result.getString("Responsible for greenhouse");
                String gardenerName = result.getString("Gardener name");
                String gardenerSurname = result.getString("Gardener surname");
                String gardenerAge = result.getString("Gardener age");
                System.out.printf("%s\t%s\t%s\n", id, name, type, region, greenhouseId, greenhouseName, greenhouseSize, location, responsible, gardenerName, gardenerSurname, gardenerAge);
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Program program = new Program();
        try {
            boolean exit = false;
            while (!exit) {

                System.out.println("Choose an option:");
                System.out.println("1. Add a greenhouse record");
                System.out.println("2. Update a greenhouse record");
                System.out.println("3. Delete a greenhouse record");
                System.out.println("4. Search for greenhouse records");
                System.out.println("5. Search for greenhouse records");
                System.out.println("6. Search for greenhouse records");
                System.out.println("7. Search for greenhouse records");
                System.out.println("8. Exit");

                try {
                    int option = scanner.nextInt();

                    switch (option) {
                        case 1:
                            program.addGreenhouse();
                            break;
                        case 2:
                            program.updateGreenhouse();
                            break;
                        case 3:
                            program.deleteGreenhouse();
                            break;
                        case 4:
                            program.searchGreenhouse();
                            break;
                        case 5:
                            program.createTable();
                            break;
                        case 6:
                            program.clearTable();
                            break;
                        case 7:
                            program.joinTables();
                            break;
                        case 8:
                            exit = true;
                            break;
                        default:
                            System.out.println("Enter values 1, 2, 3, 4, 5, 6, 7, 8");

                    }
                } catch (InputMismatchException e) {
                    System.out.println("Enter values 1, 2, 3, 4, 5, 6, 7, 8");
                    scanner.nextLine();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}