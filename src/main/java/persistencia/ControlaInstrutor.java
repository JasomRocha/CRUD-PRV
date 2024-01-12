package persistencia;



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
    
    public void updateArray(ArrayList <Instrutor> inst ){
        instrutor = inst;
    }
    
    public ArrayList <Instrutor> retornarTodos(){
        return instrutor;
    }
}
