class Combinations{
	/*
	public void combinar(String[]c){
		for (int i=0; i< c.length; i++ ) {
			combinarEl(c, i, "");
		}
	}

	private String combinarEl(String c[], i, String ans){
		
	}



	public void mostrar(String ar[]){
		String line ="";
		for (int i=0; i< ar.length; i++ ) {
			line = line + ar[i] + " ";
		}
		System.out.println(line);
	}

	public static void main(String[] args) {
		/*String car[] = {"A", "B", "C", "D", "E"};
		Combinations c = new Combinations();
		c.mostrar(car);

	}*/

	public static void main(String[] args) {
        String[] elementos = "a,b,c,d,e".split(",");
        int n = 5;                  //Tipos para escoger
        int r = elementos.length;   //Elementos elegidos
        Perm2(elementos, "", n, r);
    }

    private static void Perm2(String[] elem, String act, int n, int r) {
        if (n == 0) {
            System.out.println(act);
        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(elem[i])) { // Controla que no haya repeticiones
                    Perm2(elem, act + elem[i] + ", ", n - 1, r);
                }
            }
        }
    }
}