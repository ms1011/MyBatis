package com.ohgiraffers.section01.xml;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xml.Template.getSqlSession;

public class MenuService {
    public void findMenuByPrice(int maxPrice) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.selectMenuByPrice(maxPrice);
        System.out.print("service : ");
        menus.forEach(System.out::println);
    }

    public void searchMenu(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenu(searchCriteria);
        System.out.print("service : ");
        menus.forEach(System.out::println);
    }
}
