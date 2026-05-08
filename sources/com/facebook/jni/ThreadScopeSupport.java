package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import defpackage.u9a;

/* JADX INFO: loaded from: classes2.dex */
@DoNotStrip
public class ThreadScopeSupport {
    static {
        u9a.b("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    private static native void runStdFunctionImpl(long j);
}
