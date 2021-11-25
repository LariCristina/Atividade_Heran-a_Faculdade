public class Trigonometria {
    double hipoternusa;
    double cateto_oposto;
    double cateto_adjacente;
    double seno;
    double cosseno;
    double tantente;
    double retorno;

    public Trigonometria(double hipoternusa, double cateto_oposto, double cateto_adjacente, double seno, double cosseno, double tantente, double retorno) {
        this.hipoternusa = hipoternusa;
        this.cateto_oposto = cateto_oposto;
        this.cateto_adjacente = cateto_adjacente;
        this.seno = seno;
        this.cosseno = cosseno;
        this.tantente = tantente;
        this.retorno = retorno;

    }

    public double getHipoternusa() {
        return hipoternusa;
    }

    public void setHipoternusa(double hipoternusa) {
        this.hipoternusa = hipoternusa;
    }

    public double getCateto_oposto() {
        return cateto_oposto;
    }

    public void setCateto_oposto(double cateto_oposto) {
        this.cateto_oposto = cateto_oposto;
    }

    public double getCateto_adjacente() {
        return cateto_adjacente;
    }

    public void setCateto_adjacente(double cateto_adjacente) {
        this.cateto_adjacente = cateto_adjacente;
    }

    public double getSeno() {
        return seno;
    }

    public void setSeno(double seno) {
        this.seno = seno;
    }

    public double getCosseno() {
        return cosseno;
    }

    public void setCosseno(double cosseno) {
        this.cosseno = cosseno;
    }

    public double getTantente() {
        return tantente;
    }

    public void setTantente(double tantente) {
        this.tantente = tantente;
    }
    public double calcular_triangulo(double retorno){
        seno=cateto_oposto/hipoternusa;
        cosseno=cateto_adjacente/hipoternusa;
        tantente=cateto_oposto/cateto_adjacente;
        return retorno;
    }

    public double getRetorno() {
        return retorno;
    }

    public void setRetorno(double retorno) {
        this.retorno = retorno;
    }
}


