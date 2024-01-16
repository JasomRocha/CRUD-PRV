/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author jasom
 */
public class Cliente implements Comparable <Cliente>{
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;
    public String atividade;
    public String descricao;

    public Cliente()  {
    }

    
    public Cliente(String razaoSocial, String nomeFantasia, String cnpj, String atividade, String descrição) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.atividade = atividade;
        this.descricao = descrição;
    }

 
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescrição(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int compareTo(Cliente other) {
        return nomeFantasia.compareTo(other.getNomeFantasia());
    }
    
    
}
