package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 5;

        if (selection == 1) {
            System.out.println("Hello! Thank you for your call!");
        }else if (selection == 2) {
            System.out.println("Hola Gracias para llamar");
        }else if (selection == 3) {
            System.out.println("merhaba aradığınız için teşekkür ederim");
        }else if (selection == 4) {
            System.out.println("Privet! Spasibo za zvonok");
        }else if (selection ==5) {
            System.out.println("bonjour, merci d'avoir appelé");
        }else{
            System.out.println("Let's talk java and English, hello!");


        }
    }
}
