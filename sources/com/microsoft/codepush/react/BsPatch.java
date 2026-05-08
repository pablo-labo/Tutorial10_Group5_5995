package com.microsoft.codepush.react;

/* JADX INFO: loaded from: classes3.dex */
public class BsPatch {
    static {
        System.loadLibrary("bspatch");
    }

    public static native int nativeApplyPatch(String str, String str2, String str3);

    public static native String nativeGetErrorString(int i);
}
