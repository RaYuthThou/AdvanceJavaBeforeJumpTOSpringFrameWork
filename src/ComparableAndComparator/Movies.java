package ComparableAndComparator;


import java.util.Comparator;

public class Movies implements Comparable<Movies>{
    private String nameMovies;
    private double rating;
    private int years;
    public Movies(String nameMovies, double rating, int years) {
        this.nameMovies = nameMovies;
        this.rating = rating;
        this.years = years;
    }

    @Override
    public int compareTo(Movies m){
        return this.nameMovies.compareTo(m.nameMovies);
    }


    @Override
    public String toString() {
        return "Movies{" +
                "nameMovies='" + nameMovies + '\'' +
                ", rating=" + rating +
                ", years=" + years +
                '}';
    }

    public String getNameMovies() {
        return nameMovies;
    }

    public void setNameMovies(String nameMovies) {
        this.nameMovies = nameMovies;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
