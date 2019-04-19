package ir.ac.kntu.payroll;

enum PayrollDay1 {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    SATURDAY, SUNDAY;

    private static final int MINS_PER_SHIFT = 8 * 60;

    int pay(int minutesWorked, int payRate) {
        int basePay = minutesWorked * payRate;

        int overtimePay;
        switch (this) {
            case FRIDAY:
            case THURSDAY: // Weekend
                overtimePay = basePay;
                break;
            default: // Weekday
                overtimePay = minutesWorked <= MINS_PER_SHIFT ?
                        0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
        }

        return basePay + overtimePay;
    }

    public static void main(String[] args) {
        int pay = MONDAY.pay(500, 100);
        int pay2 = THURSDAY.pay(500, 100);
        int pay3 = FRIDAY.pay(500, 100);
        System.out.println(pay);
        System.out.println(pay2);
        System.out.println(pay3);

    }
} 
