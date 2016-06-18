package ifpb.ads.exemplo;

import com.sun.javafx.css.CalculatedValue;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import ifpb.ads.exemplo.inject.Locator;
import ifpb.ads.shared.Calculadora;
import ifpb.locator.ServerContext;
import ifpb.locator.context.DefaultContext;
import ifpb.locator.named.App;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 15/06/2016, 15:25:46
 */
@Named
@RequestScoped
public class Controlador {

//    @Inject
    @Locator("Kiko")    
    private String nome;
//    private Locate<String> nomed;
//    @Inject
    @Locator("10")
//    private Locate<Integer> idade;
    private Integer idade = 13;
    
    @Locator("Chaves")
    private String mudar;
//    @Inject
//    @Locator("kiko")
//    private Locate<Pessoa> pessoa;

//    public String getNome() {
//        return nome.bean;
//    }
//
//    public Integer getIdade(){
//        return idade.bean;
//    }

//    public Pessoa getPessoa() {
//        return pessoa.bean;
//    }

    
    
    public String getNome() {
//        System.out.println(calculadora);
        return nome;
    }

    public Integer getIdade() {
        
        return idade;
    }

    public String getMudar() {
        return mudar;
    }
    
    //java:global/core/CalculadoraImpl
    
//    @Locator("CalculadoraImpl")
//    private Calculadora calculadora;
    
//    public int getCalc(){
//       return  this.calculadora.somar(1, 1);
//    }
//    @Named
    
    @Inject
    private ServerContext c;
    
    
    
    
}
