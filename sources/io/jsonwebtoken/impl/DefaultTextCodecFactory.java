package io.jsonwebtoken.impl;

import com.datadog.android.core.internal.CoreFeature;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DefaultTextCodecFactory implements TextCodecFactory {
    public String getSystemProperty(String str) {
        return System.getProperty(str);
    }

    @Override // io.jsonwebtoken.impl.TextCodecFactory
    public TextCodec getTextCodec() {
        return isAndroid() ? new AndroidBase64Codec() : new Base64Codec();
    }

    public boolean isAndroid() {
        String systemProperty = getSystemProperty("java.vm.name");
        if (systemProperty != null) {
            return systemProperty.toLowerCase().contains("dalvik");
        }
        String systemProperty2 = getSystemProperty("java.vm.vendor");
        if (systemProperty2 != null) {
            return systemProperty2.toLowerCase().contains(CoreFeature.DEFAULT_SOURCE_NAME);
        }
        return false;
    }
}
