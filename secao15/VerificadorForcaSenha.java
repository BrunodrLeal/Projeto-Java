package secao15;
import java.util.*;

public class VerificadorForcaSenha {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
                System.out.println("Digite uma senha:");
                String senha = sc.nextLine();

                int forca = verificarForcaSenha(senha);
                // verificar Força.

                if(forca <= 2){
                    System.out.println("A sua senha é fraca. ");
                } else if ( forca == 3){
                    System.out.println("A sua senha é média. "); 
                } else if (forca == 4) {
                    System.out.println("A sua senha é segura.");
                } else {
                    System.out.println("A sua senha é muito forte.");
                }

            sc.close();
    }
    public static int verificarForcaSenha(String senha){
            int forca = 0;
            if(senha.length() > 8) {
            forca++;
        }

        // letras maiúsculas de a a z
        if(senha.matches(".*[A-Z].*")) {
            forca++;
        }

        // letras minúsculas de a a z
        if(senha.matches(".*[a-z].*")) {
            forca++;
        }

        // verificar se tem números
        if(senha.matches(".*\\d.*")) {
            forca++;
        }

        // - > traço
        // - > intervalo entre 2 caracteres
        if(senha.matches(".*[!@#$%&*()\\-_?<>].*")) {
            forca++;
        }
        return forca;
    }    
}

