package com.xgs.zwy.ui.utils;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *JTable 控件公共操纵类
 * @author http://www.my400800.cn 
 */
public class JTableComm {

    /**
     * 隐藏指定JTable的指定列
     * @param table    指定JTable
     * @param column   指定列
     */
    public static void HiddenCell(JTable table, int column) {
        TableColumn tc = table.getTableHeader().getColumnModel().getColumn(column);
        tc.setMaxWidth(0);
        tc.setPreferredWidth(0);
        tc.setWidth(0);
        tc.setMinWidth(0);
        table.getTableHeader().getColumnModel().getColumn(column).setMaxWidth(0);
        table.getTableHeader().getColumnModel().getColumn(column).setMinWidth(0);
    }

    /**
     * 显示指定JTable的指定列
     * @param table    指定JTable
     * @param column   指定列
     * @param width    指定列显示宽度
     */
    public static void showColumn(JTable table, int column, int width) {
        TableColumn tc = table.getColumnModel().getColumn(column);
        tc.setMaxWidth(width);
        tc.setPreferredWidth(width);
        tc.setWidth(width);
        tc.setMinWidth(width);
        table.getTableHeader().getColumnModel().getColumn(column).setMaxWidth(width);
        table.getTableHeader().getColumnModel().getColumn(column).setMinWidth(width);
    }
}