package com.datadog.android.trace;

import com.datadog.android.rum.internal.RumFeature;
import defpackage.doe;
import defpackage.qka;
import defpackage.vka;
import io.opentracing.util.GlobalTracer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b\u001aK\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Ldoe;", "", RumFeature.EVENT_THROWABLE_PROPERTY, "Lj6g;", "setError", "(Ldoe;Ljava/lang/Throwable;)V", "", "message", "(Ldoe;Ljava/lang/String;)V", "T", "operationName", "parentSpan", "", "activate", "Lkotlin/Function1;", "block", "withinSpan", "(Ljava/lang/String;Ldoe;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "dd-sdk-android-trace_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class SpanExtKt {
    public static final void setError(doe doeVar, Throwable th) {
        doeVar.getClass();
        th.getClass();
        AndroidTracer.INSTANCE.logThrowable(doeVar, th);
    }

    public static final <T> T withinSpan(String str, doe doeVar, boolean z, Function1<? super doe, ? extends T> function1) {
        str.getClass();
        function1.getClass();
        GlobalTracer.a.buildSpan(str);
        vka vkaVar = qka.a;
        if (z) {
            GlobalTracer.b.getClass();
        }
        try {
            return function1.invoke(vkaVar);
        } catch (Throwable th) {
            setError(vkaVar, th);
            throw th;
        }
    }

    public static Object withinSpan$default(String str, doe doeVar, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        str.getClass();
        function1.getClass();
        GlobalTracer.a.buildSpan(str);
        vka vkaVar = qka.a;
        if (z) {
            GlobalTracer.b.getClass();
        }
        try {
            return function1.invoke(vkaVar);
        } catch (Throwable th) {
            setError(vkaVar, th);
            throw th;
        }
    }

    public static final void setError(doe doeVar, String str) {
        doeVar.getClass();
        str.getClass();
        AndroidTracer.INSTANCE.logErrorMessage(doeVar, str);
    }
}
