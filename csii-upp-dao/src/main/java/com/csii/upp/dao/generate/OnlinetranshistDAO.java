package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Onlinetranshist;
import com.csii.upp.dto.generate.OnlinetranshistExample;

public class OnlinetranshistDAO extends BasePayDAO {
	  /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANSHIST
     *
     * @mbggenerated
     */
    public static int countByExample(OnlinetranshistExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("ONLINETRANSHIST.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANSHIST
     *
     * @mbggenerated
     */
    public static int deleteByExample(OnlinetranshistExample example) throws SQLException {
        int rows = getSqlMap().delete("ONLINETRANSHIST.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANSHIST
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String transseqnbr) throws SQLException {
        Onlinetranshist _key = new Onlinetranshist();
        _key.setTransseqnbr(transseqnbr);
        int rows = getSqlMap().delete("ONLINETRANSHIST.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANSHIST
     *
     * @mbggenerated
     */
    public static void insert(Onlinetranshist record) throws SQLException {
        getSqlMap().insert("ONLINETRANSHIST.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANSHIST
     *
     * @mbggenerated
     */
    public static void insertSelective(Onlinetranshist record) throws SQLException {
        getSqlMap().insert("ONLINETRANSHIST.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANSHIST
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Onlinetranshist> selectByExample(OnlinetranshistExample example) throws SQLException {
        List<Onlinetranshist> list = getSqlMap().queryForList("ONLINETRANSHIST.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANSHIST
     *
     * @mbggenerated
     */
    public static Onlinetranshist selectByPrimaryKey(String transseqnbr) throws SQLException {
        Onlinetranshist _key = new Onlinetranshist();
        _key.setTransseqnbr(transseqnbr);
        Onlinetranshist record = (Onlinetranshist) getSqlMap().queryForObject("ONLINETRANSHIST.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANSHIST
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Onlinetranshist record, OnlinetranshistExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("ONLINETRANSHIST.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANSHIST
     *
     * @mbggenerated
     */
    public static int updateByExample(Onlinetranshist record, OnlinetranshistExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("ONLINETRANSHIST.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANSHIST
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Onlinetranshist record) throws SQLException {
        int rows = getSqlMap().update("ONLINETRANSHIST.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANSHIST
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Onlinetranshist record) throws SQLException {
        int rows = getSqlMap().update("ONLINETRANSHIST.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINETRANSHIST
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends OnlinetranshistExample {
        private Object record;

        public UpdateByExampleParms(Object record, OnlinetranshistExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}