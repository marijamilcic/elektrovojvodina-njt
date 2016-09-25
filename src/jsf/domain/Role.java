package jsf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="uloga")
public class Role implements Serializable {

	@Id
	@Column(name= "id_uloge")
	private int roleID;
	
	@Column(name= "naziv_uloge")
	private String roleName;
	
	public Role(){
		
	}

	public Role(int roleID, String roleName) {
		super();
		this.roleID = roleID;
		this.roleName = roleName;
	}

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "roleID=" + roleID + ", roleName=" + roleName;
	}
	
}
