public class Pessoa{
	private int codigoPessoa;
	private String nomePessoa;
	
	public Pessoa(int codigoPessoa, String nomePessoa){
		this.codigoPessoa = codigoPessoa;
		this.nomePessoa = nomePessoa;
	}
	
	public static void main(String[]args){
		Pessoa pessoa = new Pessoa(1, "Fernando Vieira");
		System.out.println(pessoa.codigoPessoa+" - "+pessoa.nomePessoa);
	}
}	