import java.util.Scanner;
class Solution{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=scanner.nextInt();
        if(isPalindrome(num)){
            System.out.println("The number is palindrome:" + num);
        }
        else{
            System.out.println("the number is not palindrome:" +num);
        }
    }
        public static boolean isPalindrome(int number){
            if(number<0){
                return false;
            }
            int original=number;
            int reverse=0;
            while(number!=0){
                int dig=number%10;
                reverse=reverse*10+dig;
                number = number/10;
            }
            return original==reverse;
        }
    }
