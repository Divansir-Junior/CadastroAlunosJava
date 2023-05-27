
public class Alunos {
	private String name;
	private int idade;
	private String nMatricula;
	
	public Alunos() {
		
	}

	public Alunos(String name, int idade, String nMatricula) {
		super();
		this.name = name;
		this.idade = idade;
		this.nMatricula = nMatricula;
	}
	

	public Alunos(String name, int idade) {
		super();
		this.name = name;
		this.idade = idade;
		
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getnMatricula() {
		return nMatricula;
	}

	public void setnMatricula(String nMatricula) {
		this.nMatricula = nMatricula;
	}
	
	
	public String toString() {
		return "Dados : " + "NOME:"+ " " + name + " " + "IDADE:" + idade + " " + "MATRICULA:" + nMatricula + "||";
	}
	
	
}
