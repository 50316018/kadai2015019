package lib;

public class Calculation_lib {
	//�t�B�[���h�̒�`
  private int m,n;

  public Calculation_lib(int m, int n) {
	//super()�͍���K�v�Ȃ��׏�������
	this.m = m;
	this.n = n;
	//this:�t�B�[���h	
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
