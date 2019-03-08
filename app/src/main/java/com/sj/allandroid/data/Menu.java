package com.sj.allandroid.data;

import java.util.List;

/**
 * Created by SJ on 2019/2/13.
 */
public class Menu {
    private String title;
    private List<Function> functions;

    public Menu(String title, List<Function> functions) {
        this.title = title;
        this.functions = functions;
    }
    public static class Function{
        private Class cls;
        private String name;

        public Function(Class cls, String name) {
            this.cls = cls;
            this.name = name;
        }

        public Class getCls() {
            return cls;
        }

        public String getName() {
            return name;
        }
    }

    public String getTitle() {
        return title;
    }

    public List<Function> getFunctions() {
        return functions;
    }
}
