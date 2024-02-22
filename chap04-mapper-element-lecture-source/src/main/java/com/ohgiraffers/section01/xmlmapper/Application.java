package com.ohgiraffers.section01.xmlmapper;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("========== 매퍼 elements 테스트 메뉴 ==========");
            System.out.println("1. <resultMap> 테스트");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    resultMapSubMenu();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("메뉴 번호를 잘못 입력하였습니다.");
                    break;
            }
        } while(true);
    }

    private static void resultMapSubMenu() {
        Scanner sc = new Scanner(System.in);
        ElementService elementService = new ElementService();
        do {
            System.out.println("========== <resultMap> 서브 메뉴 ==========");
            System.out.println("1. <resultMap> 테스트");
            System.out.println("2. <association> 테스트");
            System.out.println("3. <collection> 테스트");
            System.out.println("9. 이전 메뉴로 돌아가기");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    elementService.selectResultMapTest();
                    break;
                case 2:
                    elementService.selectResultMapAssociationTest();
                    break;
                case 3:
                    elementService.selectResultMapCollectionTest();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("메뉴 번호를 잘못 입력하였습니다.");
                    break;
            }
        } while(true);

    }
}
