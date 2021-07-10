
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente walquiria = new Cliente();
		walquiria.nome = "Walquiria Lima";
		walquiria.cpf = "111.111.111 - 11";
		walquiria.profissão = "programadora";
		
		Conta contaDaWalquiria = new Conta();
		contaDaWalquiria.deposita(100);
		
		contaDaWalquiria.titular = walquiria;
		System.out.println(contaDaWalquiria.titular.nome);
		System.out.println(contaDaWalquiria.titular);
		
	}

}
