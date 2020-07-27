public class hasSameLastDigit {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 >= 10 && num2 >= 10 && num3 >= 10 && num1 <= 1000 && num2 <= 1000 && num3 <= 1000) {
            int num11 = num1 % 10;
            int num21 = num2 % 10;
            int num31 = num3 % 10;
            if (num11 == num21 || num11 == num31 || num21 == num31) return true;
            else return false;
        } else return false;
    }

    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) return true;
        else return false;
    }
}
