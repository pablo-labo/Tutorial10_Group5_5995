package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes3.dex */
public final class sjc {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            a = iArr;
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ReadableType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(ReadableMap readableMap, String str) {
        if (!readableMap.hasKey(str)) {
            return null;
        }
        int i = a.a[readableMap.getType(str).ordinal()];
        if (i == 1) {
            return String.valueOf(readableMap.getBoolean(str));
        }
        if (i == 2) {
            return String.valueOf(readableMap.getDouble(str));
        }
        if (i != 3) {
            return null;
        }
        return readableMap.getString(str);
    }
}
