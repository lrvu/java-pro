package com.api.string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Calendar;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // !1. String 的构造器
        // - 直接赋值
        String sabc = "abc";
        System.out.println(sabc); // abc
        // - 使用无参构造器创建空字符串对象
        String snull = new String();
        System.out.println(snull); // 空
        // - 使用chars字符数组创建字符串对象
        char[] chars = { 'a', 'b', 'c' };
        String schars = new String(chars);
        System.out.println(schars); // abc
        // - 通过bytes(字节数组)和Charset(字符集)创建字符串
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = schars.getBytes();
        String sbytes = new String(bytes, charset);
        System.out.println(sbytes); // abc
        // - 使用bytes(字节数组)和 charsetName 参数创建字符串
        String sbyte2 = new String(bytes, "utf-8");
        System.out.println(sbyte2); // abc

        // !2. String 的实例方法
        // - charAt(int) 返回指定索引处的 char 值
        char cat2 = sabc.charAt(2);
        System.out.println(cat2); // c
        // - codePointAt(int) 返回指定索引处的字符（Unicode）
        int cpat2 = sabc.codePointAt(2);
        System.out.println(cpat2); // 99
        // - compareTo(String)
        /*
         * 如果参数字符串等于此字符串，则返回值 0；
         * 如果此字符串按字典顺序小于字符串参数，则返回一个小于 0 的值；
         * 如果此字符串按字典顺序大于字符串参数，则返回一个大于 0 的值；
         * 如果没有字符不同，则较短字符串的字典顺序在较长字符串之前。
         */
        System.out.println(sabc.compareTo("abc")); // 0
        System.out.println(sabc.compareTo("ac")); // -1
        System.out.println(sabc.compareTo("aa")); // 1
        // - concat(String) 将指定字符串连接到此字符串的结尾
        System.out.println(sabc.concat("d")); // abcd
        System.out.println(sabc); // abc，不改变原有的值，等于“+”
        // - endsWith(String) 测试字符串是否以指定的后缀结束
        String website = "www.baidu.com";
        System.out.println(website.endsWith("com"));
        // - startsWith(String) 测试此字符串是否以指定前缀开始
        System.out.println(website.startsWith("www"));
        // - equals(Object) 比较字符序列是否相等
        System.out.println(sabc.equals(sbytes));
        // - getBytes() 使用平台的默认字符集将此 String 编码为字节序列
        // （字符集参数可选
        System.out.println(Arrays.toString(sabc.getBytes()));
        // - getChars(int srcBegin, int src End, char[] dst, int dstBegin)
        // 将字符从此字符串复制到目标字符数组
        String src = "This is source.";
        char[] dst = new char[2];
        src.getChars(5, 7, dst, 0);
        System.out.println(Arrays.toString(dst));
        // - indexOf(int ch) 返回指定字符在此字符串中第一次出现处的索引
        System.out.println(sabc.indexOf('c'));
        // - lastIndexOf(int ch) 返回指定字符在此字符串中最后一次出现处的索引
        System.out.println(src.lastIndexOf('s'));
        // - length() 返回字符串长度
        System.out.println(src.length());
        // - matches(String regex) 告知此字符串是否匹配给定的正则表达式
        System.out.println(src.matches("\\w"));
        // - replace(char oldChar, char newChar) 返回一个新字符串，通过newChar替换了oldChar
        System.out.println(sabc.replace('b', 'p')); // apc
        // - replaceAll(String regex, String replacement)
        // 使用给定的replacement替换此字符串中所有匹配给定的正则表达式的子字符串
        String oldstr = "a1b2c3";
        String newstr = oldstr.replaceAll("\\d", " ");
        System.out.println(newstr); // a b c
        // - split(String regex) 根据正则表达式的匹配拆分此字符串
        String[] splits = oldstr.split("\\d");
        System.out.println(Arrays.toString(splits)); // [a, b, c]
        // - substring(int beginIndex, int endIndex)
        // 返回一个新的字符串，它是此字符串的一个子字符串
        String substr = oldstr.substring(0, 2);
        System.out.println(substr); // a1
        // - toCharArray() 将此字符串转换为一个新的字符数组
        char[] chars2 = substr.toCharArray();
        System.out.println(Arrays.toString(chars2)); // [a, 1]
        // - toLowerCase() 将所有字符转换为小写
        String uper = "ABC";
        String lower = uper.toLowerCase();
        System.out.println(lower); // abc
        // - toUpperCase() 将所有字符转换为大写
        System.out.println(lower.toUpperCase()); // ABC
        // - trim() 返回字符串的副本，忽略前导空白和尾部空白
        String blanks = "     There are some blanks.    ";
        String trim = blanks.trim();
        System.out.println(trim);

        // !3. String 的静态方法
        // - copyValueOf(char[] data) 返回指定数组中表示该字符序列的 String
        char[] data = { 'i', ' ', 'l', 'r', 'v', ' ', 'u' };
        String tmp = String.copyValueOf(data);
        System.out.println(tmp);
        // - format(String format, Object... args)
        // 使用指定的格式字符串和参数返回一个格式化字符串
        /*
         * 格式说明符语法：
         * %[argument_index$][flags][width][.precision]conversion
         * 可选的 argument_index 是一个十进制整数，用于表明参数在参数列表中的位置。第一个参数由 "1$" 引用，第二个参数由 "2$"
         * 引用，依此类推。
         * 
         * 可选 flags 是修改输出格式的字符集。有效标志集取决于转换类型。
         * 
         * 可选 width 是一个非负十进制整数，表明要向输出中写入的最少字符数。
         * 
         * 可选 precision 是一个非负十进制整数，通常用来限制字符数。特定行为取决于转换类型。
         * 
         * 所需 conversion 是一个表明应该如何格式化参数的字符。给定参数的有效转换集取决于参数的数据类型。
         * 
         * t表明是日期格式，Y、m、d 则对应年月日，更多格式参见 Java Formatter 类的文档。
         */
        Calendar calendar = Calendar.getInstance();
        tmp = String.format("today is %1$tY-%1$tm-%1$td", calendar);
        System.out.println(tmp);

        // - valueOf(...) 将基本类型转换为String返回 （略）

    }
}
