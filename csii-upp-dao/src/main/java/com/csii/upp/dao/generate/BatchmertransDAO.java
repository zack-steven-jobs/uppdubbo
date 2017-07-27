package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Batchmertrans;
import com.csii.upp.dto.generate.BatchmertransExample;

public class BatchmertransDAO extends BasePayDAO {
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANS
     *
     * @mbggenerated
     */
    public static int countByExample(BatchmertransExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("BATCHMERTRANS.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANS
     *
     * @mbggenerated
     */
    public static int deleteByExample(BatchmertransExample example) throws SQLException {
        int rows = getSqlMap().delete("BATCHMERTRANS.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANS
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String cleartransnbr) throws SQLException {
        Batchmertrans _key = new Batchmertrans();
        _key.setCleartransnbr(cleartransnbr);
        int rows = getSqlMap().delete("BATCHMERTRANS.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANS
     *
     * @mbggenerated
     */
    public static void insert(Batchmertrans record) throws SQLException {
        getSqlMap().insert("BATCHMERTRANS.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANS
     *
     * @mbggenerated
     */
    public static void insertSelective(Batchmertrans record) throws SQLException {
        getSqlMap().insert("BATCHMERTRANS.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANS
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Batchmertrans> selectByExample(BatchmertransExample example) throws SQLException {
        List<Batchmertrans> list = getSqlMap().queryForList("BATCHMERTRANS.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANS
     *
     * @mbggenerated
     */
    public static Batchmertrans selectByPrimaryKey(String cleartransnbr) throws SQLException {
        Batchmertrans _key = new Batchmertrans();
        _key.setCleartransnbr(cleartransnbr);
        Batchmertrans record = (Batchmertrans) getSqlMap().queryForObject("BATCHMERTRANS.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANS
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Batchmertrans record, BatchmertransExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("BATCHMERTRANS.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANS
     *
     * @mbggenerated
     */
    public static int updateByExample(Batchmertrans record, BatchmertransExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("BATCHMERTRANS.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANS
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Batchmertrans record) throws SQLException {
        int rows = getSqlMap().update("BATCHMERTRANS.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANS
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Batchmertrans record) throws SQLException {
        int rows = getSqlMap().update("BATCHMERTRANS.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BATCHMERTRANS
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends BatchmertransExample {
        private Object record;

        public UpdateByExampleParms(Object record, BatchmertransExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}