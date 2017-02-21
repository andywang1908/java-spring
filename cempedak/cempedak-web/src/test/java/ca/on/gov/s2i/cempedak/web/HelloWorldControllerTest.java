package ca.on.gov.s2i.cempedak.web;

import static org.junit.Assert.assertTrue;

import java.rmi.RemoteException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ca.on.gov.s2i.cempedak.BaseTest;
import ca.on.gov.s2i.cempedak.Pager;

public class HelloWorldControllerTest extends BaseTest {
    // private final SubSystem subSystem =
    // SubSystem.getInstance(HotConstants.MODULE_NAME);
    // private final Logger logger =
    // subSystem.getLogger(ApplicantServiceTest.class);
    static final Logger LOG = LoggerFactory.getLogger(HelloWorldControllerTest.class);

    @Autowired
    HelloWorldController helloWorldController;

    @Test
    // @Transactional(rollbackFor = DSFault.class)
    public void testCreateActivityApplication() throws RemoteException {
        long activityId = 100L;

        // TODO can not use this plate again

        assertTrue(activityId > 0);
        System.out.println("Generate activityId:" + activityId);

        Pager pager = helloWorldController.findAllCycleHighway();
        LOG.info("pager:" + pager);

        // TODO logger
    }
}
