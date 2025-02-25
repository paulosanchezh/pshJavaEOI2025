public class BooksTest {
    public static void main(String[] args) {
        Author autor = new Author('m',"furbo@furbo", "Juan Castaña");
        Book libro = new Book("Castaña dorada", autor, 23.4);
        System.out.println(libro.toString());
    }
}
