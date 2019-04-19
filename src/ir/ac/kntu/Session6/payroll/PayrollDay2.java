package ir.ac.kntu.payroll;

enum PayrollDay2 {
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, //default day is WEEKDAY
    THURSDAY(PayType.WEEKEND), FRIDAY(PayType.WEEKEND);

    private final PayType type;

    PayrollDay2(PayType type) {
        this.type = type;
    }

    PayrollDay2() {
        this(PayType.WEEKDAY);
    }

    private enum PayType {
        WEEKDAY, WEEKEND
    }

    public static void main(String[] args) {
        int pay = MONDAY.pay(500, 100);
        int pay2 = THURSDAY.pay(500, 100);
        int pay3 = FRIDAY.pay(500, 100);
        System.out.println(pay);
        System.out.println(pay2);
        System.out.println(pay3);

    }

    private static final int MINS_PER_SHIFT = 8 * 60;

    int pay(int minutesWorked, int payRate) {
        int basePay = minutesWorked * payRate;

        int overtimePay;
        switch (this.type) {
            case WEEKEND:
                overtimePay = basePay;
                break;

            default:
                overtimePay = minutesWorked <= MINS_PER_SHIFT ?
                        0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
                break;
        }

        return basePay + overtimePay;
    }
} 

