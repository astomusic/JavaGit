package homework_gamelevel;

public class Board {

	public static void main(String[] args) {
		Player p1 = new Player();	// Board���� Player�� �����ϰ�
		p1.upgradeLevel();	// upgradeLevel�Լ��� GameLevel�� �����Ѵ�.
		p1.attack(GameLevel_1.getInstance()); // attack�Լ��� ȣ���ϸ� �� �������� ������ �̷������.
		
		Player p2 = new Player();
		p2.upgradeLevel();
		p2.attack(GameLevel_2.getInstance());
		
		Player p3 = new Player();
		p3.upgradeLevel();
		p3.attack(GameLevel_3.getInstance());
	}

}
