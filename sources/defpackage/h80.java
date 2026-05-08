package defpackage;

import android.graphics.Canvas;
import android.text.TextUtils;
import defpackage.i80;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h80 {
    public final k80 a;
    public final int b;
    public final long c;
    public final hif d;
    public final CharSequence e;
    public final List<qtc> f;

    /* JADX WARN: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h80(defpackage.k80 r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h80.<init>(k80, int, int, long):void");
    }

    public final hif a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        acb acbVar;
        float fH = h();
        k80 k80Var = this.a;
        cb0 cb0Var = k80Var.g;
        int i8 = k80Var.l;
        dm8 dm8Var = k80Var.i;
        tjf tjfVar = k80Var.b;
        i80.a aVar = i80.a;
        vcb vcbVar = tjfVar.c;
        return new hif(charSequence, fH, cb0Var, i, truncateAt, i8, (vcbVar == null || (acbVar = vcbVar.b) == null) ? false : acbVar.a, i3, i5, i6, i7, i4, i2, dm8Var);
    }

    public final b5d b(int i) {
        return this.d.f.isRtlCharAt(i) ? b5d.b : b5d.a;
    }

    public final float c() {
        return this.d.d(0);
    }

    public final float d() {
        return this.d.a();
    }

    public final float e(int i, boolean z) {
        hif hifVar = this.d;
        return z ? hifVar.h(i, false) : hifVar.i(i, false);
    }

    public final float f() {
        return this.d.d(r1.g - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g(defpackage.qtc r11, int r12, defpackage.mhf r13) {
        /*
            r10 = this;
            android.graphics.RectF r4 = defpackage.wab.z(r11)
            r11 = 1
            r8 = 0
            if (r12 != 0) goto L9
            goto Ld
        L9:
            if (r12 != r11) goto Ld
            r12 = r11
            goto Le
        Ld:
            r12 = r8
        Le:
            s5 r6 = new s5
            r0 = 3
            r6.<init>(r13, r0)
            hif r0 = r10.d
            android.text.Layout r1 = r0.f
            int r10 = android.os.Build.VERSION.SDK_INT
            r13 = 34
            if (r10 < r13) goto L24
            int[] r10 = defpackage.z70.a(r0, r4, r12, r6)
            goto Lb6
        L24:
            yl8 r2 = r0.c()
            if (r12 != r11) goto L39
            kn2 r10 = new kn2
            java.lang.CharSequence r12 = r1.getText()
            e1h r13 = r0.j()
            r10.<init>(r12, r13)
        L37:
            r5 = r10
            goto L4f
        L39:
            java.lang.CharSequence r12 = r1.getText()
            android.text.TextPaint r13 = r0.a
            r3 = 29
            if (r10 < r3) goto L49
            uc6 r10 = new uc6
            r10.<init>(r12, r13)
            goto L37
        L49:
            vc6 r10 = new vc6
            r10.<init>(r12)
            goto L37
        L4f:
            float r10 = r4.top
            int r10 = (int) r10
            int r10 = r1.getLineForVertical(r10)
            float r12 = r4.top
            float r13 = r0.e(r10)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L67
            int r10 = r10 + 1
            int r12 = r0.g
            if (r10 < r12) goto L67
            goto La6
        L67:
            r3 = r10
            float r10 = r4.bottom
            int r10 = (int) r10
            int r10 = r1.getLineForVertical(r10)
            if (r10 != 0) goto L7c
            float r12 = r4.bottom
            float r13 = r0.g(r8)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L7c
            goto La6
        L7c:
            r7 = 1
            int r12 = defpackage.iif.b(r0, r1, r2, r3, r4, r5, r6, r7)
        L81:
            r13 = r3
            r9 = -1
            if (r12 != r9) goto L8f
            if (r13 >= r10) goto L8f
            int r3 = r13 + 1
            r7 = 1
            int r12 = defpackage.iif.b(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L81
        L8f:
            if (r12 != r9) goto L92
            goto La6
        L92:
            r7 = 0
            r3 = r10
            int r10 = defpackage.iif.b(r0, r1, r2, r3, r4, r5, r6, r7)
        L98:
            if (r10 != r9) goto La4
            if (r13 >= r3) goto La4
            int r3 = r3 + (-1)
            r7 = 0
            int r10 = defpackage.iif.b(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L98
        La4:
            if (r10 != r9) goto La8
        La6:
            r10 = 0
            goto Lb6
        La8:
            int r12 = r12 + r11
            int r12 = r5.q(r12)
            int r10 = r10 - r11
            int r10 = r5.r(r10)
            int[] r10 = new int[]{r12, r10}
        Lb6:
            if (r10 != 0) goto Lbb
            long r10 = defpackage.kjf.b
            return r10
        Lbb:
            r12 = r10[r8]
            r10 = r10[r11]
            long r10 = defpackage.cr8.c(r12, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h80.g(qtc, int, mhf):long");
    }

    public final float h() {
        return iq2.h(this.c);
    }

    public final void i(ww1 ww1Var) {
        Canvas canvasA = z40.a(ww1Var);
        hif hifVar = this.d;
        if (hifVar.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, h(), d());
        }
        int i = hifVar.h;
        if (canvasA.getClipBounds(hifVar.p)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            fcf fcfVar = oif.a;
            fcfVar.a = canvasA;
            hifVar.f.draw(fcfVar);
            if (i != 0) {
                canvasA.translate(0.0f, (-1.0f) * i);
            }
        }
        if (hifVar.d) {
            canvasA.restore();
        }
    }

    public final void j(ww1 ww1Var, long j, vbe vbeVar, odf odfVar, ib4 ib4Var) {
        cb0 cb0Var = this.a.g;
        int i = cb0Var.c;
        cb0Var.d(j);
        cb0Var.f(vbeVar);
        cb0Var.g(odfVar);
        cb0Var.e(ib4Var);
        cb0Var.b(3);
        i(ww1Var);
        cb0Var.b(i);
    }

    public final void k(ww1 ww1Var, sn1 sn1Var, float f, vbe vbeVar, odf odfVar, ib4 ib4Var) {
        cb0 cb0Var = this.a.g;
        int i = cb0Var.c;
        float fH = h();
        cb0Var.c(sn1Var, (((long) Float.floatToRawIntBits(d())) & 4294967295L) | (Float.floatToRawIntBits(fH) << 32), f);
        cb0Var.f(vbeVar);
        cb0Var.g(odfVar);
        cb0Var.e(ib4Var);
        cb0Var.b(3);
        i(ww1Var);
        cb0Var.b(i);
    }
}
