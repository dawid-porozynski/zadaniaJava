//import java.util.Scanner;
//
//public class Safe {
//    private String pin = "123456";
//    private Alarm alarm;
//
//
//    public Safe(Alarm alarm) {
//        this.alarm = alarm;
//    }
//
//
//    public void enterPin() {
//        System.out.println("podaj pin do sejfu: \n");
//        Scanner scanner = new Scanner(System.in);
//        String pin_guess = scanner.toString();
//        if (pin_guess == pin) {
//
//            correctPin();
//        } else {
//            wrongPin();
//        }
//    }
//
//    private void correctPin() {
//        System.out.println("\nDrzwiczki do sejfu sie otwieraja");
//        System.exit(0);
//    }
//
//
//    private void wrongPin() {
//        System.out.println("Wlaczyles alarm!");
//        addAlarm();
//
//    }
//
//    public void addAlarm() {
//        new sound_Alarm();
//        new bars_Alarm();
//        new dogs_Alarm();
//        new police_Alarm();
//
//    }
//
//    public void removeAlarm() {
//        System.out.println("wpisałeś poprawnie kod wyłączający alarm.\n");
//        enterPin();
//
//    }
//
//
//    public void first_safe_owner() {
//
//        this.enterPin();
//
//
//    }
//}
//
//interface Alarm {
//    void activate();
//}
//
//class sound_Alarm implements Alarm {
//    public void activate() {
//        System.out.println("ALARM");
//    }
//}
//
//class bars_Alarm implements Alarm {
//    public void activate() {
//
//        System.out.println("Kraty sie zamykaja");
//    }
//}
//
//class dogs_Alarm implements Alarm {
//    public void activate() {
//
//        System.out.println("klatka z psami sie otwiera");
//    }
//}
//
//class police_Alarm implements Alarm {
//    public void activate() {
//
//        System.out.println("Policja została powiadomiona");
//    }
//}
//
//class PinEvent {
//    private String date;
//    private Safe safe;
//
//
//    public PinEvent(Safe safe) {
//        this.safe = safe;
//        this.date = "teraz";
//
//
//    }
//
//    public Safe getSafe() {
//        return this.safe;
//    }
//}
//
//interface Logger {
//    enum Severity {
//        LOW,
//        MID,
//        HIGH
//    }
//
//    enum EventSource {
//        PIN_ENTRY,
//        ALARM_ACTIVATION
//    }
//
//}
//
//class SafeMessage implements Logger {
//    void log(Severity severity, EventSource source, String message) {
//        System.out.println(severity.name() + " " + source.name() + ": " + message);
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Alarm dogs_Alarm = dogs_Alarm.activate();
//        Safe safe = new Safe(dogs_Alarm);
//        safe.first_safe_owner();
//
//
//    }
//}
//
//
////zrobic 2 sejfy jeden bogatego w ktorym odpala sie wszystkie zabezpieczenia, drugi sredni z jednym zabezpieczeniem moze 2
////w pinevent zmienic typ na date i w konstruktorze curre4ntDate

import java.util.Scanner;

public class Safe {
    private String pin = "123456";
    private Alarm alarm;

    public Safe(Alarm alarm) {
        this.alarm = alarm;
    }

    public void enterPin() {
        System.out.println("Podaj pin do sejfu:");
        Scanner scanner = new Scanner(System.in);
        String pin_guess = scanner.nextLine();
        if (pin_guess.equals(pin)) {
            correctPin();
        } else {
            wrongPin();
        }
    }

    private void correctPin() {
        System.out.println("Drzwiczki do sejfu się otwierają.");
        System.exit(0);
    }

    private void wrongPin() {
        System.out.println("Wprowadzony został nieprawidłowy PIN.");
        alarm.activate();
    }
}

interface Alarm {
    void activate();
}

class SecurityCompany implements Alarm {
    public void activate() {
        System.out.println("Wysyłanie ekipy ochrony...");
    }
}

class IronBars implements Alarm {
    public void activate() {
        System.out.println("Spuszczanie krat ochronnych...");
    }
}

class GuardDogs implements Alarm {
    public void activate() {
        System.out.println("Wypuszczanie psów ochronnych...");
    }
}

class Police implements Alarm {
    public void activate() {
        System.out.println("Powiadomienie policji...");
    }
}

class SafeLogger {
    void log(Logger.Severity severity, Logger.EventSource source, String message) {
        System.out.println(severity.name() + " " + source.name() + ": " + message);
    }
}

interface Logger {
    enum Severity {
        LOW,
        MID,
        HIGH
    }

    enum EventSource {
        PIN_ENTRY,
        ALARM_ACTIVATION
    }

}

class Main {
    public static void main(String[] args) {
        Alarm alarm = new Police();

        SafeLogger logger = new SafeLogger();
        Safe safe = new Safe(alarm);

        logger.log(Logger.Severity.LOW, Logger.EventSource.PIN_ENTRY, "Uruchomienie sejfu.");
        safe.enterPin();
        logger.log(Logger.Severity.LOW, Logger.EventSource.PIN_ENTRY, "Zamknięcie sejfu.");
    }
}