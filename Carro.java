public class Carro{
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;

    
    public Carro(String nome){
        this.nome=nome;
        this.ligado=false;
        this.destruido=false;
        this.blindagem=0;
        this.armamento=false;
    }

    public String getnome(){
        return this.nome;
    }

    public Boolean getligado(){
        return this.ligado;
    }

    public void setligado(Boolean ligado){
       this.ligado=ligado;
    }

    public Boolean getdestruido(){
        return this.destruido;
    }

    public void setdestruido(Boolean destruido){
        this.destruido=destruido;

    }

    public Boolean getarmamento(){
        return this.armamento;
    }

    public void setarmamento(Boolean armamento){
        this.armamento=armamento;
    }

    public int getblindagem(){
        return this.blindagem;
    }

    public int setblindagem(int blindagem){
        return this.blindagem=blindagem;
    }

    public void sofrerDano(int dano){
        this.blindagem-=dano;
        if (this.blindagem<=0) {
            this.blindagem=0;
            this.ligado=false;
            this.destruido=true;

        }

    }

    public void info(){
        System.out.println("------------------------------------");
        System.out.printf("Nome..........:%s%n", this.nome);
        System.out.printf("Ligado........:%s%n", this.ligado ? "Sim" : "Não");
        System.out.printf("Destruido........:%s%n", this.destruido ? "Sim" : "Não");
        System.out.printf("Blindagem........:%s%n", this.blindagem);
        System.out.printf("Armamento........:%s%n", this.armamento ? "Sim" : "Não");
    }

    

















}
