package com.goomo.DB_Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.goomo.fntity.Persion;

@Repository // used to connect to db
public class Persion_Jdbc_DAO {
	// logic to get all data present in table persion
	// select * from persion;
	@Autowired
	JdbcTemplate jdbcTemplate;
	//create our own rowmaper
	class PersionRowMaper implements RowMapper<Persion> {

		@Override
		public Persion mapRow(ResultSet rs, int rowNum) throws SQLException {
			Persion persion = new Persion();
			persion.setId(rs.getInt("id"));
			persion.setName(rs.getString("name"));
			persion.setLocation(rs.getString("location"));
			persion.setBirthdate(rs.getTimestamp("birth_date"));
			return persion;
		}

	}

	public List<Persion> findAll() {
		//return jdbcTemplate.query("select * from persion", new BeanPropertyRowMapper(Persion.class));
		return jdbcTemplate.query("select * from persion",new PersionRowMaper());
	}

	public Persion findByID(int id) {
		return jdbcTemplate.queryForObject("select * from persion where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Persion>(Persion.class));
	}

	public Persion findByName(String name) {
		return jdbcTemplate.queryForObject("select * from persion where name=?", new Object[] { name },
				new BeanPropertyRowMapper<Persion>(Persion.class));
	}

	public Persion findByLocation(String location) {
		return jdbcTemplate.queryForObject("select * from persion where location=?", new Object[] { location },
				new BeanPropertyRowMapper<Persion>(Persion.class));
	}

	public int deleteById(int id) {
		return jdbcTemplate.update("delete from persion where id=?", new Object[] { id });
	}

	public int insert(Persion persion) {
		return jdbcTemplate.update("insert into persion values(id,name,location,birthdate)" + " values(?,?,?,?)",
				new Object[] { persion.getId(), persion.getName(), persion.getLocation(),
						new Timestamp(persion.getBirthdate().getTime()) });
	}

	public int update(Persion persion) {
		return jdbcTemplate.update("update persion set name=?,location=?,birthdate=?" + "where id=?",
				new Object[] { persion.getName(), persion.getLocation(),
						new Timestamp(persion.getBirthdate().getTime()), persion.getId() });
	}

}