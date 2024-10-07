//Rule 13 Input Output
//FIO08-J Distinguish between characters or bytes read from a stream and -1

//Compliant Code:
//...
FileInputStream in;
// Initialize stream
int inbuff;
byte data;
while ((inbuff = in.read()) != -1) {
    data = (byte) inbuff;
    // ... 
}