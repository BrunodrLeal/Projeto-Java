package secao22;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {
    public static void main(String[] args) {
          
        // 1 - Leitura de Arquivo
        
        String currentDir = System.getProperty("user.dir") + "\\src\\secao22\\";

        System.out.println(currentDir);

        // windows - > \
        //FileReader = caracter por caracter.
        //BufferedReader = Linha por linha

        try (FileReader reader = new FileReader(currentDir + "arquivo.txt")) {
            
            int caracter;

            while((caracter = reader.read()) != -1) {
                System.out.print((char) caracter );
            }

        } catch (Exception e) {
           
            System.out.println("Erro ao ler arquivo: " + e.getMessage());

        }

        System.out.println();
        try (BufferedReader reader = new BufferedReader(new FileReader (currentDir + "arquivo.txt"))) {
            
            String linha;

            while((linha = reader.readLine()) != null) {
                System.out.print(linha );
            }

        } catch (Exception e) {
           
            System.out.println("Erro ao ler arquivo: " + e.getMessage());

        }

        // 2 - Escrita de Arquivos em java

        try (FileWriter writer = new FileWriter(currentDir + "saida.txt")) {
            writer.write("escrevendo em Arquivo \n");
            writer.write("escrevendo em Arquivo 2");

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
        
        try (BufferedWriter  writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt"))) {
            
            writer.write("Escrevendo em Arquivo em BufferedWrite");
            writer.newLine();
            writer.write("Escrevendo em Arquivo em BufferedWrite 2");
            writer.newLine();

        } catch (Exception e) {
           System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        try (BufferedWriter  writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt", true))) {
            
            writer.append("Testando");
        } catch (Exception e) {
           System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        // 3 - serialização do objeto.

        Pessoa pessoa = new Pessoa("Mateus" , 33);
        System.out.println(pessoa.getNome());

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {

            oos.writeObject(pessoa);

            System.out.println("Objeto Serializado com sucesso.");
            
        } catch (Exception e) {
            System.out.println("Erro ao serializar arquivo: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentDir + "pessoa.ser"))) {
            
            Pessoa pessoa2 = (Pessoa) ois.readObject();

            System.out.println("nome: " + pessoa2.getNome());
            System.out.println("nome: " + pessoa2.getIdade());
        } catch (Exception e) {
            System.out.println("Erro ao serializar arquivo: " + e.getMessage());
        }

       /* // manipulação de Binarios

        try (FileInputStream fis = new FileInputStream(currentDir + "imagem.jpg");
             FileOutputStream fos = new FileOutputStream(currentDir + "copia_imagem.jpg");
            ) {
            
            int byteData;

            while((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("Copia de imagem realizada com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(currentDir + "video.mkv"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(currentDir+ "copia_video.mkv"))
        ) {
            byte[] buffer = new byte[1024]; // buffer 1 kb em 1 kb

            int byteLidos;

            while((byteLidos = bis.read(buffer)) != -1) {
                bos.write(buffer, 0,byteLidos);
            }
            System.out.println("video copiado com sucesso. ");
        } catch (Exception e) {
            System.out.println("Erro ao copiar vídeo: " + e.getMessage());
        }

        // 5 - Manipulação de imagem.

        try {
           
            BufferedImage imagem = ImageIO.read(new File(currentDir + "imagem.jpg")); 

            if(imagem == null) {
                System.out.println("A imagem não pode ser carregada.");
            }

            Graphics2D g2d = imagem.createGraphics();

             // preparando o texto
            g2d.setFont(new Font("Arial" , Font.BOLD,50));
            FontMetrics fm = g2d.getFontMetrics();
            String texto = "Texto No Centro";

            // centralizar texto na imagem
            int larguraTexto = fm.stringWidth(texto);
            int alturaTexto = fm.getHeight();

            // posicionamento
            int x = (imagem.getWidth() - larguraTexto) /2;
            int y = (imagem.getHeight() - alturaTexto) /2 + fm.getAscent();

            // desenhar retangulo
            g2d.setColor(Color.BLACK);
            g2d.fillRect(x -10, y - fm.getAscent(), larguraTexto +20, alturaTexto);

            // desenhar o texto em cima do retangulo

            g2d.setColor(Color.RED);
            g2d.drawString(texto,x,y);

            // liberação de recursos

            g2d.dispose();

            // salvar a imagem

            File outputFile = new File(currentDir + "imagem_com_texto.png");

            ImageIO.write(imagem, "png", outputFile);

            System.out.println("Gerou o texto na imagem");
        } catch (Exception e) {
             System.out.println("Erro ao processar imagem. : " + e.getMessage());
        }*/

        // 6 -  Diretorios e Arquivos

        Path caminhoDiretorio = Paths.get(currentDir + "diretorioNovo");

        try {
            if(!Files.exists(caminhoDiretorio)){
                Files.createDirectories(caminhoDiretorio);

                System.out.println("Diretorio criado com sucesso: " + caminhoDiretorio.toString());
            } else {
                System.out.println("Diretório já existe. ");
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar diretório");
        }

        // Criar , Copia e mever arquivos.

        Path caminhoArquivoOriginal = Paths.get(currentDir + "arquivo_criado.txt");
        Path caminhoArquivoCopia = Paths.get(currentDir + "arquivo_criado_copia.txt");
        Path caminhoArquivoMovido = Paths.get(currentDir + "diretorioNovo", "arquivo_criado_movido.txt"); // sintaxe diferente

        try {

            // Criar
            if(!Files.exists(caminhoArquivoOriginal)){
                Files.createFile(caminhoArquivoOriginal);
                System.out.println("Arquivo criado.");
            }

            // Copiar
            if(!Files.exists(caminhoArquivoCopia)){
                Files.copy(caminhoArquivoOriginal, caminhoArquivoCopia);
            }

            // mover

            Files.move(caminhoArquivoCopia,caminhoArquivoMovido);


        } catch (Exception e) {
            System.out.println("Erro ao fazer ações com arquivos: "+ e.getMessage());
        }

        // 7 - Arquivos temporarios

        try {
            
            Path arquivoTemporario = Files.createTempFile("meuTemFile", ".txt");

            System.out.println("Arquivo criado em: " + arquivoTemporario.toAbsolutePath());

            Files.writeString(arquivoTemporario, "Conteúdo temporario"); // escrever usando o writeString

            String conteudo = Files.readString(arquivoTemporario); // ler

            System.out.println("Contrudo:" + conteudo);

            Files.delete(arquivoTemporario);


        } catch (Exception e) {
             System.out.println("Erro ao criar arquivo temporario: "+ e.getMessage());
        }

        

}
}
