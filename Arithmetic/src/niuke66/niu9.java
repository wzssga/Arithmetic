package niuke66;

/*我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
 * 总共有多少种方法？
1⃣️target <= 0 大矩形为<= 2*0,直接return 1；
2⃣️target = 1大矩形为2*1，只有一种摆放方法，return1；
3⃣️target = 2 大矩形为2*2，有两种摆放方法，return2；
4⃣️target = n 分为两步考虑：
1:第一块竖着放，那么剩下的n-1块就有f（n-1）种方法
2：第一块横着放，那么下面那块的方法也确定了，所以剩下的n-2块就有f（n-2）种方法
 */
public class niu9 {
	public int RectCover(int target) {
		if (target <= 0) {
			return 0;
		}else if (target==1) {
			return 1;
		}else if (target==2) {
			return 2;
		}else {
			return RectCover(target-1)+RectCover(target-2);
		}
	}
}
