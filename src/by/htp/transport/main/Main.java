package by.htp.transport.main;

import by.htp.transport.domen.*;
import by.htp.transport.logica.*;

public class Main {
	public static void main(String[] args) {
	
	Poezd poezd = new Poezd();
	PodvizhnayEdinica wagon1 = new PasangersWagon();
	poezd.addPodvizhnayEdinica(wagon1);
	Print.print(poezd);

	}
}
