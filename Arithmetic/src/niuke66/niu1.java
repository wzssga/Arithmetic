package niuke66;

public class niu1 {
//	题目描述
//	在一个二维数组中，每一行都按照从左到右递增的顺序排序，
//	每一列都按照从上到下递增的顺序排序。请完成一个函数，输
//	入这样的一个二维数组和一个整数，判断数组中是否含有该整数
	/* 思路

	* 矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，

	* 因此从左下角开始查找，当要查找数字比左下角数字大时。右移

	* 要查找数字比左下角数字小时，上移

	*/
	
	static boolean Find(int target, int [][] array) {
		int rowCount = array.length;
		int colCount = array[0].length;
		for (int i = 0; i < colCount ; i++) {
			if (target<=array[rowCount-1][i]) {
				//@错误原因：下处写成j++
				for (int j = rowCount-1; j >= 0; j--) {
					if (array[i][j]==target) {
						return true;
					}
				}
			}
		}
		return false;
    }
	
	
	
	
	
	public static void main(String[] args) {
		//array定义方法：
		
//		double[][] numsix={{1.111D,2.222D,3.333D},{4.444D,5.555D,6.666D}};
//		int[][] numseven=new int[][]{{10,20,30},{40,50},{60}};
//        // 动态初始化
//        int[] intArray4 = new int[3];
		
//		int array1 [][] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int target = 7;
		Find(target,array);

	}

}
