package com.sj.allandroid.data;

import com.sj.b_1_four_base_component.SActivity;
import com.sj.b_materialdesign.MDView1Activity;
import com.sj.b_materialdesign.MDView2Activity;
import com.sj.b_view.ConstraintLayoutActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SJ on 2019/2/13.
 */
public enum MenuEnum {
    FourBaseComponent("四大组件",
            new Menu.Function(SActivity.class,"Activity"),
            new Menu.Function(null,"Service"),
            new Menu.Function(null,"BroadCast"),
            new Menu.Function(null,"ContentProvider")
    ),

    MaterialDesign("MaterialDesign",
            new Menu.Function(MDView1Activity.class,"Toolbar/DrawerLayout"),
            new Menu.Function(MDView2Activity.class,"折叠标题栏应用"),
            new Menu.Function(null,"")
    ),

    BaseUIComponent("基础组件",
            new Menu.Function(ConstraintLayoutActivity.class,"ConstraintLayout"),
            new Menu.Function(null,"")
    ),
    ImportantComponent("重要组件",
            new Menu.Function(null,""),
            new Menu.Function(null,""),
            new Menu.Function(null,"")
    ),
    AsyncTask("异步任务机制",
            new Menu.Function(null,""),
            new Menu.Function(null,""),
            new Menu.Function(null,"")
    ),
    Thread("线程间通信",
            new Menu.Function(null,""),
            new Menu.Function(null,""),
            new Menu.Function(null,"")
    ),
    CustomView("View事件分发",
            new Menu.Function(null,""),
            new Menu.Function(null,""),
            new Menu.Function(null,"")
    ),

    DesignPatterns("DesignPatterns",
            new Menu.Function(null,""),
            new Menu.Function(null,""),
            new Menu.Function(null,"")
    );
    private Menu menu;
    MenuEnum(String title, Menu.Function ...function) {
        List<Menu.Function> functions = new ArrayList<>();
        for (Menu.Function f : function) {
            functions.add(f);
        }
        menu = new Menu(title,functions);
    }
    public Menu getMenu() {
        return menu;
    }
}
