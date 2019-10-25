
public class CounterStrike extends Game implements Weapon{

	@Override
	public void JenisGame() {
		System.out.println("Jenis Game ini berupa FPS");
		
	}

	@Override
	public void WeaponName() {
		System.out.println("AK47");
		
	}
	
	@Override
	public void HitDamageHeadshot() {
		System.out.println("Would Deal 300 damage for a Headshot");
		
	}

	@Override
	public void HitDamageBody() {
		System.out.println("Would deal at least 50 Damage for a bodyShot");
		
	}

	@Override
	public void WeaponPrice() {
		System.out.println("$2700");
		
	}

	
	
	

	
	
}
