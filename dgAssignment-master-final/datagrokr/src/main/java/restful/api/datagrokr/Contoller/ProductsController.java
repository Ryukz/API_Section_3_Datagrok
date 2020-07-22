package restful.api.datagrokr.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restful.api.datagrokr.Model.Products;
import restful.api.datagrokr.Repository.ProductsRepository;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class ProductsController {
    @Autowired
    ProductsRepository productsRepository;
    @PostMapping("/addProducts")
    public Products addProducts(@Valid @RequestBody  Products products)
    {
       return productsRepository.save(products);
    }
    @GetMapping("/getProducts/{id}")
    public Optional<Products> getProducts(@Valid @PathVariable Integer id)
    {
        return  productsRepository.findById(id);
    }
    @PutMapping("/updateProducts/{id}")
    public String updateProducts(@Valid @RequestBody  Products products, @PathVariable Integer id) {
        String A = "";
        Optional<Products> products1 = productsRepository.findById(id);
        if (products1.isPresent())
        {
            Products products2 =products1.get();
            products2.setCategoryID(products.getCategoryID());
            products2.setSupplierID(products.getSupplierID());
            products2.setQuantityPerUnit(products.getQuantityPerUnit());
            products2.setUnitPrice(products.getUnitPrice());
            products2.setUnitsInStock(products.getUnitsInStock());
            products2.setUnitsInOrder(products.getUnitsInOrder());
            products2.setRecorderLevel(products.getRecorderLevel());
            products2.setDiscontinued(products.getDiscontinued());
            products2.setProductName(products.getProductName());
            productsRepository.save(products2);
            A="Updated!!!";
        }
        else
            A="Not Present!!";

        return A;
    }

}
