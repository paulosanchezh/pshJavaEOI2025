public class Movie {
    private String title;
    private String director;
    private int year;

    Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}
