package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Batchmertranshist;
import com.csii.upp.dto.generate.BatchmertranshistExample;

public class BatchmertranshistDAO extends BasePayDAO {
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANSHIST
     *
     * @mbggenerated
     */
    public static int countByExample(BatchmertranshistExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("BATCHMERTRANSHIST.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANSHIST
     *
     * @mbggenerated
     */
    public static int deleteByExample(BatchmertranshistExample example) throws SQLException {
        int rows = getSqlMap().delete("BATCHMERTRANSHIST.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANSHIST
     *
     * @mbggenerated
     */
    public static int deleteByPrimaryKey(String cleartransnbr) throws SQLException {
        Batchmertranshist _key = new Batchmertranshist();
        _key.setCleartransnbr(cleartransnbr);
        int rows = getSqlMap().delete("BATCHMERTRANSHIST.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANSHIST
     *
     * @mbggenerated
     */
    public static void insert(Batchmertranshist record) throws SQLException {
        getSqlMap().insert("BATCHMERTRANSHIST.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANSHIST
     *
     * @mbggenerated
     */
    public static void insertSelective(Batchmertranshist record) throws SQLException {
        getSqlMap().insert("BATCHMERTRANSHIST.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANSHIST
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static List<Batchmertranshist> selectByExample(BatchmertranshistExample example) throws SQLException {
        List<Batchmertranshist> list = getSqlMap().queryForList("BATCHMERTRANSHIST.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANSHIST
     *
     * @mbggenerated
     */
    public static Batchmertranshist selectByPrimaryKey(String cleartransnbr) throws SQLException {
        Batchmertranshist _key = new Batchmertranshist();
        _key.setCleartransnbr(cleartransnbr);
        Batchmertranshist record = (Batchmertranshist) getSqlMap().queryForObject("BATCHMERTRANSHIST.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANSHIST
     *
     * @mbggenerated
     */
    public static int updateByExampleSelective(Batchmertranshist record, BatchmertranshistExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("BATCHMERTRANSHIST.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANSHIST
     *
     * @mbggenerated
     */
    public static int updateByExample(Batchmertranshist record, BatchmertranshistExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("BATCHMERTRANSHIST.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANSHIST
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKeySelective(Batchmertranshist record) throws SQLException {
        int rows = getSqlMap().update("BATCHMERTRANSHIST.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BATCHMERTRANSHIST
     *
     * @mbggenerated
     */
    public static int updateByPrimaryKey(Batchmertranshist record) throws SQLException {
        int rows = getSqlMap().update("BATCHMERTRANSHIST.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BATCHMERTRANSHIST
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends BatchmertranshistExample {
        private Object record;

        public UpdateByExampleParms(Object record, BatchmertranshistExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}