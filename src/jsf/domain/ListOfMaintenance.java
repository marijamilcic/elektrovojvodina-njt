package jsf.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "lista_odrzavanja")
public class ListOfMaintenance implements Serializable {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "id_sablona")
	private Pattern patternID;
	
	@Id
	@Column(name = "id_liste")
	private int listID;
	
	@Column(name = "stanje")
	private String state;
	
	@Column(name = "datum_kreiranja")
	private Date dateOfCreation;
	
	@Column(name = "datum_dodele_korisniku")
	private Date dateOfUserClaiming;
	
	@Column(name = "planirani_datum_izvrsenja")
	private Date planedDateOfexecution;

	@Temporal(TemporalType.DATE)
	@Column(name = "datum_zatvaranja")
	private Date dateOfClosing;

	@ManyToOne
	@JoinColumn(name= "radnik_koji_je_zatvorio_listu")
	private Worker workerWhoFinished;

    @Column(name = "datum_revizije")
    protected Date dateOfRevision;

	@ManyToOne
	@JoinColumn(name= "id_kalendara")
	private CalendarOfMaintenance calendarID;

	public Pattern getPatternID() {
		return patternID;
	}

	public void setPatternID(Pattern patternID) {
		this.patternID = patternID;
	}

	public int getListID() {
		return listID;
	}

	public void setListID(int listID) {
		this.listID = listID;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public Date getDateOfUserClaiming() {
		return dateOfUserClaiming;
	}

	public void setDateOfUserClaiming(Date dateOfUserClaiming) {
		this.dateOfUserClaiming = dateOfUserClaiming;
	}

	public Date getPlanedDateOfexecution() {
		return planedDateOfexecution;
	}

	public void setPlanedDateOfexecution(Date planedDateOfexecution) {
		this.planedDateOfexecution = planedDateOfexecution;
	}

	public Date getDateOfClosing() {
		return dateOfClosing;
	}

	public void setDateOfClosing(Date dateOfClosing) {
		this.dateOfClosing = dateOfClosing;
	}

	public Worker getWorkerWhoFinished() {
		return workerWhoFinished;
	}

	public void setWorkerWhoFinished(Worker workerWhoFinished) {
		this.workerWhoFinished = workerWhoFinished;
	}

	public CalendarOfMaintenance getCalendarID() {
		return calendarID;
	}

	public void setCalendarID(CalendarOfMaintenance calendarID) {
		this.calendarID = calendarID;
	}
}
