/*
* Advanced Object Oriented Programming with Java, WS 2016 
* Problem: Bijele
* Link: https://open.kattis.com/problems/bijele
* @author ROBEL KIFLE
* @author EMRE DOGAN
* @version 1.0, 2016-10-27 18:45:24
* Method : Ad-Hoc 
*  Status : Accepted 
*  Runtime: 0.11s 
*/
package Bijele;
import java.util.Scanner;

public class Bijele {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] CBoard;
		CBoard = new int[6];
		int[] Lnum ={1,1,2,2,2,8};
		for(int i=0; i < CBoard.length; i++){
			do{
			CBoard[i] = read.nextInt();
			}while(CBoard[i] < 0 || CBoard[i] >10);
			Lnum[i] = Lnum[i] - CBoard[i];
			System.out.print(Lnum[i] + " ");
		}
		read.close();
	}
}
