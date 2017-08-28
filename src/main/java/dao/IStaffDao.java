package dao;

import java.util.List;

import dmo.Staff;

/**
 * 
 * @author 17051548
 *
 */
public interface IStaffDao {
	public List<String> findAllName();

    public String findIdByName(String staffId);

    public List<Staff> findAll();

    void add(Staff staff);
}
