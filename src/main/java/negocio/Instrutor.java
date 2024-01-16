package negocio;

/**
 *
 * @author jasom
 */
public class Instrutor implements Comparable <Instrutor> {
    private String nome;
    private String sobrenome;
    private String Treinamento;
    private String endereco;
    private String numero;

    public Instrutor(String nome, String sobrenome, String Treinamento, String endereco, String numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.Treinamento = Treinamento;
        this.endereco = endereco;
        this.numero = numero;
    }
    
    public Instrutor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTreinamento() {
        return Treinamento;
    }

    public void setTreinamento(String Treinamento) {
        this.Treinamento = Treinamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Instrutor{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", Treinamento=" + Treinamento + ", endereco=" + endereco + ", numero=" + numero + '}';
    }

  
    @Override
    public int compareTo(Instrutor other) {
        return nome.compareTo(other.getNome());
    }
     
}
