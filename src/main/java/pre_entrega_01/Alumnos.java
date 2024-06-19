package pre_entrega_01;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity

public class Alumnos {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column
    protected String nombre;

    @Column
    protected String apellido;

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Curso> curso;

    @Column
    protected Integer edad;

    @Column
    protected Integer nota;

    public Alumnos(){}
    public Alumnos(String nombre, String apellido, Integer edad, Integer nota){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
    }

    public Integer getId() {
        return id;
    }

    public void  setId(Integer id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad){
        this.edad = edad;
    }

    public Integer getNota(){
        return nota;
    }

    public void setNota(Integer nota){
        this.nota = nota;
    }

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnos alumnos = (Alumnos) o;
        return Objects.equals(id, alumnos.id) && Objects.equals(nombre, alumnos.nombre) && Objects.equals(apellido, alumnos.apellido) && Objects.equals(edad, alumnos.edad) && Objects.equals(nota, alumnos.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, edad, nota);
    }
}
