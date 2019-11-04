package soundSystem;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule();

    @Autowired
    private CompactDisc cd;


    @Autowired
    private MediaPlayer player;
    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }


    @Test
    public void player(){

        player.play();
        Assert.hasText("Playing Sgt. Pepper's Lonely Hearts Club Band byThe Beatles\n",
                systemOutRule.getLog());
    }
}
