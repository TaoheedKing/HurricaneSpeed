import java.util.Scanner;

public class Hurricane {
    public static void main(String[] args){
        Scanner keyboard =  new Scanner(System.in);
        System.out.println("Please enter your speed");
        int speed = keyboard.nextInt();
        String category;

        if (speed >= 74 && speed <= 95){
            category = "Category 1";
            System.out.println(category);
        } else if (speed >= 97 && speed <= 110){
            category = "Category 2";
            System.out.println(category);
        } else if (speed >= 111 && speed <= 129) {
            category = "Category 3";
            System.out.println(category);
        } else if (speed >= 130 && speed <= 156) {
            category = "Category 4";
            System.out.println(category);
        } else if (speed >= 157) {
            category = "Category 5";
            System.out.println(category);
        } else {
            System.out.println("Invalid input! program exiting.");
        }
    }
}
