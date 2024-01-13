package persistencia;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import negocio.Instrutor;

/**
 *
 * @author jasom
 */
public class ControlaInstrutor {
   
    private ArrayList <Instrutor> instrutor = new ArrayList<>(200);

   
    public boolean salvar(Instrutor ci){
        if(ci != null){
         instrutor.add(ci);
        }else {
            return false;
        }
        return true;
    }
    
    public boolean salvarEmArquivo(String path) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))) {
        for (Instrutor inst : instrutor) {
            bw.write(inst.getNome() + "," + inst.getSobrenome() + "," +
                     inst.getTreinamento() + "," + inst.getEndereco() + "," +
                     inst.getNumero());
            bw.newLine();
        }
        return true;
    } catch (IOException e) {
        e.printStackTrace();
        return false;
        }
    }


    public ArrayList <Instrutor> retornarTodos(){
        return instrutor;
    }  
}
