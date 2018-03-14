package niuke66;

/*输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变*/
public class niu12 {
	public void reOrderArray(int[] array) {
		if (array.length == 1 || array.length == 0) {
			return;
		}
		int[] newArray = new int[array.length];
		int oddNum = 0, oddBegin = 0;
		for (int i = 0; i < newArray.length; i++) {
			if ((array[i] & 1) == 1)
				oddNum++;
		}

		for (int i = 0; i < newArray.length; i++) {
			if ((array[i] & 1) == 1) {
				newArray[oddBegin++] = array[i];
			} else {
				newArray[oddNum++] = array[i];
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			array[i] = newArray[i];
		}
	}

	// 思路2】：类似冒泡算法，前偶后奇数就交换：
//	void reOrderArray(vector<int> &array) {
//		 
//		         
//		        for (int i = 0; i < array.size();i++)
//		        {
//		            for (int j = array.size() - 1; j>i;j--)
//		            {
//		                if (array[j] % 2 == 1 && array[j - 1]%2 == 0) //前偶后奇交换
//		                {
//		                    swap(array[j], array[j-1]);
//		                }
//		            }
//		        }
//		 
//	}
//	
}
