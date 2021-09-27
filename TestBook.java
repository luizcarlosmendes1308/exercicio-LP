package author;
import java.util.Arrays;

public class TestBook {
  public static void main(String[] args)
	{
    Author[] authors = new Author[2];
    authors[0] = new Author("Luiz","luiz.mendes@gmail.com",'M');
    authors[1] = new Author("Ketheleen","ketheleen.cristine@hotmail.com",'F');

    Book theBook = new Book("A lua", authors, 40.1, 51);

    System.out.println("Nome: "+theBook.getName());
    System.out.println("Preço: "+theBook.getPrice());
    System.out.println("Qtd: "+theBook.getQty());
    System.out.println("Authors Array: "+ Arrays.toString(theBook.getAuthors()));
    System.out.println("Authors Nomes: "+theBook.getAuthorNames());
    System.out.println("Livro: "+theBook.toString());


    theBook.setPrice(57.50);
    theBook.setQty(120);

    System.out.println("Preço: "+theBook.getPrice());
    System.out.println("Qtd: "+theBook.getQty());

    
      Student student = new Student("Luiz","luiz.mendes@gmail.com","AVG",10,1.40);
      System.out.println(student.toString());

      Staff staff = new Staff("Ketheleen","ketheleen.cristine@hotmail.com","I-LIVE",120 );
      System.out.println(staff.toString());




  }
}