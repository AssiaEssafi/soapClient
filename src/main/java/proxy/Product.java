package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Date;

/**
 * <p>Classe Java pour product complex type.</p>
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 *
 * <pre>{@code
 * <complexType name="product">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="datecreation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
        "code",
        "name",
        "price",
        "datecreation" // Ajout de datecreation
})
public class Product {

    protected Integer code;
    protected String name;
    protected Double price;
    protected Date datecreation; // Ajout du champ datecreation

    // Constructeur par défaut
    public Product() {
    }

    // Constructeur avec tous les paramètres
    public Product(Integer code, String name, Double price, Date datecreation) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.datecreation = datecreation;
    }

    // Getters et Setters
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer value) {
        this.code = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double value) {
        this.price = value;
    }

    public Date getDatecreation() {
        return datecreation; // Getter pour datecreation
    }

    public void setDatecreation(Date datecreation) { // Setter pour datecreation
        this.datecreation = datecreation;
    }
}
