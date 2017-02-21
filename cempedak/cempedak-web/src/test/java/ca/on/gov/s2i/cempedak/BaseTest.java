package ca.on.gov.s2i.cempedak;

import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations = "classpath:applicationContextTest.xml")
/**/
@ContextConfiguration({
        // "classpath:beans.xml",
        "file:src/main/webapp/WEB-INF/cempedak-core-config.xml",
        "file:src/main/webapp/WEB-INF/dispatcher-servlet.xml" })
@TransactionConfiguration(defaultRollback = false)
public abstract class BaseTest implements ApplicationContextAware {
    protected Date currentDate = new Date();

    // @Autowired
    // ApplicantService applicantService;

    // @Autowired
    // JdbcTemplate hotJdbcTemplate;

    /**
     * setUp.
     * 
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * setUpClass.
     * 
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
        try {
            /*
             * SimpleNamingContextBuilder builder = new
             * SimpleNamingContextBuilder(); DriverAdapterCPDS cpds = new
             * DriverAdapterCPDS();
             * cpds.setDriver("oracle.jdbc.driver.OracleDriver"); //cpds.setUrl(
             * "jdbc:oracle:thin:@susracdev.service.cihs.gov.on.ca:1525:susdev")
             * ; //jdbc:oracle:thin:@//oracle.hostserver2.mydomain.ca:1522/ABCD
             * cpds.setUrl
             * ("jdbc:oracle:thin:@//susracdev.service.cihs.gov.on.ca:1525/susdev"
             * ); cpds.setUser("s2i"); cpds.setPassword("s2i");
             * 
             * SharedPoolDataSource dataSource = new SharedPoolDataSource();
             * dataSource.setConnectionPoolDataSource(cpds);
             * dataSource.setMaxActive(10); dataSource.setMaxWait(50);
             * builder.bind("java:/comp/env/jdbc/s2i.ds", dataSource);//
             * java:/comp/env/jdbc/s2i.ds builder.activate();
             */

            /*
             * Context initContext = new InitialContext(); Context webContext =
             * (Context)initContext.lookup("java:/comp/env");
             * 
             * DataSource ds = (DataSource) webContext.lookup("jdbc/s2i.ds"); if
             * ( ds==null ) { System.out.println(" ds is null! "); } else {
             * Statement stmt = ds.getConnection().createStatement(); ResultSet
             * rs = stmt.executeQuery("select sysdate from dual"); if (
             * rs.next() ) { System.out.println("sysdate: "+rs.getString(1)+"");
             * } }
             */

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        // TODO Auto-generated method stub

    }

}
