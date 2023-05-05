import java.util.Scanner;

public class Safe {
    private String pin = "123456";
    private Alarms alarms;


    public class alarms implements Alarm {


    }


    public void enterPin() {
        System.out.println("podaj pin do sejfu: \n");
        Scanner scanner = new Scanner(System.in);
        String pin_guess = scanner.toString();
        if (pin_guess == pin) {

            correctPin();
        } else {
            wrongPin();
        }
    }

    private void correctPin() {
        System.out.println("\nDrzwiczki do sejfu sie otwieraja");
        System.exit(0);
    }


    private void wrongPin() {
        System.out.println("Wlaczyles alarm!");
        addAlarm();

    }

    public void addAlarm() {
        this.alarms

    }

    public void removeAlarm() {
        System.out.println("wpisałeś poprawnie kod wyłączający alarm.\n");
        enterPin();

    }


    public void first_safe_owner() {

        this.enterPin();

    }
}

interface Alarm {
    public void sound_Alarm() {
        System.out.println("ALARM");
    }

    public void bars_Alarm() {
        System.out.println("Kraty sie zamykaja");
    }

    public void dogs_Alarm() {
        System.out.println("klatka z psami sie otwiera");
    }

    public void police_Alarm() {
        System.out.println("Policja została powiadomiona");
    }


    public class Logger {

    }
}


class PinEvent {
    private String date;
    private Safe safe;


    public PinEvent(Safe safe) {
        this.safe = safe;
        this.date = "teraz";


    }

    public Safe getSafe() {
        return this.safe;
    }
}

interface Logger {
    enum Severity {
        LOW,
        MID,
        HIGH
    }

//eventSource

    String Log_message = Severity.LOW + " ";
}

class Main {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.first_safe_owner();

    }
}


//zrobic 2 sejfy jeden bogatego w ktorym odpala sie wszystkie zabezpieczenia, drugi sredni z jednym zabezpieczeniem moze 2
//w pinevent zmienic typ na date i w konstruktorze curre4ntDate