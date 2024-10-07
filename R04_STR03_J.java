//Rule 04 Characters and Strings
//STR03-J Do not encode noncharacter data as a string

//Compliant Code:
//...
BigInteger x = new BigInteger("530500452766");
String s = x.toString();  // Valid character data
byte[] byteArray = s.getBytes();
String ns = new String(byteArray); 
x = new BigInteger(ns);