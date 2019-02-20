package com.tofrer.app;

import com.webcerebrium.binance.api.BinanceApi;
import com.webcerebrium.binance.api.BinanceApiException;
/**
 * Main class to interact with the Binance site
 * @author fnoriega
 */
public class App {
    
    public static void main( String[] args) {
        
        try {
          //BinanceApi api = new BinanceApi();
          //System.out.println("ETH-BTC PRICE=" + api.pricesMap().get("ETHBTC"));
          System.out.println((new BinanceApi()).ping() );
        } catch (BinanceApiException e) {
          System.out.println( "ERROR: " + e.getMessage());
        }
    }
}
