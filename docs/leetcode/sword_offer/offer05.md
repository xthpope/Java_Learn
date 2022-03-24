剑指 Offer 05. 替换空格

请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

 

示例 1：

输入：s = "We are happy."
输出："We%20are%20happy."

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

思路：
1.第一想法还是字符串拆成字符数组，然后遍历，用StringBuilder进行替换改String
2.创建一个字符数组,假设全是空格,数组的最大量就是字符串长度的3倍 ，然后进行原地替换，获得正确的字符数组，最后转成字符串

Solution4