import java.net.UnknownHostException;

import com.mongodb.MongoException;

public class Testador {

	public static void main(String[] args) throws UnknownHostException, MongoException {
		
		//Contato c1 = new Contato("Joazinho", 25, 63525262, "Rua do joao", "Jao@todas.com");
		//Contato c2 = new Contato();
		
		Conexao conexao = new Conexao();
		
		//conexao.addPessoa(c1);
		conexao.buscar();
		

	}

}
