public class Conta {

        double saldo=10.0; //variavel da classe conta
        double novoSaldo = 0;

        public void sacar(Double valor) {
            //variavel local de método
            novoSaldo = saldo - valor;
        }
        public void imprimirSaldo(){
            //disponível em toda classe
            System.out.println("Seu saldo antes do saque era de: "+ saldo+"$");
            //somente o método sacar conhece esta variavel
            System.out.println("Seu saldo após o saque é de: "+ novoSaldo+"$");

        }
        public double calcularDividaExponencial(){
            //variável local de método
            double valorParcela = 50.0;
            double valorMontante = 0.0; // começando a variável com valor zero
            for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
                //esta variável será reiniciada a cada execução for
                double valorCalculado = valorParcela * x;
                valorMontante = valorMontante + valorCalculado;
            }
            //escopo de fluxo
            //x e valorCalculado nunca estarão disponíveis fora do for
            
            return valorMontante;
            } 
        }
