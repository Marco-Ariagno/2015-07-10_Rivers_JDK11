package it.polito.tdp.rivers.db;

import it.polito.tdp.rivers.model.Flow;
import it.polito.tdp.rivers.model.River;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class RiversDAO {
	
	public List<River> getAllRivers() {
		final String sql = "SELECT id, name FROM river" ;
		
		List<River> rivers = new LinkedList<River>() ;
		
		try {
			Connection conn = DBConnect.getConnection() ;

			PreparedStatement st = conn.prepareStatement(sql) ;
			
			ResultSet res = st.executeQuery() ;
			
			while( res.next() ) {
				rivers.add( new River(res.getInt("id"), res.getString("name"))) ;
			}
			
			conn.close() ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null ;
		}
		
		return rivers ;
	
	}
	
	
	public List<Flow> getAllFlows() {
		final String sql = "SELECT id, day, flow, river FROM flow" ;
		
		List<Flow> flows = new LinkedList<Flow>() ;
		
		try {
			Connection conn = DBConnect.getConnection() ;

			PreparedStatement st = conn.prepareStatement(sql) ;
			
			ResultSet res = st.executeQuery() ;
			
			while( res.next() ) {
				flows.add( new Flow(res.getInt("id"), res.getDate("day").toLocalDate(),
						res.getDouble("flow"), res.getInt("river"))) ;
			}
			
			conn.close() ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null ;
		}
		
		return flows ;
	
	}

	
	
	

}

