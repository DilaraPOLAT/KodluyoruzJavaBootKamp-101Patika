package MaasHesabi;

public class Employee {
	public String name;
	public int salary;
	public int workHours;
	public int hireYear ;//ise baslangic yili
	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	public int tax(int maas) {    // Maaþa uygulanan vergiyi hesaplayacaktýr.
		if(maas>=1000)
		{
			return (int)(maas*0.3);
		}
		return maas;
	}
	
	public int bonus(int maas,int calismasaati) {    // Saat baþýna 30 TL olacak þekilde maaþa uygulanacak bonus ücretleri hesaplayacaktýr.
		
		    maas=maas+calismasaati*30;
			return maas;
		
	
	}

	public int raiseSalary(int yil,int maas) {// Çalýþanýn iþe baþlangýç yýlýna göre maaþ artýþýný hesaplayacaktýr. Þuan ki yýlý 2021 olarak alýn.
		yil=2021-yil;
		if(yil<10)
		{
			maas=maas+(int)(maas*0.5);
			return maas;
		}
		else if(yil>9 &&yil<20)
		{
			maas=maas+(int)(maas*0.10);
			return maas;
		}
		else
		{
			maas=maas+(int)(maas*0.15);
			return maas;
		}
	}

	public  void toString(Employee emp) {
		int vergi=tax(emp.salary);
		int bonus=bonus(emp.salary,emp.workHours)-emp.salary;
		int vergiBonus=((emp.salary-vergi)+bonus);
		int maasArtisi=raiseSalary(emp.hireYear,emp.salary)-emp.salary;
		int toplamMaas=vergiBonus+ maasArtisi;
		System.out.println("Adý:"+emp.name+"\nMaaþý:"+emp.salary+"\nÇalýþma saati:"+emp.workHours+"\nBaþlangýç Yýlý :"+emp.hireYear+
				"\nvergi:"+vergi+"\nBonus:"+bonus+"\nMaas Artýþý:"+maasArtisi );
		System.out.println("Vergi ve Bonuslar ile birlikte maaþ :"+vergiBonus);
		System.out.println("Toplam Maaþ :"+toplamMaas);
		
	}
}
