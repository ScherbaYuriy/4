class Main {
    public static void main(String[] args) {


        Astronavt astronavt = new Astronavt("Yra", 19, 70, 3);

        SpaceModule spaceModule = new SpaceModule("Apolo", 70, 1000);

        SpaceStation spaiseStation = new SpaceStation("Станція", 1000, 100, 3, 4);
        //SpaceStation spaiseStation1 = new SpaceStation("Stanciya",100,1111, 45, 3);


        Experement experement = new Experement(1);

        experement.test();


        spaiseStation.metod(10);
        astronavt.demoMetod();
    }
}