package Facade_design;

public class Main {
    public static void main(String[] args){
        DvdPlayer dvd=new DvdPlayer();
        Projector projector=new Projector();
        HomeTheatrefacade hometheatre=new HomeTheatrefacade(dvd,projector);
        hometheatre.watchMovie("Inception");
    }

}
