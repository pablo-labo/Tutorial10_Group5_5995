package defpackage;

import androidx.media3.exoplayer.source.k;

/* JADX INFO: loaded from: classes.dex */
public final class dq1 implements k {
    public final p55 a;
    public m55 b;
    public hn3 c;

    public dq1(p55 p55Var) {
        this.a = p55Var;
    }

    public final long a() {
        hn3 hn3Var = this.c;
        if (hn3Var != null) {
            return hn3Var.d;
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.media3.datasource.a r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, androidx.media3.exoplayer.source.l r15) throws androidx.media3.exoplayer.source.UnrecognizedInputFormatException {
        /*
            r7 = this;
            hn3 r1 = new hn3
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.c = r1
            m55 r8 = r7.b
            if (r8 == 0) goto Lf
            return
        Lf:
            p55 r8 = r7.a
            m55[] r8 = r8.e(r9, r10)
            int r10 = r8.length
            e47$b r11 = defpackage.e47.b
            java.lang.String r11 = "expectedSize"
            defpackage.wg2.o(r10, r11)
            e47$a r11 = new e47$a
            r11.<init>(r10)
            int r10 = r8.length
            r12 = 1
            r13 = 0
            if (r10 != r12) goto L2c
            r8 = r8[r13]
            r7.b = r8
            goto L7f
        L2c:
            int r10 = r8.length
            r14 = r13
        L2e:
            if (r14 >= r10) goto L7b
            r0 = r8[r14]
            boolean r2 = r0.c(r1)     // Catch: java.lang.Throwable -> L3d java.io.EOFException -> L6d
            if (r2 == 0) goto L40
            r7.b = r0     // Catch: java.lang.Throwable -> L3d java.io.EOFException -> L6d
            r1.f = r13
            goto L7b
        L3d:
            r0 = move-exception
            r8 = r0
            goto L5b
        L40:
            java.util.List r0 = r0.i()     // Catch: java.lang.Throwable -> L3d java.io.EOFException -> L6d
            r11.d(r0)     // Catch: java.lang.Throwable -> L3d java.io.EOFException -> L6d
            m55 r0 = r7.b
            if (r0 != 0) goto L54
            long r5 = r1.d
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L52
            goto L54
        L52:
            r0 = r13
            goto L55
        L54:
            r0 = r12
        L55:
            defpackage.ka2.q(r0)
            r1.f = r13
            goto L78
        L5b:
            m55 r7 = r7.b
            if (r7 != 0) goto L67
            long r9 = r1.d
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 != 0) goto L66
            goto L67
        L66:
            r12 = r13
        L67:
            defpackage.ka2.q(r12)
            r1.f = r13
            throw r8
        L6d:
            m55 r0 = r7.b
            if (r0 != 0) goto L54
            long r5 = r1.d
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L52
            goto L54
        L78:
            int r14 = r14 + 1
            goto L2e
        L7b:
            m55 r10 = r7.b
            if (r10 == 0) goto L85
        L7f:
            m55 r7 = r7.b
            r7.l(r15)
            return
        L85:
            androidx.media3.exoplayer.source.UnrecognizedInputFormatException r7 = new androidx.media3.exoplayer.source.UnrecognizedInputFormatException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r10.<init>(r12)
            wy3 r12 = new wy3
            java.lang.String r13 = ", "
            r12.<init>(r13)
            qyc r8 = defpackage.e47.k(r8)
            q6 r13 = new q6
            r14 = 4
            r13.<init>(r14)
            java.util.AbstractList r8 = defpackage.nz8.b(r13, r8)
            java.lang.String r8 = r12.e(r8)
            r10.append(r8)
            java.lang.String r8 = ") could read the stream."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.getClass()
            qyc r10 = r11.f()
            r7.<init>(r8, r9, r10)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq1.b(androidx.media3.datasource.a, android.net.Uri, java.util.Map, long, long, androidx.media3.exoplayer.source.l):void");
    }
}
