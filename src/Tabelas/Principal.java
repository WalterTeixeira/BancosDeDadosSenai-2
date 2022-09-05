package Tabelas;

import Controller.CandidatoController;

public class Principal {

    public static void main(String[] args) {

        Candidatos c1 = new Candidatos();
        c1.setNome("Lula");
        c1.setIdcandidatos(1);
        c1.setPartido("PT");

        Candidatos c2 = new Candidatos();
        c2.setNome("Bolsonaro");
        c2.setIdcandidatos(2);
        c2.setPartido("PL");

        CandidatoController controller = new CandidatoController();
        try {
            controller.salvar(c1);
            controller.salvar(c2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (Candidatos c: controller.listar()) {
            System.out.println(c.toString());
        }



    }

}
