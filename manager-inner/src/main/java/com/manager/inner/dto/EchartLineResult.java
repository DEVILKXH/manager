package com.manager.inner.dto;

import java.util.ArrayList;
import java.util.List;

public class EchartLineResult {

	private List<String> legendData = new ArrayList<>();
	
	private List<String> axisData = new ArrayList<>();
	
	private List<EchartLine> series = new ArrayList<>();

	public List<String> getLegendData() {
		return legendData;
	}

	public void setLegendData(List<String> legendData) {
		this.legendData = legendData;
	}

	public List<String> getAxisData() {
		return axisData;
	}

	public void setAxisData(List<String> axisData) {
		this.axisData = axisData;
	}

	public List<EchartLine> getSeries() {
		return series;
	}

	public void setSeries(List<EchartLine> series) {
		this.series = series;
	}
	
	public void addLedgendData(String value){
		if(!this.legendData.contains(value)){
			this.legendData.add(value);
		}
	}
	
	public void addxAxisData(String value){
		if(!this.axisData.contains(value)){
			this.axisData.add(value);
		}
	}
	
	public void addSeries(EchartLine line){
		this.series.add(line);
	}
}
