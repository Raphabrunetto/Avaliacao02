package Prova;

    class NotificadorSMS implements Notificador {
    @Override
    public void notificar(Produto produto) {
        System.out.println("Enviando SMS sobre a alteração no produto: \n" + produto.getNome());
    }
}