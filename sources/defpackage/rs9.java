package defpackage;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class rs9 {
    public static final Logger a = Logger.getLogger(rs9.class.getName());

    /* JADX WARN: Removed duplicated region for block: B:39:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(java.io.InputStream r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r6 = "Error closing input stream (ignored)"
            java.util.logging.Logger r0 = defpackage.rs9.a
            if (r7 != 0) goto Lb
            java.util.List r6 = java.util.Collections.EMPTY_LIST
            java.util.List r6 = (java.util.List) r6
            return r6
        Lb:
            r1 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L45
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L45
            aab r1 = new aab     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r1.<init>()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r1.readExternal(r2)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.util.List r3 = r1.a()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            if (r3 != 0) goto L38
            java.util.List r7 = r1.a()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r2.close()     // Catch: java.io.IOException -> L2b
            goto L31
        L2b:
            r1 = move-exception
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            r0.log(r2, r6, r1)
        L31:
            java.util.List r7 = (java.util.List) r7
            return r7
        L34:
            r1 = move-exception
            goto L51
        L36:
            r1 = move-exception
            goto L49
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.lang.String r3 = "Empty metadata"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            throw r1     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        L40:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L51
        L45:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L49:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = "Unable to parse metadata file"
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L34
            throw r3     // Catch: java.lang.Throwable -> L34
        L51:
            if (r2 == 0) goto L5e
            r2.close()     // Catch: java.io.IOException -> L57
            goto L68
        L57:
            r7 = move-exception
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            r0.log(r2, r6, r7)
            goto L68
        L5e:
            r7.close()     // Catch: java.io.IOException -> L62
            goto L68
        L62:
            r7 = move-exception
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            r0.log(r2, r6, r7)
        L68:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs9.a(java.io.InputStream):java.util.List");
    }
}
