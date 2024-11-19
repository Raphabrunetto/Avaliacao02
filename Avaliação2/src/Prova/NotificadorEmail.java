package Prova;

    class NotificadorEmail implements Notificador {
    @Override
    public void notificar(Produto produto) {
        System.out.println("Enviando email sobre a alteração no produto: \n" + produto.getNome());
    }
}
