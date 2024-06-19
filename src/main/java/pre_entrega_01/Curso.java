package pre_entrega_01;


import jakarta.persistence.*;

import java.security.PrivateKey;
import java.util.Objects;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nombre;

    @Column
    private Integer precio;

    @Column
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "alumno_id")
    private Alumnos alumno;

   public Curso(){}
   public Curso(String nombre, Integer precio, Integer stock){
       this.nombre = nombre;
       this.precio = precio;
       this.stock = stock;
   }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio(){
       return precio;
    }

    public void setPrecio(Integer precio){
       this.precio = precio;
    }

    public Integer getStock(){
       return stock;
    }

    public void setStock(){
       this.stock = stock;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(id, curso.id) && Objects.equals(nombre, curso.nombre) && Objects.equals(precio, curso.precio) && Objects.equals(stock, curso.stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio, stock);
    }
}
//usarONETOMANY