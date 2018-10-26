
package ar.gob.ambiente.sacvefor.servicios.cglsicma;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entidad que encapsula los datos de los Items productivos vinculados a una Guía
 * @author rincostante
 */
@XmlRootElement
public class ItemProductivo implements Serializable {
    private Long id;
    /**
     * Identificación del usuario de registro designado para el SICMA
     */
    private Long id_usuario;
    /**
     * Nombre científico del producto del que se compone el ítem
     */
    private String nom_cientif;
    /**
     * Nombre vulgar del producto del que se compone el ítem
     */
    private String nom_vulgar;
    /**
     * Clase de comercialización del producto
     */
    private String clase;
    /**
     * Unidad de medida del producto
     */
    private String unidad;
    /**
     * Identificación de la especie en el registro único de espececies (TAX)
     */
    private Long id_esp_tax;
    /**
     * Identificador del producto en el CGL
     */
    private Long id_prod;
    /**
     * Identificador de la guía a la cual pertenecen los ítems productivos
     */
    private Long id_guia;
    /**
     * Equivalencia en Kg por unidad de medida del producto
     */
    private float kg_x_unidad;
    /**
     * Total del producto
     */
    private float total;
    /**
     * Equivalencia en Kg de la totalidad del producto
     */
    private float total_kg;
    /**
     * Código del producto constituído por:
     * nombreCientifico: nombre científico de la Especie constituido por 'Género/Especie'
     * nombreVulgar: nombre vulgar de la Especie definido de manera local
     * clase: clase en la que se comercializa el Producto definido de manera local
     * unidad: unidad de medida en la que se comercializa el Producto/Clase definido de manera local
     * resolución: numero de la resolución (campo numero de la entidad Autorización)
     * provincia: nombre de la Provincia dentro de la cual se extraerá el Producto
     * EJ.:"3|Bulnesia sarmientoi|PALO SANTO|Rollo|Kg|123-DGB-2017|Chaco".
     */
    private String cod_traz;
    
    /**
     * Constructores
     */
    
    public ItemProductivo(){
        this.clase = "default";
        this.cod_traz = "default";
        this.id = Long.valueOf(0);
        this.id_esp_tax = Long.valueOf(0);
        this.id_guia = Long.valueOf(0);
        this.id_prod = Long.valueOf(0);
        this.id_usuario = Long.valueOf(0);
        this.kg_x_unidad = 0;
        this.nom_cientif = "default";
        this.nom_vulgar = "default";
        this.total = 0;
        this.total_kg = 0;
        this.unidad = "default";
    }
    
    public ItemProductivo(String clase, String cod_traz, Long id, Long id_esp_tax, Long id_guia, Long id_prod,
            Long id_usuario, float kg_x_unidad, String nom_cientif, String nom_vulgar, float total, float total_kg, String unidad){
        this.clase = clase;
        this.cod_traz = cod_traz;
        this.id = id;
        this.id_esp_tax = id_esp_tax;
        this.id_guia = id_guia;
        this.id_prod = id_prod;
        this.id_usuario = id_usuario;
        this.kg_x_unidad = kg_x_unidad;
        this.nom_cientif = nom_cientif;
        this.nom_vulgar = nom_vulgar;
        this.total = total;
        this.total_kg = total_kg;
        this.unidad = unidad;
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

    public String getNom_cientif() {
        return nom_cientif;
    }

    public void setNom_cientif(String nom_cientif) {
        this.nom_cientif = nom_cientif;
    }

    public String getNom_vulgar() {
        return nom_vulgar;
    }

    public void setNom_vulgar(String nom_vulgar) {
        this.nom_vulgar = nom_vulgar;
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

    public Long getId_esp_tax() {
        return id_esp_tax;
    }

    public void setId_esp_tax(Long id_esp_tax) {
        this.id_esp_tax = id_esp_tax;
    }

    public Long getId_prod() {
        return id_prod;
    }

    public void setId_prod(Long id_prod) {
        this.id_prod = id_prod;
    }

    public Long getId_guia() {
        return id_guia;
    }

    public void setId_guia(Long id_guia) {
        this.id_guia = id_guia;
    }

    public float getKg_x_unidad() {
        return kg_x_unidad;
    }

    public void setKg_x_unidad(float kg_x_unidad) {
        this.kg_x_unidad = kg_x_unidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTotal_kg() {
        return total_kg;
    }

    public void setTotal_kg(float total_kg) {
        this.total_kg = total_kg;
    }

    public String getCod_traz() {
        return cod_traz;
    }

    public void setCod_traz(String cod_traz) {
        this.cod_traz = cod_traz;
    }
    
    /**
     * Método sobreescritos
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
        if (!(object instanceof ItemProductivo)) {
            return false;
        }
        ItemProductivo other = (ItemProductivo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return new StringBuffer(" id: ").append(id).
                append(" clase: ").append(clase).
                append(" cod_traz: ").append(cod_traz).
                append(" id_esp_tax: ").append(id_esp_tax).
                append(" id_guia: ").append(id_guia).
                append(" id_prod: ").append(id_prod).
                append(" id_usuario: ").append(id_usuario).
                append(" kg_x_unidad: ").append(kg_x_unidad).
                append(" nom_cientif: ").append(nom_cientif).
                append(" nom_vulgar: ").append(nom_vulgar).
                append(" total: ").append(total).
                append(" total_kg: ").append(total_kg).
                append(" unidad: ").append(unidad).toString();
    }   
}
