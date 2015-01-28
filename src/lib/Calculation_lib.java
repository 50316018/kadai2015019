package lib;

public class Calculation_lib {
	//フィールドの定義
  private int m,n;

  public Calculation_lib(int m, int n) {
	//super()は今回必要ない為消去した
	this.m = m;
	this.n = n;
	//this:フィールド	
  }

  public int getPlus(){
	return m+n;
  }

  public int getMinus(){
	return m-n;
  }

  public int getMultiple(){
	return m*n;
  }

  public int getDivide(){
	return m/n;
  }
}
