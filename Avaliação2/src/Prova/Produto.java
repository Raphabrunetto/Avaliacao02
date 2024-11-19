package Prova;

class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Altera a quantidade do produto e notifica os interessados
    public void alterarQuantidade(int novaQuantidade, Notificador notificador) {
        this.quantidade = novaQuantidade;
        System.out.println("Alterando quantidade do produto " + nome + " para " + novaQuantidade);
        notificar(notificador);
    }

    // Método que delega a notificação aos notificadores
    private void notificar(Notificador notificador) {
        notificador.notificar(this);
    }
}

