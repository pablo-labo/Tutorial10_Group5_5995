package defpackage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jli extends bni {
    public final AtomicReference<Bundle> a;
    public boolean b;

    public jli() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.a = new AtomicReference<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T e(android.os.Bundle r3, java.lang.Class<T> r4) {
        /*
            if (r3 == 0) goto L32
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L32
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = ": %s, %s"
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            java.lang.String r1 = r2.concat(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3}
            java.lang.String r3 = java.lang.String.format(r1, r3)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L32:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jli.e(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // defpackage.gmi
    public final void a(Bundle bundle) {
        synchronized (this.a) {
            try {
                try {
                    this.a.set(bundle);
                    this.b = true;
                } finally {
                    this.a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle h(long j) {
        Bundle bundle;
        synchronized (this.a) {
            if (!this.b) {
                try {
                    this.a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.a.get();
        }
        return bundle;
    }
}
