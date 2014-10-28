package org.elasticsearch.plugin.example;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.rest.BaseRestHandler;
import org.elasticsearch.rest.RestChannel;
import org.elasticsearch.rest.RestController;
import org.elasticsearch.rest.RestRequest;
import org.elasticsearch.rest.RestStatus;
import org.elasticsearch.rest.StringRestResponse;
import org.elasticsearch.rest.RestRequest.Method;

public class SearchRankingRestHandler extends BaseRestHandler {

	protected SearchRankingRestHandler(Settings settings, Client cl,RestController controller) {
		super(settings, cl);
		SearchRequest rq = new SearchRequest() ;
		rq.beforeStart();
	    rq.searchType(SearchType.QUERY_AND_FETCH);
		cl.search(rq);
	    controller.registerHandler(Method.GET,"/_hello", this);
		// TODO Auto-generated constructor stub
	}

	public void handleRequest(RestRequest request, RestChannel channel) {
		// TODO Auto-generated method stub
	   String param = request.param("action");
	   channel.sendResponse(new StringRestResponse(RestStatus.OK, "Jaffaaa, " + param + "!"));
	 }

}
