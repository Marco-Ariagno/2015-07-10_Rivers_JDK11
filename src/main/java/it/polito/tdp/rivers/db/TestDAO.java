package it.polito.tdp.rivers.db;

import java.util.List;

import it.polito.tdp.rivers.model.Flow;
import it.polito.tdp.rivers.model.River;

public class TestDAO {

	public static void main(String[] args) {
		RiversDAO dao = new RiversDAO() ;
		
		List<River> rivers = dao.getAllRivers() ;
		System.out.println(rivers) ;
		
		List<Flow> flows = dao.getAllFlows() ;
		System.out.format("Loaded %d flows\n", flows.size()) ;
		//System.out.println(flows) ;
	}

}
