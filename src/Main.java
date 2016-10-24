public class Main {

    public static void main(String[] args) {
        ExceptionSample exSample = new ExceptionSample();
        try {
            exSample.sendEx();
        } catch (MyException e) {
            System.out.println("Moj wyjatek");
        }
    }
}
