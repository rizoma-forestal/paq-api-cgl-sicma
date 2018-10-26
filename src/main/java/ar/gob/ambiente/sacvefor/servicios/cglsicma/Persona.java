
package ar.gob.ambiente.sacvefor.servicios.cglsicma;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular las Personas provenientes del servicio de Gestion Local 
 * o a registrar en el mismo desde el SICMA
 * Titulares y Destinatarios
 * Para se utilizada en la integración con SICMA
 * @author rincostante
 */
@XmlRootElement
public class Persona implements Serializable {
    private Long id;
    /**
     * Identificación del usuario de registro designado para el SICMA
     */
    private Long id_usuario;
    /**
     * Identificación de la persona vinculada en el RUE
     */
    private Long id_rue;
    /**
     * Nombre completo de la persona si es FISICA
     */
    private String nom_persona;
    /**
     * Nomnbre de la Razón social de la persona si es JURIDICA
     */
    private String razon_social;
    /**
     * CUIT de la persona
     */
    private Long cuit;
    /**
     * Dirección de correo electrónico de la persona
     */
    private String email;
    /**
     * Identificación del rol de la persona que se quiere persistir
     */
    private Long id_rol;
    /**
     * Tipo de persona que podrá ser FISICA o JURIDICA
     */
    private String tipo_persona;
    /**
     * Identificación de la provincia de registro de la persona en el TERR
     * En este caso será el id de CHACO
     */
    private Long id_prov;
    /**
     * Nombre de la provincia de registro de la persona en el RUE
     */
    private String prov;
    /**
     * Identificador del tipo de sociedad en caso que sea una persona JURIDICA
     */
    private Long id_tipo_soc;
    
    /**
     * Constructores
     */
    public Persona() {
        this.cuit = Long.valueOf(0);
        this.email = "default";
        this.id = Long.valueOf(0);
        this.id_prov = Long.valueOf(0);
        this.id_rol = Long.valueOf(0);
        this.id_rue = Long.valueOf(0);
        this.id_tipo_soc = Long.valueOf(0);
        this.id_usuario = Long.valueOf(0);
        this.nom_persona = "default";
        this.prov = "default";
        this.razon_social = "default";
        this.tipo_persona = "default";
    }
    
    public Persona(Long cuit, String email, Long id, Long id_prov, Long id_rol, Long id_rue, Long id_tipo_soc,
            Long id_usuario, String nom_persona, String prov, String razon_social, String tipo_persona) {
        this.cuit = cuit;
        this.email = email;
        this.id = id;
        this.id_prov = id_prov;
        this.id_rol = id_rol;
        this.id_rue = id_rue;
        this.id_tipo_soc = id_tipo_soc;
        this.id_usuario = id_usuario;
        this.nom_persona = nom_persona;
        this.prov = prov;
        this.razon_social = razon_social;
        this.tipo_persona = tipo_persona;
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

    public Long getId_rue() {
        return id_rue;
    }

    public void setId_rue(Long id_rue) {
        this.id_rue = id_rue;
    }

    public String getNom_persona() {
        return nom_persona;
    }

    public void setNom_persona(String nom_persona) {
        this.nom_persona = nom_persona;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public Long getId_prov() {
        return id_prov;
    }

    public void setId_prov(Long id_prov) {
        this.id_prov = id_prov;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public Long getId_tipo_soc() {
        return id_tipo_soc;
    }

    public void setId_tipo_soc(Long id_tipo_soc) {
        this.id_tipo_soc = id_tipo_soc;
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
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuffer(" cuit: ").append(cuit).
                append(" email: ").append(email).
                append(" id: ").append(id).
                append(" id_prov: ").append(id_prov).
                append(" id_rol: ").append(id_rol).
                append(" id_rue: ").append(id_rue).
                append(" id_tipo_soc: ").append(id_tipo_soc).
                append(" id_usuario: ").append(id_usuario).
                append(" nom_persona: ").append(nom_persona).
                append(" prov: ").append(prov).
                append(" razon_social: ").append(razon_social).
                append(" tipo_persona: ").append(tipo_persona).toString();
    }    
}
