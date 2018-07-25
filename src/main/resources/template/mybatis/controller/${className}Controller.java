<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.controller;

import ${basepackage}.po.*;
/**
 * @Description: controller层
 * @author: liubao
 * @Date: Created in new Date();
 */
@RestController
@RequestMapping("/${className}")
public class ${className}Controller {
    @Autowired
    private ${className}Service ${classNameLower}Service;
    /**
     * 新增
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insert(${className}Po ${classNameLower}){

        return ${classNameLower}Service.insert(${classNameLower});

    };
    /**
     * 修改
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int update(${className}Po ${classNameLower}){

        return ${classNameLower}Service.update(${classNameLower});

    };
    /**
     * 根据id查询
     */
    @RequestMapping(value = "/selectById", method = RequestMethod.GET)
    public ${className}Po selectById(${table.pkColumn.javaType} id){

        return ${classNameLower}Service.selectById(id);

    };
    /**
     * 条件查询
     */
    @RequestMapping(value = "/selectList", method = RequestMethod.POST)
    public List<${className}Po> selectList(${className}Po ${classNameLower}){

        return ${classNameLower}Service.selectList(${classNameLower});

    };
    /**
     * 删除
     */
    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    public int deleteById(${table.pkColumn.javaType} id){

        return ${classNameLower}Service.deleteById(id);

    };

}