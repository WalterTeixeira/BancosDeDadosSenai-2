package DAO;

import Tabelas.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class PesquisaDAO {

    private static PesquisaDAO instance;
    private List<Pesquisa> listaPesquisa = new ArrayList<>();

    public static PesquisaDAO getInstance(){
        if (instance == null){
            instance = new PesquisaDAO();
        }
        return instance;
    }

    public void salvar(Pesquisa pesquisa){
        listaPesquisa.add(pesquisa);

    }

    public void atualizar(Pesquisa pesquisa){
        listaPesquisa.set(pesquisa.getIdPesquisa(), pesquisa);

    }

    public void excluir(int idPesquisa){
        listaPesquisa.remove(idPesquisa);
    }

    public List<Pesquisa> listar(){
        return listaPesquisa;
    }
}
