package DAO;

import java.util.ArrayList;
import java.util.List;

import Tabelas.CandidatoPesquisa;

public class CandidatoPesquisaDAO {

    private static CandidatoPesquisaDAO instance;
    private List<CandidatoPesquisa> listaCandidatoPesquisa = new ArrayList<>();

    public static CandidatoPesquisaDAO getInstance() {
        if(instance == null) {
            instance = new CandidatoPesquisaDAO();
        }
        return instance;
    }

    public void registrarVotos(CandidatoPesquisa candidatoPesquisa) {
        listaCandidatoPesquisa.add(candidatoPesquisa);
    }


}
