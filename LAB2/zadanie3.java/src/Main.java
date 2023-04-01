class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        validate_Day(day);
        validate_Month(month);
        validate_Year(year);

        this.day = day;
        this.month = month;
        this.year = year;
    }

    private void validate_Day(int day) {
        if (day > 31 || day < 1) throw new IllegalArgumentException("Nie ma takiego dnia");
    }

    private void validate_Month(int month) {
        if (month > 12 || month < 1) throw new IllegalArgumentException("Nie ma takiego miesiaca");
    }

    private void validate_Year(int year) {
        if (year > 2050 || year < 1990) throw new IllegalArgumentException("Nie pasuje w kryteria");
    }

    public int get_Month() {
        return month;
    }

    public int get_Day() {
        return day;
    }

    public int get_Year() {
        return year;
    }

    public void set_Month(int month) {
        validate_Month(month);
        this.month = month;
    }

    public void set_Day(int day) {
        validate_Day(day);
        this.day = day;
    }

    public void set_Year(int year) {
        validate_Year(year);
        this.year = year;
    }

    public String display_Date() {
        return String.format("%02d/%02d/%d", day, month, year);
    }

    public String toString() {
        return this.display_Date();
    }

    public static void main(String[] args) {
        MyDate date = new MyDate(12, 5, 2020);
        System.out.println(date);
        System.out.println(date.get_Day());
        System.out.println(date.get_Year());
        System.out.println(date.get_Month());

        date.set_Day(11);
        date.set_Month(1);
        date.set_Year(2011);
        System.out.println(date.display_Date());
    }
}