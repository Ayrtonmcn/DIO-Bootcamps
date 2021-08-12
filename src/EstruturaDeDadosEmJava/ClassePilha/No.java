package EstruturaDeDadosEmJava.ClassePilha;

public class No {

    private int dado;
    private No refNo = null; // referecia do próximo nó;

    // construtor vazio

    public No() {
    }

    // construtor para passagem de um dado

    public No(int dado) {
        this.dado = dado;
    }

    // criação dos getter and setter


    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    // implementação da classe toString

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
