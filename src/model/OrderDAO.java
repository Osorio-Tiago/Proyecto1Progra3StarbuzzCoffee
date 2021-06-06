package model;

public interface OrderDAO {

	 public boolean create(Order order, Request request);
	 public boolean update(Order order);
	 public boolean read(Order order);
}

