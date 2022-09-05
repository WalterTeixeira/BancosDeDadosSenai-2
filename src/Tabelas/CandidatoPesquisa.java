package Tabelas;

public class CandidatoPesquisa{

    private int idcandidatoxpesquisa;
    private int votos;
    private Candidatos candidato;
    private Pesquisa pesquisa;

    public CandidatoPesquisa(int idcandidatoxpesquisa, int votos, Candidatos candidato, Pesquisa pesquisa) {
        this.idcandidatoxpesquisa = idcandidatoxpesquisa;
        this.votos = votos;
        this.candidato = candidato;
        this.pesquisa = pesquisa;
    }

    public int getIdcandidatoxpesquisa() {
        return idcandidatoxpesquisa;
    }

    public void setIdcandidatoxpesquisa(int idcandidatoxpesquisa) {
        this.idcandidatoxpesquisa = idcandidatoxpesquisa;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public Candidatos getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidatos candidato) {
        this.candidato = candidato;
    }

    public Pesquisa getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(Pesquisa pesquisa) {
        this.pesquisa = pesquisa;
    }
}

