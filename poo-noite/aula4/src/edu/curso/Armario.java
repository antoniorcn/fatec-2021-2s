package edu.curso;

public class Armario {
    int tamanhoArmario;
    int espacoLivre;
    boolean portaAberta;
    String cor;
    String tipoMaterial;

    public void abrirPorta() {
        // String cor = "rosa";
        System.out.println("Porta foi aberta");
        portaAberta = true;

        // System.out.println("Cor ==> " + this.cor);
    }

    public void fecharPorta() {
        System.out.println("Porta foi fechada");
        this.portaAberta = false;
    }

    public void esvaziarArmario() {
        int a = 10;
        System.out.println("O armário está completamente vazio");
        this.espacoLivre = this.tamanhoArmario;
    }

    public void guardarAlgo() {
        if (portaAberta) {
            this.espacoLivre = this.espacoLivre - 1;
            System.out.println("Foi guardado mais alguma coisa no armario");
            System.out.printf("No momento o armario possui %d espaços livres %n",
                    this.espacoLivre);
        } else {
            System.out.println("Abra a porta primeiro antes de guardar algo");
        }
    }

    public void guardar(int qtd) {
        if (portaAberta) {
            if (qtd <= espacoLivre) {
                this.espacoLivre = this.espacoLivre - qtd;
                //            System.out.printf("Foram guardados %d itens no armario " +
                //                    " agora tem %d espaco livre %n", qtd, this.espacoLivre);
                System.out.printf("Foram guardados %d itens no armario ", qtd);
                System.out.printf("No momento o armario possui %d espaços livres %n",
                        this.espacoLivre);
            } else {
                System.out.println("Não há espaço suficiente no armario para guardar isto");
            }
        } else {
            System.out.println("Abra a porta primeiro antes de guardar algo");
        }
    }

    public int espacoLivre() {
        return this.espacoLivre;
    }
}
