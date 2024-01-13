package Application;



import apresentacao.Principal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import negocio.Instrutor;
import persistencia.ControlaInstrutor;


/**
 *
 * @author jasom
 */
public class SistemaCadastroPrv {

    public static void main(String[] args) {
        
        ControlaInstrutor ci = new ControlaInstrutor();
        String path = "c:\\temp\\instrutores.csv";
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            
            
            while(line != null){
                String[] fields = line.split(",");
                String nome = fields[0];
                String sobrenome = fields[1];
                String Treinamento = fields[2];
                String Endereco = fields[3];
                String numero = fields[4];
                
                Instrutor inst = new Instrutor(nome, sobrenome, Treinamento, Endereco, numero);
                
                ci.salvar(inst);
                
                line = br.readLine();
            }

        } 
        catch(IOException e){
            e.printStackTrace();
        }
       
        Principal principal = new Principal(ci);    
        principal.setVisible(true);
    }
      
}
