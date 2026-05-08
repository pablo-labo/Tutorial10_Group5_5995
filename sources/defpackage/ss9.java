package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.a;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.source.h;
import defpackage.gdb;
import defpackage.js9;
import defpackage.ns9;
import defpackage.oj9;
import java.util.ArrayList;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes.dex */
public final class ss9 extends b implements Handler.Callback {
    public final ns9.a h0;
    public final d.a i0;
    public final Handler j0;
    public final os9 k0;
    public ka6 l0;
    public boolean m0;
    public boolean n0;
    public long o0;
    public js9 p0;
    public long q0;

    public ss9(d.a aVar, Looper looper) {
        Handler handler;
        super(5);
        this.i0 = aVar;
        if (looper == null) {
            handler = null;
        } else {
            String str = vjg.a;
            handler = new Handler(looper, this);
        }
        this.j0 = handler;
        this.h0 = ns9.a;
        this.k0 = new os9(1);
        this.q0 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.b
    public final void E() {
        this.p0 = null;
        this.l0 = null;
        this.q0 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.b
    public final void G(long j, boolean z) {
        this.p0 = null;
        this.m0 = false;
        this.n0 = false;
    }

    @Override // androidx.media3.exoplayer.b
    public final void L(a[] aVarArr, long j, long j2, h.b bVar) {
        this.l0 = this.h0.a(aVarArr[0]);
        js9 js9Var = this.p0;
        if (js9Var != null) {
            long j3 = js9Var.b;
            long j4 = (this.q0 + j3) - j2;
            if (j3 != j4) {
                js9Var = new js9(j4, js9Var.a);
            }
            this.p0 = js9Var;
        }
        this.q0 = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(defpackage.js9 r7, java.util.ArrayList r8) {
        /*
            r6 = this;
            r0 = 0
        L1:
            js9$a[] r1 = r7.a
            int r2 = r1.length
            if (r0 >= r2) goto L48
            r2 = r1[r0]
            androidx.media3.common.a r2 = r2.a()
            if (r2 == 0) goto L40
            ns9$a r3 = r6.h0
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L40
            ka6 r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.c()
            r1.getClass()
            os9 r3 = r6.k0
            r3.n()
            int r4 = r1.length
            r3.p(r4)
            java.nio.ByteBuffer r4 = r3.d
            java.lang.String r5 = defpackage.vjg.a
            r4.put(r1)
            r3.r()
            js9 r1 = r2.V(r3)
            if (r1 == 0) goto L45
            r6.N(r1, r8)
            goto L45
        L40:
            r1 = r1[r0]
            r8.add(r1)
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss9.N(js9, java.util.ArrayList):void");
    }

    @SideEffectFree
    public final long O(long j) {
        ka2.q(j != -9223372036854775807L);
        ka2.q(this.q0 != -9223372036854775807L);
        return j - this.q0;
    }

    @Override // androidx.media3.exoplayer.l
    public final int a(a aVar) {
        if (this.h0.b(aVar)) {
            return l.f(aVar.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return l.f(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean b() {
        return true;
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.k
    public final boolean c() {
        return this.n0;
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = 0;
        if (message.what != 1) {
            bg.h();
            return false;
        }
        js9 js9Var = (js9) message.obj;
        d.a aVar = this.i0;
        d dVar = d.this;
        lz8<gdb.c> lz8Var = dVar.m;
        oj9.a aVarA = dVar.k0.a();
        while (true) {
            js9.a[] aVarArr = js9Var.a;
            if (i >= aVarArr.length) {
                break;
            }
            aVarArr[i].b(aVarA);
            i++;
        }
        dVar.k0 = new oj9(aVarA);
        oj9 oj9VarA1 = dVar.a1();
        int i2 = 3;
        if (!oj9VarA1.equals(dVar.Q)) {
            dVar.Q = oj9VarA1;
            lz8Var.c(14, new g9(aVar, i2));
        }
        lz8Var.c(28, new dz1(js9Var, i2));
        lz8Var.b();
        return true;
    }

    @Override // androidx.media3.exoplayer.k
    public final void i(long j, long j2) {
        boolean z = true;
        while (z) {
            int i = 0;
            if (!this.m0 && this.p0 == null) {
                os9 os9Var = this.k0;
                os9Var.n();
                ql0 ql0Var = this.c;
                ql0Var.d();
                int iM = M(ql0Var, os9Var, 0);
                if (iM == -4) {
                    if (os9Var.h(4)) {
                        this.m0 = true;
                    } else if (os9Var.f >= this.a0) {
                        os9Var.X = this.o0;
                        os9Var.r();
                        ka6 ka6Var = this.l0;
                        String str = vjg.a;
                        js9 js9VarV = ka6Var.V(os9Var);
                        if (js9VarV != null) {
                            ArrayList arrayList = new ArrayList(js9VarV.a.length);
                            N(js9VarV, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.p0 = new js9(O(os9Var.f), (js9.a[]) arrayList.toArray(new js9.a[0]));
                            }
                        }
                    }
                } else if (iM == -5) {
                    a aVar = (a) ql0Var.c;
                    aVar.getClass();
                    this.o0 = aVar.s;
                }
            }
            js9 js9Var = this.p0;
            if (js9Var == null || js9Var.b > O(j)) {
                z = false;
            } else {
                js9 js9Var2 = this.p0;
                Handler handler = this.j0;
                if (handler != null) {
                    handler.obtainMessage(1, js9Var2).sendToTarget();
                } else {
                    d.a aVar2 = this.i0;
                    d dVar = d.this;
                    lz8<gdb.c> lz8Var = dVar.m;
                    oj9.a aVarA = dVar.k0.a();
                    while (true) {
                        js9.a[] aVarArr = js9Var2.a;
                        if (i >= aVarArr.length) {
                            break;
                        }
                        aVarArr[i].b(aVarA);
                        i++;
                    }
                    dVar.k0 = new oj9(aVarA);
                    oj9 oj9VarA1 = dVar.a1();
                    int i2 = 3;
                    if (!oj9VarA1.equals(dVar.Q)) {
                        dVar.Q = oj9VarA1;
                        lz8Var.c(14, new g9(aVar2, i2));
                    }
                    lz8Var.c(28, new dz1(js9Var2, i2));
                    lz8Var.b();
                }
                this.p0 = null;
                z = true;
            }
            if (this.m0 && this.p0 == null) {
                this.n0 = true;
            }
        }
    }
}
