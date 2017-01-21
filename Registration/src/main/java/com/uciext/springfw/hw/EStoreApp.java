package com.uciext.springfw.hw;

	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;

	import org.apache.log4j.Logger;

	import com.uciext.springfw.hw.catalog.service.CatalogService;
	import com.uciext.springfw.hw.catalog.model.Catalog;

	public class EStoreApp {
	   private static Logger logger = Logger.getLogger(EStoreApp.class.getName());
	   private String cname;
	   
	   // MIKE wire the constructor
	   public EStoreApp(){
		   logger.info("Estore App - start");
	   } 

	   public EStoreApp(String cname){
		   logger.info(cname);
		   logger.info("Estore App - start");
	   } 

	   public static void main(String[] args) throws Exception {
		   
	      logger.info("start: " );
		  
	      BeanFactory factory = new XmlBeanFactory(
	    		  new ClassPathResource("/META-INF/spring/EStoreAppContext.xml"));
	      
	      // inject catalog servies
	      CatalogService catalogService = 
	    		  (CatalogService) factory.getBean("catalogService");

	      // Make a call
	      Catalog catalog1 = catalogService.getCatalog("Java Books");

	      logger.info("Catalog: \n" + catalog1.toString());
	   }
}
