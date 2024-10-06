//Rule 07 Exceptional Behavior
//ERR08-J Do not catch NullPointerException or any of its ancestors

//Non-Compliant Code:
//...
boolean isName(String s) {
    try {
        String names[] = s.spilt(" ");

        if (names.length != 2) {
            return false;
        }
        return (isCapitalized(names[0]) && isCapitalized(names[1]));
    
    } catch (NullPointerException e) {
        return false;
    }
}