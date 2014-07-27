package homework_gamelevel;

public class Player {
	//player가 levelCount 대신 GameLevel을 가지는건 어떨까요? getGameLevel이 좀더 간단해 질꺼 같습니다.
	static int levelCount = 0; // ������ player �ν��Ͻ��� ���� �����ϱ� ���� ����
	int levelNo;	// player �ν��Ͻ� ������ �ѹ�
	{
		++levelCount;		// player �ν��Ͻ��� ������ ������ levelCount ���� 1�� ��������
		levelNo = levelCount; // levelNo�� �����Ѵ�.�׷��� �� �ν��Ͻ����� �ٸ� �� ����.
	}

	public void upgradeLevel(){ // ���� GameLeve(1~3)�� �����ϴ� �Լ�
		System.out.println("========level " + getGameLevel() + " start==========");
	}
	
	public int getGameLevel(){ // ���� GameLevel(1~3)�� ��ȯ�ϴ� �Լ�
		switch(levelCount){
			case 1: return GameLevel_1.getInstance().levelOfGame;
			case 2: return GameLevel_2.getInstance().levelOfGame;
			case 3: return GameLevel_3.getInstance().levelOfGame;
			default: System.out.println("GameLevel�� ������ 1~3�� ������ϴ�.");
					return 0;
		}
	}
	
	public void attack(GameLevel obj){ // attack()�Լ��� �� ������ ������ �߻�
		obj.play(); // ���� Ŭ������ template method�� �����Ѵ�.
		System.out.println("========level " + getGameLevel() + " end============");
		System.out.println();
	}
}
