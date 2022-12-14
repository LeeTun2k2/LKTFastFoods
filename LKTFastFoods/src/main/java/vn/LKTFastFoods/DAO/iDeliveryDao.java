package vn.LKTFastFoods.DAO;

import java.util.List;

import vn.LKTFastFoods.Model.Delivery;

public interface iDeliveryDao {
	List<Delivery> getAll(int index, int pagesize);

	Delivery getOne(int id);

	void insert(Delivery delivery);

	void update(Delivery delivery);

	void delete(int id);
}
