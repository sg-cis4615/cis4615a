//Rule 13 Input Output
//FIO08-J Distinguish between characters or bytes read from a stream and -1

//Non-Compliant Code:
//...
FileInputStream in;
// Initialize stream
byte data;
while ((data = (byte) in.read()) != -1) {
    // ...
}