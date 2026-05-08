package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class cb0 extends TextPaint {
    public f80 a;
    public odf b;
    public int c;
    public vbe d;
    public da2 e;
    public sn1 f;
    public az3 g;
    public kie h;
    public ib4 i;

    public final u2b a() {
        f80 f80Var = this.a;
        if (f80Var != null) {
            return f80Var;
        }
        f80 f80Var2 = new f80(this);
        this.a = f80Var2;
        return f80Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        ((f80) a()).j(i);
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final defpackage.sn1 r6, final long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.g = r0
            r5.f = r0
            r5.h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof defpackage.kne
            if (r1 == 0) goto L1d
            kne r6 = (defpackage.kne) r6
            long r6 = r6.a
            long r6 = defpackage.hh2.w(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof defpackage.tbe
            if (r1 == 0) goto L73
            sn1 r1 = r5.f
            boolean r1 = defpackage.wl7.b(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            kie r1 = r5.h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.a
            boolean r1 = defpackage.kie.a(r3, r7)
        L36:
            if (r1 != 0) goto L58
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L58
            r5.f = r6
            kie r1 = new kie
            r1.<init>(r7)
            r5.h = r1
            bb0 r1 = new bb0
            r1.<init>()
            az3 r6 = androidx.compose.runtime.r.c(r1)
            r5.g = r6
        L58:
            u2b r6 = r5.a()
            az3 r7 = r5.g
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L68
        L67:
            r7 = r0
        L68:
            f80 r6 = (defpackage.f80) r6
            r6.f(r7)
            r5.e = r0
            defpackage.ie7.y(r5, r9)
            return
        L73:
            defpackage.l.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb0.c(sn1, long, float):void");
    }

    public final void d(long j) {
        da2 da2Var = this.e;
        if (da2Var == null ? false : da2.c(da2Var.a, j)) {
            return;
        }
        if (j != 16) {
            this.e = new da2(j);
            setColor(pnb.P(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(ib4 ib4Var) {
        if (ib4Var == null || wl7.b(this.i, ib4Var)) {
            return;
        }
        this.i = ib4Var;
        if (ib4Var.equals(ib5.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(ib4Var instanceof bwe)) {
            l.g();
            return;
        }
        ((f80) a()).r(1);
        bwe bweVar = (bwe) ib4Var;
        ((f80) a()).q(bweVar.a);
        ((f80) a()).p(bweVar.b);
        ((f80) a()).o(bweVar.d);
        ((f80) a()).n(bweVar.c);
        ((f80) a()).m(bweVar.e);
    }

    public final void f(vbe vbeVar) {
        if (vbeVar == null || wl7.b(this.d, vbeVar)) {
            return;
        }
        this.d = vbeVar;
        if (vbeVar.equals(vbe.d)) {
            clearShadowLayer();
            return;
        }
        vbe vbeVar2 = this.d;
        float f = vbeVar2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (vbeVar2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), pnb.P(this.d.a));
    }

    public final void g(odf odfVar) {
        if (odfVar == null || wl7.b(this.b, odfVar)) {
            return;
        }
        this.b = odfVar;
        int i = odfVar.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
