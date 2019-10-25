
public class Main {
	
	public Main()
	{
		Dota2 dota = new Dota2();
		
		dota.HeroesName();
		dota.HeroesAbility();
		
		CounterStrike cs = new CounterStrike();
		
		cs.WeaponName();
		cs.WeaponPrice();
		cs.HitDamageBody();
		cs.HitDamageHeadshot();
	}
	
	public static void main(String[] args) {
		new Main();
		
		
	}

}
