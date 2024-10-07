//Rule 07 Exceptional Behavior
//ERR08-J Do not catch NullPointerException or any of its ancestors

//Compliant Code:
//...
boolean isName(String s) {
    if (s == null) {
        return false;
    }
    
    String names[] = s.split(" ");
    
    if (names.length != 2) {
        return false;
    }

    return (isCapitalized(names[0]) && isCapitalized(names[1]));
}