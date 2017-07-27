package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Onlinetrans;
import com.csii.upp.dto.generate.OnlinetransExample;

public class OnlinetransDAO extends BasePayDAO {
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANS
     *
     * @mbggenerated
     */
    public static int countByExample(OnlinetransExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("ONLINETRANS.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANS
     *
     * @mbggenerated
     */
    public static int deleteByExample(OnlinetransExample example) throws SQLException {
        int rows = getSqlMap().delete("ONLINETRANS.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANS
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String transseqnbr) throws SQLException {
        Onlinetrans _key = new Onlinetrans();
        _key.setTransseqnbr(transseqnbr);
        int rows = getSqlMap().delete("ONLINETRANS.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANS
     *
     * @mbggenerated
     */
    public static void insert(Onlinetrans record) throws SQLException {
        getSqlMap().insert("ONLINETRANS.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANS
     *
     * @mbggenerated
     */
    public static void insertSelective(Onlinetrans record) throws SQLException {
        getSqlMap().insert("ONLINETRANS.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANS
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Onlinetrans> selectByExample(OnlinetransExample example) throws SQLException {
        List<Onlinetrans> list = getSqlMap().queryForList("ONLINETRANS.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANS
     *
     * @mbggenerated
     */
    public static Onlinetrans selectByPrimaryKey(String transseqnbr) throws SQLException {
        Onlinetrans _key = new Onlinetrans();
        _key.setTransseqnbr(transseqnbr);
        Onlinetrans record = (Onlinetrans) getSqlMap().queryForObject("ONLINETRANS.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANS
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Onlinetrans record, OnlinetransExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("ONLINETRANS.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANS
     *
     * @mbggenerated
     */
    public static int updateByExample(Onlinetrans record, OnlinetransExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("ONLINETRANS.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANS
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Onlinetrans record) throws SQLException {
        int rows = getSqlMap().update("ONLINETRANS.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINETRANS
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Onlinetrans record) throws SQLException {
        int rows = getSqlMap().update("ONLINETRANS.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINETRANS
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends OnlinetransExample {
        private Object record;

        public UpdateByExampleParms(Object record, OnlinetransExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}