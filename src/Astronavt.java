class Astronavt extends Experement {
    private String name;
    private int age;
    private double weight;

    public Astronavt(String name, int age, double weight, int a) {
        super(a);
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void hello() {
        System.out.println("Привіт я астронавт" + name);
    }

    double faktor(double i) {
        if (i == 1) {
            return 1;
        } else {
            double x = faktor(i - 1) + i;
            return x;
        }
    }

    void demo(SpaceModule spaceModule, SpaceStation spaiseStation) {
        System.out.println(spaceModule.getWeight() + spaiseStation.getAge());
    }

    int suma(int a, int b) {

        return a + b;
    }

    double suma(double a, double b) {
        return a + b;

    }

    void demoMetod() {
        System.out.println("Астронавт метод");
        test();
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
