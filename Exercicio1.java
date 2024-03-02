public class Exercicio1 {
    int count;
    // a) Some os inteiros ímpares entre 1 e 99 utilizando uma instrução for.
    public void somaImpares() {
        int somaImpares = 0;

        for(var i = 1; i <= 99; i+=2) {
            somaImpares += i;
        }

        System.out.println(somaImpares);
    }

    // b) Imprima os inteiros de 1 a 20, utilizando um loop while. Imprima apenas cinco inteiros por linha.
    public void imprimeInteirosWhile() {
        int i = 0;
        while (i < 20){
            i++;
            count++;
            if(count!=5){
                System.out.print(i+",");
            }else{
                count=0;
                System.out.println(i);
            }
        }
    }

    // c) Repita o exercício b, mas dessa vez com a instrução For.
    public void imprimeInteirosFor() {
        for (int j = 1; j <= 20; j++) {
            count++;
            if (count != 5) {
                System.out.print(j + ",");
            } else {
                count = 0;
                System.out.println(j);
            }
        }
    }

}
