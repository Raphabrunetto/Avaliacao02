package Prova;

public class MonitoramentoEstoque {
    public static void main(String[] args) {
        // Criando um produto
        Produto produto = new Produto("feijão", 100);
        Produto produtoB = new Produto("arroz", 200);
        Produto produtoC = new Produto("suco", 150);

        // Criando os notificadores (sistemas ou equipes interessados)
        Notificador emailNotificador = new NotificadorEmail();
        Notificador smsNotificador = new NotificadorSMS();
        Notificador sistemaAnaliseNotificador = new NotificadorSistemaAnalise();

        // Criando o decorador para adicionar notificações ao produto
        ProdutoComNotif produtoComNotificacaoEmail = new ProdutoComNotif(produto, emailNotificador);
        ProdutoComNotif produtoComNotificacaoSMS = new ProdutoComNotif(produto, smsNotificador);
        ProdutoComNotif produtoComNotificacaoSistemaAnalise = new ProdutoComNotif(produto, sistemaAnaliseNotificador);
        ProdutoComNotif produtoComNotificacaoEmailB = new ProdutoComNotif(produtoB, emailNotificador);
        ProdutoComNotif produtoComNotificacaoAnaliseC = new ProdutoComNotif(produtoC, sistemaAnaliseNotificador);

        // Alterando a quantidade do produto e notificando os interessados
        produto.alterarQuantidade(120, produtoComNotificacaoEmail);  // Notifica via Email
        produto.alterarQuantidade(80, produtoComNotificacaoSMS);    // Notifica via SMS
        produto.alterarQuantidade(50, produtoComNotificacaoSistemaAnalise);
        produtoB.alterarQuantidade(90, produtoComNotificacaoEmail);
        produtoC.alterarQuantidade(10, sistemaAnaliseNotificador); // Notifica para Sistema de Análise
        produtoComNotificacaoEmailB.notificar(produtoB);  // Notificação via Email
        produtoComNotificacaoAnaliseC.notificar(produtoC); // Para Produto C, notificamos apenas o Sistema de Análise

    }
}
