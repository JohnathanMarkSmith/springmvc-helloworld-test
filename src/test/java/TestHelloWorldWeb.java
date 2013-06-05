import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

/**
 * Last changed: $LastChangedDate: 2012-11-14 11:31:35 -0500 (Wed, 14 Nov 2012)
 * $
 *
 * @author $Author$
 * @version $Revision$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("com.johnathanmsmith.mvc.web.config.WebMVCConfig")
public class TestHelloWorldWeb
{
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

    @Test
    public void getFoo() throws Exception {
        this.mockMvc.perform(get("/ask").accept("application/html"))
                .andExpect(status().isOk());

    }
}
