package defpackage;

import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nqc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ReadableType.values().length];
        try {
            iArr[ReadableType.Null.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReadableType.Boolean.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReadableType.Number.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ReadableType.String.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ReadableType.Map.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ReadableType.Array.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
