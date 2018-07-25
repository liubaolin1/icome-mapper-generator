<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.service.impl;

import ${basepackage}.po.*;
/**
 * @Description: service实现层
 * @author: liubao
 * @Date: Created in 2018/7/17 8:19
 */
@Service
public class ${className}ServiceImpl implements ${className}Service{
    @Autowired
    private ${className}Mapper ${classNameLower}Mapper;
    /**
     * 新增
     */
    @Override
    public int insert(${className}Po ${classNameLower}){
        return ${classNameLower}Mapper.insert(${classNameLower});
    };
    /**
     * 修改
     */
    @Override
    public int update(${className}Po ${classNameLower}){
        return ${classNameLower}Mapper.update(${classNameLower});
    };
    /**
     * 根据id查询
     */
    @Override
    public ${className}Po selectById(${table.pkColumn.javaType} id){
        return ${classNameLower}Mapper.selectById(id);
    };
    /**
     * 条件查询
     */
    @Override
    public List<${className}Po> selectList(${className}Po ${classNameLower}){
        return ${classNameLower}Mapper.searchList(${classNameLower});
    };
    /**
     * 删除
     */
    @Override
    public int deleteById(${table.pkColumn.javaType} id){
        return ${classNameLower}Mapper.deleteById(id);
    };

}