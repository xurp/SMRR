package com.huanghe.springboot.mapper;

import com.huanghe.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Author: River
 * @Date:Created in  11:56 2018/10/24
 * @Description:
 */

/**
 * @Mapper :指定这个是操作数据库的mapper
 */
// [注]:最好都加一下这个注解
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    // [注]:使用注解式myBatis时设定参数
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}
