package org.wso2.appfactory.integration.test.utils.rest;

import org.wso2.appfactory.integration.test.utils.AFConstants;
import org.wso2.carbon.automation.test.utils.http.client.HttpRequestUtil;
import org.wso2.carbon.automation.test.utils.http.client.HttpResponse;

import java.net.URL;

/**
 * Created by hasitha on 4/28/15.
 */
public class PropertyRestClient extends BaseRestClient {

    /**
     * Construct authenticates REST client to invoke appmgt functions
     *
     * @param backEndUrl backend url
     * @param username   username
     * @param password   password
     * @throws Exception
     */
    public PropertyRestClient(String backEndUrl, String username, String password) throws Exception {
        super(backEndUrl, username, password);
    }


}
