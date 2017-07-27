package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Callbacktransreg;
import com.csii.upp.dto.generate.CallbacktransregExample;

public class CallbacktransregDAO extends BasePayDAO {
	 /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLBACKTRANSREG
     *
     * @mbggenerated
     */
    public static int countByExample(CallbacktransregExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("CALLBACKTRANSREG.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLBACKTRANSREG
     *
     * @mbggenerated
     */
    public static int deleteByExample(CallbacktransregExample example) throws SQLException {
        int rows = getSqlMap().delete("CALLBACKTRANSREG.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLBACKTRANSREG
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String callbacktransnbr) throws SQLException {
        Callbacktransreg _key = new Callbacktransreg();
        _key.setCallbacktransnbr(callbacktransnbr);
        int rows = getSqlMap().delete("CALLBACKTRANSREG.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLBACKTRANSREG
     *
     * @mbggenerated
     */
    public static void insert(Callbacktransreg record) throws SQLException {
        getSqlMap().insert("CALLBACKTRANSREG.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLBACKTRANSREG
     *
     * @mbggenerated
     */
    public static void insertSelective(Callbacktransreg record) throws SQLException {
        getSqlMap().insert("CALLBACKTRANSREG.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLBACKTRANSREG
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Callbacktransreg> selectByExample(CallbacktransregExample example) throws SQLException {
        List<Callbacktransreg> list = getSqlMap().queryForList("CALLBACKTRANSREG.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLBACKTRANSREG
     *
     * @mbggenerated
     */
    public static Callbacktransreg selectByPrimaryKey(String callbacktransnbr) throws SQLException {
        Callbacktransreg _key = new Callbacktransreg();
        _key.setCallbacktransnbr(callbacktransnbr);
        Callbacktransreg record = (Callbacktransreg) getSqlMap().queryForObject("CALLBACKTRANSREG.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLBACKTRANSREG
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Callbacktransreg record, CallbacktransregExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("CALLBACKTRANSREG.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLBACKTRANSREG
     *
     * @mbggenerated
     */
    public static int updateByExample(Callbacktransreg record, CallbacktransregExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("CALLBACKTRANSREG.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLBACKTRANSREG
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Callbacktransreg record) throws SQLException {
        int rows = getSqlMap().update("CALLBACKTRANSREG.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLBACKTRANSREG
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Callbacktransreg record) throws SQLException {
        int rows = getSqlMap().update("CALLBACKTRANSREG.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CALLBACKTRANSREG
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends CallbacktransregExample {
        private Object record;

        public UpdateByExampleParms(Object record, CallbacktransregExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}