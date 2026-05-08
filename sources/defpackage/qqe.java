package defpackage;

import defpackage.o7d;

/* JADX INFO: loaded from: classes3.dex */
public final class qqe {
    public static final /* synthetic */ int a = 0;

    static {
        Object aVar;
        Object aVar2;
        Exception exc = new Exception();
        String simpleName = a7h.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            aVar = x81.class.getCanonicalName();
        } catch (Throwable th) {
            aVar = new o7d.a(th);
        }
        if (o7d.a(aVar) != null) {
            aVar = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            aVar2 = qqe.class.getCanonicalName();
        } catch (Throwable th2) {
            aVar2 = new o7d.a(th2);
        }
        if (o7d.a(aVar2) != null) {
            aVar2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
