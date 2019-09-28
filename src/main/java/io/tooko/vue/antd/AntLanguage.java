package io.tooko.vue.antd;

import com.intellij.lang.Language;

// 定义语言
public class AntLanguage extends Language {

    public static final AntLanguage INSTANCE = new AntLanguage();

    private AntLanguage() {
        super("Ant Design");
    }
}
