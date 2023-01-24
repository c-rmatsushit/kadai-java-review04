package baseball;

public class Review03 {
	public static void main(String[] args) {
		BaseBallTeam giants = new BaseBallTeam();
        giants.setName("読売ジャイアンツ");
        giants.setWin(67);
        giants.setLose(45);
        giants.setDraw(8);
        giants.report();

		BaseBallTeam tigers= new BaseBallTeam();
		tigers.setName("阪神タイガース");
		tigers.setWin(60);
		tigers.setLose(53);
		tigers.setDraw(7);
		tigers.report();

		BaseBallTeam dragons = new BaseBallTeam();
		dragons.setName("中日ドラゴンズ");
		dragons.setWin(60);
		dragons.setLose(55);
		dragons.setDraw(5);
		dragons.report();

		BaseBallTeam baystars = new BaseBallTeam();
		baystars.setName("横浜DeNAベイスターズ");
		baystars.setWin(56);
		baystars.setLose(58);
		baystars.setDraw(6);
		baystars.report();

		BaseBallTeam carp = new BaseBallTeam();
        carp.setName("広島カープ");
        carp.setWin(52);
        carp.setLose(56);
        carp.setDraw(12);
        carp.report();

		BaseBallTeam yakult = new BaseBallTeam();
        yakult.setName("東京ヤクルトスワローズ");
        yakult.setWin(41);
        yakult.setLose(69);
        yakult.setDraw(10);
        yakult.report();
	}
}



