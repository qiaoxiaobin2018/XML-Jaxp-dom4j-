package cn.xmlParserTest.dom4jTest;

import org.dom4j.Document;
import org.dom4j.Node;

import java.util.List;

public class TestDom4jXpath {
    public static void main(String[] args) throws Exception{
        selectSingleName();

    }
    //查询xml中第一个p1中name元素的值
    public static void selectSingleName() throws Exception {
        /*
         * 1.得到document
         * 2.直接使用selectNodes("//p1[@id1="123"]/name")方法得到所有的name元素
         *
         * */
        //得到document
        Document document = dom4jMethod.getDocument();
        //直接使用selectNodes("//name")方法得到所有的name元素
        Node name = document.selectSingleNode("//p1[@id1='123']/name");
        //获取name值
        String s = name.getText();
        //输出
        System.out.println(s);
    }
    //查询xml中所有name元素的值
    public static void selectAllName() throws Exception {
        /*
        * 1.得到document
        * 2.直接使用selectNodes("//name")方法得到所有的name元素
        *
        * */
        //得到document
        Document document = dom4jMethod.getDocument();
        //直接使用selectNodes("//name")方法得到所有的name元素
        List<Node> list = document.selectNodes("//name");
        //遍历list集合
        for(Node node:list){
            //node是每一个name元素
            //得到name元素里面的值
            String s = node.getText();
            System.out.println(s);
        }
    }

}
