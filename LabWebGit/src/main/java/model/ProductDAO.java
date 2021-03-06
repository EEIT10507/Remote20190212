package model;

import java.util.List;

public interface ProductDAO {

	ProductBean findByPrimaryKey(int id);

	List<ProductBean> findAll();

	ProductBean insert(ProductBean bean);

	ProductBean update(String name, double price, java.util.Date make, int expire, int id);

	boolean delete(int id);

}