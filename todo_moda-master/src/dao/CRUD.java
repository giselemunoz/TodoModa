
package dao;

import java.sql.ResultSet;

public interface CRUD {
    public ResultSet list();
        
    public ResultSet search(String param);
    
    public void update(Object model);
   
}
