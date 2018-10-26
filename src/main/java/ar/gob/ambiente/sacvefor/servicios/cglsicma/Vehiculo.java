
package ar.gob.ambiente.sacvefor.servicios.cglsicma;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular los Vehículos registrados localmente
 * y para registrar Vehículos nuevos desde el SICMA
 * @author rincostante
 */
@XmlRootElement
public class Vehiculo implements Serializable {
    private Long id;
    /**
     * Identificación del usuario de registro designado para el SICMA
     */
    private Long id_usuario;
    /**
     * Matrícula del vehículo
     */
    private String matricula;
    /**
     * Marca del vehículo
     */
    private String marca;
    /**
     * Modelo del vehículo
     */
    private String modelo;
    /**
     * Año del modelo del vehículo
     */
    private int anio;
    /**
     * Identificación del transportista
     */
    private Long id_transp;
    
    /**
     * Constructores
     */
    public Vehiculo(){
        this.anio = 0;
        this.id = Long.valueOf(0);
        this.id_transp = Long.valueOf(0);
        this.id_usuario = Long.valueOf(0);
        this.marca = "default";
        this.matricula = "default";
        this.modelo = "default";
    }
    
    public Vehiculo(int anio, Long id, Long id_transp, Long id_usuario, String marca, String matricula, String modelo){
        this.anio = anio;
        this.id = id;
        this.id_transp = id_transp;
        this.id_usuario = id_usuario;
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Long getId_transp() {
        return id_transp;
    }

    public void setId_transp(Long id_transp) {
        this.id_transp = id_transp;
    }
    
    /**
     * Métodos sobreescritos
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return new StringBuffer(" anio: ").append(anio).
                append(" id: ").append(id).
                append(" id_transp: ").append(id_transp).
                append(" id_usuario: ").append(id_usuario).
                append(" marca: ").append(marca).
                append(" matricula: ").append(matricula).
                append(" v: ").append(modelo).toString();
    }    
}
