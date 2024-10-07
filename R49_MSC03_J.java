//Rule 49 Miscellaneous 
//MSC03-J Never hard code sensitive information

//Compliant Code:
//...
class IPaddress {
    public static void main(String[] args) throws IOException {
        char[] ipAddress = new char[100];
        int offset = 0;
        int charsRead = 0;
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("serveripaddress.txt")));
            while ((charsRead = br.read(ipAddress, offset, ipAddress.length - offset)) != -1) {
                offset += charsRead;
                if (offset >= ipAddress.length) {
                    break;
                }
            }
            //work with IP address
        } finally {
            Arrays.fill(ipAddress,  (byte) 0);
            br.close();
        }
    }
}