package restful.api.datagrokr.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.BitSet;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "integer(11)")
    private Integer ProductID;
    @Column(columnDefinition = "varchar(40)")
    @NotNull(message = "Value can not be null")
    private String ProductName;
    @Column(columnDefinition = "integer(11)")
    private Integer SupplierID;
    @Column(columnDefinition = "integer(11)")
    private Integer CategoryID;
    @Column(columnDefinition = "varchar(20)")
    private String QuantityPerUnit;
    @Column(columnDefinition = "decimal(10,4)")
    private Double UnitPrice;

    public Integer getProductID() {
        return ProductID;
    }

    public void setProductID(Integer productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Integer getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(Integer supplierID) {
        SupplierID = supplierID;
    }

    public Integer getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(Integer categoryID) {
        CategoryID = categoryID;
    }

    public String getQuantityPerUnit() {
        return QuantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        QuantityPerUnit = quantityPerUnit;
    }

    public Double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        UnitPrice = unitPrice;
    }

    public Integer getUnitsInStock() {
        return UnitsInStock;
    }

    public void setUnitsInStock(Integer unitsInStock) {
        UnitsInStock = unitsInStock;
    }

    public Integer getUnitsInOrder() {
        return UnitsOnOrder;
    }

    public void setUnitsInOrder(Integer unitsInOrder) {
        UnitsOnOrder = unitsInOrder;
    }

    public Integer getRecorderLevel() {
        return RecorderLevel;
    }

    public void setRecorderLevel(Integer recorderLevel) {
        RecorderLevel = recorderLevel;
    }

    public Boolean getDiscontinued() {
        return Discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        Discontinued = discontinued;
    }

    @Column(columnDefinition = "smallint(2)")
    private Integer UnitsInStock;
    @Column(columnDefinition = "smallint(2)")
    private Integer UnitsOnOrder;
    @Column(columnDefinition = "smallint(2)")
    private Integer RecorderLevel;

    @Override
    public String toString() {
        return "Products{" +
                "ProductID=" + ProductID +
                ", ProductName='" + ProductName + '\'' +
                ", SupplierID=" + SupplierID +
                ", CategoryID=" + CategoryID +
                ", QuantityPerUnit='" + QuantityPerUnit + '\'' +
                ", UnitPrice=" + UnitPrice +
                ", UnitsInStock=" + UnitsInStock +
                ", UnitsInOrder=" + UnitsOnOrder +
                ", RecorderLevel=" + RecorderLevel +
                ", Discontinued=" + Discontinued +
                '}';
    }

    @Column(columnDefinition = "bit(1)")
    @NotNull(message = "Value can not be null")
    private Boolean Discontinued;


}
