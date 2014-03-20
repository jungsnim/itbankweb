package model.tank;
public interface ITankParts
{
	public String getName();
}
class TBullet implements ITankParts{
	public TBullet() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		// TODO Auto-generated method stub
		return "총알";
	}
}
class TBody implements ITankParts{
	public TBody() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		// TODO Auto-generated method stub
		return "바디";
	}
}
class TChain implements ITankParts{
	public TChain() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		// TODO Auto-generated method stub
		return "체인";
	}
}