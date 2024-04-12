package Exc2;

public class SecondClass {
    private int privateVariable;

    public void setPrivateVariable(int value){
        privateVariable = value;
    }

    public int getPrivateVariable(){
        return privateVariable;
    }
    public void method1() throws MyException{
        if (privateVariable < 0){
            throw new MyException("privateVariable від'ємне число");
        }
    }

    public void method2() throws MyException{
        if (privateVariable == 0 ){
            throw new MyException("privateVariable = 0");
        }
    }

    public void method3() throws MyException{
        if (privateVariable > 0){
            throw new MyException("privateVariable додатнє число");
        }
    }
}
