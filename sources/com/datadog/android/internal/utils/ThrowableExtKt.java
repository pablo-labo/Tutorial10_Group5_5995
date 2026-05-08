package com.datadog.android.internal.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"loggableStackTrace", "", "", "dd-sdk-android-internal_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class ThrowableExtKt {
    public static final String loggableStackTrace(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }
}
