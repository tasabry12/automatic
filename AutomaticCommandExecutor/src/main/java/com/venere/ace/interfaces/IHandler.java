/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venere.ace.interfaces;

import com.venere.ace.abstracts.AManager;

/**
 *
 * @author cquatrini
 */
public interface IHandler {
   
   public AManager getManager() ;

   public void setManager(AManager oTaskManager);
   
   public boolean isHanlderStopped();
    
   
}
