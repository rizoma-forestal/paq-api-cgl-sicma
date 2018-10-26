
package ar.gob.ambiente.sacvefor.servicios.cglsicma;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entidad que encapsula los datos de un Producto forestal.
 * Empleado solo para devolver con GET
 * @author rincostante
 */
@XmlRootElement
public class Producto {
    private Long id;
    /**
     * Nombre vulgar de la especie del producto en la Provincia
     */
    private String nom_vulgar;
    /**
     * Nombre científico de la especie del producto en TAX
     */
    private String nom_cientifico;
    /**
     * Nombre de la clase de comercialización
     */
    private String clase;
    /**
     * Nombre de la unidad de medida del producto
     */
    private String unidad;
    /**
     * Identificador de la especie en el registro de Taxonomías
     */
    private Long id_esp_tax;
    /**
     * Equivalencia en kg por unidad del producto
     */
    private float kg_x_unidad;

    /**
     * Constructores
     */    
    public Producto(){
        this.clase = "default";
        this.id = Long.valueOf(0);
        this.nom_cientifico = "default";
        this.nom_vulgar = "default";
        this.unidad = "default";
        this.id_esp_tax = Long.valueOf(0);
        this.kg_x_unidad = 0;
    }
    
    public Producto(String clase, Long id, String nom_cientifico, String nom_vulgar, String unidad, Long id_esp_tax, float kg_x_unidad){
        this.clase = clase;
        this.id = id;
        this.nom_cientifico = nom_cientifico;
        this.nom_vulgar = nom_vulgar;
        this.unidad = unidad; 
        this.id_esp_tax = id_esp_tax;
        this.kg_x_unidad = kg_x_unidad;
    }

    public float getKg_x_unidad() {
        return kg_x_unidad;
    }

    public void setKg_x_unidad(float kg_x_unidad) {
        this.kg_x_unidad = kg_x_unidad;
    }

    public Long getId_esp_tax() {
        return id_esp_tax;
    }

    public void setId_esp_tax(Long id_esp_tax) {
        this.id_esp_tax = id_esp_tax;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_vulgar() {
        return nom_vulgar;
    }

    public void setNom_vulgar(String nom_vulgar) {
        this.nom_vulgar = nom_vulgar;
    }

    public String getNom_cientifico() {
        return nom_cientifico;
    }

    public void setNom_cientifico(String nom_cientifico) {
        this.nom_cientifico = nom_cientifico;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
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
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }  
    
    @Override
    public String toString() {
        return new StringBuffer(" clase: ").append(clase).
                append(" id: ").append(id).
                append(" nom_cientifico: ").append(nom_cientifico).
                append(" nom_vulgar: ").append(nom_vulgar).
                append(" unidad: ").append(unidad).
                append(" id_esp_tax: ").append(id_esp_tax).
                append(" kg_x_unidad: ").append(kg_x_unidad).toString();
    }       
}
