/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author joang
 */
@WebService
public interface IDao<T> {
    @WebMethod
    public List getAll();
    
    @WebMethod
    public boolean add(T object);
    
    @WebMethod
    public boolean delete(int id);
    
    @WebMethod
    public boolean update(T object);
}
