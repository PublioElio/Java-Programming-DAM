package addact_14;

import java.util.Scanner;

/**
 * This is a custom library of math functions
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class CustomMathLib {

    /**
     * This function checks if a number is palindromic
     *
     * @param num the number to check
     * @return true or false
     */
    public static boolean isPalindromic(int num) {
        return (num == reverse(num));
    }

    /**
     * This function checks if a number is prime
     *
     * @param num an integer
     * @return a boolean
     */
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= (num / 2) && isPrime; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
        }
        return (isPrime);
    }

    /**
     * This function gets the next prime number after the number entered
     *
     * @param num the number to search for the next prime number
     * @return the next prime number after the number entered
     */
    public static int nextPrime(int num) {
        boolean notPrime = false;
        while (!notPrime) {
            notPrime = isPrime(++num);
        }
        return (num);
    }

    /**
     * This function calculates the power of a given base and exponent
     *
     * @param base the base number
     * @param exponent the exponent o power limit
     * @return the power of the given parameters
     */
    public static int power(int base, int exponent) {
        int power = 1;
        if (exponent == 0) {
            power = 1;
        } else {
            for (int i = 1; i <= exponent; i++) {
                power *= base;
            }
        }
        return (power);
    }

    /**
     * This function gets the total length of digits of a given integer
     *
     * @param num the number to get length
     * @return the length in digits
     */
    public static int digits(int num) {
        int digits = 0;
        while (num > 0) {
            num /= 10;
            digits++;
        }
        return (digits);
    }

    /**
     * This function reverses an integer number
     *
     * @param num the number to reverse
     * @return the reversed number
     */
    public static int reverse(int num) {
        int rev = 0, digit;
        while (num > 0) {
            digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;
        }
        return (rev);
    }

    /**
     * This function returns the digit found in position 'n' of an integer,
     * starting from '0' from left to right.
     *
     * @param num the number where we want to search for the position
     * @param n the position where we want to get the digit
     * @return the digit
     */
    public static int digitN(int num, int n) {
        int digit = 0, exp = 0;
        for (int i = (digits(num) - 1); i >= 0; i--) {
            if (i == n) {
                digit = num / power(10, exp);
                digit %= 10;
            }
            exp++;
        }
        return (digit);
    }

    /**
     * This function returns the position of the first occurrence of a digit
     * inside an integer. If not found, it returns -1.
     *
     * @param num the number to search a position
     * @param digit to search in the number
     * @return the position of the digit
     */
    public static int digitPosition(int num, int digit) {
        int position = 0;
        boolean found = false;
        while (position < digits(num) && !found) {
            if (digitN(num, position) != digit) {
                position++;
            } else {
                found = true;
            }
        }
        position = found ? position : -1;
        return (position);
    }

    /**
     * This function erases a number of digits from a number, starting to count
     * from right to left
     *
     * @param num the number to modify
     * @param digits the quantity of digits to erase
     * @return the new number
     */
    public static int eraseRight(int num, int digits) {
        int counter = 1;
        while (counter <= digits) {
            num /= 10;
            counter++;
        }
        return (num);
    }

    /**
     * This function erases a number of digits from a number, starting to count
     * from left to right
     *
     * @param num the number to modify
     * @param digits the quantity of digits to erase
     * @return the new number
     */
    public static int eraseLeft(int num, int digits) {
        for (int i = 0; i < digits; i++) {
            num -= digitN(num, 0) * power(10, (digits(num) - 1));
        }
        return (num);
    }

    /**
     * This function appends a digit to a number, at the right
     *
     * @param num the original number
     * @param digit the digit to append
     * @return the new number
     */
    public static int appendRight(int num, int digit) {
        num = num >= 0 ? (num * 10) + digit : (((num * -1) * 10) + digit) * -1;
        return (num);
    }

    /**
     * This function appends a digit to a number, at the left
     *
     * @param num the original number
     * @param digit the digit to append
     * @return the new number
     */
    public static int appendLeft(int num, int digit) {
        if (num == 0) {
            num = digit * 10;
        } else if (num < 0) {
            num = Math.abs(num);
            num = (digit * power(10, digits(num)) + num) * -1;
        } else {
            num = digit * power(10, digits(num)) + num;
        }
        return (num);
    }

    /**
     * Takes the start and end positions as parameters inside a number and
     * returns the corresponding piece.
     *
     * @param num the number to get a piece
     * @param start the beggining of the new number (included)
     * @param end the end of the new number (included)
     * @return the new number
     */
    public static int numberPiece(int num, int start, int end) {
        int length = digits(num);
        num = eraseLeft(num, start);
        num = eraseRight(num, length - (end - 1));
        return (num);
    }

    /**
     * This function gets two numbers and puts them together, one after another
     *
     * @param num first number
     * @param num2 second number
     * @return the new number
     */
    public static int appendNumber(int num, int num2) {
        return (num * power(10, digits(num2)) + num2);
    }

    /**
     * This function gets a positive integer number
     *
     * @return a positive integer
     */
    public static int getPositiveInt() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            num = sc.nextInt();
            if (num < 0) {
                System.out.print("ERROR: number must be positive. "
                        + "Enter a positive integer number: ");
            }
        } while (num < 0);
        return (num);
    }

    /**
     * This function checks a if an integer is a valid binary number
     *
     * @param num the number to check if it's binary
     * @return true or false
     */
    public static boolean isBinary(int num) {
        int digit;
        boolean isBinary = true;
        while ((num > 0) && isBinary) {
            digit = num % 10;
            isBinary = digit < 2;
            num /= 10;
        }
        return (isBinary);
    }

    public static void main(String[] args) {
        int num, power, n, start, end;

        /* Get the base number */
        System.out.print("-> Enter a positive integer number: ");
        num = getPositiveInt();

        /* Test isPalindromic() */
        System.out.printf("1. Is %d a palindromic number?: %b\n",
                num, isPalindromic(num));

        /* Test isPrime() */
        System.out.printf("2. Is %d a prime number?: %b\n", num,
                isPrime(num));

        /* Test nextPrime() */
        System.out.printf("3. The next prime number after %d is %d\n",
                num, nextPrime(num));

        /* Test power() */
        System.out.printf("-> Enter a exponent for base %d: ", num);
        power = getPositiveInt();
        System.out.printf("4. %d to the power of %d is: %d\n", num,
                power, power(num, power));

        /* Test digits() */
        System.out.printf("5. %d has %d digits.\n",
                num, digits(num));

        /* Test reverse() */
        System.out.printf("6. %d reversed is %d\n", num,
                reverse(num));

        /* Test digitN() */
        do {
            System.out.printf("-> Enter a position to get a digit in number %d "
                    + "(starting from '0' and from left to right): ", num);
            n = getPositiveInt();
            if (n > (digits(num) - 1)) {
                System.out.printf("ERROR: the position can't be greater than "
                        + "%d.\n", (digits(num) - 1), num);
            }
        } while (n > (digits(num) - 1));
        System.out.printf("7. The digit in position %d (stating from '0' and "
                + "from left to right) in the number %d is: %d\n",
                n, num, digitN(num, n));

        /* Test digitPosition() */
        do {
            System.out.printf("-> Enter a digit to get it's position in "
                    + "%d: ", num);
            n = getPositiveInt();
            if (n < 0 && n > 9) {
                System.out.println("ERROR: the digit must be within "
                        + "'0' and '9'.");
            }
        } while (n < 0 && n > 9);
        System.out.printf("8. The digit '%d' in the number %d is in "
                + "position %d\n", n, num, digitPosition(num, n));

        /* Test eraseRight() */
        do {
            System.out.printf("-> Enter a number of digits to erase "
                    + "from %d, from right to left: ", num);
            n = getPositiveInt();
            if (n > digits(num)) {
                System.out.printf("ERROR: the digits to erase from %d can't"
                        + " be more than %d\n", num, digits(num));
            }
        } while (n > digits(num));
        System.out.printf("9. The number %d without %d digits from right"
                + " to left is %d\n", num, n, eraseRight(num, n));

        /* Test eraseLeft()*/
        do {
            System.out.printf("-> Enter a number of digits to erase "
                    + "from %d, from left to right: ", num);
            n = getPositiveInt();
            if (n > digits(num)) {
                System.out.printf("ERROR: the digits to erase from %d can't"
                        + " be more than %d\n", num, digits(num));
            }
        } while (n > digits(num));
        System.out.printf("10. The number %d without %d digits from right"
                + " to left is %d\n", num, n, eraseLeft(num, n));

        /* Test appendRight() */
        do {
            System.out.printf("-> Enter a digit to append in %d from"
                    + " the right & the left: ", num);
            n = getPositiveInt();
            if (n < 0 && n > 9) {
                System.out.println("ERROR: the digit must be within "
                        + "'0' and '9'.");
            }
        } while (n < 0 && n > 9);
        System.out.printf("11. %d with the digit %d at the right is %d\n",
                num, n, appendRight(num, n));

        /* Test appendLeft */
        System.out.printf("12. %d with the digit %d at the left is %d\n",
                num, n, appendLeft(num, n));

        /* Test numberPiece() */
        System.out.printf("-> Let's get a piece of number %d.\n", num);
        do {
            System.out.print("-> Enter a starting position to cut (included): ");
            start = getPositiveInt();
            if (start > digits(num)) {
                System.out.printf("ERROR: the start must be lesser or equal "
                        + "than %d.\n", digits(num));
            }
        } while (start > digits(num));

        do {
            System.out.print("-> Enter an ending position (included): ");
            end = getPositiveInt();
            if (end > digits(num)) {
                System.out.printf("ERROR: the end must be lesser or equal "
                        + "than %d.\n", digits(num));
            }
        } while (end > digits(num));

        System.out.printf("13. The piece of %d that results is: %d\n",
                num, numberPiece(num, start, end));

        /* Test appendNumber() */
        System.out.printf("-> Enter another number to append in %d: ", num);
        n = getPositiveInt();

        System.out.printf("14. %d and %d together are: %d.\n",
                num, n, appendNumber(num, n));
    }
}
