class ExceptionSample {
    public void sendEx() throws MyException {
        System.out.println("Zgłoszenie wyjątku");
        throw new MyException();
    }
}