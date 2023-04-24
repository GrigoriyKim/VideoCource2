package enums;

import java.util.Arrays;

public class EnumEx3 {
    public static void main(String[] args) {
        Todays todays = new Todays(WeekDay.SUNDAY);
        todays.daysInfo();
        System.out.println(todays.weekDay);
        WeekDay w1 = WeekDay.FRIDAY;
        WeekDay w2 = WeekDay.FRIDAY;
        WeekDay w3 = WeekDay.MONDAY;
        System.out.println(w1==w2);
//        System.out.println(WeekDay.FRIDAY==WeekDays.FRIDAY); // ne ravni
//        System.out.println(WeekDays.FRIDAY==WeekDays2.FRIDAY); // ne ravni
        System.out.println(WeekDay.FRIDAY.equals(WeekDays2.FRIDAY)); // ne ravni
        System.out.println(WeekDays.FRIDAY.equals(WeekDays2.FRIDAY)); // ne ravni
        WeekDay w15 = WeekDay.valueOf("MONDAY");
//        WeekDay w15 = WeekDay.valueOf("MONDAy"); // vivedet Exception
        System.out.println(w15);
        WeekDay [] array = WeekDay.values();
        System.out.println(Arrays.toString(array));
    }
}

enum WeekDay{
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");
    private String mood;
    private WeekDay(String mood){ // tolko private
        this.mood = mood;
    }
//    private WeekDay(){} // mojno sdelat pustoy chtobi ostavit 1 den bez mood
    public String getMood(){
        return mood;
    }
}

class Todays{
    WeekDay weekDay;
    public Todays(WeekDay weekDay) {
        this.weekDay = weekDay;
    }
    void daysInfo(){
        switch (weekDay){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Idi na rabotu!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Mojno otdohnut");
                break;
        }
        System.out.println("Nastroenie v etot den: " + weekDay.getMood());
    }
}

enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}