package jsf.domain;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "radnik")

public class Worker implements Serializable {


	public int workerID;
	public int idNumber;
	public String professionalism;
	public String status;
	public String name;
	public String surname;

	public Worker(){
	}

	public Worker(int workerID, int idNumber, String professionalism, String status, String name, String surname) {
		super();
		this.workerID = workerID;
		this.idNumber = idNumber;
		this.professionalism = professionalism;
		this.status = status;
		this.name = name;
		this.surname = surname;
	}
	@Id
	@Column(name= "id_radnika")
	public int getWorkerID() {
		return workerID;
	}

	public void setWorkerID(int workerID) {
		this.workerID = workerID;
	}

	@Column(name = "jmbg")
	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	@Column(name= "strucnost")
	public String getProfessionalism() {
		return professionalism;
	}

	public void setProfessionalism(String professionalism) {
		this.professionalism = professionalism;
	}

	@Column(name= "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name= "ime")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name= "prezime")
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "workerID=" + workerID + ", idNumber=" + idNumber + ", professionalism=" + professionalism
				+ ", status=" + status + ", name=" + name + ", surname=" + surname;
	}
	
	
}
