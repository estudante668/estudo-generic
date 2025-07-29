package domain;


public class UserDomain extends GenericDomain<Integer> {

    private Integer id;
    private String nome;
    
    public UserDomain(Integer id, String nome) {
        super(id);
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDomain that = (UserDomain) o;
        return id != null ? id.equals(that.id) : that.id == null;
    } 

    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    } 
    
    public String toString() {
        return "UserDomain{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

}
