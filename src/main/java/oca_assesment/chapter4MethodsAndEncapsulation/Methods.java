package main.java.oca_assesment.chapter4MethodsAndEncapsulation;


public class Methods {
    public static void main(String[] args) {
        Methods test = new Methods();
        test.staticMethodsCanBeCalledOnANullObjectReferingToAClass();

    }

    public static void aStaticPrintout(String textToPrint){
        System.out.println(textToPrint);
    }
    public void staticMethodsCanBeCalledOnANullObjectReferingToAClass() {
        Methods objectReference = new Methods();
        Methods.aStaticPrintout("calling a static method on the Methods class");  // notice both are public.
        objectReference.aStaticPrintout("calling a static method on an instance of type Methods");  // notice both are public.
        objectReference = null;
        objectReference.aStaticPrintout("calling a static method on an instance that is null but still of type Methods");  // object becomes null but still refers to a Methods class so you can still call static methods on it !!
    }
}