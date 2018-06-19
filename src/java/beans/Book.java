
package beans;

/**
 *
 * @author Lighters
 */
public class Book {
    
    String bookname;
    String booisbn;
    String booktype;
    String press;
    int stock;
    String auhor;
    double price;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBooisbn() {
        return booisbn;
    }

    public void setBooisbn(String booisbn) {
        this.booisbn = booisbn;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAuhor() {
        return auhor;
    }

    public void setAuhor(String auhor) {
        this.auhor = auhor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "bookname=" + bookname + ", booisbn=" + booisbn + ", booktype=" + booktype + ", press=" + press + ", stock=" + stock + ", auhor=" + auhor + ", price=" + price + '}';
    }
    
    
}
