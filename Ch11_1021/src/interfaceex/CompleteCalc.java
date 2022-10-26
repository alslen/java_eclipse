package interfaceex;

public class CompleteCalc extends Calculator{

	// CompleteCalc Ŭ������ �θ� Ŭ���� Calculator(�߻�Ŭ����) : 2���� �����ϰ�, 2���� ���� ����.
	// ������ ���� 2���� �޼���� ��ӹ��� �ڽ� Ŭ������ ������ ����
	
	// CompleteCalc �⺻ ����Ʈ ������ ȣ���, ����ڰ� ������ �����ڰ� ����.
	// �׷���, ��� ����Ʈ �����ڸ� �����Ϸ��� �˾Ƽ� ����� ��. CompleteCalc()
	// �⺻ ������ �ȿ��� �ٽ�, �θ��� �����ڸ� �� ȣ�� ��. super()
	// 2���� ������ �Ǿ� ����.
	
	@Override
	public int times(int num1, int num2) {
		
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0 )
			return num1/num2;
		else 
			return Calc.ERROR;
	}
	
	public void showInfo(){
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�" );
	}

	@Override
	public void description() {
		super.description();
	}
}
