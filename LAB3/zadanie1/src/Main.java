abstract class  Machine {
    protected String Brand;
    protected String Name;
    protected int Engine_Capacity;

    protected enum Engine_Type {
        DIESEL,
        GAS,
        GASOLINE,
        HYBRID
    }

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

    class Vehicle extends Machine {
        private double Power;
        private double Torque; //moment obrotowy
        int Vehicle_Number;
        int Max_Vehicle_Number = 5;

        public Vehicle() {
            Name = "Ford Mondeo Vignale 2.0";
            Brand = "Ford";
            Engine_Capacity = 1997;
            //Engine_type
            Power = 180;
            Torque = 400;
            Vehicle_Number = 1;
            for (int i = 1; i <= Vehicle_Number; i++) {
                if (Max_Vehicle_Number < Vehicle_Number) {
                    System.out.println("Numer pojazdu jest za duży");
                    System.exit(0);
                } else if (i == Vehicle_Number) {
                    Vehicle_Number = i;
                }
            }

        }

        public void Print_vehicle() {
            System.out.println("pojazd " + Vehicle_Number + " z " + Max_Vehicle_Number);
            System.out.println("Nazwa pojazdu: " + Name);
            System.out.println("Marka pojazdu: " + Brand);
            System.out.println("Pojemnosc silnika : " + Engine_Capacity + " cm3");
            System.out.println("rodzaj silnika : " + Engine_Type.DIESEL);
            System.out.println("Moc : " + Power + "Km");
            System.out.println("Moment obrotowy : " + Torque + "Nm");


        }

        class Cars extends Vehicle {
            private String segment;
            private int VIN;//17 znaków

            public Cars() {
//                Name = "Ford Mondeo Vignale 2.0";
//                Brand = "Ford";
//                Engine_Capacity =1997;
//                //Engine_type
//                Power=180;
//                Torque=400;
//                Vehicle_Number=1;
//                for (int i = 1; i <= Vehicle_Number; i++) {
//                    if (Max_Vehicle_Number<Vehicle_Number) {
//                        System.out.println("Numer pojazdu jest za duży");
//                        System.exit(0);
//                    } else if (i==Vehicle_Number) {
//                        Vehicle_Number=i;
//                    }
//                }
            }

            public void Print_cars() {
                System.out.println("Nazwa pojazdu: " + Name);
                System.out.println("Marka pojazdu: " + Brand);
                System.out.println("Pojemnosc silnika : " + Engine_Capacity + " cm3");
                System.out.println("rodzaj silnika : " + Engine_Type.DIESEL);
                System.out.println("Moc : " + Power + "Km");
                System.out.println("Moment obrotowy : " + Torque + "Nm");


            }

            class Two_wheeler extends Vehicle {
                private String type;
                public Two_wheeler() {
//                Name = "Ford Mondeo Vignale 2.0";
//                Brand = "Ford";
//                Engine_Capacity =1997;
//                //Engine_type
//                Power=180;
//                Torque=400;
//                Vehicle_Number=1;
//                for (int i = 1; i <= Vehicle_Number; i++) {
//                    if (Max_Vehicle_Number<Vehicle_Number) {
//                        System.out.println("Numer pojazdu jest za duży");
//                        System.exit(0);
//                    } else if (i==Vehicle_Number) {
//                        Vehicle_Number=i;
//                    }
//                }
                }

                public void Print_Two_wheeler(){
                    System.out.println("Nazwa pojazdu: "+Name);
                    System.out.println("Marka pojazdu: "+Brand);
                    System.out.println("Pojemnosc silnika : "+Engine_Capacity+" cm3");
                    System.out.println("rodzaj silnika : "+ Engine_Type.DIESEL);
                    System.out.println("Moc : "+ Power+"Km");
                    System.out.println("Moment obrotowy : "+ Torque+ "Nm");


                }
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {

    }
}