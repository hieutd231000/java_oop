package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title,category,cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {

        return  super.getTitle() +
                "-" + super.getCategory() +
                "-" + director +
                "-" + length +
                ":" + super.getCost() + "$";
    }

    public boolean search(String title){
        if(title == null){
            return false;
        }
        String[] titleArr = super.getTitle().split(" ");
        for(int i=0; i< titleArr.length; i++){
            if(title.equalsIgnoreCase(titleArr[i])){
                return true;
            }
        }
        return false;
    }
}

