import javax.persistence.*;


@Entity
@Table(name="banks_table")

public class Bank {

    @Id
    @GeneratedValue(generator="incrementer")
    @GenericGenerator(name="increment",strategy="increment")
    private int id;

    @Column(name ="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
