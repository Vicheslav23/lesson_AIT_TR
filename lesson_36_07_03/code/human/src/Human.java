public class Human {
    String sex;
    int age;
    double weight;
    double height;
    String race;

    @Override
    public String toString() {
        return "Human{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", race='" + race + '\'' +
                '}';
    }

}
