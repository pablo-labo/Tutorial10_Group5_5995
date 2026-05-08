package defpackage;

import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zi6 implements rjd {
    public final int a;
    public final bj6 b;
    public int c = -1;

    public zi6(bj6 bj6Var, int i) {
        this.b = bj6Var;
        this.a = i;
    }

    @Override // defpackage.rjd
    public final void a() throws IOException {
        int i = this.c;
        bj6 bj6Var = this.b;
        if (i == -2) {
            bj6Var.w();
            throw new SampleQueueMappingException(l5.m("Unable to bind a sample queue to TrackGroup with MIME type ", bj6Var.x0.a(this.a).d[0].n, "."));
        }
        if (i == -1) {
            bj6Var.G();
        } else if (i != -3) {
            bj6Var.G();
            bj6Var.k0[i].y();
        }
    }

    @Override // defpackage.rjd
    public final boolean b() {
        if (this.c == -3) {
            return true;
        }
        if (!d()) {
            return false;
        }
        int i = this.c;
        bj6 bj6Var = this.b;
        return !bj6Var.E() && bj6Var.k0[i].w(bj6Var.I0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r6 = this;
            int r0 = r6.c
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            defpackage.ka2.l(r0)
            bj6 r0 = r6.b
            r0.w()
            int[] r3 = r0.z0
            r3.getClass()
            int[] r3 = r0.z0
            int r4 = r6.a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L31
            java.util.Set<wpf> r1 = r0.y0
            xpf r0 = r0.x0
            wpf r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2f
            r3 = -3
            goto L3a
        L2f:
            r3 = r5
            goto L3a
        L31:
            boolean[] r0 = r0.C0
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
            goto L2f
        L38:
            r0[r3] = r1
        L3a:
            r6.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi6.c():void");
    }

    public final boolean d() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    @Override // defpackage.rjd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m(long r4) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r0 = r3.d()
            if (r0 == 0) goto L5e
            int r0 = r3.c
            bj6 r3 = r3.b
            boolean r1 = r3.E()
            if (r1 == 0) goto L11
            goto L5e
        L11:
            bj6$b[] r1 = r3.k0
            r1 = r1[r0]
            boolean r2 = r3.I0
            int r4 = r1.u(r4, r2)
            java.util.ArrayList<ui6> r3 = r3.c0
            if (r3 == 0) goto L2c
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L26
            goto L42
        L26:
            r5 = 1
            java.lang.Object r3 = defpackage.ia.k(r5, r3)
            goto L43
        L2c:
            java.util.Iterator r3 = r3.iterator()
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L42
        L36:
            java.lang.Object r5 = r3.next()
            boolean r2 = r3.hasNext()
            if (r2 != 0) goto L36
            r3 = r5
            goto L43
        L42:
            r3 = 0
        L43:
            ui6 r3 = (defpackage.ui6) r3
            if (r3 == 0) goto L5a
            boolean r5 = r3.h()
            if (r5 != 0) goto L5a
            int r5 = r1.s()
            int r3 = r3.g(r0)
            int r3 = r3 - r5
            int r4 = java.lang.Math.min(r4, r3)
        L5a:
            r1.F(r4)
            return r4
        L5e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi6.m(long):int");
    }

    @Override // defpackage.rjd
    public final int o(ql0 ql0Var, DecoderInputBuffer decoderInputBuffer, int i) {
        a aVar;
        if (this.c == -3) {
            decoderInputBuffer.c(4);
            return -4;
        }
        if (d()) {
            int i2 = this.c;
            bj6 bj6Var = this.b;
            ArrayList<ui6> arrayList = bj6Var.c0;
            if (!bj6Var.E()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = arrayList.get(i4).k;
                        int length = bj6Var.k0.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (bj6Var.C0[i6] && bj6Var.k0[i6].A() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    vjg.U(arrayList, 0, i4);
                    ui6 ui6Var = arrayList.get(0);
                    a aVar2 = ui6Var.d;
                    if (!aVar2.equals(bj6Var.v0)) {
                        bj6Var.Z.b(bj6Var.b, aVar2, ui6Var.e, ui6Var.f, ui6Var.g);
                    }
                    bj6Var.v0 = aVar2;
                }
                if (arrayList.isEmpty() || arrayList.get(0).h()) {
                    int iB = bj6Var.k0[i2].B(ql0Var, decoderInputBuffer, i, bj6Var.I0);
                    if (iB == -5) {
                        a aVarD = (a) ql0Var.c;
                        aVarD.getClass();
                        if (i2 == bj6Var.q0) {
                            int iK1 = bm7.K1(bj6Var.k0[i2].A());
                            while (i3 < arrayList.size() && arrayList.get(i3).k != iK1) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                aVar = arrayList.get(i3).d;
                            } else {
                                aVar = bj6Var.u0;
                                aVar.getClass();
                            }
                            aVarD = aVarD.d(aVar);
                        }
                        ql0Var.c = aVarD;
                    }
                    return iB;
                }
            }
        }
        return -3;
    }
}
