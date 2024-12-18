package generic;

import java.util.Objects;

public class Par <C, V> {

    private C chave;
    private V Valor;

    public Par(C chave, V valor){
        super();
        this.chave = chave;
        this.Valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public V getValor() {
        return Valor;
    }

    public void setValor(V valor) {
        Valor = valor;
    } @Override
    public int hashCode() {
        final  int prime =31;
        int result = 1;
        result = prime * result + ((chave == null) ? 0 : chave.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) object;
        return Objects.equals(chave, par.chave);
    }
}
