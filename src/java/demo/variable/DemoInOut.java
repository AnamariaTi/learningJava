package java.demo.variable;

import java.util.Scanner;

public class DemoInOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //veuillez entre un mot
        System.out.println("Veuillez entrer un mot : ");
        //mot
        String input = sc.nextLine();
        // votre mot : mot
        System.out.println("Votre mot "+ input);
    }
}
