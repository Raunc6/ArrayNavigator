import java.util.Scanner;

public class Navigator {
    private int [] arrayOfNumbers;
    private int currentNumber = 0;

    public Navigator(int[] arrayOfNumber) {
        this.arrayOfNumbers = arrayOfNumber;
        this.currentNumber = currentNumber;
    }

    public void forward() {
        if (currentNumber < arrayOfNumbers.length - 1) {
            currentNumber++;
        } else {
            System.out.println("You're at the end of the array! Try backing up!");
        }
    }

    public void backwards() {
        if (currentNumber > 0) {
            currentNumber--;
        } else {
            System.out.println("You're at the beginning of the array! Try going forward!");
        }
    }

    public void printCurrentNumber () {
        System.out.println("You're current element is: " + currentNumber);
    }

    public static void main(String[] args) {
        int[] myArrayOfNumbers = {0,1,2,3,4,5,6,7,8,9};
        Navigator arrayNavigator = new Navigator(myArrayOfNumbers);
        Scanner scanner = new Scanner(System.in);
        String userInput;
        while (true) {
            System.out.println("Enter a command to navigate through the list:");
            System.out.println("r to move forward.");
            System.out.println("e to move backwards.");
            System.out.println("p to print out the current element.");
            System.out.println("q to quit the program.");
            userInput = scanner.nextLine();
            if (userInput.equals("r")) {
                arrayNavigator.forward();
            } else if (userInput.equals("e")) {
                arrayNavigator.backwards();
            } else if (userInput.equals("p")) {
                arrayNavigator.printCurrentNumber();
            } else if (userInput.equals("q")) {
                break;
            } else {
                System.out.println("Incorrect input - try again!");
            }
        }
    }
}
