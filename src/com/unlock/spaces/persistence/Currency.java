package com.unlock.spaces.persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class Currency implements Serializable {

    @Basic
    private String currencyCode;

    public Currency() {

    }
   
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
