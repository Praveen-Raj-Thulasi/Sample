import java.util.Scanner;
class Palindrome{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int rev = 0;
        int org = N;
        while(N > 0){
            rev = (rev * 10) + N % 10;
            N /= 10;
        }
        if(org == rev){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}