package EstruturaDeDadosEmJava.ListasEncadeadas;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    // método add()

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    // método get()
    public T get(int index) {
        return getNo(index).getConteudo();
    }

    // método getno()
    private No<T> getNo(int index) {

        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noReterno = null;
        for (int i = 0; i <= index; i++) {
            noReterno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noReterno;
    }

    // método remove(): retornar o conteudo do nó que ele removeu

    public T remove(int index) {
        No<T> noPivor = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    // método size(): retorna o tamanho da lista
    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    // metodo validaIndice()
    private void validaIndice(int index) {
        if (index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice " + index + " desta lista. \n" +
                    " esta lista só vai até o índice " + ultimoIndice + ".");
        }
    }

    // método isEmpty(): verifica se a lista esta vazia
    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    // método toString()

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteúdo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
