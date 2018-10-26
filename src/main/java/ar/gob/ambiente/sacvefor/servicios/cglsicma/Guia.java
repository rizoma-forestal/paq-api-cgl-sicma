
package ar.gob.ambiente.sacvefor.servicios.cglsicma;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entidad que encapsula los datos de las Guías para insertarlas en el CGL
 * @author rincostante
 */
@XmlRootElement
public class Guia implements Serializable {
    private Long id;
    /**
     * Identificación del usuario de registro designado para el SICMA
     */
    private Long id_usuario;
    /**
     * Código identificatorio de la Guía generado por el SICMA
     */
    private String codigo;
    /**
     * Identificador del tipo de Guía que será acordado al configurar el CGL propio
     */
    private Long id_tipo;
    /**
     * Fecha de emisión de la guía a actualizarse al momento de emitir la guía mediante la API
     */
    private Date fecha_emision;
    /**
     * Fecha de vencimiento de la guía a actualizarse al momento de emitir la guía mediante la API
     */
    private Date fecha_venc;
    /**
     * Numero de la fuente de productos que, en este caso, será una Disposición
     */
    private String num_fuente;
    /**
     * Identificador de la EntidadGuia que hace las veces de ORIGEN de los productos
     */
    private Long id_origen;
    /**
     * Identificador de la EntidadGuia que hacer las veces de DESTINO de los productos
     */
    private Long id_destino;
    /**
     * Identificador de la entidad EstadoGuia. Será 10 ("CON TRANSP. Y PROD.") para la inserción
     * y 9 ("EMITIDA") para la emisión
     */
    private Long id_estado;
    /**
     * Cantidad de horas de vigencia de la guía, a setear solo para la emisión de la guía
     */
    private int vigencia;
    /**
     * Colección que que guarda los datos del transporte de los productos
     */
    private Transporte transporte;
    
    /**
     * Constructores
     */
    
    public Guia(){
        this.codigo = "default";
        this.fecha_emision = new Date();
        this.fecha_venc = new Date();
        this.id = Long.valueOf(0);
        this.id_destino = Long.valueOf(0);
        this.id_origen = Long.valueOf(0);
        this.id_tipo = Long.valueOf(0);
        this.id_usuario = Long.valueOf(0);
        this.num_fuente = "default";
        this.id_estado = Long.valueOf(0);
        this.vigencia = 0;
        this.transporte = new Transporte();
    }
    
    public Guia(String codigo, Date fecha_emision, Date fecha_venc, Long id, Long id_destino, 
            Long id_origen, Long id_tipo, Long id_usuario, String num_fuente, Long id_estado, int vigencia, Transporte transporte){
        this.codigo = codigo;
        this.fecha_emision = fecha_emision;
        this.fecha_venc = fecha_venc;
        this.id = id;
        this.id_destino = id_destino;
        this.id_origen = id_origen;
        this.id_tipo = id_tipo;
        this.id_usuario = id_usuario;
        this.num_fuente = num_fuente;
        this.id_estado = Long.valueOf(0);
        this.vigencia = 0;        
        this.transporte = transporte;  
    }

    public Long getId_estado() {
        return id_estado;
    }

    public void setId_estado(Long id_estado) {
        this.id_estado = id_estado;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Long getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Date getFecha_venc() {
        return fecha_venc;
    }

    public void setFecha_venc(Date fecha_venc) {
        this.fecha_venc = fecha_venc;
    }

    public String getNum_fuente() {
        return num_fuente;
    }

    public void setNum_fuente(String num_fuente) {
        this.num_fuente = num_fuente;
    }

    public Long getId_origen() {
        return id_origen;
    }

    public void setId_origen(Long id_origen) {
        this.id_origen = id_origen;
    }

    public Long getId_destino() {
        return id_destino;
    }

    public void setId_destino(Long id_destino) {
        this.id_destino = id_destino;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
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
        if (!(object instanceof Guia)) {
            return false;
        }
        Guia other = (Guia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return new StringBuffer(" codigo: ").append(codigo).
                append(" fecha_emision: ").append(fecha_emision).
                append(" fecha_venc: ").append(fecha_venc).
                append(" id: ").append(id).
                append(" id_destino: ").append(id_destino).
                append(" id_origen: ").append(id_origen).
                append(" id_tipo: ").append(id_tipo).
                append(" id_usuario: ").append(id_usuario).
                append(" num_fuente: ").append(num_fuente).
                append(" id_estado: ").append(id_estado).
                append(" vigencia: ").append(vigencia).
                append(" transporte: ").append(transporte).toString();
    }  
}
