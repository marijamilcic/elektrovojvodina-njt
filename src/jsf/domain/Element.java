package jsf.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="element")
public class Element implements Serializable {

	@Id
	@Column(name= "id_elementa")
	private int elementID;
	
	@Column(name= "lokacija")
	private String location;
	
	@Column(name= "koordinate")
	private int coordinates;
	
	@Column(name= "opis")
	private String description;

	@ManyToOne
	@JoinColumn(name= "id_tipaelementa")
	private ElementType type;

	public Element(){
		
	}
	
	public Element(int elementID, String location, int coordinates, String description, ElementType type) {
		super();
		this.elementID = elementID;
		this.location = location;
		this.coordinates = coordinates;
		this.description = description;
		this.type = type;
	}

	public int getElementID() {
		return elementID;
	}

	public void setElementID(int elementID) {
		this.elementID = elementID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(int coordinates) {
		this.coordinates = coordinates;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ElementType getType() {
		return type;
	}

	public void setType(ElementType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "elementID=" + elementID + ", location=" + location + ", coordinates=" + coordinates
				+ ", description=" + description + ", type=" + type;
	}
	
	
}
