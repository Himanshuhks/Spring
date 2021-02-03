package main.java.com.kamal.kishore.spring.ioc.sim;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import main.java.com.kamal.kishore.spring.ioc.apps.IApps;
import main.java.com.kamal.kishore.spring.ioc.appstores.IAppStores;

/**
 * @author Kamal
 */
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public abstract class ISimNetwork {

    protected Integer id;
    protected String name;
    protected IAppStores appStores;
    protected IApps apps;

    /**
     * Making phone call to end point
     */
    abstract public void makeCall();

    /**
     * Use Phone Internet
     */
    abstract public void useInternet();

}
