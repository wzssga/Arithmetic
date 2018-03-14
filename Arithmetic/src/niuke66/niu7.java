package niuke66;
/*
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
*/
//在数学上，斐波纳契数列以如下被以递归的方法定义：
//F(0)=0，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
public class niu7 {
	public int fibo(int n) {
		if (n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
	}
}
