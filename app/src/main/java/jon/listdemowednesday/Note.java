package jon.listdemowednesday;
public class Note {
    private String text;
    private int image;
    public Note(String text, int image) {
        this.text = text;
        this.image = image;
    }
    public Note(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
