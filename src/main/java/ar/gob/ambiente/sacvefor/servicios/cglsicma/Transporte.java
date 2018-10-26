
package ar.gob.ambiente.sacvefor.servicios.cglsicma;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entidad que encapsula los datos del Transporte de una Guía.
 * @author rincostante
 */
@XmlRootElement
public class Transporte implements Serializable {
    private Long id;
    /**
     * Identificación del usuario de registro designado para el SICMA
     */
    private Long id_usuario;
    /**
     * Matrícula del acoplado si correspondiera
     */
    private String acoplado;
    /**
     * Nombre completo del conductor del vehículo
     */
    private String cond_nombre;
    /**
     * DNI del conductor del vahículo
     */
    private Long cond_dni;
    /**
     * Identificador único del vehículo en el RUE
     */
    private Long id_veh;
    
    /**
     * Constructores
     */
    public Transporte(){
        this.acoplado = "default";
        this.cond_dni = Long.valueOf(0);
        this.cond_nombre = "default";
        this.id = Long.valueOf(0);
        this.id_usuario = Long.valueOf(0);
        this.id_veh = Long.valueOf(0);
    }
    
    public Transporte(String acoplado, Long cond_dni, String cond_nombre, Long id, Long id_usuario, Long id_veh){
        this.acoplado = acoplado;
        this.cond_dni = cond_dni;
        this.cond_nombre = cond_nombre;
        this.id = id;
        this.id_usuario = id_usuario;
        this.id_veh = id_veh;
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

    public String getAcoplado() {
        return acoplado;
    }

    public void setAcoplado(String acoplado) {
        this.acoplado = acoplado;
    }

    public String getCond_nombre() {
        return cond_nombre;
    }

    public void setCond_nombre(String cond_nombre) {
        this.cond_nombre = cond_nombre;
    }

    public Long getCond_dni() {
        return cond_dni;
    }

    public void setCond_dni(Long cond_dni) {
        this.cond_dni = cond_dni;
    }

    public Long getId_veh() {
        return id_veh;
    }

    public void setId_veh(Long id_veh) {
        this.id_veh = id_veh;
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
        if (!(object instanceof Transporte)) {
            return false;
        }
        Transporte other = (Transporte) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return new StringBuffer(" acoplado: ").append(acoplado).
                append(" cond_dni: ").append(cond_dni).
                append(" cond_nombre: ").append(cond_nombre).
                append(" id: ").append(id).
                append(" id_usuario: ").append(id_usuario).
                append(" id_veh: ").append(id_veh).toString();
    }   
}
