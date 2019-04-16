package com.formafast.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.formafast.beans.CompM;

public class CompMDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(CompM p) {
		String sql ="insert into Comp92(name,email,password,gender,company,country,contact) values('"+p.getName()+"','"+p.getEmail()+"','"+p.getPassword()+"','"+p.getGender()+"','"+p.getCompany()+"','"+p.getCountry()+"',"+p.getContact()+")";
		return template.update(sql);
	}

	public int update(CompM p) {
		String sql ="update Comp92 set name='"+p.getName()+"', email='"+p.getEmail()+"',password='"+p.getPassword()+"', gender='"+p.getGender()+"',company='"+p.getCompany()+"',country='"+p.getCountry()+"', contact="+p.getContact()+" where id="+p.getId()+"";
		return template.update(sql);
	}

	public int delete(int id) {
		String sql = "delete from Comp92 where id=" + id + "";
		return template.update(sql);
	}

	public CompM getCompMById(int id) {
		String sql = "select * from Comp92 where id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<CompM>(CompM.class));
	}

	public List<CompM> getCompanyMailer() {
		return template.query("select * from Comp92", new RowMapper<CompM>() {
			public CompM mapRow(ResultSet rs, int row) throws SQLException {
				CompM e = new CompM();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setPassword(rs.getString(4));
				e.setGender(rs.getString(5));
				e.setCompany(rs.getString(6));
				e.setCountry(rs.getString(7));
				e.setContact(rs.getInt(8));
				return e;
			}
		});
	}
}