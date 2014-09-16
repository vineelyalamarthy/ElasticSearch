ElasticSearch
=============

This can be used to re-rank the search results in Elastic Search


1 .How to use this plugin ? 

    Download ElasticSearch 0.90.3 version. 
    
    Git clone this repository
    
    Install Maven on your system 
    
    Go to the top folder (SearchRankingPlugin) and do mvn package
    
    Then into the target/releases folder a zip file is created. Let it be file.zip
    
    Now Go into bin folder of the downloaded ElasticSearch. The following command will install the plugin 
    
    plugin --url file:///path to file.zip  --install SearchRankingPlugin
    
    Now check the list of the of the plugins installed by running the command here under. 
    
    plugin -l 
    
    When we run the above command SearchRankingPlugin should be listed among them.
    
    Execute the below command now.It should load the SearchRankingPlugin .
    
    
    
