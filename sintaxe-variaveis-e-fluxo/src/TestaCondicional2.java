
public class TestaCondicional2 {
	public static void main(String[] args) {
		
		System.out.println("Testado condicionais");
		int idade = 16;
		//int quantidadePessoas = 3;
		boolean acompanhado = true;
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
				System.out.println("N�o pode entrar");
		}
	}
}
