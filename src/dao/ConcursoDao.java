/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Concurso;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Breno-
 */
public class ConcursoDao extends GenericoDao {
    
    public int CadastrarConcurso(Concurso concurso) throws SQLException {
        getConnection();
        int resultado = 0;
        try {
            getConnection();
            pstmt = connection.prepareStatement("INSERT INTO concurso (codConcurso, numeroConcurso) VALUES (?, ?)");
            pstmt.setInt(1, concurso.getCodConcurso());
            pstmt.setString(2, concurso.getNumeroConcurso());
            resultado = pstmt.executeUpdate();
        } finally {
            finishConnection();
        }
        return resultado;
    }
    
    public List<Concurso> listarConcursos() throws SQLException {
        List<Concurso> y = new ArrayList<Concurso>();
        try {
            getConnection();
            pstmt = connection.prepareStatement("SELECT * FROM concurso ORDER BY codConcurso ASC;");
            
            resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                Concurso c = new Concurso();
                
                c.setCodConcurso(resultSet.getInt("codConcurso"));
                c.setNumeroConcurso(resultSet.getString("numeroConcurso"));
                
                y.add(c);
            }
        } finally {
            finishConnection();
        }
        return y;
    }
 
    public Concurso codConcursoPorNumeroConcurso(String pesquisar) throws SQLException {
        Concurso y = new Concurso();
        try {
            getConnection();
            pstmt = connection.prepareStatement("SELECT * FROM concurso WHERE numeroConcurso = ?");
            pstmt.setString(1, pesquisar);
            resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                
                y.setCodConcurso(resultSet.getInt("codConcurso"));
                y.setNumeroConcurso(resultSet.getString("numeroConcurso"));
                
            }
        } finally {
            finishConnection();
        }
        return y;
    }
    
}
