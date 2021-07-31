public class HomeWorkApp2 {
    public static void main(String[] args){
        System.out.println(checkSum(7, 5));
        checkNumber(0);
        System.out.println(checkNumber2(-1));
        returnString("test" , 3);
        System.out.println(checkYear(2204));
    }
    public static boolean checkSum(int a, int b){
        return a + b >= 10 && a + b <= 20;
    }
    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean checkNumber2(int a){
        return a < 0;
    }
    public static void returnString(String t , int a){
        while (a-- > 0) {
            System.out.println(t);
        }
    }
    public static boolean checkYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
