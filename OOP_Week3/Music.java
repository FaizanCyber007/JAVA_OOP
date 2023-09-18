public class Music {
    private String title;
    private String duration;
    private String genre;
    private Date releasDate;
    private Singer singer;

    Music(String title, String duration, String genre, Date releasDate, Singer singer) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.releasDate = releasDate;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleasDate() {
        return releasDate;
    }
    public void setReleasDate(Date releasDate) {
        this.releasDate = releasDate;
    }

    public Singer getSinger() {
        return singer;
    }
    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String toString() {
        return String.format("Title: %s \nDuration: %s \nGenre: %s \nRelease Date: %s \n%s",title,duration,genre,releasDate,singer);
    }
}
