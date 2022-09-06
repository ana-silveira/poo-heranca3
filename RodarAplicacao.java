package POO_Heranca3;

public class RodarAplicacao {

    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[] { new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
        /*Criação de vetor do tipo ClasseMae, que eu chamei de classes.
        Dentro desse vetor existem 3 objetos, que eu chamei de ClasseFilha1, ClasseFilha2 e ClasseMae.
         */

        for (ClasseMae classe: classes) {
            classe.metodo1();  // Aqui ocorre um comportamento de POLIMORFISMO com Sobrescrita (porque estávamos trabalhando com a ClasseMae).
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }
        /* O metodo2 existe na ClasseFilha2 mas não existe na ClasseFilha1.
        Então esse método não vai se comportar polimorficamente em ClasseFilha1, mas vai na CLasseFilha2
        Ocorreu sobrescrita também.
        */

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
    /* Nesse 3o caso, vai ocorrer herança sobrescrita, sem polimorfismo, porque já estou trabalhando
    diretamente com a ClasseFilha2, instanciando um método dela e estou chamando o metodo2, que é
    justamente quem eu sobrescrevi.
    Eu mudei a implementação do método2, que é da classe mãe, e estou usando na ClasseFilha2.

    */

}
