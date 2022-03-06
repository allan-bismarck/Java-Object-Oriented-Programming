package aula05.ou.aula06;
import java.util.Scanner;

public class ContaBanco {
    public String numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    Scanner leitor= new Scanner(System.in);
    
    public void estadoAtual() {
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Estado: " + this.status);
    }
    
    public ContaBanco() {
        this.saldo=0.0f;
        this.status=false;
    }
    
    public void abrirConta(String num, String nome, String tip) {
        this.status=true;
        this.numConta=num;
        this.dono=nome;
        this.tipo=tip;
        if(tip=="cc") {
            this.saldo=50.0f;
        } else {
            this.saldo=150.0f;
        }
        System.out.println("Conta aberta com sucesso.");
    }
    public void fecharConta() {
        if(this.saldo!=0) {
               System.out.println("Não é possível fechar!");
               if(this.saldo<0) {
                   System.out.println("Débito existente, quite para poder fechar a conta.");
               } else {
                   System.out.println("Existe saldo disponível, saque para poder fechar a conta.");
               }  
        } else {
            this.status=false;
            System.out.println("Conta fechada com sucesso.");
        }
    }
    public void depositar(float v) {
        if(this.status==true) {
            this.saldo+=v;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Não é possível depositar em uma conta fechada.");
        }
    }
    public void sacar(float v) {
        if(this.status==true) {
            if(this.saldo>=v) {
                this.saldo-=v;
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para saque!");
                System.out.println("Saldo disponível " + this.saldo);
              } 
        } else {
            System.out.println("Não é possível sacar de uma conta fechada.");
        }
    }
    public void pagarMensal() {
        if(this.saldo<0||this.status==false) {
            if(this.saldo<0) {
                System.out.println("Não é possível fazer o pagamento, saldo negativo.");
            } else {
                System.out.println("Não é possível fazer o pagamento, conta fechada.");
            }
        } else {
            int x;
            if(this.tipo=="cc") {
                x=12;             
            } else {
                x=20;
              }
            if(this.saldo>=x) {
                this.saldo-=x;
                System.out.println("Pagamento efetuado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente!");
              }
          }
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
