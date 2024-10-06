//Rule 49 Miscellaneous 
//MSC03-J Never hard code sensitive information

//Non-Compliant Code:
//...
class IPaddress {
    String ipAddress = new String("172.16.254.1");
    public static void main(String[] args) {
        //...
    }
}