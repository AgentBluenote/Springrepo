package com.uciext.springfw.hw.catalog.model;

import java.lang.StringBuilder;

public class Catalog {
	// Properties
    private String lastupdateDate;
    private String catalogName;
    
    public String gelastupdateDate() {
        return lastupdateDate;
    }
    public void setlastupdateDate(String value) {
        this.lastupdateDate = value;
    }

    public String getCatalogName() {
        return catalogName;
    }
    public void setCatalogName(String value) {
        this.catalogName = value;
    }

    public String toString() {
       StringBuilder buff = new StringBuilder("[Catalog: ")
       .append("catalogName=").append(catalogName)
       .append(", lastupdateDate=").append(lastupdateDate)
       .append("]")
       ;

       return buff.toString();
    }
}
