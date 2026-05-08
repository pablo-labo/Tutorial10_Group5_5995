package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class tfb {
    public final int a;
    public final gu5<zhd> b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final ap2[] f;
    public final c6e g;
    public final w42<ap2> h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [E[], java.lang.Object[]] */
    public tfb(int i, gu5<? extends zhd> gu5Var) {
        this.a = i;
        this.b = gu5Var;
        this.f = new ap2[i];
        int i2 = d6e.a;
        this.g = new c6e(i, 0);
        w42<ap2> w42Var = new w42<>();
        if (i < 1) {
            l5.q("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            l5.q("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        w42Var.d = i - 1;
        w42Var.a = new Object[i];
        this.h = w42Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.rfb
            if (r0 == 0) goto L13
            r0 = r8
            rfb r0 = (defpackage.rfb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            rfb r0 = new rfb
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r7 = r0.L$0
            tfb r7 = (defpackage.tfb) r7
            defpackage.r7d.b(r8)
            goto L42
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L30:
            defpackage.r7d.b(r8)
            r0.L$0 = r7
            r0.label = r3
            c6e r8 = r7.g
            java.lang.Object r8 = r8.a(r0)
            g13 r0 = defpackage.g13.a
            if (r8 != r0) goto L42
            return r0
        L42:
            java.util.concurrent.locks.ReentrantLock r8 = r7.c     // Catch: java.lang.Throwable -> L8c
            w42<ap2> r0 = r7.h     // Catch: java.lang.Throwable -> L8c
            r8.lock()     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r7.e     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L96
            int r1 = r0.b     // Catch: java.lang.Throwable -> L8e
            int r4 = r0.c     // Catch: java.lang.Throwable -> L8e
            if (r1 != r4) goto L74
            int r1 = r7.d     // Catch: java.lang.Throwable -> L8e
            int r4 = r7.a     // Catch: java.lang.Throwable -> L8e
            if (r1 < r4) goto L5a
            goto L74
        L5a:
            ap2 r1 = new ap2     // Catch: java.lang.Throwable -> L8e
            gu5<zhd> r4 = r7.b     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L8e
            zhd r4 = (defpackage.zhd) r4     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L8e
            ap2[] r4 = r7.f     // Catch: java.lang.Throwable -> L8e
            int r5 = r7.d     // Catch: java.lang.Throwable -> L8e
            int r6 = r5 + 1
            r7.d = r6     // Catch: java.lang.Throwable -> L8e
            r4[r5] = r1     // Catch: java.lang.Throwable -> L8e
            r0.a(r1)     // Catch: java.lang.Throwable -> L8e
        L74:
            int r1 = r0.b     // Catch: java.lang.Throwable -> L8e
            int r4 = r0.c     // Catch: java.lang.Throwable -> L8e
            if (r1 == r4) goto L90
            E[] r4 = r0.a     // Catch: java.lang.Throwable -> L8e
            r5 = r4[r1]     // Catch: java.lang.Throwable -> L8e
            r4[r1] = r2     // Catch: java.lang.Throwable -> L8e
            int r1 = r1 + r3
            int r2 = r0.d     // Catch: java.lang.Throwable -> L8e
            r1 = r1 & r2
            r0.b = r1     // Catch: java.lang.Throwable -> L8e
            ap2 r5 = (defpackage.ap2) r5     // Catch: java.lang.Throwable -> L8e
            r8.unlock()     // Catch: java.lang.Throwable -> L8c
            return r5
        L8c:
            r8 = move-exception
            goto La2
        L8e:
            r0 = move-exception
            goto L9e
        L90:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L8e
            r0.<init>()     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L96:
            java.lang.String r0 = "Connection pool is closed"
            r1 = 21
            defpackage.zkd.O(r1, r0)     // Catch: java.lang.Throwable -> L8e
            throw r2     // Catch: java.lang.Throwable -> L8e
        L9e:
            r8.unlock()     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8c
        La2:
            c6e r7 = r7.g
            r7.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfb.a(pu2):java.lang.Object");
    }

    public final void b() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (ap2 ap2Var : this.f) {
                if (ap2Var != null) {
                    ap2Var.close();
                }
            }
            j6g j6gVar = j6g.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c(StringBuilder sb) {
        w42<ap2> w42Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            iy8 iy8VarS = u63.s();
            int i = (w42Var.c - w42Var.b) & w42Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = w42Var.c;
                    int i4 = w42Var.b;
                    int i5 = w42Var.d;
                    if (i2 < ((i3 - i4) & i5)) {
                        ap2 ap2Var = w42Var.a[(i4 + i2) & i5];
                        ap2Var.getClass();
                        iy8VarS.add(ap2Var);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            iy8 iy8VarL = iy8VarS.l();
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            c6e c6eVar = this.g;
            c6eVar.getClass();
            sb2.append(Math.max(a6e.V.get(c6eVar), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + iy8VarL.a() + ")[" + z92.W0(iy8VarL, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            ap2[] ap2VarArr = this.f;
            int length = ap2VarArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                ap2 ap2Var2 = ap2VarArr[i7];
                i6++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i6);
                sb3.append("] - ");
                sb3.append(ap2Var2 != null ? ap2Var2.a.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (ap2Var2 != null) {
                    ap2Var2.a(sb);
                }
            }
            j6g j6gVar = j6g.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(ap2 ap2Var) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(ap2Var);
            j6g j6gVar = j6g.a;
            reentrantLock.unlock();
            this.g.release();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
