class SpaceModule {
    private String name;
    private double weight;
    private int sizeCargo;


    public SpaceModule(String name, double weight, int sizeCargo) {
        this.name = name;
        this.weight = weight;
        this.sizeCargo = sizeCargo;
    }

    public SpaceModule() {}


    private void hello() {
        System.out.println("Привіт я космічний модуль  " + name);
    }

    void helloH(){
        hello();
    }



    private boolean bul(int cargo) {
        if (cargo <= sizeCargo) {
            return true;
        } else return false;
    }

    private  boolean bul(double cargo) {
        if (cargo <= sizeCargo) {
            return true;
        } else return false;
    }



    boolean aBoolean(double cargo){
        return bul(cargo);
    }
    boolean bBoolean(int cargo){
        return bul(cargo);
    }







    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getSizeCargo() {
        return sizeCargo;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSizeCargo(int sizeCargo) {
        this.sizeCargo = sizeCargo;
    }


}
