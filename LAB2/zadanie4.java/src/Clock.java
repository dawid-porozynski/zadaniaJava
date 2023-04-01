public class Clock {
    private int hours,seconds,minutes;

    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Konstruktor z trzema parametrami
    public Clock(int hours, int minutes, int seconds) {
        validate_Hours(hours);
        validate_Minutes(minutes);
        validate_Seconds(seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    //  czas w sekundach licząc od północy
    public Clock(int time_in_Seconds) {
        if (time_in_Seconds > 86399) throw new IllegalArgumentException("Podane sekundy są za duże");
        this.hours = time_in_Seconds / 3600;
        time_in_Seconds %= 3600;
        this.minutes = time_in_Seconds / 60;
        this.seconds = time_in_Seconds % 60;
    }

    public int get_Hours() {
        return this.hours;
    }

    public int get_Minutes() {
        return this.minutes;
    }

    public int get_Seconds() {
        return this.seconds;
    }

    private void validate_Minutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Zły zakres minut");
        }
    }

    private void validate_Hours(int hours) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Zły zakres godzin");
        }
    }

    private void validate_Seconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Zły zakres sekund");
        }
    }

    public void set_Hours(int hours) {
        validate_Hours(hours);
        this.hours = hours;
    }

    public void set_Minutes(int minutes) {
        validate_Minutes(minutes);
        this.minutes = minutes;
    }

    public void set_Seconds(int seconds) {
        validate_Seconds(seconds);
        this.seconds = seconds;
    }

    // zwiększa wartość sekund o jeden
    public void tick() {
        if (this.seconds == 59) {
            if (this.minutes == 59) {
                if (this.hours == 23) {
                    this.hours = 0;
                } else {
                    this.hours++;
                }
                this.minutes = 0;
            } else {
                this.minutes++;
            }
            this.seconds = 0;
        } else {
            this.seconds++;
        }
    }

    // zmniejsza wartość sekund o jeden
    public void tick_Down() {
        if (this.seconds == 0) {
            if (this.minutes == 0) {
                if (this.hours == 0) {
                    this.hours = 23;
                } else {
                    this.hours--;
                }
                this.minutes = 59;
            } else {
                this.minutes--;
            }
            this.seconds = 59;
        } else {
            this.seconds--;
        }
    }

    //  zwraca obiekt w postaci "[hh-mm-ss]"
    public String toString() {
        return String.format("[%02d-%02d-%02d]", this.hours, this.minutes, this.seconds);
    }

    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 59);
        System.out.println(clock);
        clock.tick();
        System.out.println(clock);
        clock.tick_Down();
        System.out.println(clock);
        Clock clock2 = new Clock(12345);
        System.out.println(clock2);
    }
}