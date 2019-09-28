package io.tooko.vue.antd.xml;

import com.intellij.openapi.project.Project;
import com.intellij.psi.xml.XmlTag;
import com.intellij.xml.XmlAttributeDescriptor;
import com.intellij.xml.XmlAttributeDescriptorsProvider;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

// 自定义标签属性支持
public class AntAttributesProvider implements XmlAttributeDescriptorsProvider {

    /**
     * 给标签加属性（该方法需要返回XmlTag对应的所有属性的Descriptor列表）
     * @param xmlTag
     * @return
     */
    @Override
    public XmlAttributeDescriptor[] getAttributeDescriptors(XmlTag xmlTag) {
        final Project project = xmlTag.getProject();
        for (Map.Entry<String, HashMap<String, String[]>> next : AntTagConstant.TAG_CONSTANT.entrySet()) {
            if (next.getKey().equals(xmlTag.getName())) {
                HashMap<String, String[]> attrsMap = next.getValue();
                XmlAttributeDescriptor[] attrs = new AntAttributeDescriptor[attrsMap.size()];
                int i = 0;
                for (Map.Entry<String, String[]> attr : attrsMap.entrySet()) {
                    attrs[i] = new AntAttributeDescriptor(project, attr.getKey(), attr.getValue());
                    i++;
                }
                return attrs;
            }
        }
        return XmlAttributeDescriptor.EMPTY;
    }

    /**
     * 该方法返回名为s的XmlTag所对应的单个Descriptor
     * @param s
     * @param xmlTag
     * @return
     */
    @Nullable
    @Override
    public XmlAttributeDescriptor getAttributeDescriptor(String s, XmlTag xmlTag) {
        return null;
    }
}
