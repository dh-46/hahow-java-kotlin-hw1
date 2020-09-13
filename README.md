# Hahow--Java 與 Kotlin 一起學 : 程式設計的起點

## 作業 1 - 火車售票案例之類別設計-Ticket

1. 建立一個新專案，名稱為 homework
2. 在專案中建立一個 package 名稱為 com.train
3. 依單元6所學，將本專案送交至 github
4. 再完成以下需求，完成後再送交(commit) 新版本並push到 github 中

Java版: 在 com.train 下建立類別 Tester.java，加入main方法。
Kotlin版: 在 com.train 下建立類別 TesterKotlin.kt，加入main方法。

假設只有台北到高雄的票，單程票價1000元，來回票為2000元再打九折。
請設計 Tester.java與TestKotlin.kt ，讓它執行後完成以下規範 :

1. 詢問使用者要購買張數，如下:
    - Please enter number of tickets: 
2. 取得使用者輸入的張數後，再詢問幾張來回票，如下:
	- How many round-trip tickets: 
3. 最後印出本次的張數、來回票數與總金額，如下:
    - Total tickets: 5
    - Round-trip: 3
	- Total: 7400

**請先設計類別後(如 Ticket)，再產生物件用它來解決問題。**

## 作業 2 - 連續訂票功能

承作業1，請加入必要的設計，讓程式能夠連續訂票
 (訂完一次後，繼續下一次訂票)

當使用者想結束訂票時，只要購買張數輸入 -1 ，即結束程式。

* 使用同一個專案 homework 練習，本次作業完成後請 commit 新版後 push 至github。