package com.example.chapter3.homework;

import java.util.ArrayList;
import java.util.List;

public class TestDataSet {
    public static List<TestData> getData() {
        List<TestData> result = new ArrayList();
        result.add(new TestData("教育部辟谣取消教师寒暑假", "446.4w"));
        result.add(new TestData("广州番禺一大桥产生裂痕", "405.8w"));
        result.add(new TestData("北京申奥成功20年了", "367.4w"));
        result.add(new TestData("《失孤》原型一家相拥哭成泪人", "350.4w"));
        result.add(new TestData("东京奥运会4名技术人员吸毒", "276w"));
        result.add(new TestData("摄影师拍到中国空间站", "272.8w"));
        result.add(new TestData("京东宣布全员涨薪2个月", "260.4w"));
        result.add(new TestData("苏州暴雨", "75.6w"));
        result.add(new TestData("6月全国菜价上涨", "55w"));
        result.add(new TestData("猫的第六感有多强", "43w"));
        result.add(new TestData("IU真好看", "22.2w"));
        return result;
    }
}
