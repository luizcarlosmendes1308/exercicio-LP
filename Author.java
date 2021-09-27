package author;
public class Author {

	private String name, email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return this.gender;
	}

	public String toString() {
		return "Author[name=" +this.name+ ",email=" +this.email+ ",gender=" +this.gender+ "]";
	}

	
	public static void main(String[] args)
	{
		Author autor1 = new Author("Luiz","luiz.mendes@gmail.com",'m');
		System.out.println(autor1.toString());

		Author autor2 = new Author("Ketheleen","ketheleen.cristine@hotmail.com",'f');
		System.out.println(autor2.toString());

		autor1.setEmail("luiz@luiz");
		autor2.setEmail("ketheleen@ketheleen");

		System.out.println("Autor 1: Nome: "+autor1.getName()+" Email: "+autor1.getEmail()+" Genero: "+autor1.getGender());
		System.out.println("Autor 2: Nome: "+autor2.getName()+" Email: "+autor2.getEmail()+" Genero: "+autor2.getGender());
	}
}