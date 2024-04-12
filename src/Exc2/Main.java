package Exc2;

public class Main {
    public static void main(String[] args) {

        SecondClass secondClass = new SecondClass();
        secondClass.setPrivateVariable(-1);

        try {
            secondClass.method1();
        }catch (MyException e){
            System.out.println("Власний виняток " + e.getMessage());
        }

        try {
            secondClass.method2();
        }catch (MyException e){
            System.out.println("Власний виняток " + e.getMessage());
        }

        try {
            secondClass.method3();
        }catch (MyException e){
            System.out.println("Власний виняток " + e.getMessage());
        }

    }
}
