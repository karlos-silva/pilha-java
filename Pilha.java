public class Pilha {
    private int topo;
    private int[] elementos;
    public int max;

    Pilha(int tamanho) {
        this.topo = -1;
        this.elementos = new int[tamanho];
        this.max = tamanho;
    }

    public boolean isFull() {
        return (topo == elementos.length -1);
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public void push(int elemento) {
        if(isFull()) {
            throw new RuntimeException("Pilha Cheia / Stack Overflow");
        }
        topo++;
        elementos[topo] = elemento;
    }

    public int pop() {
        if(isEmpty()) {
            throw new RuntimeException("Pilha Vazia / Stack Empty");
        }
        int elemento;
        elemento = elementos[topo];
        topo--;
        return elemento;
    }

    public int top() {
        if(isEmpty()) {
            throw new RuntimeException("Pilha Vazia / Stack Empty");
        }
        return elementos[topo];
    }

}
