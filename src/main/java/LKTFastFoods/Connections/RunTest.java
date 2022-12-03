package LKTFastFoods.Connections;

public class RunTest {

	public RunTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			System.out.println(new DBConnection().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
