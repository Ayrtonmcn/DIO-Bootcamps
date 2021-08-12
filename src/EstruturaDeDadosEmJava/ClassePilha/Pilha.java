package EstruturaDeDadosEmJava.ClassePilha;

public class Pilha {

    private No refNoEntradaPilha;

    // construtor vazio da pilha

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    // método push - acrescenta um nó ao topo da pilha

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    // método pop

    public No pop() {
        if (!this.isEmpty()) {   //se não estiver vazia
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    // método top - indica o nó do topo da pilha

    public No top() {
        return refNoEntradaPilha;
    }

    // método isEmpty

    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }

    // implementação da classe toString

    @Override
    public String toString() {

        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();

            }else {
                break;
            }
        }
        stringRetorno += "============\n";
        return stringRetorno;
    }
}
