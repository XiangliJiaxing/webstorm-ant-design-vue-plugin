package io.tooko.vue.antd.lang;

import com.intellij.lang.Language;

/**
 *
 * 定义语言支持
 *
 * @author XiangliJiaxing
 */
public class AntLanguage extends Language {

    public static final AntLanguage INSTANCE = new AntLanguage();

    private AntLanguage() {
        super("Ant Design Vue");
    }
}
