package miniproject;

public  class SBIBank extends Bank {
	int dp;
	int wd;
	
public  SBIBank()
{
	
}

public SBIBank(String name, int accno, int amount, String address, int dp, int wd) {
	super(name, accno, amount, address);
	this.dp = dp;
	this.wd = wd;
}

public int getDp() {
	return dp;
}

public void setDp(int dp) {
	this.dp = dp;
}
public int getWd() {
	return wd;
}

public void setWd(int wd) {
	this.wd = wd;
}
public int deposit() {
	dp = this.getAmount()+3000;
	return dp;
}
public int withdraw()
{
	wd = this.dp-2000;
	return wd;
}

@Override
public String toString() {
	return super.toString()+ "SBIBank [dp=" + dp + ", wd=" + wd + "]";
}
	
}


	


	
	


