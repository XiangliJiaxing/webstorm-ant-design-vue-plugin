package io.tooko.vue.antd.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * 定义文件类型
 *
 * @author XiangliJiaxing
 */
public class AntFileType extends LanguageFileType {

    public static final AntFileType INSTANCE = new AntFileType();

    private AntFileType() {
        super(AntLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Ant-Design";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Ant Design Vue language file";
    }

    // 定义文件扩展名
    @NotNull
    @Override
    public String getDefaultExtension() {
        return "vue";
    }

    // 定义文件图标
    @Nullable
    @Override
    public Icon getIcon() {
        return AntIcons.FILE;
    }
}
