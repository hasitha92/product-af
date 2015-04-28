package org.wso2.appfactory.tests.scenarios;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.wso2.appfactory.integration.test.utils.AFConstants;
import org.wso2.appfactory.integration.test.utils.AppFactoryIntegrationTest;
import org.wso2.appfactory.integration.test.utils.rest.AppMgtRestClient;
import org.wso2.appfactory.integration.test.utils.rest.PropertyRestClient;
import org.wso2.carbon.automation.engine.annotations.ExecutionEnvironment;
import org.wso2.carbon.automation.engine.annotations.SetEnvironment;
import org.wso2.carbon.automation.test.utils.http.client.HttpResponse;

import java.util.Map;

/**
 * Created by hasitha on 4/28/15.
 */
public class PropertiesTestCase extends AppFactoryIntegrationTest {



    @BeforeClass(alwaysRun = true)
    public void setEnvironment() throws Exception {
        initWithTenantAndApplicationCreation();
    }

    // Add a property
    @SetEnvironment(executionEnvironments = {ExecutionEnvironment.PLATFORM})
    @Test(description = "Add a resource property")
    public void addProperty(){
        // send a rest call to create a property in the application
        // we need to know about he application name;
        // /appmgt/site/pages/resources-add.jag?applicationName=napp08&applicationKey=napp08&pagePath=resources

    }

    // Delete a property
    @SetEnvironment(executionEnvironments = {ExecutionEnvironment.PLATFORM})
    @Test(description = "Delete a resource property")
    public void deleteProperty(){

    }





}
