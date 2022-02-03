package Shreyosri;

public class Mutable {
	
		private String a;

		public Mutable(String a) {
			this.a=a;
		}

		public String getA() {
			return a;
		}

		public void setA(String a) {
			this.a = a;
		}

		public static void main(String[] args) {
			Mutable b=new Mutable("Shreyosri");
			System.out.println(b.getA());
			b.setA("sayani");
			System.out.println(b.getA());

		}

	}

