package Scene1;

import java.sql.Timestamp;
import java.util.Date;

public class InfoTable {
    int bookId;
    String name;
    String date;

    public InfoTable(int bookId, String name, String date) {
        this.bookId = bookId;
        this.name = name;
        this.date = date;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
