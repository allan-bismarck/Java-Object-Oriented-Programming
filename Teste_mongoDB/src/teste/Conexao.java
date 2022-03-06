package teste;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import java.net.UnknownHostException;

public class Conexao {
    
    private Mongo conexao;
    private DB db;
    
    public void addPessoa(Contato c) throws UnknownHostException, MongoException  {
        this.conexao = new Mongo("localhost");
        this.db = conexao.getDB("contato");
        
        try {
            BasicDBObject pessoa = new BasicDBObject();
            pessoa.put("nome",c.getNome());
            pessoa.put("idade", c.getIdade());
            pessoa.put("telefone", c.getTelefone());
            pessoa.put("endereco", c.getEndereco());
            pessoa.put("email", c.getEmail());
            
            DBCollection col = db.getCollection("contato");
            col.insert(pessoa);
            
        } catch(Exception e) {
            System.err.println(e.getClass().getName() + "," + e.getMessage());
        }
    }
    
    public void buscar() throws UnknownHostException, MongoException  {
        this.conexao = new Mongo("localhost");
        this.db = conexao.getDB("contato");
        
        try {
            DBCursor cursor = db.getCollection("contato").find();
            System.out.println("---");
            while(cursor.hasNext()) {
                BasicDBObject pessoa = (BasicDBObject)cursor.next();
                System.out.println("nome:"+pessoa.getString("nome"));
                System.out.println("idade:"+pessoa.getInt("idade"));
                System.out.println("Telefone"+pessoa.getInt("telefone"));
                System.out.println("Endereco"+pessoa.get("endereco"));
                System.out.println("Email"+pessoa.getString("email"));
                System.out.println("----");
            }
        } catch(Exception e) {
            System.err.println(e.getClass().getName() + "," + e.getMessage());
        } 
    }
}
