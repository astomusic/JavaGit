package birthdayhomework;

public class BirthDay {
	public int year;
	public int month;
	public int day;
	
	public BirthDay(){}
	public BirthDay(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setDay(int day){
		this.day = day;
	}
	public void setDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
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
}
