public class Dato {
    public static void print (String s) {
        System.out.println(s);
    }
    public static String str (int i) {
        return Integer.toString(i);
    }
    public static void main (String[] args) {
        int year = 2024;
        String month = "January";
        int date = 31;
        String day = "Wednesday";
        print(str(year));
        print(month);
        print(str(date));
        print(day);
        print(day + ", " + month + " " + date + ", " + year);
        print(day + " " + date + " " + month + " " + year);
    }
}