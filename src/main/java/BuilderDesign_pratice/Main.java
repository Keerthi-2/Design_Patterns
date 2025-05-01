package BuilderDesign_pratice;

public class Main {
    public static void main(String[] args){
        Restapi.Builder Builder=new Restapi.Builder();

        Builder=Builder.setUrl("google.com").
                setHeaders("content:application/json").
                setUsername("ashok kumar");
        Restapi restapiMain=Builder.build();

        System.out.println(Builder);
//        Restapi.Builder inner_class=new Restapi.Builder();
        System.out.println(restapiMain);

    }
}
