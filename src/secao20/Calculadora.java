package secao20;

interface Calculadora{
    int somar(int a, int b);

    // ele pode ser itulizado, sem implementação.

    default int multplicar(int a, int b) {
        return  a * b;
    }
}