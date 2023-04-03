package Homework3;

public class Publisher {
    int ID_pub;
    String PubName;
    String PubAddress;


    Publisher( int ID_pub, String PubName, String PubAddress ) {
        this.ID_pub = ID_pub;
        this.PubName = PubName;
        this.PubAddress = PubAddress;
    }

    public String getPublisherName() {
        return PubName;
    }

    public int getPublisherID() {
        return ID_pub;
    }

    public String getPublisherAddress() {
        return PubAddress;
    }

    public void setPublisherAddress( String PubAddress ) {
        this.PubAddress = PubAddress;
        System.out.println("Updated publisher's address is: " + PubAddress);
    }

}
