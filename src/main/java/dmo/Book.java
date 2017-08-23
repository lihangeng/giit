package dmo;

public class Book extends BookKey {
    private String dateOfPrinting;

    private String author;

    private String press;

    private String category;

    private Float unitPrice;

    public String getDateOfPrinting() {
        return dateOfPrinting;
    }

    public void setDateOfPrinting(String dateOfPrinting) {
        this.dateOfPrinting = dateOfPrinting == null ? null : dateOfPrinting.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press == null ? null : press.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }
}