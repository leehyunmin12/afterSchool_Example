package instance;

public class Song {
    private String title;
    private String singer;
    private int year;
    private String country;

    public Song(String title, String singer, int year, String country){
        this.title = title;
        this.singer = singer;
        this.year = year;
        this.country = country;
    }
    void show(){
        System.out.print(year+"년 "+country+"의 "+singer+"가 부른 "+title);
    }

    public static void main(String[] args) {
        Song song = new Song("좋다고 말해","볼빨간사춘기",2016, "대한민국");
        song.show();
    }

}
