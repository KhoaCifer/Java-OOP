package data;

public class BookManagement {
    private String name;
    private String author;
    private int money;
    public BookManagement(String name, String author, int money) {
        this.name = name;
        this.author = author;
        this.money = money;
    }
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void insertBookInformation() {
        System.out.printf("The book's information:\nBook name: %s\nAuthor: %s\nPrice: %d\n", name, author, money);
    }
}
