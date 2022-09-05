package Controller;

import DAO.CandidatoDAO;
import Tabelas.Candidatos;

import java.util.List;

public class CandidatoController {

    public void salvar(Candidatos candidatos) throws Exception {
        if (candidatos.getNome() == null || candidatos.getNome().length() < 3) {
            throw new Exception("Descrição Inválida");
        }
        CandidatoDAO.getInstance().salvar(candidatos);
    }

    public void atualizar(Candidatos candidatos) throws Exception {

        if (candidatos.getNome() == null || candidatos.getNome().length() < 3) {
            throw new Exception("Nome inválido");
        }

        CandidatoDAO.getInstance().atualizar(candidatos);
    }

    public  void excluir(int idcandidatos) throws Exception {

        if (idcandidatos == 0) {
            throw new Exception();
        }
        CandidatoDAO.getInstance().excluir(idcandidatos);

    }

    public List<Candidatos> listar(){

        return CandidatoDAO.getInstance().listar();
    }
}
