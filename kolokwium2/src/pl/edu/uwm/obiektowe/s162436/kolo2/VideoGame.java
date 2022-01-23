package pl.edu.uwm.obiektowe.s162436.kolo2;

public class VideoGame extends Product{
    String genre;
    String studio;
    int pegi;

    public VideoGame(String name, long id, double price, String genre, String studio, int pegi) {
        super(name, id, price);
        this.genre = genre;
        this.studio = studio;
        this.pegi = pegi;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", studio='" + studio + '\'' +
                ", pegi=" + pegi +
                '}';
    }
}
