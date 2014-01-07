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

import com.xgs.zwy.base.ThreadLocalVariable;
import com.xgs.zwy.core.GlobalValue;
import com.xgs.zwy.domain.SystemSetting;

/**
 * 读取非设备销售条目的比例的配置文件
 * @author xWX146107
 *
 */
public class PropertiesUtil {

    private static final String path="" ;
    private static final  Properties properties =null;
    
    private PropertiesUtil(){}
    static{
//    	path =System.getProperty("user.dir");
////    	path =PropertiesUtil.class.getClassLoader().getResource("").getPath();
//        System.out.println(path+File.separatorChar+"setting.properties");
//        properties = readProperties();
    }
    /**
     * 读取配置文件的key的值
     * @param key
     * @return
     */
    public static String readData(String key){
		return key;
//        InputStream is = null;
//        Properties properties = new Properties();
//        try {
//             is = new FileInputStream(new File(path));
//             properties.load(is);
//        }  catch (IOException e) {
//            e.printStackTrace();
//            throw new RuntimeException("读取配置文件错误");
//        }finally{
//            if(is!=null){
//                try {
//                    is.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                    throw new RuntimeException("读取配置文件错误");
//                }
//            }
//        }
//        return  properties.getProperty(key);
    }
    /**
     * 读取配置文件的key的值
     * @param key
     * @return
     */
    public static Map<String, String>  readAllData(){
		return null;
//        InputStream is = null;
//        Properties properties = new Properties();
//        Map<String, String> map = new HashMap<String, String>();
//        try {
//            is = new FileInputStream(new File(path));
//            properties.load(is);
//            Set<Entry<Object, Object>> set = properties.entrySet();
//            for (Entry<Object, Object> entry : set) {
//                map.put((String)entry.getKey(), (String)entry.getValue());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            if(is!=null){
//                try {
//                    is.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return  map;
    }
    /**
     * 读取配置文件的key的值
     * @param key
     * @return
     */
    private static Properties  readProperties(){
		return null;
//    	InputStream is = null;
//    	Properties properties = new Properties();
//    	Map<String, String> map = new HashMap<String, String>();
//    	try {
//    		is = new FileInputStream(new File(path));
//    		properties.load(is);
//    		Set<Entry<Object, Object>> set = properties.entrySet();
//    		for (Entry<Object, Object> entry : set) {
//    			map.put((String)entry.getKey(), (String)entry.getValue());
//    		}
//    	} catch (FileNotFoundException e) {
//    		e.printStackTrace();
//    	} catch (IOException e) {
//    		e.printStackTrace();
//    	}finally{
//    		if(is!=null){
//    			try {
//    				is.close();
//    			} catch (IOException e) {
//    				e.printStackTrace();
//    			}
//    		}
//    	}
//    	return  new Properties(properties);
    }
    
    /**
     * 修改配置文件的值
     * @param key
     * @return
     */
    public static String writeData(String key,String value){
		return value;
//        OutputStream out = null;
//        Properties properties = new Properties();
//        try {
//            out = new FileOutputStream(new File(path));
//            properties.setProperty(key, value);
//            properties.store(out, null);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            if(out!=null){
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return  properties.getProperty(key);
    }
    
	public static Properties getProperties() {
		return properties;
	}
	
	public static SystemSetting getSystemSetting() {
		return null;
//		SystemSetting setting = ThreadLocalVariable.getSystemSetting();
//		if(setting==null){
//			setting = initSystemSetting();
//		}
////		if(setting.getOutPath()==null) 
////			return null;
//		return setting;
	}
	
	public static SystemSetting updateSystemSetting(SystemSetting setting) {
		return setting;
//		if(setting==null||setting.getOutPath()==null) 
//			return null;
//		
//		writeData(GlobalValue.OUT_PATH,setting.getOutPath());
////		if(setting.getInPath()!=null)
////		writeData(GlobalValue.IN_PATH,setting.getInPath());
//		ThreadLocalVariable.setSystemSetting(setting);
//		return setting;
	}
	public static SystemSetting initSystemSetting(){
		return null;
//		String inPath = properties.getProperty(GlobalValue.IN_PATH);
//		String outPath = properties.getProperty(GlobalValue.OUT_PATH);
//		SystemSetting setting = new SystemSetting(outPath);
//		ThreadLocalVariable.setSystemSetting(setting);
//		return setting;
	}
public static void main(String[] args) {
	PropertiesUtil.readAllData();
}
}