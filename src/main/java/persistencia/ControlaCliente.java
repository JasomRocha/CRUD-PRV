package persistencia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import negocio.Cliente;



public class ControlaCliente {
      private ArrayList <Cliente> clientes = new ArrayList<>(200);

   
    public boolean salvar(Cliente cc){
        if(cc != null){
         clientes.add(cc);
        }else {
            return false;
        }
        return true;
    }
    
   
    public boolean salvarEmArquivo(String pathC) {
    
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathC, false))) {
        for (Cliente inst : clientes) {
            bw.write(inst.getRazaoSocial() + "," + inst.getNomeFantasia() + "," +
                     inst.getCnpj() + "," + inst.getAtividade() + "," +
                     inst.getDescricao());
            bw.newLine();
        }
        return true;
    } 
    
    catch (IOException e) {
        e.printStackTrace();
        return false;
        }
    }

    public ArrayList <Cliente> retornarTodos(){
        return clientes;
    }  
    
    public ArrayList <Cliente> ordenarTabela(ArrayList <Cliente> clientes){
        Collections.sort(clientes);
        return clientes;
    }
    
}
