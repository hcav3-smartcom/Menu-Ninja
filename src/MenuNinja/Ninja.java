package MenuNinja;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusMissao;
    String habilidadeEspecial;


    public void mostrarInformacoes(){

        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade da missão: " + nivelDeDificuldade);
        System.out.println("Status: " + statusMissao);

    }

}