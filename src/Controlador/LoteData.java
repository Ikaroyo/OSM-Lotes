/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Modelo.Lote;
import java.sql.Date;

/**
 *
 * @author emman
 */
public class LoteData {

    private Connection con = null;

    public LoteData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }

    public void agregarLote(Lote lote) {

        // String de consulta a base de datos
        String sql = "INSERT INTO lotes(nrolote, efectivo, credito, debito, cheques, compensacion, municipalidad, fecha, usuario) VALUES (?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, lote.getNroLote());
            ps.setDouble(2, lote.getEfectivo());
            ps.setDouble(3, lote.getCredito());
            ps.setDouble(4, lote.getDebito());
            ps.setDouble(5, lote.getCheques());
            ps.setDouble(6, lote.getCompensacion());
            ps.setDouble(7, lote.getMunicipalidad());
            ps.setDate(8, Date.valueOf(lote.getFecha()));
            ps.setString(9, lote.getUsuario());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Lote cargado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Lote no pudo ser cargado");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde cargar lote " + ex);

        }
    }
}
