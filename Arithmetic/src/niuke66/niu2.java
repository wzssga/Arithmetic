package niuke66;

public class niu2 {
	/*
	 * 请实现一个函数，将一个字符串中的空格替换成“%20”。 例如， 当字符串为We Are
	 * Happy.则经过替换之后的字符串为We%20Are%20Happy。 *
	 */
	static String replaceSpace(StringBuffer str) {
		// 法一：
		/*
		 * StringBuffer sb = new StringBuffer(); for (int i = 0; i < str.length(); i++)
		 * { if (str.charAt(i)==' ') { sb.append("%20"); } else {
		 * sb.append(str.charAt(i)); } } return sb.toString();
		 */
		/* 法二 */
		/*
		 * 在当前字符串替换，怎么替换才更有效率（不考虑java里现有的replace方法）。 从前往后替换，后面的字符要不断往后移动，要多次移动，所以效率低下
		 * 从后往前，先计算需要多少空间，然后从后往前移动，则每个字符只为移动一次， 这样效率更高一点。
		 */

		// 计算一共有多少个空格
		int spaceNum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				spaceNum++;
			}
		}
		//增加空间
		int indexOld = str.length()-1;//旧stringBuffer的最后一位
		str.setLength(spaceNum*2+str.length());//使str的长度扩大到转换成%20之后的长度,防止下标越界
		int indexNew = str.length()-1;//新stringBuffer的最后一位，从这里开始存
		for (;indexOld>=0;indexOld--) {
			if (str.charAt(indexOld)==' ') {
				str.setCharAt(indexNew--, '0');
				str.setCharAt(indexNew--, '2');
				str.setCharAt(indexNew--, '%');
				
			}
			else {
				str.setCharAt(indexNew--, str.charAt(indexOld));
				
			}
		}
		return str.toString();
		
		

	}

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		str.append("We Are Happy.");
		String s = replaceSpace(str);
		System.out.println(s);

	}

}
