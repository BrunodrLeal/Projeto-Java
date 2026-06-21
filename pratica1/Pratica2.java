package pratica1;
import java.util.*;
public class Pratica2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Palavra
        //Palindromo(sc);
        //Email(sc);
        //JogoAdivinhacao(sc);
        SistemaNotas(sc);
        
    }
    public static void Palavra(Scanner sc){
        // Exercício 14
        System.out.println("Me dê uma palavra: ");
        String palavra = sc.nextLine();
        for(int i = 0; i < palavra.length();i++){

        }
        System.out.println("Essa palavra tem " + palavra.length()+ " caracteres");
        System.out.println("Palavra maiúscula "+ palavra.toUpperCase());
        System.out.println("Palavra minúscula "+ palavra.toLowerCase());
    }
    public static void Palindromo(Scanner sc){
        // Exercício 15
        String palavraInvertida = "";
        System.out.println("Escreva uma palavra vou checar se é um palindromo.");
        String palavra = sc.nextLine();
        for (int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida = palavraInvertida + palavra.charAt(i);
        }
        if(palavraInvertida.equals(palavra)){
            System.out.println("É um palindromo");
        } else{
            System.out.println("Não é um palindromo");
        }

    }
    public static void Email(Scanner sc){

        while(true){
        System.out.println("Digite um E-mail:");
        String email = sc.nextLine();
        if(email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")){
            System.out.println("E-mail "+ email+ " válido e aceito! ");
            System.out.println("Programa finalizado.");
            break;
        }else{
            System.out.println("E-mail inválido");
            System.out.println("tente outra vez");
        }
        }
        
    }
    public static void JogoAdivinhacao(Scanner sc){
        // Exercício 18
        Random gerador = new Random();

        int testeAleatorio = gerador.nextInt(100)+1;
        
        System.out.println("Adivinhe o número");
        int numero = sc.nextInt();

        while (numero != testeAleatorio) {
            
            if (numero < testeAleatorio){
                System.out.println("Mais alto!");
            } else{
                System.out.println("Mais baixo!");
            }
            System.out.println("Palpite errado, tente novamente");
            numero = sc.nextInt();
        }
        System.out.println("Você acertou. Parabéns.");
    }
    public static void SistemaNotas(Scanner sc){
        // Exercício 19 Sistema de Notas completo.
   
        ArrayList<String> Nome = new ArrayList<>();
        ArrayList<String> Endereco = new ArrayList<>();
        ArrayList<String> Cidade = new ArrayList<>();
        ArrayList<String> Estado = new ArrayList<>();
        ArrayList<String> País = new ArrayList<>();
        ArrayList<String> Escola = new ArrayList<>();
        ArrayList<String> Materia = new ArrayList<>();
        ArrayList<Double> Nota = new ArrayList<>();
       
        while (true) {

            System.out.println("1 - Cadastrar:"); // pronto
            System.out.println("2 - Listar:"); // pronto
            System.out.println("3 - Pesquisar aluno:");// pronto
            System.out.println("4 - Calcular Média:");
            System.out.println("5 - Excluir aluno:");
            System.out.println("0 - Sair:");
            int escolha = sc.nextInt();
            sc.nextLine(); //limpa o enter

            if(escolha == 1){
                // Cadastro;
                System.out.println("Sistema de cadastramento:");
                System.out.println("Digite o nome completo:");
                    String nomeCompleto = sc.nextLine();
                    Nome.add(nomeCompleto);
                //endereço completo um adicional parao exercício quero ver como a impressão dos dados vai funcionar. 
                System.out.println("Endereço Completo:");   
                    String enderecoCompleto = sc.nextLine();
                    Endereco.add(enderecoCompleto);

                System.out.println("Cidade:");  
                    String cidadeCompleto = sc.nextLine();
                    Cidade.add(cidadeCompleto);

                System.out.println("Estado:");  
                    String estadoGeografico = sc.nextLine();
                    Estado.add(estadoGeografico);
                    
                System.out.println("País de origem");  
                    String paísCompleto = sc.nextLine();
                    País.add(paísCompleto);
                
                System.out.println("Escola Escolhida:");  
                    String escolaCompleto = sc.nextLine();
                    Escola.add(escolaCompleto);    
                    
                System.out.println("Matéria Escolar:");  
                    String materiaEscolar = sc.nextLine();
                    Materia.add(materiaEscolar);
                
                System.out.println("Nota da Matéria:");  
                    Double notaMateria = sc.nextDouble(); 
                    Nota.add(notaMateria);
                    sc.nextLine();  
                    System.out.println("Cadastro finalizado.");  
            }
            //
            else if(escolha == 2){
                // listar aluno;
                for(String nome : Nome){

                int posicao = Nome.indexOf(nome);
                    System.out.println(nome + " / " 
                        + Endereco.get(posicao) + " / "
                        + Cidade.get(posicao) + " / "
                        + Estado.get(posicao)+ " / "
                        + País.get(posicao)+ " / "
                        + Escola.get(posicao)+ " / "
                        + Materia.get(posicao)+ " / "
                        + Nota.get(posicao) + "."
                    );
            }
        }
            
            else if(escolha == 3){
                // pesquisar aluno;
               System.out.println("Digite o nome do aluno: ");
                String nomeDigitado = sc.nextLine();
               
                if(Nome.contains(nomeDigitado)){
                    System.out.println("Aluno encontrado.");
                
                    int posicao = Nome.indexOf(nomeDigitado);

                    System.out.println(nomeDigitado + " / " 
                        + Endereco.get(posicao) + " / "
                        + Cidade.get(posicao) + " / "
                        + Estado.get(posicao)+ " / "
                        + País.get(posicao)+ " / "
                        + Escola.get(posicao)+ " / "
                        + Materia.get(posicao)+ " / "
                        + Nota.get(posicao) + "."
                    );
                }
                else {
                    System.out.println("Aluno não encontrado.");
                }
            }    
            
            else if(escolha == 4){
            // Calcular média;

            double soma = 0;
            for(double nota: Nota){
                soma+= Nota.size();
            }
            double media = soma / Nota.size();

            System.out.println("A média da turma é: " + media);
            
            }
            else if(escolha == 5){
            // Excluir aluno;
            }
            
            else if(escolha == 0){
                System.out.println("Cadastro finalizado.");
                break;
            }
            // opção invalida para cobrir erros do usuário;
            else{
                System.out.println("Opção Invalida.");
            }
            
        }

    }
}

