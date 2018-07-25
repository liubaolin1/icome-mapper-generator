<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.service;

import ${basepackage}.po.*;
/**
 * @Description: service层
 * @author: liubao
 * @Date: Created in 2018/7/17 8:19
 */
public interface ${className}Service{
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

