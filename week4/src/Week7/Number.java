package Week7;

public class Number {
    private  int n1;
    private  int n2;
    public  Number(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    public  int addition(){
        return  n1+n2;
    }
    public  int subtration(){
        return  n1-n2;
    }
    public  int multiplication(){
        return n1*n2;
    }
    public  double division(){
        return  n1/n2*1.0;
    }
}
