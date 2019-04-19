package ir.ac.kntu.payroll;

//3. Using Strategy Pattern
enum PayrollDay {
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, //default day is WEEKDAY
    THURSDAY(PayType.WEEKEND), FRIDAY(PayType.WEEKEND);

    private final PayType type;

    private PayrollDay(PayType type) {
        this.type = type;
    }

    private PayrollDay() {
        this(PayType.WEEKDAY);
    }

    int pay(int minutesWorked, int payRate) {
        return type.pay(minutesWorked, payRate);
    }


    private enum PayType {
        WEEKDAY {
            int overtimePay(int minutesWorked, int payRate) {
                return minutesWorked <= MINS_PER_SHIFT ? 0 :
                        (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
            }
        },

        WEEKEND {
            int overtimePay(int minutesWorked, int payRate) {
                return minutesWorked * payRate;
            }

        };

        abstract int overtimePay(int mins, int payRate);

        int pay(int minsWorked, int payRate) {
            int basePay = minsWorked * payRate;
            return basePay + overtimePay(minsWorked, payRate);
        }

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

}