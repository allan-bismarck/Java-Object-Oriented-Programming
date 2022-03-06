package teste;

import com.mongodb.MongoException;
import java.net.UnknownHostException;

public class Teste_mongoDB {
    public static void main(String[] args) throws UnknownHostException, MongoException {
        Contato c1 = new Contato("JOAO", 35, 88889999, "Rua 4", "JOAO@univasf.com");
        Conexao conexao = new Conexao();
        conexao.addPessoa(c1);
        //conexao.buscar();
    }
    
}
