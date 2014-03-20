package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/////////////
//자동차를 출력하세요
/// 자동차 - 인터페이스
////자동차 종류 - 클래스
//F1 --- 바퀴, 부스터
//리무진 ---- 바퀴, 방음벽
//트럭 ---- 바퀴, 짐칸
////자동차 부품 - 인터페이스
////자동차 부품 종류 - 클래스

public interface HW_ICar
{
	@Override
	public String toString();
}
@Component("f1")
class CarF1 implements HW_ICar{
	@Autowired
	@Qualifier("tire")
	HW_IPart tire;
	@Autowired
	@Qualifier("booster")
	HW_IPart booster;
	public HW_IPart getTire() {
		return tire;
	}
	public void setTire(PartTire tire) {
		this.tire = tire;
	}
	public HW_IPart getBooster() {
		return booster;
	}
	public void setBooster(PartBooster booster) {
		this.booster = booster;
	}
	@Override
	public String toString() {
		return "CarF1 [tire=" + tire + ", booster=" + booster + "]";
	}
	
	
}
@Component("truck")
class CarTruck implements HW_ICar{
	@Autowired
	@Qualifier("tire")
	HW_IPart tire;
	@Autowired
	@Qualifier("trunk")
	HW_IPart trunk;
	public HW_IPart getTire() {
		return tire;
	}
	public void setTire(PartTire tire) {
		this.tire = tire;
	}
	public HW_IPart getTrunk() {
		return trunk;
	}
	public void setTrunk(PartTrunk trunk) {
		this.trunk = trunk;
	}
	@Override
	public String toString() {
		return "CarTruck [tire=" + tire + ", trunk=" + trunk + "]";
	}
	
}
@Component("limu")
class CarLimu implements HW_ICar{
	@Autowired
	@Qualifier("tire")
	HW_IPart tire;
	@Autowired
	@Qualifier("sproof")
	HW_IPart sproof;
	public HW_IPart getTire() {
		return tire;
	}
	public void setTire(PartTire tire) {
		this.tire = tire;
	}
	public HW_IPart getSproof() {
		return sproof;
	}
	public void setSproof(PartSoundProof sproof) {
		this.sproof = sproof;
	}
	@Override
	public String toString() {
		return "CarLimu [tire=" + tire + ", sproof=" + sproof + "]";
	}
	
}
