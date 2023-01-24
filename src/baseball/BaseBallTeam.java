package baseball;

public class BaseBallTeam {

	private String name;
	private int win;
	private int lose;
	private int draw;

	 public void setName (String name) {
		this.name = name;
	    }
	 public void setWin(int win) {
	       this.win = win;
	    }
	 public void setLose(int lose) {
	       this.lose = lose;
	    }
	 public void setDraw(int draw) {
	        this.draw = draw;
	    }
	 public double getRate(){
		 double a = win + lose;
	    	return (double)win/a;
	    }

	    public void report() {
	    	System.out.println ( this.name + "の2020年の成績は"+ win + "勝" + lose + "敗"+ draw + "分、勝率は" + String.format("%.5f",getRate()) +"です。");
	    }
}