package org.webrtc;

import defpackage.b0;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class JniHelper {
    @CalledByNative
    public static Object getKey(Map.Entry entry) {
        return entry.getKey();
    }

    @CalledByNative
    public static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            b0.o("ISO-8859-1 is unsupported");
            return null;
        }
    }

    @CalledByNative
    public static Object getStringClass() {
        return String.class;
    }

    @CalledByNative
    public static Object getValue(Map.Entry entry) {
        return entry.getValue();
    }
}
