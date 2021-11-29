package HomeAssignments;

public class Book {
    private String BookTitle;
    private float BookPrice;

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.BookTitle = bookTitle;
    }

    public float getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.BookPrice = bookPrice;
    }
}

class MainClass{

    private Book[] books ;
    public void createBook(int n)
    {
//        Scanner sc=new Scanner(System.in);
//        Book b = new Book();
        books = new Book[n];
        books[0] = new Book();
        books[1] = new Book();
//        String t = sc.nextLine();
        books[0].setBookTitle("Java");
//        float p = sc.nextFloat();
        books[1].setBookTitle("Python");
        books[0].setBookPrice(87);
        books[1].setBookPrice(32);

    }

    public void showBooks(){
        System.out.println("Books \t Price");
        for (Book b : books
             ) {
            System.out.println(b.getBookTitle() + " \t " + b.getBookPrice());
        }
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 2;
        MainClass obj = new MainClass();
        obj.createBook(n);
        obj.showBooks();
    }
}
