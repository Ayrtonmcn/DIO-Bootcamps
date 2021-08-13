package EstruturaDeDadosEmJava.ClasseFila;

public class No {

    private Object object;
    private No refNo;

    // construtor
    public No() {

    }

    public No(Object object) {
        this.refNo = null;
        this.object = object;
    }

    // getter e setter

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    // toString

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
