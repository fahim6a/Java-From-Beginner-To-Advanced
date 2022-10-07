class library{
    String [] books;
    int no_Of_Books;
    //constructor
    library(){
        this.books = new String[100];
        this.no_Of_Books=0;
    }
    public void addBook(String book){
      //Array to store AddBook
      this.books[no_Of_Books]=book;
      no_Of_Books++;
        System.out.println(book+" has been added");
    }
    public void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
                if (this.books[i].equals(book)) {
                    System.out.println("Book has been issued!.");
                    this.books[i] = null;
                    return;
                }
            }
        System.out.println("This book does not exist");
        }
    public void returnBook(String book){
     addBook(book);
    }
    public void showAvailableBook(){
        //Array to store showAvailableBook
        System.out.println("Available books are: ");
        for (String book:this.books) {
            if (book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
}
public class Online_Library {
    public static void main(String[] args) {
    library li = new library();
    //add book
    li.addBook("Think and grow Rich");
    li.addBook("Algorithm");
    li.addBook("Database");
    li.addBook("Compiler");
    //call showAvailableBook
    li.showAvailableBook();
    //call IssueBook
        li.issueBook("Algorithm");
        li.showAvailableBook();
        li.returnBook("Algorithm");
        li.showAvailableBook();
    }
}
