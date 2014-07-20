package Homework_car;

class CarCompany {
	
	static String nameOfCompany; // ȸ���̸� , ��� ��ü�� ����(�����ڵ���)
	String nameOfCar;	// �ڵ����� �̸�
	int numberOfCar;  // �ڵ��� ����
	int priceOfCar;	// �ڵ��� ����
	
	private static CarCompany Hyundai = new CarCompany(nameOfCompany); // singleton
	
	//public CarCompany(){}
	private CarCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
		System.out.println("Hyundai �ν��Ͻ��� �����Ǿ����ϴ�.");
		
	}
	public static CarCompany getInstance(String nameOfCompany) {
		if(Hyundai == null)
			Hyundai = new CarCompany(nameOfCompany);
		return Hyundai;
	}
	
	public CarCompany(){}
	public CarCompany(String nameOfCar, int numberOfCar, int priceOfCar) {
		this.nameOfCar = nameOfCar;
		this.numberOfCar = numberOfCar;
		this.priceOfCar = priceOfCar;
	}
	
}

class Sonata extends CarCompany{
	
	Sonata(){
		this("�̸�����",0,0);
	}
	public Sonata(String nameOfCar, int numberOfCar, int priceOfCar){
		this.nameOfCar = nameOfCar;
		this.numberOfCar = numberOfCar;
		this.priceOfCar = priceOfCar;
		System.out.println("�ҳ�Ÿ �ν��Ͻ��� �����Ǿ����ϴ�.");
	}
	
}

class Grandeur extends CarCompany{
	
	public Grandeur(String nameOfCar, int numberOfCar, int priceOfCar){
		this.nameOfCar = nameOfCar;
		this.numberOfCar = numberOfCar;
		this.priceOfCar = priceOfCar;
		System.out.println("�׷��� �ν��Ͻ��� �����Ǿ����ϴ�.");
	}
}

class Genesis extends CarCompany{
	
	public Genesis(String nameOfCar, int numberOfCar, int priceOfCar){
		this.nameOfCar = nameOfCar;
		this.numberOfCar = numberOfCar;
		this.priceOfCar = priceOfCar;
		System.out.println("���׽ý� �ν��Ͻ��� �����Ǿ����ϴ�.");
	}
}

class Calculating {  // �ڵ����� ���� ����ϴ� �κ�
	public static int Cal(CarCompany[] Ltd){
		int result = 0;
		
		for(int i = 0; i < Ltd.length; i++){
			result += ( Ltd[i].priceOfCar * Ltd[i].numberOfCar);  // �ڵ��� ���ݸ� �ջ��Ѵ�.
			//System.out.println(Ltd[i].priceOfCar);
		}
		return result;
	}
}

