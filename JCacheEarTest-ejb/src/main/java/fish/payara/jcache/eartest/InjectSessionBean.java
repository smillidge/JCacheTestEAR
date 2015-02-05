/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.jcache.eartest;

import javax.cache.CacheManager;
import javax.cache.spi.CachingProvider;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author steve
 */
@Stateless
public class InjectSessionBean{
    
    @Inject
    CachingProvider cp;
    
    @Inject
    CacheManager cm;

    public void useCache() {
        
        System.out.println(cp);
        System.out.println(cm);
        System.out.println(cm.getCache("TestCache"));
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
