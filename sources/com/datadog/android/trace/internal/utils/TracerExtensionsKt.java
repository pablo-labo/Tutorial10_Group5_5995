package com.datadog.android.trace.internal.utils;

import defpackage.doe;
import defpackage.ppf;
import defpackage.rc3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Lppf;", "", "traceId", "(Lppf;)Ljava/lang/String;", "spanId", "dd-sdk-android-trace_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class TracerExtensionsKt {
    public static final String spanId(ppf ppfVar) {
        ppfVar.getClass();
        doe doeVarActiveSpan = ppfVar.activeSpan();
        if (doeVarActiveSpan instanceof rc3) {
            return ((rc3) doeVarActiveSpan).b.e.toString();
        }
        return null;
    }

    public static final String traceId(ppf ppfVar) {
        ppfVar.getClass();
        doe doeVarActiveSpan = ppfVar.activeSpan();
        if (doeVarActiveSpan instanceof rc3) {
            return ((rc3) doeVarActiveSpan).b.d.toString();
        }
        return null;
    }
}
