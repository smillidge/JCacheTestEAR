/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.jcache.eartest;

import javax.cache.annotation.CacheResult;
import javax.ejb.Stateless;

/**
 *
 * @author steve
 */
@Stateless
public class CDISessionBean{

    @CacheResult(cacheName = "TestCache")
    public String generateResult(String key) {
        return Long.toHexString(System.currentTimeMillis());
    }
}
