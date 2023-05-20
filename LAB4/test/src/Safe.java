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