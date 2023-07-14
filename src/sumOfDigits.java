import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int result = sumOfDigits(num);
        System.out.println("Сумма цифр числа " + num + ": " + result);
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }

        return n % 10 + sumOfDigits(n / 10);
    }
}


    def is_palindrome(S) :
        # Remove any spacesand convert to lowercase
        s = s.replace(" ", "").lower()
        # Check if the string is equal to its reverse
        return s == s[:: - 1]
        input1 = "Qazaq"
        output1 = is_palindrome(input1)
        print(output1)  # Output: True

        input2 = "beshBARMAK"
        output2 = is_palindrome(input2)
        print(output2)  # Output : False