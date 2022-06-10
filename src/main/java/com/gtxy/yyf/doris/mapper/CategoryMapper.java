package com.gtxy.yyf.doris.mapper;


import com.gtxy.yyf.doris.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JP
 * @title: CategoryMapper
 * @projectName springboot_mybatis
 * @description:
 * @date 2019/2/16 001616:48
 */

@Mapper
@Repository
public interface CategoryMapper {


    /**
     * @Author jp
     * @Description //TODO  查询所有
     * @Date 17:52 2019/2/16 0016
     * @Param
     * @return
     **/

    List<Category> findAll();


    public void save(Category category);


    public void delete(int id);


    public Category get(int id);


    public void update(Category category);

  /*  @Select("select * from category_ ")
    List<Category> findAll();

    @Insert(" insert into category_ ( name ) values (#{name}) ")
    public int save(Category category);

    @Delete(" delete from category_ where id= #{id} ")
    public void delete(int id);

    @Select("select * from category_ where id= #{id} ")
    public Category get(int id);

    @Update("update category_ set name=#{name} where id=#{id} ")
    public int update(Category category);*/


}
