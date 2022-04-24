final static int num=100;
public static void main(String []args){
getRandomNumber_1();
}

for(int i=0,i<num.length-1,i++){
  for(int j=0,j<num.length-i-1,j++)
	  if(num[j]>num[j+1]){
             int sum=num[j]
             num[j]=num[j+1]
	     num[j+1]=sum
	  }
}
for(int tmp:num){
 System.out.println(tmp)
}
