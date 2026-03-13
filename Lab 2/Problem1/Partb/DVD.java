package Problem1.Partb;

public class DVD extends LibraryItem {
    private int duration;
    private String genre;

    public DVD(String t, String a, int p,int d,String g){
        super(t, a, p);
        this.duration=d;
        this.genre=g;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }
    
    @Override
    public String toString() {
        return super.toString()+", Duration: "+duration+" min, Genre: "+genre;
    }
}
