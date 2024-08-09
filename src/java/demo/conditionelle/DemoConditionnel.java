package java.demo.conditionelle;

public class DemoConditionnel {


    public static void main(String[] args) {


        int temp = 18;
        if (temp >= 5 && temp <= 15) {
            System.out.println("J'allume la chaudiere ");
        } else if (temp < 5) {
            System.out.println("J'allume le poele ");
        } else {
            System.out.println("J'éteind la chaudière");
        }


        int age = 58;
        if (age < 0) {
            System.out.println("Age invalide ");
        } else if (age < 12) {
            System.out.println("Enfant");
        } else if (age < 18) {
            System.out.println("Adolescent");
        } else if (age < 67) {
            System.out.println("Adult");
        } else {
            System.out.println("Retrait");
        }


        age = 18;
        switch (age) {
            case 0:
                System.out.println("Vous étes né");
                break;
            case 13:
                System.out.println("adolescence tardive");
                break;
            case 12:
                System.out.println("c'est le debout de l'adolescence ");
                break;
            case 18:
                System.out.println("Vous devenez adulte");
                break;
            case 67:
                System.out.println("C'est la retraite");
                break;
            default:
                System.out.println("Rien de particulier ");


        }


    }


}
