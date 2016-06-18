package ifpb.ads.exemplo;

import ifpb.ads.exemplo.inject.Locator;
import ifpb.ads.shared.Calculadora;
import ifpb.ads.shared.Contador;
import ifpb.locator.ServerContext;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/06/2016, 09:20:14
 */
@Named
@RequestScoped
public class Controlador implements Serializable {

    @Locator("CalculadoraImpl")
    private Calculadora calculadora;
     

     @Inject
    private ServerContext c;
    
    private String resultado;
    private int a;
    private int b;

    public String somar() {
        resultado = String.valueOf(calculadora.somar(a, b));
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
