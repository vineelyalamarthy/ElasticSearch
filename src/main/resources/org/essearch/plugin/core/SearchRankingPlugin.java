package org.essearch.plugin.core;

import org.elasticsearch.plugins.AbstractPlugin;


public class SearchRankingPlugin extends AbstractPlugin {
	
	 @Override public String name() {
	        return "searchrankingplugin";
	    }

	    @Override public String description() {
	        return "This can improve the results of search results ranking";
	    }

}

