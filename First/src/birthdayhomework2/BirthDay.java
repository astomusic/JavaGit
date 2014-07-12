// checkvalidate()�޼ҵ带 ���� ���� ������� �ʰ�, setYear, setMonth, setDay �޼ҵ忡 ���� ���� ��
// ���� ��ȿ���� �Ǵ��ϰ�, �������� �Ǵ��ϰ� �� �ڵ带 �ٲپ� �ý��ϴ�.
package birthdayhomework;

public class BirthDay {
	public int year;
	public int month;
	public int day;
	public boolean leapyear = false; // true(����o), false(����x)
	public boolean valide = false;
	
	public BirthDay(){}
	public BirthDay(int year, int month, int day){
		setYear(year);
		setMonth(month);
		valide = setDay(day);
	}
	public void setYear(int year){
		if(year < 0){
			System.out.println("�߸��� �Է��Դϴ�.(0�� �̻� ����)");
			return;
		}
		if((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) // �����̸�
			leapyear = true;
		else
			leapyear = false;
		this.year = year;
	}
	public void setMonth(int month){
		if(month < 1 || month > 12){ // 1~12�� ���̰��� �ƴϸ� �߸��� �Է��̹Ƿ� 
			System.out.println("�߸��� �Է��Դϴ�(1��~12���� ����).");
			return;
		}
		this.month = month;
	}
	public boolean setDay(int day){
		if(day < 1 || day > 31){
			System.out.println("�߸��� �Է��Դϴ�(1��~31�ϸ� ����).");
			return false;
		}
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 
				|| month == 10 || month == 12){ // 31�ϱ��� �ִ� ���̸�
			if(day <= 31)
				return true;
			else 
				return false;
		}
		else if(month == 2){ // 2���̸�
			if(leapyear){ // �����̸�
				if(day <= 29)
					return true;
				else 
					return false;
			}
			else{	// ������ �ƴϸ�
				if(day <= 28)
					return true;
				else
					return false;
			}
		}
		else{  // 30�� ���� �ִ� ���̸�
			if(day <= 30)
				return true;
			else
				return false;
		}
	}
	public boolean setDate(int year, int month, int day){
		setYear(year);
		setMonth(month);
		return setDay(day);
	}
	// checkValidate()�� ������� �ʴ´ٸ�
	/*
	public boolean checkValidate(){
		int y = this.year;
		int m = this.month;
		int d = this.day;
		
	
		if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){ // 31�ϱ��� �ִ� ���̸�
			if(d >= 1 && d <= 31)
				return true;
			else
				return false;
		}
		else if(m == 4 || m == 6 || m == 9 || m == 11){ // 30�ϱ��� �ִ� ���̸�
			if(d >= 1 && d <= 30)
				return true;
			else
				return false;
		}
		else if(m == 2){ // 2���̸�
			if((y % 4) == 0 && (y % 100) != 0 || (y % 400) == 0){ // �����̸�
				if(d >= 1 && d <= 29) // 29�ϱ��� ����
					return true;
				else
					return false;
			}
			else{ // ������ �ƴϸ�
				if(d >= 1 && d <= 28)
					return true;
				else
					return false;
			}	
		}
		else // ���� 1~12���� �ƴϸ�
			return false;	
	}
	*/
}
