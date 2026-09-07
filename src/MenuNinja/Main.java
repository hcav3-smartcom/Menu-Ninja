package MenuNinja;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        //Abrir Scanner para o usuario
        Scanner scanner = new Scanner(System.in);
        //Abrir array dos ninjas
        Ninja[] ninjas = new Ninja[5];

        //criando primeiro ninja
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.missao = "Recuperar o amuleto";
        Sasuke.nivelDeDificuldade = "Alto";
        Sasuke.statusMissao = "Em andamento";
        Sasuke.habilidadeEspecial = "Suzanoo";
        ninjas[0] = Sasuke;

        //Contadores
        int quantidadeDeNinjas = 1;
        int opcaoDoUsuario = 0;
        int deletarNinja = 0;

        //Exibição de Menu e recepção de dados
        while (opcaoDoUsuario != 6) {
            System.out.println("\n===== MENU NINJA =====" + "\n" +
                    "1 - Mostrar informações dos ninjas" + "\n" +
                    "2 - Adicionar ninja" + "\n" +
                    "3 - Editar ninja" + "\n" +
                    "4 - Deletar ninja" + "\n" +
                    "5 - Mostrar habilidade especial" + "\n" +
                    "6 - Sair");
            System.out.println("Digite uma opção: ");
            opcaoDoUsuario = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Você selecionou a opção: " + opcaoDoUsuario + "!");


            switch (opcaoDoUsuario){
                //Mostrar as informações dos Ninjas
                case 1:
                    System.out.println("\n== INFORMAÇÕES NINJAS ==");
                    for (int i = 0; i < quantidadeDeNinjas; i++) {
                        System.out.println("\nNINJA " + (i +1));
                        ninjas[i].mostrarInformacoes();
                    }
                    break;
                    //Adicionando ninja
                case 2:
                    if (quantidadeDeNinjas < ninjas.length){
                        Ninja novoNinja = new Ninja();

                        System.out.println("\n== ADICIONAR NINJAS ==");
                        System.out.println("Digite o nome do ninja: ");
                        novoNinja.nome = scanner.nextLine();
                        System.out.println("Digite o idade do ninja: ");
                        novoNinja.idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Digite a missão relacionada ao ninja: ");
                        novoNinja.missao = scanner.nextLine();
                        System.out.println("Digite o nivel de dificuldade da missão: ");
                        novoNinja.nivelDeDificuldade = scanner.nextLine();
                        System.out.println("Digite o status da missão: ");
                        novoNinja.statusMissao = scanner.nextLine();
                        System.out.println("Digite a habilidade especial do ninja: ");
                        novoNinja.habilidadeEspecial = scanner.nextLine();

                        ninjas[quantidadeDeNinjas] = novoNinja;
                        quantidadeDeNinjas++;
                        System.out.println("Ninja adicionado com sucesso!");
                    } else {
                        System.out.println("Quantidade Maxima atingida.");
                    } break;

                    //Editando um ninja
                case 3:
                    if (quantidadeDeNinjas > 0){
                        System.out.println("\n== EDITAR NINJAS ==");
                        for (int i = 0; i < quantidadeDeNinjas; i++) {
                            System.out.println("Escolha um ninja para editar: ");
                            int indiceDaEdicao = scanner.nextInt();
                            scanner.nextLine();
                            indiceDaEdicao--;

                            if (indiceDaEdicao >= 0 && indiceDaEdicao < quantidadeDeNinjas){
                                System.out.println("Digite o novo nome do ninja: ");
                                ninjas[indiceDaEdicao].nome = scanner.nextLine();
                                System.out.println("Digite a nova idade do ninja: ");
                                ninjas[indiceDaEdicao].idade = scanner.nextInt();
                                System.out.println("Digite a nova missão do ninja: ");
                                ninjas[indiceDaEdicao].missao = scanner.nextLine();
                                scanner.nextLine();
                                System.out.println("Digite a dificuldade da nova missão: ");
                                ninjas[indiceDaEdicao].nivelDeDificuldade = scanner.nextLine();
                                System.out.println("Digite o status da missão: ");
                                ninjas[indiceDaEdicao].statusMissao = scanner.nextLine();
                                System.out.println("Digite a habilidade especial do ninja: ");
                                ninjas[indiceDaEdicao].habilidadeEspecial = scanner.nextLine();

                                System.out.println("Ninja Editado com sucesso.");
                            } else {
                                System.out.println("Ninja invalido!");
                            }
                        }
                        }else {
                        System.out.println("Nenhum ninja cadastrado para edição.");
                    }
                    break;
                case 4:
                    if (quantidadeDeNinjas > 0){
                        System.out.println("\n== DELETAR NINJAS ==");
                        for (int i = 0; i < quantidadeDeNinjas; i++) {
                            System.out.println("\nEscolha um ninja para deletar: ");
                            deletarNinja = scanner.nextInt();
                            scanner.nextLine();
                            deletarNinja--;
                            if (deletarNinja >= 0 && deletarNinja< quantidadeDeNinjas){
                                for (int j = deletarNinja; i < quantidadeDeNinjas -1 ; i++) {
                                    ninjas[i] = ninjas[i + 1];
                                }
                                ninjas[quantidadeDeNinjas -1] = null;
                                quantidadeDeNinjas--;
                                System.out.println("Ninja deletado com sucesso!");
                            } else {
                                System.out.println("Ninja invalido!");
                            }
                        }
                    }else {
                        System.out.println("Nenhum ninja cadastrado!");
                    }
                    break;

                    //Visualizando habilidades especiais
                case 5:
                    System.out.println("\n== HABILIDADES ESPECIAIS ==");
                    for (int i = 0; i < quantidadeDeNinjas; i++) {
                        System.out.println( ninjas[i].nome + " -> " + ninjas[i].habilidadeEspecial);
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o Sistema!");
                    break;
                default:
                    System.out.println("Opção invalida.");
                    }
            }
        scanner.close();
        }
    }
