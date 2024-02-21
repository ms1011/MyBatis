package com.ohgiraffers.section01.xml;

public class MenuDTO {

    private int menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private String orderableStatus;

    public MenuDTO() {
    }

    public MenuDTO(int menuCode, String menuName, int menuPrice, int categoryCode, String orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    /* 설명. MyBatis는 사실 getter, setter가 없어도 자바의 리플렉션 기술을 활용해 접근한다 */
    /* 설명. spring의 controller에서 command 객체로도 사용되므로 실제 구현 시에는 getter, setter를 만들어 쓰자 */
    
    @Override
    public String toString() {
        return "MenuDTO{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", categoryCode=" + categoryCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
