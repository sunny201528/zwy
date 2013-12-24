package com.xgs.zwy.util;

public class StringChange {
	public static void main(String[] args) {
		String QJstr = "hello";
		String QJstr1 = "ｈｅｈｅ";

		String result = BQchange(QJstr);
		String result1 = QBchange(QJstr1);

		System.out.println(QJstr + "===" + result);
		System.out.println(QJstr1 + "===" + result1);
	}

	// 半角转全角
	public static final String BQchange(String QJstr) {
		String outStr = "";
		String Tstr = "";
		byte[] b = null;

		for (int i = 0; i < QJstr.length(); i++) {
			try {
				Tstr = QJstr.substring(i, i + 1);
				b = Tstr.getBytes("unicode");
			} catch (java.io.UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			if (b[3] != -1) {
				b[2] = (byte) (b[2] - 32);
				b[3] = -1;
				try {
					outStr = outStr + new String(b, "unicode");
				} catch (java.io.UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			} else
				outStr = outStr + Tstr;
		}
		return outStr;
	}

	// 全角转半角
	public static final String QBchange(String QJstr) {
		String outStr = "";
		String Tstr = "";
		byte[] b = null;

		for (int i = 0; i < QJstr.length(); i++) {
			try {
				Tstr = QJstr.substring(i, i + 1);
				b = Tstr.getBytes("unicode");
			} catch (java.io.UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			if (b[3] == -1) {
				b[2] = (byte) (b[2] + 32);
				b[3] = 0;
				try {
					outStr = outStr + new String(b, "unicode");
				} catch (java.io.UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			} else
				outStr = outStr + Tstr;
		}
		return outStr;
	}

	/**/// /

	// / 转全角的函数(SBC case)
	// /

	// /任意字符串
	// /全角字符串
	// /
	// /全角空格为12288，半角空格为32
	// /其他字符半角(33-126)与全角(65281-65374)的对应关系是：均相差65248
	// /
	public static String ToSBC(String input) {
		// 半角转全角：
		char[] c = input.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 32) {
				c[i] = (char) 12288;
				continue;
			}
			if (c[i] < 127)
				c[i] = (char) (c[i] + 65248);
		}
		return new String(c);
	}

	/**/// /

	// / 转半角的函数(DBC case)
	// /

	// /任意字符串
	// /半角字符串
	// /
	// /全角空格为12288，半角空格为32
	// /其他字符半角(33-126)与全角(65281-65374)的对应关系是：均相差65248
	// /
	public static String ToDBC(String input) {
		char[] c = input.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 12288) {
				c[i] = (char) 32;
				continue;
			}
			if (c[i] > 65280 && c[i] < 65375)
				c[i] = (char) (c[i] - 65248);
		}
		return new String(c);
	}
}