package com.csii.upp.dto.generate;

import java.util.Date;

public class Cardtyp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CARDTYP.CARDTYPCD
     *
     * @mbggenerated
     */
    private String cardtypcd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CARDTYP.CARDTYPDESC
     *
     * @mbggenerated
     */
    private String cardtypdesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CARDTYP.DATELASTMAINT
     *
     * @mbggenerated
     */
    private Date datelastmaint;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CARDTYP.CARDTYPCD
     *
     * @return the value of CARDTYP.CARDTYPCD
     *
     * @mbggenerated
     */
    public String getCardtypcd() {
        return cardtypcd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CARDTYP.CARDTYPCD
     *
     * @param cardtypcd the value for CARDTYP.CARDTYPCD
     *
     * @mbggenerated
     */
    public void setCardtypcd(String cardtypcd) {
        this.cardtypcd = cardtypcd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CARDTYP.CARDTYPDESC
     *
     * @return the value of CARDTYP.CARDTYPDESC
     *
     * @mbggenerated
     */
    public String getCardtypdesc() {
        return cardtypdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CARDTYP.CARDTYPDESC
     *
     * @param cardtypdesc the value for CARDTYP.CARDTYPDESC
     *
     * @mbggenerated
     */
    public void setCardtypdesc(String cardtypdesc) {
        this.cardtypdesc = cardtypdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CARDTYP.DATELASTMAINT
     *
     * @return the value of CARDTYP.DATELASTMAINT
     *
     * @mbggenerated
     */
    public Date getDatelastmaint() {
        return datelastmaint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CARDTYP.DATELASTMAINT
     *
     * @param datelastmaint the value for CARDTYP.DATELASTMAINT
     *
     * @mbggenerated
     */
    protected void setDatelastmaint(Date datelastmaint) {
        this.datelastmaint = datelastmaint;
    }
}