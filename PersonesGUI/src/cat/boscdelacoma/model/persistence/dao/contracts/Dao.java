/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.boscdelacoma.model.persistence.dao.contracts;

import cat.boscdelacoma.model.persistence.exceptions.DAOException;
import java.util.List;

/**
 *
 * @author Victo
 */
public interface Dao<T> {
    //Mètodes de consulta
    T get(long id) throws DAOException;
    List<T> getAll() throws DAOException;
    
    //Mètodes modificadors
    void add(T t) throws DAOException;
    void update(T t) throws DAOException;
    void delete(T t) throws DAOException;

}
