package Week9;

public class Collection <T>{
    private T[]date;

    public Collection(T[] date) {
        this.date = date;
    }

    public boolean IsEmpty(){
        boolean is=true;
        for (int i = 0; i < date.length; i++) {
            if (date[i]!=null)
                is=false;
            break;
        }
        return is;
    }
    public  void makeEmpty(){
        for (int i = 0; i < date.length; i++) {
            date[i]=null;
        }
    }
    public boolean insert(int index,T t){
        try {
            T[] newdate = (T[]) new Object[date.length + 1];
            for (int i = 0; i < index; i++) {
                newdate[i] = date[i];
            }
            date[index] = t;
            for (int i = index; i < date.length; i++) {
                newdate[i + 1] = date[i];
                return true;
            }
        }catch (Exception e){
         e.printStackTrace();
        }
       return false;
    }
    public boolean remove(int index,T t){
        try {
            T newdate[]=(T[]) new Object[date.length-1];
            for (int i = 0; i <index; i++) {
                newdate[i]=date[i];
            }
            for (int i = index; i < date.length-1; i++) {
                newdate[i]=date[i+1];
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean isPresent(T t){
        boolean is=false;
        for (T t1 : date) {
            if (t1.equals(t));
            is=true;
        }
        return is;
    }
}
