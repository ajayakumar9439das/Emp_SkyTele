package EmpSkytele1.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empsky")
public class EmpSky {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name="user",nullable =false,length=45)
	private String user;
	@Column(name="emil",nullable =false,length=128,unique = true)
	private String email;
	@Column(name="dob",nullable =false,length=20,unique = true)
	private LocalDate dob;
	@Column(name="age",nullable =false,length=20)
	private int age;
      public long getId() {
        return id;
      }
      public void setId(long id) {
        this.id = id;
      }
      public String getUser() {
        return user;
      }
      public void setUser(String user) {
        this.user = user;
      }
      public String getEmail() {
        return email;
      }
      public void setEmail(String email) {
        this.email = email;
      }
      public LocalDate getDob() {
        return dob;
      }
      public void setDob(LocalDate dob) {
        this.dob = dob;
      }
      public int getAge() {
        return age;
      }
      public void setAge(int age) {
        this.age = age;
      }
}

