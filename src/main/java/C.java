public class C {


    private String hello;

    public void say(){

        hello = "hello";
        lastName();
        lastName();
        System.out.println(hello);

    }

    private void lastName() {
        System.out.println(hello);
        System.out.println(hello);
    }


}
