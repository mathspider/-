package Week9;

public class Student implements People{
    private String name;
    private  double weight;
    private double hight;

    public Student(String name, double weight, double hight) {
        this.name = name;
        this.weight = weight;
        this.hight = hight;
    }

    @Override
    public double getweight() {
        return this.weight;
    }

    @Override
    public double gethight() {
        return this.hight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", hight=" + hight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

}
