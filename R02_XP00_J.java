//Rule 02 Expressions
//XP00-J Do not ignore values returned by methods 

//Non-Compliant Code:
//...
public void deleteFile() {
    
    File someFile = new File ("someFileName.txt");
    //do something with someFile
    someFile.delete();
}
