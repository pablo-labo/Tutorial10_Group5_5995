package defpackage;

import android.view.View;
import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes3.dex */
public final class fsg<T extends View> extends kka<T> {
    public final zf8 a;

    public fsg(zf8 zf8Var) {
        zf8Var.getClass();
        this.a = zf8Var;
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(s23.b, s23.f0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // defpackage.kka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.Object r3, defpackage.gk0 r4, boolean r5) throws expo.modules.kotlin.exception.Exceptions$IncorrectThreadException, expo.modules.kotlin.exception.Exceptions$AppContextLost, expo.modules.kotlin.exception.Exceptions$ViewNotFound {
        /*
            r2 = this;
            if (r4 == 0) goto L85
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            r1 = 0
            if (r5 != r0) goto L5d
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            ohd r4 = r4.b
            java.lang.ref.WeakReference<com.facebook.react.bridge.ReactApplicationContext> r4 = r4.a
            java.lang.Object r4 = r4.get()
            com.facebook.react.bridge.ReactApplicationContext r4 = (com.facebook.react.bridge.ReactApplicationContext) r4
            if (r4 != 0) goto L25
        L23:
            r4 = r1
            goto L33
        L25:
            com.facebook.react.bridge.UIManager r4 = defpackage.dmc.k(r4, r3)
            if (r4 == 0) goto L30
            android.view.View r4 = r4.resolveView(r3)
            goto L31
        L30:
            r4 = r1
        L31:
            if (r4 == 0) goto L23
        L33:
            if (r4 == 0) goto L36
            return r4
        L36:
            expo.modules.kotlin.exception.Exceptions$ViewNotFound r4 = new expo.modules.kotlin.exception.Exceptions$ViewNotFound
            zf8 r2 = r2.a
            oe8 r2 = r2.a()
            r2.getClass()
            yd8 r2 = (defpackage.yd8) r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to find the "
            r5.<init>(r0)
            r5.append(r2)
            java.lang.String r2 = " view with tag "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2, r1)
            throw r4
        L5d:
            expo.modules.kotlin.exception.Exceptions$IncorrectThreadException r2 = new expo.modules.kotlin.exception.Exceptions$IncorrectThreadException
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r3.getClass()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            java.lang.Thread r4 = r4.getThread()
            java.lang.String r4 = r4.getName()
            r4.getClass()
            java.lang.String r5 = "Expected to run on "
            java.lang.String r0 = " thread, but was run on "
            java.lang.String r3 = defpackage.t40.l(r5, r4, r0, r3)
            r2.<init>(r3, r1)
            throw r2
        L85:
            expo.modules.kotlin.exception.Exceptions$AppContextLost r2 = new expo.modules.kotlin.exception.Exceptions$AppContextLost
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsg.d(java.lang.Object, gk0, boolean):java.lang.Object");
    }
}
