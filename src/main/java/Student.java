import javax.persistence.*;

@Entity
public class Student {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String name;
	public double score;
}
