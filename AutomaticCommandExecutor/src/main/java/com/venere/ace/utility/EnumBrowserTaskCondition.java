/*                   Copyright (c) 2007 Venere Net S.p.A.
 *                             All Rights Reserved
 *
 * This software is the confidential and proprietary information of
 * Venere Net S.p.A. ("Confidential  Information"). You  shall not disclose
 * such  Confidential Information and shall use it only in accordance with
 * the terms  of the license agreement you entered into with Venere Net S.p.A.
 *
 * VENERE NET S.P.A. MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY
 * OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE,
 * OR NON-INFRINGEMENT. VENERE NET S.P.A. SHALL NOT BE LIABLE FOR ANY DAMAGES
 * SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS
 * SOFTWARE OR ITS DERIVATIVES.
 */

package com.venere.ace.utility;

/**
 *
 * @author quatrini
 */
public enum EnumBrowserTaskCondition implements IEnum {

    URL           ("checkUrl"),
    TEXT          ("getText"),
    WAIT_HP_SEARCH("wait4SearchHotelPage"),
    WAIT_SEARCHER ("wait4SearchAvailability"),
    WAIT_BOOKING ("waitBookingBar"),
    WAIT_ELEMENT   ("wait4Element"),
    WAIT_ELEMENT_DISAPPEAR ("waitElementDisappear");
    
    private final String sAction;

    EnumBrowserTaskCondition(String  sAction){
      this.sAction = sAction;
    }
   

   @Override
   public String getActionCode() {
      return sAction;
   }

   @Override
   public IEnum getTerminateCode() {
      throw new UnsupportedOperationException("Not supported yet.");
   }
}
