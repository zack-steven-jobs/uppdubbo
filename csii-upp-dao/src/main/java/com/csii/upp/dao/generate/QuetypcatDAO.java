package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Quetypcat;
import com.csii.upp.dto.generate.QuetypcatExample;

public class QuetypcatDAO extends BasePayDAO {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUETYPCAT
	 * @mbggenerated
	 */
	public static int countByExample(QuetypcatExample example) throws SQLException {
		Integer count = (Integer) getSqlMap().queryForObject(
				"QUETYPCAT.countByExample", example);
		return count;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUETYPCAT
	 * @mbggenerated
	 */
	public static int deleteByExample(QuetypcatExample example) throws SQLException {
		int rows = getSqlMap().delete("QUETYPCAT.deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUETYPCAT
	 * @mbggenerated
	 */
	public static int deleteByPrimaryKey(String quetypcatcd) throws SQLException {
		Quetypcat _key = new Quetypcat();
		_key.setQuetypcatcd(quetypcatcd);
		int rows = getSqlMap().delete("QUETYPCAT.deleteByPrimaryKey", _key);
		return rows;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUETYPCAT
	 * @mbggenerated
	 */
	public static void insert(Quetypcat record) throws SQLException {
		getSqlMap().insert("QUETYPCAT.insert", record);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUETYPCAT
	 * @mbggenerated
	 */
	public static void insertSelective(Quetypcat record) throws SQLException {
		getSqlMap().insert("QUETYPCAT.insertSelective", record);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUETYPCAT
	 * @mbggenerated
	 */
	@SuppressWarnings("unchecked")
	public static List<Quetypcat> selectByExample(QuetypcatExample example)
			throws SQLException {
		List<Quetypcat> list = getSqlMap().queryForList(
				"QUETYPCAT.selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUETYPCAT
	 * @mbggenerated
	 */
	public static Quetypcat selectByPrimaryKey(String quetypcatcd) throws SQLException {
		Quetypcat _key = new Quetypcat();
		_key.setQuetypcatcd(quetypcatcd);
		Quetypcat record = (Quetypcat) getSqlMap().queryForObject(
				"QUETYPCAT.selectByPrimaryKey", _key);
		return record;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUETYPCAT
	 * @mbggenerated
	 */
	public static int updateByExampleSelective(Quetypcat record,
			QuetypcatExample example) throws SQLException {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMap().update("QUETYPCAT.updateByExampleSelective",
				parms);
		return rows;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUETYPCAT
	 * @mbggenerated
	 */
	public static int updateByExample(Quetypcat record, QuetypcatExample example)
			throws SQLException {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMap().update("QUETYPCAT.updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUETYPCAT
	 * @mbggenerated
	 */
	public static int updateByPrimaryKeySelective(Quetypcat record)
			throws SQLException {
		int rows = getSqlMap().update("QUETYPCAT.updateByPrimaryKeySelective",
				record);
		return rows;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table QUETYPCAT
	 * @mbggenerated
	 */
	public static int updateByPrimaryKey(Quetypcat record) throws SQLException {
		int rows = getSqlMap().update("QUETYPCAT.updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table QUETYPCAT
	 * @mbggenerated
	 */
	protected static class UpdateByExampleParms extends QuetypcatExample {
		private Object record;

		public UpdateByExampleParms(Object record, QuetypcatExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}