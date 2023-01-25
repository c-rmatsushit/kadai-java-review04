package animal;

public class Review04 {

	public static void main(String[] args) {
		Human emp = new Human("田中　太郎", 25, "電車");
        emp.say();
        emp.think();

        Human emp1 = new Human("鈴木　次郎", 30, "野球");
        emp1.say();
        emp1.think();

        Human emp2 = new Human("山田　花子", 20, "映画");
        emp2.say();
        emp2.think();
	}
}