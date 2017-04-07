package packageVehicule;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testVehicule.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VehiculeTest
{
    private Vehicule vehicule1;
    private Conducteur conducte1;

    
    

    /**
     * Default constructor for test class testVehicule
     */
    public VehiculeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        vehicule1 = new Vehicule();
        vehicule1.setImat(321);
        vehicule1.setRoues(8);
        vehicule1.setVitesse(50);
        conducte1 = new Conducteur();
        vehicule1.setConducteur(conducte1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testVitesse()
    {
        Vehicule vehicule1 = new Vehicule();
        vehicule1.setVitesse(100);
        assertEquals(true, vehicule1.compareVitesse(80));
    }

    @Test
    public void testFixture()
    {
        assertEquals(false, vehicule1.compareVitesse(140));
    }
    
    @Test
    public void testproprietaire (){
    	Vehicule v = new Vehicule();
    	Conducteur c = new Conducteur("Roger");
    	Conducteur c2 = new Conducteur("Joey");
    	associerVehicule(v, c);
    	assertEquals(true, v.testproprio(c));
    	
    	v.vendre(c2);
    	assertEquals(false, v.testproprio(c));
    	c2.supprimerVehicule(v);
    	assertEquals(true, v.testproprio(c2));
    }
    
    @Test
    public void testGetter()
    {
    	assertEquals(true, vehicule1.getImat() == 321);
    	assertEquals(true, vehicule1.getRoues() == 8);
    	assertEquals(true, vehicule1.getVitesse() == 50);
    	assertEquals(true, vehicule1.getConducteur().getName().equals( (String) "Roger" ));  	  	
    }
    
    @Test
    public void testConstructeur()
    {
    	Vehicule v = new Vehicule();
    	assertEquals(true, v.getImat() == 123);
    	assertEquals(true, v.getRoues() == 4);
    	assertEquals(true, v.getVitesse() == 130);
    	assertEquals(true, v.getConducteur().getName().equals( (String) "Roger" ));  	  	
    }
    
    @Test
    public void testSetter()
   
    {	
    	vehicule1.setImat(2);
    	assertEquals(true, vehicule1.getImat() == 2);
    	
    	vehicule1.setRoues(4);
    	assertEquals(true, vehicule1.getRoues() == 4);
    	
    	vehicule1.setVitesse(300);
    	assertEquals(true, vehicule1.getVitesse() == 300);
    	
    	vehicule1.setConducteur(new Conducteur());
    	vehicule1.getConducteur().setName("Joey");
    	assertEquals(true, vehicule1.getConducteur().getName().equals( (String) "Joey" ));  	  	
    }

	/**
	 * @param v
	 * @param c
	 */
	private void associerVehicule(Vehicule v, Conducteur c) {
		v.setConducteur(c);
    	c.addVehicule(v);
	}
    
	public void testValidité()
	{
		Vehicule v = new Vehicule();
		v.setRoues(-4);
    	assertNotEquals(true, v.getRoues() == -4);
    	v.setVitesse(-50);
    	assertNotEquals(true, v.getVitesse() == -50);

	}
    
    
}


