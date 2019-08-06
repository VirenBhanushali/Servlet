package com.bbs.dao;


import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import com.bbs.beans.Booking;
import com.bbs.beans.Bus;
import com.bbs.beans.Ticket;
import com.bbs.beans.User;

public interface DaoUser {
	public Boolean createUser(User user);
	public Boolean updateUser(Integer userId,String password , String newPassword);
	public Boolean deleteUser(int userId,String password);
	public Boolean loginUser(int userId,String password);
	public User searchUser(int userId);
	public Bus searchBus(int bus_id);
	public HashMap<Integer, Bus> getAllBus();
	public List<Bus> searchBus(String source,String destination , Date date);
	public User searchUser(String userName);
	
	
	public Booking bookTicket(Ticket ticket);
	public Boolean cancelTicket(Booking booking);
	public Booking getTicket(int bookingId,int userId);
	public Integer checkAvailability(int busId,Date date);

}
