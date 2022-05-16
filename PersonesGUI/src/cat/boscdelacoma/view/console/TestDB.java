/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.boscdelacoma.view.console;

import cat.boscdelacoma.model.business.entities.Persona;
import cat.boscdelacoma.model.persistence.dao.impl.jdbc.mysql.JDBCPersonaDAO;
import cat.boscdelacoma.model.persistence.dao.impl.jdbc.mysql.MYSQLConnection;
import cat.boscdelacoma.model.persistence.exceptions.DAOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victo
 */
public class TestDB {
    
    public static void main(String[] args){
        MYSQLConnection conn = MYSQLConnection.getInstance();
        var data = new JDBCPersonaDAO();
        try {
            var persona = new Persona("Raul S.", "8921435Z", (short) 19);
            data.add(persona);
        } catch (DAOException ex) {
            System.out.println("Error");
        }
    }
    
}
