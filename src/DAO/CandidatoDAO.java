package DAO;

import Tabelas.Candidatos;

import java.util.ArrayList;
import java.util.List;

public class CandidatoDAO {

    private static CandidatoDAO instance;
    private List<Candidatos> listaCandidatos = new ArrayList<>();

    public static CandidatoDAO getInstance() {
        if(instance == null){
            instance = new CandidatoDAO();

        }
        return instance;
    }

    public void salvar(Candidatos candidatos) {

        listaCandidatos.add(candidatos);
    }

    public void atualizar(Candidatos candidatos) {

        listaCandidatos.set(candidatos.getIdcandidatos(), candidatos);
    }

    public  void excluir(int idcandidatos){

        listaCandidatos.remove(idcandidatos);
    }

    public List<Candidatos> listar(){
        return listaCandidatos;
    }

}