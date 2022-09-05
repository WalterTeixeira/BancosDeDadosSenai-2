package Controller;

import DAO.CandidatoPesquisaDAO;
import Tabelas.CandidatoPesquisa;

public class CandidatoPesquisaController {

    public void registrarVotos(CandidatoPesquisa candidatopesquisa) throws Exception {
        if(candidatopesquisa.getPesquisa() == null) {
            throw new Exception("Pesquisa Inválida");
        }
        if(candidatopesquisa.getCandidato() == null) {
            throw new Exception("Candidato Inválido");
        }
        CandidatoPesquisaDAO.getInstance().registrarVotos(candidatopesquisa);
    }
}
