package com.uciext.springfw.hw.catalog.service.impl;

import com.uciext.springfw.hw.catalog.service.LoggingService;
import org.apache.log4j.Logger;


	public class LoggerServiceImpl implements LoggingService {
		

		public Logger getLogger(String classname){
			Logger theLogger = Logger.getLogger(this.getClass().getName());
			return theLogger; 
		}

		/*
	    private static Logger logger = Logger.getLogger(
	    		CatalogServiceImpl.class.getName());

	    private Catalog catalog1;
	    
		public CatalogServiceImpl() {
		    logger.info("In CatalogServiceImpl()");
		}
		
		public Catalog getCatalog(String catalogId) {
			if ("Java Books".equals(catalogId)) {
				return catalog1;
			}
			return null;
		}
		
		// Property Setters (for wiring)
		public void setCatalog1(Catalog value) {
			catalog1 = value;
		}

*/

}
