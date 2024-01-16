package Application;



import apresentacao.InitialMenu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import negocio.Cliente;
import negocio.Instrutor;
import persistencia.ControlaCliente;
import persistencia.ControlaInstrutor;


/**
 *
 * @author jasom
 */
public class SistemaCadastroPrv {

    public static void main(String[] args) {
        
        ControlaInstrutor ci = new ControlaInstrutor();
        ControlaCliente cc = new ControlaCliente();
        String path = "c:\\temp\\instrutores.csv";
        String pathC = "c:\\temp\\clientes.csv";
        
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
        
          try(BufferedReader br = new BufferedReader(new FileReader(pathC))){
            String line = br.readLine();
            
            
            while(line != null){
                String[] fields = line.split(",");
                String razaoSocial = fields[0];
                String nomeFantasia = fields[1];
                String cnpj = fields[2];
                String atividade = fields[3];
                String descricao = fields[4];
                
                Cliente cliente = new Cliente(razaoSocial, nomeFantasia, cnpj, atividade, descricao);
                
                cc.salvar(cliente);
                
                line = br.readLine();
            }

        } 
        catch(IOException e){
            e.printStackTrace();
        }
          
          
        InitialMenu initialMenu = new InitialMenu(ci, cc);
        initialMenu.setVisible(true);
        initialMenu.setLocationRelativeTo(null);
    }
      
}
