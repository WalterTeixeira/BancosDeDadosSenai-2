package Controller;

import DAO.PesquisaDAO;
import Tabelas.Pesquisa;


import java.util.List;

public class PesquisaController {

    public void salvar(Pesquisa pesquisa) throws Exception{
        if (pesquisa.getFormatopesquisa() == null || pesquisa.getFormatopesquisa().trim().equals("")) {
            throw new Exception("Descrição inválida");
        }
        PesquisaDAO.getInstance().salvar(pesquisa);

    }

    public void atualizar(Pesquisa pesquisa) throws Exception {
        if (pesquisa.getFormatopesquisa() == null || pesquisa.getFormatopesquisa().trim().equals("")) {
            throw new Exception("Descrição inválida");
        }
        PesquisaDAO.getInstance().atualizar(pesquisa);
    }

    public void excluir(int idPesquisa) throws Exception {
        if (idPesquisa == 0) {
            throw new Exception("Erro");

        }
        PesquisaDAO.getInstance().excluir(idPesquisa);
    }

    public List<Pesquisa> listar(){
        return PesquisaDAO.getInstance().listar();
    }
}
