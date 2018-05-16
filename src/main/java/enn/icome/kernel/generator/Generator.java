package enn.icome.kernel.generator;

import cn.org.rapid_framework.generator.GeneratorFacade;
import cn.org.rapid_framework.generator.util.FileHelper;

public class Generator {

	public static void main(String[]args)throws Exception{
        GeneratorFacade facade = new GeneratorFacade();
        //删除生成器的输出目录
        facade.deleteOutRootDir();
        facade.getGenerator().addTemplateRootDir(FileHelper.getFile("classpath:template"));
        
        facade.generateByAllTable();
    }
}
