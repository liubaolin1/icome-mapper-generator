<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.dao;

import ${basepackage}.po.*;
/**
 * @Description: dao层
 * @author: liubao
 * @Date: Created in 2018/7/17 8:19
 */
@Mapper
public interface ${className}Mapper{
    /**
     * 新增
     */
    int insert(${className}Po ${classNameLower});
    /**
     * 修改
     */
    int update(${className}Po ${classNameLower});
    /**
     * 根据id查询
     */
    ${className}Po selectById(${table.pkColumn.javaType} id);
    /**
     * 条件查询
     */
    List<${className}Po> selectList(${className}Po ${classNameLower});
    /**
     * 删除
     */
    int deleteById(${table.pkColumn.javaType} id);

}

