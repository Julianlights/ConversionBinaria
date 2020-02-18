/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionipbinario;


/**
 *
 * @Jorge Luis Julian Sanchez
 */
public class ConversionIPBinario {

    public String ipconvertion() {
        String ip1 = "192.254.1.28";
        String ip2 = "192.254.1.33";
        String ip3 = "192.254.1.100";
        int Uno = Integer.parseInt(ip1.replace(".", ""));
        int Dos = Integer.parseInt(ip2.replace(".", ""));
        int Tres = Integer.parseInt(ip3.replace(".", ""));
        String convertidor = Integer.toBinaryString(Uno);
        String convertidor2 = Integer.toBinaryString(Dos);
        String convertidor3 = Integer.toBinaryString(Tres);
        System.out.println(ip1 + ": " + convertidor);
        System.out.println(ip2 + ": " + convertidor2);
        System.out.println(ip3 + ": " + convertidor3);
        
        
        return convertidor +"\n"+ convertidor2  + "\n"+ convertidor3;
    }

    public static void main(String[] args) {
    }
}
