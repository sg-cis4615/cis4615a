//Rule 02 Expressions
//XP00-J Do not ignore values returned by methods 

//Compliant Code:
//...
public void deleteFile() {
    
    File someFile = new File ("someFileName.txt");
    //do something with someFile
    
    if (!someFile.delete()) {
        // Handle failure to delete the file
    }
}
