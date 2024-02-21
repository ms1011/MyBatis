package com.ohgiraffers.section01.xml;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.section01.xml.Template.getSqlSession;

public class MenuService {
    public void findMenuByPrice(int maxPrice) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.selectMenuByPrice(maxPrice);
        System.out.print("service : ");
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenu(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenu(searchCriteria);
        System.out.print("service : ");
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenuBySupCategory(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuBySupCategory(searchCriteria);

        if(menus != null && menus.size() > 0) {
            System.out.print("service : ");
            menus.forEach(System.out::println);
        } else {
            System.out.println("DB와 연동 실패 또는 검색 결과 없음");
        }

        sqlSession.close();
    }

    public void searchMenuByRandomMenuCode(List<Integer> randomList) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuByRandomMenuCode(randomList);

        if(menus != null && menus.size() > 0) {
            System.out.print("service : ");
            menus.forEach(System.out::println);
        } else {
            System.out.println("DB와 연동 실패 또는 검색 결과 없음");
        }

        sqlSession.close();
    }

    public void searchMenuByCodeOrSearchAll(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuByCodeOrSearchAll(searchCriteria);

        if(menus != null && menus.size() > 0) {
            System.out.print("service : ");
            menus.forEach(System.out::println);
        } else {
            System.out.println("DB와 연동 실패 또는 검색 결과 없음");
        }

        sqlSession.close();
    }

    public void searchMenuByNameOrCategory(Map<String, Object> criteria) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuByNameOrCategory(criteria);

        if(menus != null && menus.size() > 0) {
            System.out.print("service : ");
            menus.forEach(System.out::println);
        } else {
            System.out.println("DB와 연동 실패 또는 검색 결과 없음");
        }

        sqlSession.close();
    }

    public void modifyMenu(Map<String, Object> criteria) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        int result = mapper.updateMenu(criteria);

        if(result > 0) {
            System.out.println("메뉴 정보 변경에 성공하셨습니다.");
            sqlSession.commit();
        } else {
            System.out.println("메뉴 정보 변경에 실패하셨습니다.");
            sqlSession.rollback();
        }

        sqlSession.close();
    }
}
