package restful.api.datagrokr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restful.api.datagrokr.Model.Products;

public interface ProductsRepository extends JpaRepository<Products,Integer> {
}
