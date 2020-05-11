package Scene1;

public class ModelTable {
    String name, author, pub_date;
    int quantity;

    public ModelTable(String name, String author, String pub_date, int quantity) {
        this.name = name;
        this.author = author;
        this.pub_date = pub_date;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPub_date() {
        return pub_date;
    }

    public void setPub_date(String pub_date) {
        this.pub_date = pub_date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
