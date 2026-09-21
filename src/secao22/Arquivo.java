package secao22;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;


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

        // 8 - manipulação de Arquivos Comprimidos.

        /* 
        Classes principais

        ZipOutputStream
        ZiplnputStream
        ZitEntry 
        */ 

     // comprimir
        Path arquivoOriginal = Paths.get(currentDir + "arquivo.txt");
        Path arquivoZip = Paths.get(currentDir + "arquivo_comprimido.zip");

        try (
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(arquivoZip.toFile()));
            FileInputStream fis = new FileInputStream(arquivoOriginal.toFile())
        ) {
            
            // cria uma entrada ZIP para o arquivo
            ZipEntry zipEntry = new ZipEntry(arquivoOriginal.getFileName().toString());

            zos.putNextEntry(zipEntry);

            // Le o conteudo do arquivo e grava no zip
            byte[] buffer = new byte[1024];
            int bytesRead;

            while((bytesRead = fis.read(buffer)) != -1) {
                zos.write(buffer, 0, bytesRead);
            }

            // fechar a entrada do zip
            zos.closeEntry();
            System.out.println("Arquivo compactado com sucesso.");


        } catch (Exception e) {
            System.out.println("Erro ao compactar arquivo: " + e.getMessage());
        }

        // descomprimir        
        Path arquivoZipado = Paths.get(currentDir + "arquivo_comprimido.zip");
        Path destino = Paths.get(currentDir + "descompactado");

        try (
            ZipInputStream zis = new ZipInputStream(new FileInputStream(arquivoZipado.toFile()))
        ) {

            ZipEntry zipEntry;

            // criar o diretorio se nao existir
            if(!Files.exists(destino)) {
                Files.createDirectories(destino);
            }

            // iterar em cada um dos arquivos zip
            while((zipEntry = zis.getNextEntry()) != null) {

                Path caminhoDestino = destino.resolve(zipEntry.getName());

                // /destino -> /destino/arquivo.txt
                // /destino -> /destino/arquivo2.txt

                try(FileOutputStream fos = new FileOutputStream(caminhoDestino.toFile())) {

                    // Le o conteudo do arquivo e grava no zip
                    byte[] buffer = new byte[1024];
                    int bytesRead;

                    while((bytesRead = zis.read(buffer)) != -1) {
                        fos.write(buffer, 0, bytesRead);
                    }

                }

                System.out.println("Arquivo descompactado: " + caminhoDestino);

                zis.closeEntry();

            }
            
        } catch (Exception e) {
            System.out.println("Erro ao descompactar arquivo: " + e.getMessage());
        }

        // 9 manipulacao scv

        String arquivoCsv = currentDir + "dados.csv";
        String linha;
        String serparador =  ",";

        try(BufferedReader br = new BufferedReader(new FileReader(arquivoCsv))) {
            while((linha = br.readLine()) != null) {

                // dividir a String / ou explodir a String em Array

                String[] dados = linha.split(serparador);
                System.out.println("Nome: " + dados[0] + ", Idade: " + dados[1] + ", Cidade: " + dados[2]);
               
        }

        }catch (Exception e) {
            System.out.println("Erro ao ler arquivo CSV: " + e.getMessage());
        }

        // Escrita de CSV

        String arquivoCsvSaida = currentDir + "dadosEscrita.csv";

        try (FileWriter write = new FileWriter(arquivoCsvSaida)) {
            // incercao de linha a linha, repeitando o separador e quebrando a linha no final.

            write.append("Nome,Idade,Cidade\n");
            write.append("Bruno,36,Arcos\n");
            write.append("Evelin,28,Curitiba\n");
            write.append("Bia,32,Porto Alegre\n");
            write.append("Lavinea,30,Arcos\n");
            System.out.println("Arquivo CSV escrito com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo CSV: " + e.getMessage());
        }
}
}
