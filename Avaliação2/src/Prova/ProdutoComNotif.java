package Prova;

class ProdutoComNotif implements Notificador {
    protected Produto produto;
    protected Notificador notificador;

    public ProdutoComNotif(Produto produto, Notificador notificador) {
        this.produto = produto;
        this.notificador = notificador;
    }

    @Override
    public void notificar(Produto produto) {
        notificador.notificar(produto);  // Delegação para o notificador específico
    }
}
