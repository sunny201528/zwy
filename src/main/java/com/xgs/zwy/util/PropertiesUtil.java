package com.xgs.zwy.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * 读取非设备销售条目的比例的配置文件
 * @author xWX146107
 *
 */
public class PropertiesUtil {

    private static final String path ;
    private static final  Properties properties ;
    
    private PropertiesUtil(){}
    static{
    	String p =new File("").getAbsolutePath();
//        System.out.println(p);
        path =p+"\\config\\setting.properties";
//        System.out.println(path);
        properties = readProperties();
    }
    /**
     * 读取配置文件的key的值
     * @param key
     * @return
     */
    public static String readData(String key){
        InputStream is = null;
        Properties properties = new Properties();
        try {
             is = new FileInputStream(new File(path));
             properties.load(is);
        }  catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("读取配置文件错误");
        }finally{
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("读取配置文件错误");
                }
            }
        }
        return  properties.getProperty(key);
    }
    /**
     * 读取配置文件的key的值
     * @param key
     * @return
     */
    public static Map<String, String>  readAllData(){
        InputStream is = null;
        Properties properties = new Properties();
        Map<String, String> map = new HashMap<String, String>();
        try {
            is = new FileInputStream(new File(path));
            properties.load(is);
            Set<Entry<Object, Object>> set = properties.entrySet();
            for (Entry<Object, Object> entry : set) {
                map.put((String)entry.getKey(), (String)entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return  map;
    }
    /**
     * 读取配置文件的key的值
     * @param key
     * @return
     */
    private static Properties  readProperties(){
    	InputStream is = null;
    	Properties properties = new Properties();
    	Map<String, String> map = new HashMap<String, String>();
    	try {
    		is = new FileInputStream(new File(path));
    		properties.load(is);
    		Set<Entry<Object, Object>> set = properties.entrySet();
    		for (Entry<Object, Object> entry : set) {
    			map.put((String)entry.getKey(), (String)entry.getValue());
    		}
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}finally{
    		if(is!=null){
    			try {
    				is.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}
    	return  new Properties(properties);
    }
    
    /**
     * 修改配置文件的值
     * @param key
     * @return
     */
    public static String writeData(String key,String value){
        OutputStream out = null;
        Properties properties = new Properties();
        try {
            out = new FileOutputStream(new File(path));
            properties.setProperty(key, value);
            properties.store(out, null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return  properties.getProperty(key);
    }
    
	public static Properties getProperties() {
		return properties;
	}

}