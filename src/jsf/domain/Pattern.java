package jsf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sablon")
public class Pattern implements Serializable {

	@Id
	@Column(name = "id_sablona")
	public int patternId;
	
	@Column(name = "oznaka_sablona")
	public String patternMark;
	
	@Column(name = "naziv_sablona")
	public String patternName;
	
	@Column(name = "vremenske_oznake")
	public String weatherCondition;
	
	@Column(name = "mesto")
	public String Place;
	
	@Column(name = "datum")
	public Date date;
	
	@Column(name = "stanje_sablona")
	public String state;
	
	public Pattern(){
		
	}

	public Pattern(int patternId, String patternMark, String patternName, String weatherCondition, String place,
			Date date, String state) {
		super();
		this.patternId = patternId;
		this.patternMark = patternMark;
		this.patternName = patternName;
		this.weatherCondition = weatherCondition;
		Place = place;
		this.date = date;
		this.state = state;
	}

	public int getPatternId() {
		return patternId;
	}

	public void setPatternId(int patternId) {
		this.patternId = patternId;
	}

	public String getPatternMark() {
		return patternMark;
	}

	public void setPatternMark(String patternMark) {
		this.patternMark = patternMark;
	}

	public String getPatternName() {
		return patternName;
	}

	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}

	public String getWeatherCondition() {
		return weatherCondition;
	}

	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "patternId=" + patternId + ", patternMark=" + patternMark + ", patternName=" + patternName
				+ ", weatherCondition=" + weatherCondition + ", Place=" + Place + ", date=" + date + ", state=" + state;
	}
	
	
}
