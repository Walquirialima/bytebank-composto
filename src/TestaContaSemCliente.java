
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaWalquiria = new Conta();
		System.out.println(contaDaWalquiria.getSaldo());
		
		
		contaDaWalquiria.titular = new Cliente();
		System.out.println(contaDaWalquiria.titular);
		
		contaDaWalquiria.titular.nome = "Walquiria";
		System.out.println(contaDaWalquiria.titular.nome);
	}

}
