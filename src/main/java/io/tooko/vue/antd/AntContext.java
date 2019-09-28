package io.tooko.vue.antd;

import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class AntContext extends TemplateContextType {
    protected AntContext(/*@NotNull String id, @NotNull String presentableName*/) {
//        super(id, presentableName);
        super("JAVASCRIPT", "vue");
    }

    @Override
    public boolean isInContext(@NotNull PsiFile psiFile, int offset) {
        return psiFile.getName().endsWith(".vue");
    }
}
