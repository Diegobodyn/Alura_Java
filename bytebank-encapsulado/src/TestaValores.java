
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
	
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1611313);
		
		Conta conta2 = new Conta(1337, 1654846);
		Conta conta3 = new Conta(2112, 6540646);
		
		System.out.println(Conta.getTotal());
		
	}

}
