package EstruturaDeDadosEmJava.ClassePilha;

public class Main {

    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());   // imprime o último item da pilha

        System.out.println(minhaPilha);         // imprime a pilha sem o item retirado

        minhaPilha.push(new No(99));       // adiciona um novo dado na pilha

        System.out.println(minhaPilha);         // imprime a pilha com o último item adicionado
    }
}
