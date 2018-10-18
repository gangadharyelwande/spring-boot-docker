package mongo.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import mongo.springframework.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, String> {
}
