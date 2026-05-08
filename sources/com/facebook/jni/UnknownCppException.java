package com.facebook.jni;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.facebook.jni.annotations.DoNotStrip;

/* JADX INFO: loaded from: classes2.dex */
@DoNotStrip
public class UnknownCppException extends CppException {
    @DoNotStrip
    public UnknownCppException() {
        super(ViewUtilsKt.UNKNOWN_DESTINATION_URL);
    }

    @DoNotStrip
    public UnknownCppException(String str) {
        super(str);
    }
}
