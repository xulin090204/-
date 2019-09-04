package 作业;

public class JSample6_7_1 {

	public static void main(String[] args) {
		int seiseki[][]=new int[3][3];
		seiseki[0][0]=68;
		seiseki[0][1]=82;
		seiseki[0][2]=92;


		seiseki[1][0]=76;
		seiseki[1][1]=33;
		seiseki[1][2]=83;


		seiseki[2][0]=92;
		seiseki[2][1]=45;
		seiseki[2][2]=38;



		String kyoka[]= {"A","B","C"};
		for(int i=0;i<3;i++) {
			System.out.println(kyoka[i]+"成绩");
			for (int j=0;j<3;j++) {
				System.out.println(seiseki[i][j]);


				}

			}

		}

	}


