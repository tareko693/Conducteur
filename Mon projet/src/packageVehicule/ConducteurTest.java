package packageVehicule;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConducteurTest {
	Conducteur c;
	Vehicule v;

	@Before
	public void setUp() throws Exception {
		c = new Conducteur();
    	c.setEtat(false);
    	c.setMesVehicules(new ArrayList<Vehicule> ());
    	c.setName("Michou");
    	v = new Vehicule();
    	c.getMesVehicules().add(v);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ConducteurTest() {
		
		Conducteur c = new Conducteur();
		Vehicule v = new Vehicule();
		assertEquals(false, c.getMesVehicules().contains(v));
		
		c.addVehicule(v);
		assertEquals(true, c.getMesVehicules().contains(v));
		
	}
	
    @Test
    public void testGetter()
    {
    	assertEquals(true, c.getEtat() == false);
    	
    	assertEquals(true, c.getName() == "Michou");
    		
    	assertEquals(true, c.getMesVehicules().contains(v));
    }
    
    @Test
    public void testConstructeur()
    {
    	Conducteur c1 = new Conducteur();
    	
    	assertEquals(true, c1.getEtat() == true);
    	
    	assertEquals(true, c1.getName() == "Roger");
    		
    	assertEquals(true, c1.getMesVehicules().isEmpty());
    }
    
    @Test
    public void testSetter()
   
    {	
    	c.setEtat(true);
    	assertEquals(true, c.getEtat());
    	
    	c.setName("Joey");
    	assertEquals(true, c.getName() == "Joey");
    	
    	c.setMesVehicules(new ArrayList<Vehicule>());
    	Vehicule v2 = new Vehicule();
    	v2.setImat(500);
    	c.getMesVehicules().add(v2);
    	assertEquals(true, c.getMesVehicules().contains(v2));
 	
    }
    
    @Test
    public void testAssoupissement()
    {
    	Conducteur c3 = new Conducteur();
    	assertEquals(true,c3.assoupissement());
    	
    	c3.setEtat(false);
    	assertEquals(false,c3.assoupissement());
    }

}
