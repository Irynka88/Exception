public class ExceptionClass {

    public void method1(){
        try{
            int arr[] = new int[4];
            arr[7] = 5;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Виняток ArrayIndexOutOfBoundsException: " + e.getMessage());
        }catch(IndexOutOfBoundsException e){
            System.out.println("Виняток IndexOutOfBoundsException: " + e.getMessage());

        }
    }

    public void method2(){
        try {
            try {
                int a = 5/0;
            }catch (ArithmeticException e){
                System.out.println("Виняток ArithmeticException: " + e.getMessage());
            }
        }catch (Exception e){
            System.out.println("Виняток Exception: "+ e.getMessage());
        }

    }

    public void method3(){
        try {
            int[] arr = new int[5];
            arr[6] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Виняток ArrayIndexOutOfBoundsException: " + e.getMessage());
        }finally {
            System.out.println("Виконався блок finally.");
        }

    }



}
