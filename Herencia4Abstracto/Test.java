package Herencia4Abstracto;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		CuentaBanco c1= new CuentaBanco(1250.87f,0.01f);
		CuentaBanco c2= new CuentaAhorros(5400f,0.10f,false);
		CuentaBanco c3= new CuentaCorriente(400f,0.15f,12f);
		
		ArrayList<CuentaBanco> cuentas= new ArrayList<CuentaBanco>();
		cuentas.add(c1);
		cuentas.add(c2);
		cuentas.add(c3);
		
		
		for(CuentaBanco c: cuentas) System.out.println(c.toString());
	}
}
