package HelloWorld;

public class HelloWorld {

    private String message;

    public HelloWorld(){
        message = "HELLO WORLD!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        new HelloWorld();
    }

}
