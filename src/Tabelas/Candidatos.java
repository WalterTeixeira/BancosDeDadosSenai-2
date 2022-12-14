package Tabelas;

public class Candidatos {
    private int idcandidatos;
    private String fichaLimpa;
    private String nome;
    private String partido;

    public Candidatos() {
        this.idcandidatos = idcandidatos;
        this.fichaLimpa = fichaLimpa;
        this.nome = nome;
        this.partido = partido;
    }

    public int getIdcandidatos() {
        return idcandidatos;
    }

    public void setIdcandidatos(int idcandidatos) {
        this.idcandidatos = idcandidatos;
    }

    public String getFichaLimpa() {
        return fichaLimpa;
    }

    public void setFichaLimpa(String fichaLimpa) {
        this.fichaLimpa = fichaLimpa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String toString(){
        return nome + " - " + partido;
    }
}

