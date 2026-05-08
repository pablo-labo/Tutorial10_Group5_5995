package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class brh {
    public static brh c;
    public final Context a;
    public final cqh b;

    public brh(Context context) {
        this.a = context;
        cqh cqhVar = new cqh(1, null);
        this.b = cqhVar;
        context.getContentResolver().registerContentObserver(gqh.a, true, cqhVar);
    }

    public static brh b(Context context) {
        brh brhVar;
        synchronized (brh.class) {
            try {
                if (c == null) {
                    c = h4.h(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new brh(context) : new brh();
                }
                brhVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return brhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            t23 r0 = new t23     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            r0.<init>()     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            r0.a = r4     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            r0.b = r5     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            java.lang.Object r4 = r0.d()     // Catch: java.lang.SecurityException -> L14 java.lang.IllegalStateException -> L24
            goto L1f
        L14:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            java.lang.Object r4 = r0.d()     // Catch: java.lang.Throwable -> L26
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
        L1f:
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            return r4
        L22:
            r4 = move-exception
            goto L2b
        L24:
            r4 = move-exception
            goto L2b
        L26:
            r4 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
            throw r4     // Catch: java.lang.SecurityException -> L22 java.lang.IllegalStateException -> L24
        L2b:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r0 = r5.length()
            java.lang.String r2 = "Unable to read GServices for: "
            if (r0 == 0) goto L3c
            java.lang.String r5 = r2.concat(r5)
            goto L41
        L3c:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L41:
            java.lang.String r0 = "GservicesLoader"
            android.util.Log.e(r0, r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brh.a(java.lang.String):java.lang.Object");
    }

    public brh() {
        this.a = null;
        this.b = null;
    }
}
