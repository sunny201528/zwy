package com.xgs.zwy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
//    private static ApplicationContext ctx; 
    static 
    {  
        //在类路径下寻找resources/beans.xml文件  
//        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
    } 
    public static void main(String[] args) {
    	 //从Spring容器中请求SessionFactory  
//        SessionFactory factory =   
//               (SessionFactory)ctx.getBean("sessionFactory");  
 
//        Session session = factory.openSession();  
   
        //读取id为1的教师。  
//        Teacher teacher = (Teacher)session.get(Teacher.class, 1);  
// 
//        if(teacher != null)  
//        {  
//            System.out.println("姓    名： " + teacher.getName());  
//            System.out.println("研究方向： " + teacher.getResearchArea());  
//        }  
// 
//        else 
//        {  
//            System.out.println("未找到！");  
//        }  
          
//        session.close();
	}
}
