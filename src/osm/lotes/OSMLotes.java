/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package osm.lotes;

import Controlador.Conexion;
import Controlador.LoteData;
import Modelo.Lote;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emman
 */
public class OSMLotes {
    public Connection con = null;

    public static void main(String[] args) {
               try {

            Conexion conexion = new Conexion();
            LoteData ld = new LoteData(conexion);
            LocalDate lt = LocalDate.now();
            Lote lote = new Lote(2, 1, 1, 1, 1, 1, 1, lt, "fgonzalez");

            ld.agregarLote(lote);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OSMLotes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
