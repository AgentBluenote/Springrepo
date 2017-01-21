package com.uciext.springfw.hw.catalog.service.impl;

import org.apache.log4j.Logger;

import com.uciext.springfw.hw.catalog.service.CatalogService;
import com.uciext.springfw.hw.catalog.model.Catalog;

	public class CatalogServiceImpl implements CatalogService {

	    private static Logger logger = Logger.getLogger(CatalogServiceImpl.class.getName());

	    private Catalog catalog1;
//	    private Catalog course2;
	    
		public CatalogServiceImpl() {
		    logger.info("In CatalogServiceImpl()");
		}
		
		public Catalog getCatalog(String catalogId) {
			if ("Java Books".equals(catalogId)) {
				return catalog1;
			}
//			else if ("X106".equals(courseId)) {
//				return course2;
//			}
			return null;
		}
		
		// Property Setters (for wiring)
		public void setCatalog1(Catalog value) {
			catalog1 = value;
		}
/*
		public void setCatalog2(Catalog value) {
			course2 = value;
		}
		*/
	}
