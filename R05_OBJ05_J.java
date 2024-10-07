//Rule 05 Object Orientation
//OBJ05-J Do not return references to private mutable class members

//Compliant Code:
//...
class MutableClass {
    private Date d;

    public MutableClass() {
        d = new Date();
    }

    public Date getDate() {
        return (Date)d.clone();
    }
}