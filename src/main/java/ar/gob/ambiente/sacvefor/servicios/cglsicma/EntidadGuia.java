
package ar.gob.ambiente.sacvefor.servicios.cglsicma;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entidad que encapsula los datos del EntidadGuia. Servirá tanto para orígenes como destino de las Guías
 * Para se utilizada en la integración con SICMA
 * @author rincostante
 */
@XmlRootElement
public class EntidadGuia implements Serializable {
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
     * Tipo de EntidadGuía, será ORIGEN o DESTINO
     */
    private String tipo_ent;
    /**
     * Nombre completo de la persona que podrá ser el titular o el destinatario
     * según sea de tipo ORIGEN o DESTINO
     */
    private String nom_persona;
    /**
     * Tipo de persona que podrá ser FISICA o JURIDICA
     */
    private String tipo_persona;
    /**
     * CUIT de la persona que podrá ser el titular o el destinatario
     */
    private Long cuit;
    /**
     * Dirección de correo electrónico de la persona que podrá ser el titular o el destinatario
     */
    private String email;
    /**
     * Identificación de la localidad en el registro territorial
     */
    private Long id_loc;
    /**
     * Nombre de la localidad que, según sea ORIGEN o DESTINO
     * será del predio o del domicilio del destinatario, respectivamente.
     */
    private String loc;
    /**
     * Nombre del departamento que, según sea ORIGEN o DESTINO
     * será del predio o del domicilio del destinatario, respectivamente.
     */
    private String depto;
    /**
     * Nombre de la provincia que, según sea ORIGEN o DESTINO
     * será del predio o del domicilio del destinatario, respectivamente.
     */
    private String prov;
    /**
     * Identificación catastral del predio en el caso que sea un ORIGEN
     */
    private String id_catastral;
    /**
     * Nombre del predio en el caso que sea un ORIGEN
     */
    private String nom_predio;
    /**
     * Número de la Autorización de la cual toma los productos, si es ORIGEN
     */
    private String num_aut;
    /**
     * Calle del domicilio del destinatario en el caso de ser ORIGEN
     */
    private String dom_calle;
    /**
     * Número de puerta del domicilio del destinatario en el caso de ser DESTINO
     */
    private String dom_numero;

    /**
     * Constructores
     */
    public EntidadGuia(){
        this.cuit = Long.valueOf(0);
        this.depto = "default";
        this.dom_calle = "default";
        this.dom_numero = "default";
        this.email = "default";
        this.id = Long.valueOf(0);
        this.id_catastral = "default";
        this.id_loc = Long.valueOf(0);
        this.id_rue = Long.valueOf(0);
        this.id_usuario = Long.valueOf(0);
        this.loc = "default";
        this.nom_persona = "default";
        this.nom_predio = "default";
        this.num_aut = "default";
        this.prov = "default";
        this.tipo_ent = "default";
        this.tipo_persona = "default";
    }
    
    public EntidadGuia(Long cuit, String depto, String dom_calle, String dom_numero, String email, Long id, String id_catastral, Long id_loc,
            Long id_rue, Long id_usuario, String loc, String nom_persona, String nom_predio, String num_aut, String prov, String tipo_ent, String tipo_persona){
        this.cuit = cuit;
        this.depto = depto;
        this.dom_calle = dom_calle;
        this.dom_numero = dom_numero;
        this.email = email;
        this.id = id;
        this.id_catastral = id_catastral;
        this.id_loc = id_loc;
        this.id_rue = id_rue;
        this.id_usuario = id_usuario;
        this.loc = loc;
        this.nom_persona = nom_persona;
        this.nom_predio = nom_predio;
        this.num_aut = num_aut;
        this.prov = prov;
        this.tipo_ent = tipo_ent;
        this.tipo_persona = tipo_persona;
    }
    
    /**
     * Métodos de acceso
     */    
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

    public String getTipo_ent() {
        return tipo_ent;
    }

    public void setTipo_ent(String tipo_ent) {
        this.tipo_ent = tipo_ent;
    }

    public String getNom_persona() {
        return nom_persona;
    }

    public void setNom_persona(String nom_persona) {
        this.nom_persona = nom_persona;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
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

    public Long getId_loc() {
        return id_loc;
    }

    public void setId_loc(Long id_loc) {
        this.id_loc = id_loc;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getId_catastral() {
        return id_catastral;
    }

    public void setId_catastral(String id_catastral) {
        this.id_catastral = id_catastral;
    }

    public String getNom_predio() {
        return nom_predio;
    }

    public void setNom_predio(String nom_predio) {
        this.nom_predio = nom_predio;
    }

    public String getNum_aut() {
        return num_aut;
    }

    public void setNum_aut(String num_aut) {
        this.num_aut = num_aut;
    }

    public String getDom_calle() {
        return dom_calle;
    }

    public void setDom_calle(String dom_calle) {
        this.dom_calle = dom_calle;
    }

    public String getDom_numero() {
        return dom_numero;
    }

    public void setDom_numero(String dom_numero) {
        this.dom_numero = dom_numero;
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
        if (!(object instanceof EntidadGuia)) {
            return false;
        }
        EntidadGuia other = (EntidadGuia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuffer(" cuit: ").append(id).
                append(" depto: ").append(depto).
                append(" dom_calle: ").append(dom_calle).
                append(" dom_numero: ").append(dom_numero).
                append(" email: ").append(email).
                append(" id: ").append(id).
                append(" id_catastral: ").append(id_catastral).
                append(" id_loc: ").append(id_loc).
                append(" id_rue: ").append(id_rue).
                append(" id_usuario: ").append(id_usuario).
                append(" loc: ").append(loc).
                append(" nom_persona: ").append(nom_persona).
                append(" nom_predio: ").append(nom_predio).
                append(" num_aut: ").append(num_aut).
                append(" prov: ").append(prov).
                append(" tipo_ent: ").append(tipo_ent).
                append(" tipo_persona: ").append(tipo_persona).toString();
    }        
}
