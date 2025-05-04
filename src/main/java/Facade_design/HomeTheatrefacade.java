package Facade_design;

public class HomeTheatrefacade {
    DvdPlayer dvd;
    Projector projector;
    public HomeTheatrefacade(DvdPlayer dvd, Projector projector) {
        this.dvd = dvd;
        this.projector = projector;

    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        dvd.on();
        projector.on();

        dvd.play(movie);
    }
}
