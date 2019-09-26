package compte_bancaire;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CompteTest{

	@Test //JUnit 4
	public void testdebiter() throws Exception{
		Compte c=new Compte(50000);
		c.debiter(30000);
		assertEquals(50000, c.getSolde(),1e-8);
	}
	public void testcrediter() throws Exception{
		Compte c=new Compte(50000);
		c.crediter(100000);
		assertEquals(c.getSolde(),1e-8);
	}
	public void testconsulter() throws Exception{
		Compte c=new Compte(50000);
		c.consulter();
		assertEquals(50000, c.getSolde(),1e-8);
	}
}
