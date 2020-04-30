package nishi.cg.gla.spring.service;

import java.util.List;


import nishi.cg.gla.spring.entity.Product;
import nishi.cg.gla.spring.entity.ProductOld;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<ProductOld> reterive();
	public List<Product> reterivev1();

}
