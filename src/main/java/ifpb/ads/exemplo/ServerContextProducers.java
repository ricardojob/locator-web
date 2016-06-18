package ifpb.ads.exemplo;

//import com.sun.xml.internal.ws.api.policy.PolicyResolver.ServerContext;
import ifpb.locator.ServerContext;
import ifpb.locator.ejb.GlassFishContext;
import ifpb.locator.named.App;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 17/06/2016, 15:02:58
 */
@Named
@ApplicationScoped
public class ServerContextProducers {

    @Inject
    private Event<ServerContext> loginEvent;

    @Produces
    public ServerContext app() {
        ServerContext serverContext = new ServerContext(
                new GlassFishContext(),
                App.name("core"));

        loginEvent.fire(serverContext);
        return serverContext;
    }
}
