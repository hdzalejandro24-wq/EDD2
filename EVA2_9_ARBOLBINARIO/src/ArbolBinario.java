
packpackage eva2_9_arbolbinario;

/**
 *
 * @author carpi
 */
public class ArbolBinario {

    Nodo root;

    public ArbolBinario() {
        root = null;
    }

    // AGREGAMOS NODOS AL ARBOL
    public void agregarNodo(int valor) {
        if (root == null) {
            root = new Nodo(valor);
        } else {
            agregarNodoRecursivo(root, valor);
        }
    }

    // METODO RECURSIVO PARA AGREGAR NODOS
    private void agregarNodoRecursivo(Nodo nodoActual, int valor) {
        if (valor < nodoActual.valor) {
            if (nodoActual.izquierda == null) {
                nodoActual.izquierda = new Nodo(valor);
            } else {
                agregarNodoRecursivo(nodoActual.izquierda, valor);
            }
        } else if (valor > nodoActual.valor) {
            if (nodoActual.derecha == null) {
                nodoActual.derecha = new Nodo(valor);
            } else {
                agregarNodoRecursivo(nodoActual.derecha, valor);
            }
        }
    }

    // RECORRIDO PREORDEN
    public void preOrden() {
        preOrdenRecursivo(root);
    }

    private void preOrdenRecursivo(Nodo nodoActual) {
        if (nodoActual == null) {
            return;
        }

        System.out.println(nodoActual.getValor() + " - ");

        if (nodoActual.getIzquierda() != null) {
            preOrdenRecursivo(nodoActual.getIzquierda());
        }

        if (nodoActual.getDerecha() != null) {
            preOrdenRecursivo(nodoActual.getDerecha());
        }
    }
}