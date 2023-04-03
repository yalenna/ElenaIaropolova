package Homework3;

public class Author {

    int ID_auth;
    String AuthName;

    Author( int ID_auth, String AuthName ) {
        this.ID_auth = ID_auth;
        this.AuthName = AuthName;
    }

    public String getAuthorName() {
        return AuthName;
    }


    public String toString() {
        String authInf = AuthName;
        return authInf;
    }

}
