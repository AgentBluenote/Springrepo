package com.uciext.springfw.hw;

import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;

	import org.apache.log4j.Logger;

	import com.uciext.springfw.hw.catalog.service.CatalogService;
	import com.uciext.springfw.hw.catalog.model.Catalog;

public class EStoreApp {
   private static Logger logger = Logger.getLogger(EStoreApp.class.getName());
	   
   public static void main(String[] args) throws Exception {
		   
      logger.info("Start" );
	  
      // Configure dependancies
      BeanFactory factory = new XmlBeanFactory(
    		  new ClassPathResource("/META-INF/spring/EStoreAppContext.xml"));
	      
      // inject Catalog service bean
      CatalogService catalogService = 
    		  (CatalogService) factory.getBean("catalogService");

      Catalog catalog1 = catalogService.getCatalog("Java Books");

      logger.info("Catalog: \n" + catalog1.toString());
   }
}
