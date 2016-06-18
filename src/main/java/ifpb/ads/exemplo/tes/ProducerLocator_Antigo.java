package ifpb.ads.exemplo.inject;

//import com.sun.xml.internal.ws.api.policy.PolicyResolver.ServerContext;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 15/06/2016, 15:09:25
 */
//libraries.cdi = "javax.enterprise:cdi-api:${versions.cdi}" 
//versions.cdi = '1.1-20130918'

//@Named
//@RequestScoped
//@Default
//@Dependent
//@Locator
public class ProducerLocator_Antigo {
//
//    @Inject
//    Instance<ProducerLocator> instance;
//
//    @Produces
//    ProducerLocator createLogger(InjectionPoint injectionPoint) {
//        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
//    }

//    @Inject
//    private ServerContext context;
    
    
//    @Produces
//    @Locator
//    public void produceConfigurationValue(InjectionPoint injectionPoint) {

//    public <T> Locate<T> create(InjectionPoint injectionPoint) {
//    public Object create(InjectionPoint injectionPoint) {
////    public   T produceConfigurationValue(@Any Instance<T> instance, InjectionPoint injectionPoint) {
//        Annotated annotated = injectionPoint.getAnnotated();
//        Locator annotation = annotated.getAnnotation(Locator.class);
//        String key = annotation.value();
////        Locate l = new Locate(injectionPoint.getType());
//        
//        System.out.println(injectionPoint.getMember().getName());
//        System.out.println(injectionPoint.getType().getTypeName());
//        System.out.println(key);
//        System.out.println(l.bean);
//        if ("ifpb.ads.exemplo.inject.Locate<java.lang.String>"
//                .equals(injectionPoint.getType().getTypeName())) {
//
////            return (Locate<T>) new Locate(key);
////            return  new Locate(key);
//        }
//        
//        if ("ifpb.ads.exemplo.inject.Locate<ifpb.ads.exemplo.inject.Pessoa>"
//                .equals(injectionPoint.getType().getTypeName())) {
//
////            return (Locate<T>) new Locate(new Pessoa(key));
////            return  new Locate(new Pessoa(key));
//        }
//        
//        
////        return (Locate<T>) new Locate(Integer.parseInt(key));
////        return  new Locate(Integer.parseInt(key));
////        
////        if (key != null) {
////            return (T) new Pessoa(key + " - " + injectionPoint.getType());
//////                injectionPoint.getMember().
////        }
////        return (T) new Pessoa("vazio");
////        throw new IllegalStateException("No key for injection point: " + injectionPoint);
//
////        return instance.get();//select(key).get();
//    }
}
