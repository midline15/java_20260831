package day17_test;

import java.util.Random;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		System.out.println("야생의 몬스터가 나타났다");
		
		int pHP = 100;
		int cHP = 100;
		while(true) {
			System.out.println("====================================");
			System.out.println("[현재 상태] 플레이어 HP: " + pHP+" / 몬스터 HP: "+ cHP);
			System.out.print("행동을 선택하세요 (1.공격 2.회복): ");
			int menu = s.nextInt();
			System.out.println("-------------------------------------------------");
			if(menu == 1) {
				int attk = r.nextInt(11)+10;
				System.out.println("플레이어의 공격! 몬스터에게 " +attk + "의 피해를 입혔습니다.");
				cHP -= attk;
			}else if(menu == 2) {
				int heal = r.nextInt(26)+5;
				pHP += heal;
				if(pHP > 100) {
					pHP = 100;
				}
				System.out.println("플레이어가 체력을  "+heal + "만큼 회복했습니다.");
			}
			
			if(cHP <=0) {
				System.out.println("몬스터를 쓰러뜨렸습니다! 플레이어 승리!");
				break;
			}
			
			int dmg = r.nextInt(11)+5;
			pHP -= dmg;
			System.out.println("몬스터의 공격! 플레이어는 "+ dmg + "의 피해를 입었습니다.");
			
			if(pHP <= 0) {
				System.out.println("죽었습니다. 플레이어 패배!");
			}
		}
		
	}

}
