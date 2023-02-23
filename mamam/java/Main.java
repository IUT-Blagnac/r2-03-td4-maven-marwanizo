
public class Main {
	public static void main(String[] args) {
		Pile maPile = new Pile(10);
		if (!maPile.est_vide()) System.out.println("NOK1");
		
		maPile.empiler(5);
		if (maPile.est_vide()) System.out.println("NOK2");
		
		int element = maPile.depiler();
		if (!maPile.est_vide()) System.out.println("NOK3");
		if (element != 5) System.out.println("NOK4");
		
		maPile.empiler(18);
		if(maPile.sommet() != 18) System.out.println("NOK5");
		maPile.vider();
		if (!maPile.est_vide()) System.out.println("NOK6");
		System.out.println("Ca fonctionne");
	}
}
