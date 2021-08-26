package Ex1;


public class Book implements IDisplay , IInput{
    private String bookID;
    private String title;
    private String publisher;


    @override
    void print(){
        System.out.println("Book ID  " + this.bookId + 
				" Book title  " + this.title + 
				" Publisher   " + this.publisher);
    } 


    @Override
	void printDetails(){
        System.out.println("Book ID  " + this.bookId );
		System.out.println("Book title " + this.title );
		System.out.println("Publisher " + this.publisher);
    }
    

    @override
    void input(){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book ID");
		this.bookId = sc.nextInt();
		
		System.out.println("Enter the book title");
		this.title = sc.next();
		
		System.out.println("Enter the publisher");
		this.publisher = sc.next();
    }
}