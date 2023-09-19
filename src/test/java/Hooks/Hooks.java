package Hooks;

import io.cucumber.java.Before;

import static base_urls.ManagementOnSchoolsBaseUrl.setSpec;

public class Hooks {

    @Before ("@Api")
    public void beforeApi(){
        setSpec();
    }

}
