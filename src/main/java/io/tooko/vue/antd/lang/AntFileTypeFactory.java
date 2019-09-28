package io.tooko.vue.antd.lang;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * 定义文件类型工厂
 *
 *  如果编译IDE 版本为2019.2 或者以后的,则直接在extensions Point 中添加文件类型，详情见：
 *  http://www.jetbrains.org/intellij/sdk/docs/tutorials/custom_language_support/language_and_filetype.html
 *
 * @author Xiangli Jiaxing
 */
@Deprecated
public class AntFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(AntFileType.INSTANCE);
    }
}
