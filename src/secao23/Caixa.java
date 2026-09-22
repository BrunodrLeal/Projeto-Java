package secao23;

// o "T"é qualquer coisa não tem especificação.  

public class Caixa <T> {
     
        private T conteudo;
        
        public void adicionar(T conteudo){
            this.conteudo = conteudo;
        }

        public T obter() {
            return  conteudo;
        }

}
