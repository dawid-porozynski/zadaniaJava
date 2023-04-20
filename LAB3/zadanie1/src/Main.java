//zadanie1
class  Machine {
    protected String Brand;
    protected String Name;
    protected int Engine_Capacity;

    protected enum Engine_Type {
        DIESEL,
        GAS,
        ELECTRIC,
        HYBRID
    }

    //zadanie2
    class Locomotive extends Machine {
        private int Speed;
        private String Load;

        public Locomotive() {
            Name = "TRAXX MS";
            Brand = " Alstom";
            Engine_Capacity = 2300;
            Speed = 140;
            Load = "Pasażerowie";
        }

        public void Print_locomotive() {
            System.out.println("Nazwa lokomotywy: " + Name);
            System.out.println("Marka lokomotywy: " + Brand);
            System.out.println("Pojemnosc silnika : " + Engine_Capacity + " L");
            System.out.println("rodzaj silnika : " + Engine_Type.HYBRID);
            System.out.println("Max predkosc : " + Speed + " km/H");
            System.out.println("Przeznaczenie : " + Load);
        }
    }

    //zadnie3
    class Lawnmover extends Machine {
        private boolean isMelekser;
        private boolean isDrive;
        private int Number_of_blades;

        public Lawnmover() {
            Name = "Kosiarka spalinowa zx3000";
            Brand = "Performance Power";
            Engine_Capacity = 5;
            //Engine_type
            isMelekser = true;
            isDrive = true;

        }

        public void setCzyMelekser(boolean isMelekser) {
            this.isMelekser = isMelekser;
        }

        public void setCzyNaped(boolean isDrive) {
            this.isDrive = isDrive;
        }


        public void Print_lawnmover() {
            System.out.println("Nazwa kosiarki: " + Name);
            System.out.println("Marka kosiarki: " + Brand);
            System.out.println("Pojemnosc silnika : " + Engine_Capacity + " L");
            System.out.println("rodzaj silnika : " + Engine_Type.HYBRID);
            System.out.println("Czy jest melekser: " + isMelekser);
            System.out.println("Czy ma napęd : " + isDrive);
            System.out.println("Ile ostrzy : " + Number_of_blades);

        }
    }

    //zadanie4
    class Vehicle extends Machine {
        private double Power;
        private double Torque; //moment obrotowy
        private static int maxLiczbaPojazdow = 12;
        private static int nrPojazdu = 0;

        public Vehicle() {
            nrPojazdu++;
            if (nrPojazdu > maxLiczbaPojazdow) {
                System.out.println("Osiągnięto maksymalną liczbę pojazdów.");
                nrPojazdu--;
            } else {
                System.out.println("Utworzono pojazd nr " + nrPojazdu + " z " + maxLiczbaPojazdow);
            }
            Name = "Ford Mondeo Vignale 2.0";
            Brand = "Ford";
            Engine_Capacity = 1997;
            //Engine_type
            Power = 180;
            Torque = 400;


        }

        public void Print_vehicle() {
            System.out.println("pojazd " + nrPojazdu + " z " + maxLiczbaPojazdow);
            System.out.println("Nazwa pojazdu: " + Name);
            System.out.println("Marka pojazdu: " + Brand);
            System.out.println("Pojemnosc silnika : " + Engine_Capacity + " cm3");
            System.out.println("rodzaj silnika : " + Engine_Type.DIESEL);
            System.out.println("Moc : " + Power + "Km");
            System.out.println("Moment obrotowy : " + Torque + "Nm");


        }

        //zadanie5
        enum Segment {
            A,
            B,
            C,
            D,
            E,
            F
        }

        class Cars extends Vehicle {
            private Segment segment;
            private String VIN;//17 znaków

            public Cars() {
                Name = "Ford Mondeo Vignale 2.0";
                Brand = "Ford";
                Engine_Capacity = 1997;
                //Engine_type=DIESEL;
                Power = 180;
                Torque = 400;
                VIN = "VF1RFB00059365541";
                segment = Segment.F;

            }

            public void Print_cars() {
                System.out.println("Nazwa pojazdu: " + Name);
                System.out.println("Marka pojazdu: " + Brand);
                System.out.println("Pojemnosc silnika : " + Engine_Capacity + " cm3");
                System.out.println("rodzaj silnika : " + Engine_Type.DIESEL);
                System.out.println("Moc : " + Power + "Km");
                System.out.println("Moment obrotowy : " + Torque + "Nm");
                System.out.println("Nr VIN: " + VIN);
                System.out.println("segment: " + segment);

            }
        }

        enum JednosladTyp {
            ROWER,
            HULAJNOGA,
            SKUTER,
            MOTOROWER
        }

        class Two_wheeler extends Vehicle {
            private JednosladTyp type;
            private boolean hamulec;

            public Two_wheeler() {
                Name = "xs232";
                Brand = "Kawasaki";
                Engine_Capacity = 1997;
//                //Engine_type
                Power = 180;
                Torque = 400;
                type = JednosladTyp.HULAJNOGA;
                hamulec = true;
//
            }

            public void Print_Two_wheeler() {
                System.out.println("Nazwa pojazdu: " + Name);
                System.out.println("Marka pojazdu: " + Brand);
                System.out.println("Pojemnosc silnika : " + Engine_Capacity + " cm3");
                System.out.println("rodzaj silnika : " + Engine_Type.DIESEL);
                System.out.println("Moc : " + Power + "Km");
                System.out.println("Moment obrotowy : " + Torque + "Nm");
                System.out.println("Typ" + type);
                if (hamulec) {
                    System.out.println("posiada hamulec");
                }
            }
        }
    }





    public static void main(String[] args) {
        Locomotive locomotive = new Machine().new Locomotive();
        Lawnmover lawnmover = new Machine().new Lawnmover();
        Vehicle vehicle = new Machine().new Vehicle();
        Vehicle car = new Machine().new Vehicle();

        locomotive.Print_locomotive();
        lawnmover.Print_lawnmover();
        vehicle.Print_vehicle();
        car.Print_vehicle();


    }
}