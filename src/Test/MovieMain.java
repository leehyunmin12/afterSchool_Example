package Test;

class Movie {
    private String title, like, manager, year;

    public Movie() {}

    public Movie(String title, String like, String manager, String year) {
        this.title = title;
        this.like = like;
        this.manager = manager;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "제목 ='" + title + '\'' +
                ", 평점='" + like + '\'' +
                ", 감독='" + manager + '\'' +
                ", 연도='" + year + '\'' +
                '}';
    }
}

public class MovieMain {
    public static void main(String[] args) {
        Movie movies[] = {
                new Movie("범죄도시", "4.6", "이현민", "2024"),
                new Movie("기생충", "4.3", "연정훈", "2027")
        };

        for(int i=0; i<movies.length; i++) System.out.println(movies[i]);
        for(Movie m : movies) System.out.println(m);
    }
}
