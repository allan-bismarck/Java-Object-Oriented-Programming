import com.mongodb.BasicDBList;
import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.util.*;
import java.io.FileWriter;
import java.io.IOException;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.*;


public class Conexao {
	
	private Mongo conexao;
	private DB db;
        
        
        
	public void addPessoa(Contato c) throws UnknownHostException, MongoException {
		this.conexao = new Mongo("127.0.0.1");
		this.db = conexao.getDB("contatos");
		
		try {
                        BasicDBObject pessoa = new BasicDBObject();
                        BasicDBList lista = new BasicDBList();
			pessoa.put("nome", c.getNome());
			pessoa.put("idade", c.getIdade());
			pessoa.put("telefone", c.getTelefone());
			pessoa.put("endereco", c.getEndereco());
			pessoa.put("email", c.getEmail());
                        pessoa.put("lista", lista);
			
                        DBCollection col = db.getCollection("contatos");
			col.insert(pessoa);
            	} catch(Exception e){
			System.err.println(e.getClass().getName() + ", " + e.getMessage());
			
		}
	}
	
	public void buscar() throws UnknownHostException, MongoException {
		this.conexao = new Mongo("127.0.0.1");
		this.db = conexao.getDB("contatos");
		
		try {
			DBCursor cursor = db.getCollection("contatos").find();
			System.out.println("---");
			while(cursor.hasNext()) {
				BasicDBObject pessoa = (BasicDBObject) cursor.next();
				System.out.println("Nome " + pessoa.getString("Nome"));
				System.out.println("Idade " + pessoa.getInt("idade"));
				System.out.println("Telefone " + pessoa.getInt("telefone"));
				System.out.println("Endereco " + pessoa.getString("endereco"));
				System.out.println("Email " + pessoa.getString("email"));
                                pessoa.append("lista", "caralho");
                                System.out.println(pessoa.get("lista"));
				System.out.println("----");
			}
		} catch(Exception e){
			System.err.println(e.getClass().getName() + ", " + e.getMessage());
			
		}
	}
        


}
