package com.sis213.restful.model;

public class ProductID {
    private final String id;
    public ProductID(final String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }
}
