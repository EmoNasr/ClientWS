package org.example;


import proxy.Converter;
import proxy.ConverterWS;

public class ClientWs {
    public static void main(String[] args) {
        //Interface with a webservice [Midlware]
        Converter stub = new ConverterWS().getConverterPort();
        System.out.println(stub.getCompte(1).getSolde());
    }

}
