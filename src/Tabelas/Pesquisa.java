package Tabelas;

public class Pesquisa {

    private int idPesquisa;
    private String institutopesquisa;
    private String datapesquisa;
    private String medialidade;
    private String uf;
    private String formatopesquisa;
    private String tipopesquisa;

    public Pesquisa() {
        this.idPesquisa = idPesquisa;
        this.institutopesquisa = institutopesquisa;
        this.datapesquisa = datapesquisa;
        this.medialidade = medialidade;
        this.uf = uf;
        this.formatopesquisa = formatopesquisa;
        this.tipopesquisa = tipopesquisa;
    }

    public int getIdPesquisa() {
        return idPesquisa;
    }

    public void setIdPesquisa(int idPesquisa) {
        this.idPesquisa = idPesquisa;
    }

    public String getInstitutopesquisa() {
        return institutopesquisa;
    }

    public void setInstitutopesquisa(String institutopesquisa) {
        this.institutopesquisa = institutopesquisa;
    }

    public String getDatapesquisa() {
        return datapesquisa;
    }

    public void setDatapesquisa(String datapesquisa) {
        this.datapesquisa = datapesquisa;
    }

    public String getMedialidade() {
        return medialidade;
    }

    public void setMedialidade(String medialidade) {
        this.medialidade = medialidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getFormatopesquisa() {
        return formatopesquisa;
    }

    public void setFormatopesquisa(String formatopesquisa) {
        this.formatopesquisa = formatopesquisa;
    }

    public String getTipopesquisa() {
        return tipopesquisa;
    }

    public void setTipopesquisa(String tipopesquisa) {
        this.tipopesquisa = tipopesquisa;
    }
}
