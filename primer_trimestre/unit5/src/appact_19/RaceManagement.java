package appact_19;

import java.util.Scanner;
import java.util.Arrays;

/**
 * This is a race management program. First, the participants are introduced in
 * order of arrival, then the young participants increase their position by one
 * place, then the competitors who have a positive doping test certification are
 * expelled and, finally, those who have not paid the registration are
 * penalized, placing them at the bottom of the list
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class RaceManagement {

    /**
     * This function gets a positive number from console with minimum value of
     * '1'
     *
     * @param message a message to show on console
     * @param errorMessage an error message
     * @return the positive integer number
     */
    static int getPositiveNumber(int min, String message, String errorMessage) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            num = sc.nextInt();
            if (num < min) {
                System.out.print(errorMessage);
            }
        } while (num < min);
        return (num);
    }

    /**
     * This program checks if a competitor number is present in an arrray a
     * given number of times
     *
     * @param array the array to check
     * @param runnerNum the nuamber of the runner
     * @param maxNumTimesInList the maximun number of times that can be found on
     * the array
     * @return
     */
    static boolean checkRunnerNumber(int[] array, int runnerNum,
            int maxNumTimesInList) {
        int counter = 0;
        boolean notValid;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == runnerNum) {
                counter++;
            }
        }
        notValid = counter > maxNumTimesInList;
        return (notValid);
    }

    /**
     * This function fills an array with non-repeated numbers
     *
     * @param array
     */
    static void fillList(int[] array) {
        boolean repeated = false;
        for (int i = 0; i < array.length; i++) {
            do {
                array[i] = getPositiveNumber(1,
                        "Enter runner number: ",
                        "ERROR: must be a positive integer number. ");
                repeated = checkRunnerNumber(array, array[i], 1);
                if (repeated) {
                    System.out.print("ERROR: Runner number repeated. ");
                }
            } while (repeated);
        }
    }

    /**
     * This function increases in one step the position of the young runners
     *
     * @param array
     */
    static void youngerRunners(int[] array) {
        int totalYoungRunners;

        do {
            totalYoungRunners = getPositiveNumber(0,
                    "Enter the total number of young competitors: ",
                    "ERROR: not negative numbers allowed. ");
            if (totalYoungRunners > array.length) {
                System.out.printf("ERROR: max number of young runners is:"
                        + " %d. ", array.length);
            }
        } while (totalYoungRunners > array.length);

        while (totalYoungRunners > 0) {
            boolean runnerFound = false;
            int youngRunnerNum = getPositiveNumber(1,
                    "Enter non-adult runner number: ",
                    "ERROR: number must be at least '1'. ");

            for (int index = 0; index < array.length && !runnerFound; index++) {

                if ((youngRunnerNum == array[index])
                        && (youngRunnerNum != array[(array.length - 1)])) {
                    array[index] = array[index + 1];
                    array[index + 1] = youngRunnerNum;
                    totalYoungRunners--;
                    runnerFound = true;
                    System.out.println("New runner position: "
                            + Arrays.toString(array));
                } else if (youngRunnerNum == array[(array.length - 1)]) {
                    System.out.println("Young runner already first!");
                    totalYoungRunners--;
                    runnerFound = true;
                    System.out.println("Runner position: "
                            + Arrays.toString(array));
                }
            }

            if (!runnerFound) {
                System.out.println(
                        "ERROR: Young runner number not valid. ");
            }
        }
    }

    /**
     * This function gets a list of runners, and returns a new list without the
     * disqualified competitors
     *
     * @param array
     * @return a new list without the disqualified competitors
     */
    static int[] disqualifiedRunners(int[] array) {
        int totalDisqualifiedRunners, counter = 0;
        boolean validNumber;

        do {
            totalDisqualifiedRunners = getPositiveNumber(0,
                    "Enter the total number of disqualified competitors: ",
                    "ERROR: negative number not allowed. ");
            if (totalDisqualifiedRunners > array.length) {
                System.out.printf("ERROR: max number of disqualified "
                        + "runners is: %d. ", array.length);
            }
        } while (totalDisqualifiedRunners > array.length);

        int[] disqualifiedList = new int[totalDisqualifiedRunners];

        if (totalDisqualifiedRunners > 0) {

            do {
                int disqualifiedRunner = getPositiveNumber(1,
                        "Enter a disqualified runner number: ",
                        "ERROR: number must be at least '1'. ");
                validNumber = checkRunnerNumber(array,
                        disqualifiedRunner, 0);
                if (!validNumber) {
                    System.out.printf("ERROR: '%d' isn't a valid runner"
                            + " number. ", disqualifiedRunner);
                } else {
                    disqualifiedList[counter++] = disqualifiedRunner;
                }
            } while (counter < disqualifiedList.length);

            counter = 0;
        }

        int[] finalList = new int[array.length - disqualifiedList.length];

        for (int i = 0; i < array.length; i++) {
            boolean notDisqualified = true;
            for (int j = 0; j < disqualifiedList.length && notDisqualified; j++) {
                notDisqualified = array[i] != disqualifiedList[j];
            }
            if (notDisqualified) {
                finalList[counter++] = array[i];
            }
        }
        return (finalList);
    }

    /**
     * This function penalizes some competitors, putting them at the end of the
     * list in a new array
     *
     * @param array
     * @return a new array
     */
    static int[] penalizeRunners(int[] array) {
        int counter = 0;
        int totalPenalizedRunners = getPositiveNumber(0,
                "Enter the total number of penalized competitors: ",
                "ERROR: negative number not allowed. ");
        int[] finalList = new int[array.length];

        if (totalPenalizedRunners > 0) {
            boolean validNumber;
            do {
                int penalizedRunner = getPositiveNumber(1,
                        "Enter a penalized runner number: ",
                        "ERROR: number must be at least '1'. ");
                validNumber = checkRunnerNumber(array,
                        penalizedRunner, 0);
                if (!validNumber) {
                    System.out.printf("ERROR: '%d' isn't a valid runner"
                            + " number. ", penalizedRunner);
                } else {
                    finalList[counter++] = penalizedRunner;
                }
            } while (counter < totalPenalizedRunners);
        }

        for (int i = 0; i < array.length; i++) {
            boolean found = false;
            for (int j = 0; j < totalPenalizedRunners && !found; j++) {
                found = array[i] == finalList[j];
            }
            if (!found) {
                finalList[counter++] = array[i];
            }
        }

        return (finalList);
    }

    public static void main(String[] args) {
        int totalCompetitors;
        totalCompetitors = getPositiveNumber(3,
                "Enter a number of competitors: ",
                "ERROR: the minimum number of competitors is '3'. ");
        int[] runnerList = new int[totalCompetitors];
        fillList(runnerList);

        System.out.println("\nRunner list:" + Arrays.toString(runnerList));

        youngerRunners(runnerList);
        System.out.println("\nRunner list:" + Arrays.toString(runnerList));

        int[] newList = disqualifiedRunners(runnerList);
        System.out.println("\nRunner list:" + Arrays.toString(newList));

        int[] finalList = penalizeRunners(newList);
        System.out.println("\nRunner list:" + Arrays.toString(finalList));

        System.out.println("GOLD: " + finalList[finalList.length - 1]);
        System.out.println("SILVER: " + finalList[finalList.length - 2]);
        System.out.println("BRONZE: " + finalList[finalList.length - 3]);

    }
}
