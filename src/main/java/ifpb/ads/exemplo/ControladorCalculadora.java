package ifpb.ads.exemplo;

import ifpb.ads.exemplo.inject.Locator;
import ifpb.ads.shared.Calculadora;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/06/2016, 09:20:14
 */
@Named
//@SessionScoped
@RequestScoped
public class ControladorCalculadora implements Serializable {

//    @Inject
    @Locator("CalculadoraImpl")
    private Calculadora calculadora;// = new CalculadoraImpl();
    
    private String resultado;
    private int a;
    private int b;

    public String somar() {
        resultado = String.valueOf(calculadora.somar(a, b));
//        a = 0;
//        b = 0;
//        return "index.xhtml?faces-redirect=true";
//        return "index.xhtml";
        return null;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}
