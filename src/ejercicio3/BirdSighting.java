package ejercicio3;

public class BirdSighting {
    private Integer numero;
    private Integer dia;
    private String especie;
    
    public BirdSighting(){
        especie="robin";
        numero=1;
        dia=1;
    }
    public String toString(){
        String a="dia:" + dia +"\n"+"numero:"+numero+"\n"+"especie:"+especie;
        return a;
    }   
    public BirdSighting(Integer numero,Integer dia, String especie){
        this.especie=especie;
        this.numero=numero;
        this.dia=dia;
    }
    public String getEspecie(){
        return especie;
    }
    public Integer getDia(){
        return dia;
    }
    public Integer getNumero(){
        return numero;
    }
    
}
