/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Aposta;
import java.sql.SQLException;

/**
 *
 * @author Breno-
 */
public class ApostaDao extends GenericoDao {
    
    
        public int CadastrarAposta(Aposta aposta) throws SQLException {
        getConnection();
        int resultado = 0;
        try {
            getConnection();
            pstmt = connection.prepareStatement("INSERT INTO aposta (codAposta, concurso, nomeApostador, valorAposta, premio, dataAposta, numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9, numero10, numero11, numero12, numero13, numero14, numero15, numero16, numero17, numero18, numero19, numero20, numero21, numero22, numero23, numero24, numero25, numero26, numero27, numero28, numero29, numero30) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setInt(1, aposta.getCodAposta());
            pstmt.setInt(2, aposta.getConcurso().getCodConcurso());
            pstmt.setString(3, aposta.getNomeApostador());
            pstmt.setBigDecimal(4, aposta.getValorAposta());
            pstmt.setBigDecimal(5, aposta.getPremio());
            pstmt.setString(6, aposta.getDataAposta());
            pstmt.setInt(7, aposta.getN1());
            pstmt.setInt(8, aposta.getN2());
            pstmt.setInt(9, aposta.getN3());
            pstmt.setInt(10, aposta.getN4());
            pstmt.setInt(11, aposta.getN5());
            pstmt.setInt(12, aposta.getN6());
            pstmt.setInt(13, aposta.getN7());
            pstmt.setInt(14, aposta.getN8());
            pstmt.setInt(15, aposta.getN9());
            pstmt.setInt(16, aposta.getN10());
            pstmt.setInt(17, aposta.getN11());
            pstmt.setInt(18, aposta.getN12());
            pstmt.setInt(19, aposta.getN13());
            pstmt.setInt(20, aposta.getN14());
            pstmt.setInt(21, aposta.getN15());
            pstmt.setInt(22, aposta.getN16());
            pstmt.setInt(23, aposta.getN17());
            pstmt.setInt(24, aposta.getN18());
            pstmt.setInt(25, aposta.getN19());
            pstmt.setInt(26, aposta.getN20());
            pstmt.setInt(27, aposta.getN21());
            pstmt.setInt(28, aposta.getN22());
            pstmt.setInt(29, aposta.getN23());
            pstmt.setInt(30, aposta.getN24());
            pstmt.setInt(31, aposta.getN25());
            pstmt.setInt(32, aposta.getN26());
            pstmt.setInt(33, aposta.getN27());
            pstmt.setInt(34, aposta.getN28());
            pstmt.setInt(35, aposta.getN29());
            pstmt.setInt(36, aposta.getN30());
            resultado = pstmt.executeUpdate();
        } finally {
            finishConnection();
        }
        return resultado;
    }        

}
