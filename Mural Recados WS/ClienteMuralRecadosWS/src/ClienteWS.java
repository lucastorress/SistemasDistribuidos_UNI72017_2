
import java.util.ArrayList;
import mural.service.RecadoWS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class ClienteWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }

    private static String getApelidoRecado() {
        mural.service.RecadoWS_Service service = new mural.service.RecadoWS_Service();
        mural.service.RecadoWS port = service.getRecadoWSPort();
        return port.getApelidoRecado();
    }

    private static int getCodigo() {
        mural.service.RecadoWS_Service service = new mural.service.RecadoWS_Service();
        mural.service.RecadoWS port = service.getRecadoWSPort();
        return port.getCodigo();
    }

    private static String getTexto() {
        mural.service.RecadoWS_Service service = new mural.service.RecadoWS_Service();
        mural.service.RecadoWS port = service.getRecadoWSPort();
        return port.getTexto();
    }

    private static void setApelidoRecado(java.lang.String apelidoRecado) {
        mural.service.RecadoWS_Service service = new mural.service.RecadoWS_Service();
        mural.service.RecadoWS port = service.getRecadoWSPort();
        port.setApelidoRecado(apelidoRecado);
    }

    private static void setCodigo(int codigo) {
        mural.service.RecadoWS_Service service = new mural.service.RecadoWS_Service();
        mural.service.RecadoWS port = service.getRecadoWSPort();
        port.setCodigo(codigo);
    }

    private static void setTexto(java.lang.String texto) {
        mural.service.RecadoWS_Service service = new mural.service.RecadoWS_Service();
        mural.service.RecadoWS port = service.getRecadoWSPort();
        port.setTexto(texto);
    }

    private static String hello(java.lang.String name) {
        mural.service.RecadoWS_Service service = new mural.service.RecadoWS_Service();
        mural.service.RecadoWS port = service.getRecadoWSPort();
        return port.hello(name);
    }
    
}
