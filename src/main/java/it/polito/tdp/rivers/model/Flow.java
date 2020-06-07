package it.polito.tdp.rivers.model;

import java.time.LocalDate;

public class Flow {
	
	private int id ;
	private LocalDate day ;
	private double flow ;
	private int idRiver ;
	
	public Flow(int id, LocalDate day, double flow, int idRiver) {
		super();
		this.id = id;
		this.day = day;
		this.flow = flow;
		this.idRiver = idRiver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay(LocalDate day) {
		this.day = day;
	}

	public double getFlow() {
		return flow;
	}

	public void setFlow(double flow) {
		this.flow = flow;
	}

	public int getIdRiver() {
		return idRiver;
	}

	public void setIdRiver(int idRiver) {
		this.idRiver = idRiver;
	}

	@Override
	public String toString() {
		return "Flow [id=" + id + ", day=" + day + ", flow=" + flow
				+ ", idRiver=" + idRiver + "]";
	}

}
