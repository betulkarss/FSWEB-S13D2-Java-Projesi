public class Main {
    public static void main(String[] args) {

        System.out.println("-------isPalibdrome-------");
        System.out.println();
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println();
        System.out.println("-------isPerfectNumber-------");
        System.out.println();
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(5));

        System.out.println();
        System.out.println("--------numberToWords--------");
        System.out.println();
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    //isPalindrome
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int firstNum = number;
        int reverseNum = 0;

        while (number > 0) {
            int digit = number % 10;
            reverseNum = reverseNum * 10 + digit;
            number = number / 10;
        }
        return (firstNum == reverseNum);

    }


    //isPerfectNumber

    public static  boolean isPerfectNumber(int numbers){
        int sum = 0;
        if(numbers<0){
            return false;
        }
        for(int i=1; i<=numbers/2;i++){
            if(numbers%i==0){
                sum +=i;
            }
        }
        return sum == numbers;
    }

    //isnumberToWords
    public static String numberToWords(int num){
        if(num<0) {
            return "Invalid Value";
        }
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numStr = String.valueOf(num);
        StringBuilder result = new StringBuilder();

        for(char digitChar : numStr.toCharArray()){
            int digit = Character.getNumericValue(digitChar);
            result.append(words[digit]).append(" ");
        }
        return result.toString().trim();}

}