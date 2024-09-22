public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Exodus from the Country of Hope"));
        bookShelf.appendBook(new Book("The Wind-Up Bird Chronicle"));
        bookShelf.appendBook(new Book("Hear the Wind Sing"));
        bookShelf.appendBook(new Book("From the Fatherland,with Love"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
            
        }
    }
}