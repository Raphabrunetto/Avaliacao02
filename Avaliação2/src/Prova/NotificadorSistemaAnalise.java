package Prova;

class NotificadorSistemaAnalise implements Notificador {
    @Override
    public void notificar(Produto produto) {
        System.out.println("Notificando o Sistema de Análise sobre a alteração no produto: \n" + produto.getNome());
    }
}