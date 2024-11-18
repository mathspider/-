package Week12;

public class Pot {
   private  String value;
   private  boolean isOperator;

    public Pot(String value, boolean isOperator) {
        this.value = value;
        this.isOperator = isOperator;
    }

    public String getValue() {
        return value;
    }

    public boolean isOperator() {
        return isOperator;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setOperator(boolean operator) {
        isOperator = operator;
    }
}
