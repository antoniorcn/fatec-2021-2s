package edu.curso;

public class Aeroporto {

    Piloto[] pilotos = new Piloto[50];
    Aeronave[] aeronaves = new Aeronave[30];
    Passageiro[] salaEmbarque = new Passageiro[1000];
    Pessoa[] saguaoPrincipal = new Pessoa[5000];

    void embarque(Passageiro p, Aeronave a) {
        System.out.println("Passageiro " + p.nome +
                " embarcado na aeronave " + a.prefixo + " - " + a.modelo);
    }

    void controleVoo() {
        System.out.println("Controlando Voo ...");
    }


    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa("João Silva");
//        Pessoa p2 = new Pessoa("Maria Silva");
//        Pessoa p3 = new Pessoa("Alfredo Costa");
//        Pessoa p4 = new Pessoa("Alberto Andrade");
//
////        p1.nome = "João Silva";
////        p2.nome = "Maria Silva";
////        p3.nome = "Alfredo Costa";
////        p4.nome = "Alberto Andrade";
//
//        Passageiro pas1 = new Passageiro();
//        Passageiro pas2 = new Passageiro();
//        pas1.nome = "Flavio Silva";
//        pas2.nome = "Camila Silva";
//
//        Aeronave a1 = new Aeronave();
//        a1.modelo = "Boeing 737";
//        a1.prefixo = "XJ231";
//
//        Aeronave a2 = new Aeronave();
//        a2.modelo = "Airbus A320";
//        a2.prefixo = "KF346";
//
//        Piloto pil1 = new Piloto();
//        Piloto pil2 = new Piloto();
//        pil1.nome = "Michael Roberts";
//        pil2.nome = "Robert Portier";
//
//
//        Aeroporto cumbica = new Aeroporto();
//        cumbica.saguaoPrincipal = new Pessoa[] {p1, p2, p3, p4};
//        cumbica.aeronaves = new Aeronave[] {a1, a2};
//        cumbica.salaEmbarque = new Passageiro[] {pas1, pas2};
//
//        cumbica.embarque(pas1, a2);
//
//        cumbica.embarque(pas2, a1);

        Pessoa p6 = new Pessoa();
        System.out.println(p6.getPeso());

        Passageiro pass6 = new Passageiro();
        System.out.println(pass6.getPeso());
        pass6.setPeso(78.9);
        System.out.println(pass6.getPeso());
    }
}
