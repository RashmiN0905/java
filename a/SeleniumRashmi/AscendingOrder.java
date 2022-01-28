public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int b[]={40,59,60,46,3};
				int a=b.length;
				int temp=0;
				for (int i=0;i<b.length;i++ )
				{ 
                for (int j=i+1;j<b.length ;j++ )
					{
						if(b[i]>b[j]){
							temp=b[i];
							b[i]=b[j];
							b[j]=temp;
                            }
					}
				}
				for(int i=0;i<b.length;i++){
					System.out.println(b[i]);
				}
				}
	            }
