# 一个简单的java单机版机考程序

## 在主线程中创建一个Frame类型的窗口，在该窗口中再创建一个线程giveQuestion。

### 线程giveQuestion每隔20秒钟输出一个选择题（含A,B,C,D共4个选项，要求支持单选题和多选题，单选题用radio button，多选题用check box）或一个判断题（用radio button），选择题和判断题混合着给出；用户输入答案并按提交按钮提交结果（达到20秒自动提交结果）；程序判断用户输入的答案是否正确（如果错选或漏选均得零分），并实时显示当前题目的正确答案、已经给出的题目的数量（分别给出单选题数量、多选题数量和判断题数量）、用户答对的数量（分别给出单选题数量、多选题数量和判断题数量）、用户的成绩和用户答题所花的总的时间。

### 如此循环15次，包括随机选择的5个单选题（每题1分）、随机选择的5个多选题（每题2分）和随机选择的5个判断题（每题1分），结束测试时给出最终成绩。
