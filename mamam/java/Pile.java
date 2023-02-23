
public class Pile {
	
	int[] pile;
	int nbElement;

	public Pile(int i) {
		pile = new int [i];// TODO Auto-generated constructor stub
		nbElement = -1;
	}


	public boolean est_vide() {
		return nbElement==-1;// TODO Auto-generated method stub
	}

	 
	public int sommet(){
        return (this.pile[this.nbElement]);
    }

    public int[] empiler(int pfElement){
    	this.nbElement++;
        this.pile[this.nbElement] = pfElement;
       
        return this.pile;
    }

    public int depiler () {
        int a = this.pile[nbElement];
        this.nbElement--;
        return a;
    }
    
    public void vider () {
    	for (int i=0; i<=nbElement ;i++) {
    		depiler();
    	}
    }
	
}
