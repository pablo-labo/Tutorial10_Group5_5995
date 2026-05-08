package defpackage;

import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uhc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ReadableType.values().length];
        try {
            iArr[ReadableType.String.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReadableType.Map.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
