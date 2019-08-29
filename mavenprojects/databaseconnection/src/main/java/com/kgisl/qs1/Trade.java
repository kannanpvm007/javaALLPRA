package com.kgisl.qs1;

/**
 * Trade
 */
public class Trade {

    String uccCode;
    String tradeDate;
    String scrip;
    String tradeType;
    String quantity;
    String tradePrice;

    Trade(String uccCode, String tradeDate, String scrip, String tradeType, String quantity, String tradePrice) {
        this.uccCode = uccCode;
        this.tradeDate = tradeDate;
        this.scrip = scrip;
        this.tradeType = tradeType;
        this.quantity = quantity;
        this.tradePrice = tradePrice;
    }
    /**
     * @return the uccCode
     */
    public String getUccCode() {
        return uccCode;
    }
    /**
     * @param uccCode the uccCode to set
     */
    public void setUccCode(String uccCode) {
        this.uccCode = uccCode;
    }
    /**
     * @return the tradeDate
     */
    public String getTradeDate() {
        return tradeDate;
    }
    /**
     * @param tradeDate the tradeDate to set
     */
    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }
    /**
     * @return the scrip
     */
    public String getScrip() {
        return scrip;
    }
    /**
     * @param scrip the scrip to set
     */
    public void setScrip(String scrip) {
        this.scrip = scrip;
    }
    /**
     * @return the tradeType
     */
    public String getTradeType() {
        return tradeType;
    }
    /**
     * @param tradeType the tradeType to set
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }
    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    /**
     * @return the tradePrice
     */
    public String getTradePrice() {
        return tradePrice;
    }
    /**
     * @param tradePrice the tradePrice to set
     */
    public void setTradePrice(String tradePrice) {
        this.tradePrice = tradePrice;
    }
    @Override
    public String toString() {
        return uccCode+" "+tradeDate+" "+scrip+" "+tradeType+" "+quantity+" "+tradePrice;
    }
}