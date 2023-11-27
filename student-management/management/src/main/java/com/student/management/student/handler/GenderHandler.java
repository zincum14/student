package com.student.management.student.handler;

import com.student.management.student.GenderEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(value = GenderEnum.class)
public class GenderHandler implements TypeHandler<GenderEnum> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, GenderEnum gender, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, gender.code());
    }

    @Override
    public GenderEnum getResult(ResultSet resultSet, String s) throws SQLException {
        return GenderEnum.descOf(resultSet.getString(s));
    }

    @Override
    public GenderEnum getResult(ResultSet resultSet, int i) throws SQLException {
        return GenderEnum.codeOf(resultSet.getInt(i));
    }

    @Override
    public GenderEnum getResult(CallableStatement callableStatement, int i) throws SQLException {
        return GenderEnum.codeOf(callableStatement.getInt(i));
    }
}
