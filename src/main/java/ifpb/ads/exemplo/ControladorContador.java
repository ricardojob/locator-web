package ifpb.ads.exemplo;


import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import ifpb.locator.cdi.Locator;
import ifpb.ads.shared.Contador;
/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/06/2016, 09:20:14
 */
@Named
@RequestScoped
public class ControladorContador implements Serializable {

    @Locator("ContadorBean")
    private Contador contador;

    public int getContador() {
        contador.incrementar();
        return contador.value();
    }

}
