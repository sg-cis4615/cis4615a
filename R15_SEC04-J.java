//Rule 15 Platform Security
//SEC04-J Protect sensitive operations with security manager checks

//Non-Compliant Code:
//...
class SensitiveHash {
    private Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
   
    public void removeEntry(Object key) {
        ht.remove(key);
    }
}