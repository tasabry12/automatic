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
public enum EnumTestTask implements IEnum{

    PERFORM             ("performTest"),
    CHECKLAND           ("checkLand"),
    CHECKPRICE          ("checkPrice"),
    SEOTITLE            ("checkTitle"),
    SEOMETATAG          ("checkMetaTag"),
    EXISTBOOKINGCONFIRM ("checkExistBookingConfirm"),
    EXISTELEMENT        ("checkExistElement"),
    CSSVALUE            ("checkCssValue"),
    EXISTURLELEMENT     ("checkURLElement"),
    CONTAINSTYLE        ("checkElementStyle"),
    EXISTTAG            ("checkExistTag"),
    EXISTTEXT           ("checkExistText"),
    ISCONTAINEDTEXT     ("checkIsContainedText"),
    EXISTSELECTEDTEXT   ("checkExistSelectedText"),
    COUNTNUMBERELEMENT  ("checkCountElement"),
    COUNTALLELEMENTS    ("checkCountElement"),
    STORESNAP           ("makeSnap"),
    SEOLINKS            ("checkLinks"),
    COOKIECHECK         ("checkCookiePresent"),
    SHOWALLCOOKIES      ("showAllCookies"),
    CHEKKA              ("myCheck"),
    GETTEXT             ("getText"),
    SEODESCRIPTION      ("checkDescription"),
    CLOSEALL            ("closeAll"),
    EXISTPOPUNDER	("checkPopunder"),
    ISNOTEMPTYTEXT      ("checkIsNotEmptyText"),
    ISNOTEMPTYATTRIBUTE ("checkIsNotEmptyAttribute"),
    CHECKATTRIBUTEVALUE ("checkAttributeValue"),
    SEOCANONICALTAG     ("checkCanonicalTag"),
    SEOMETATAGROBOTS    ("checkMetaTag"),
    EXECUTESCRIPT       ("executeScript"),
    CHECKTMSCALLS       ("checkTMSinteraction"),
    COMPARESTRING       ("compareString"),
    CHECKORDER          ("checkOrder"),
    CHECKHOTELNAME      ("checkHotelName"),
    CHECKDEALS          ("checkDeals"),
    CHECKSTARS          ("checkStars"),
    CHECKCITYAREAS      ("checkCityAreas");
    
    
    private final String sAction;

    EnumTestTask(String  sAction){
      this.sAction = sAction;
    }
    @Override
    public String getActionCode() { return sAction; }

   @Override
   public IEnum getTerminateCode() {
       return  CLOSEALL;
   }
}
