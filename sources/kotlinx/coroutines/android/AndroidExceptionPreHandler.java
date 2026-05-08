package kotlinx.coroutines.android;

import defpackage.q1;
import defpackage.z03;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lq1;", "Lz03;", "<init>", "()V", "", "_preHandler", "Ljava/lang/Object;", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidExceptionPreHandler extends q1 implements z03 {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(z03.a.a);
        this._preHandler = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    @Override // defpackage.z03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N0(defpackage.v03 r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r3 >= r0) goto L46
            java.lang.Object r3 = r2._preHandler
            r0 = 0
            if (r3 == r2) goto Le
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            goto L2e
        Le:
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r1 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r1, r0)     // Catch: java.lang.Throwable -> L2b
            int r1 = r3.getModifiers()     // Catch: java.lang.Throwable -> L2b
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            int r1 = r3.getModifiers()     // Catch: java.lang.Throwable -> L2b
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            goto L2c
        L2b:
            r3 = r0
        L2c:
            r2._preHandler = r3
        L2e:
            if (r3 == 0) goto L35
            java.lang.Object r2 = r3.invoke(r0, r0)
            goto L36
        L35:
            r2 = r0
        L36:
            boolean r3 = r2 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r3 == 0) goto L3d
            r0 = r2
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L3d:
            if (r0 == 0) goto L46
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r0.uncaughtException(r2, r4)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.android.AndroidExceptionPreHandler.N0(v03, java.lang.Throwable):void");
    }
}
