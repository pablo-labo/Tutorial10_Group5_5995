package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import defpackage.jwa;

/* JADX INFO: loaded from: classes.dex */
public final class ea3 implements LeadingMarginSpan {
    public final int V;
    public final int W;
    public final dce a;
    public final float b;
    public final float c;
    public final float d;
    public final ib4 e;
    public final iy3 f;

    public ea3(dce dceVar, float f, float f2, float f3, float f4, ib4 ib4Var, iy3 iy3Var, float f5) {
        this.a = dceVar;
        this.b = f;
        this.c = f2;
        this.d = f4;
        this.e = ib4Var;
        this.f = iy3Var;
        int iB = gf9.b(f + f3);
        this.V = iB;
        this.W = gf9.b(f5) - iB;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.V;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        ib5 ib5Var = ib5.a;
        ib4 ib4Var = this.e;
        Integer numValueOf = null;
        if (wl7.b(ib4Var, ib5Var)) {
            paint.setStyle(Paint.Style.FILL);
        } else {
            if (!(ib4Var instanceof bwe)) {
                l.g();
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            bwe bweVar = (bwe) ib4Var;
            paint.setStrokeWidth(bweVar.a);
            paint.setStrokeMiter(bweVar.b);
            int i10 = bweVar.c;
            paint.setStrokeCap(i10 == 0 ? Paint.Cap.BUTT : i10 == 1 ? Paint.Cap.ROUND : i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            int i11 = bweVar.d;
            paint.setStrokeJoin(i11 == 0 ? Paint.Join.MITER : i11 == 1 ? Paint.Join.ROUND : i11 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            n80 n80Var = bweVar.e;
            paint.setPathEffect(n80Var != null ? n80Var.a : null);
        }
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.b)) << 32) | (((long) Float.floatToRawIntBits(this.c)) & 4294967295L);
        gu5 gu5Var = new gu5() { // from class: da3
            @Override // defpackage.gu5
            public final Object invoke() {
                ea3 ea3Var = this.a;
                dce dceVar = ea3Var.a;
                int i12 = i2;
                jwa jwaVarA = dceVar.a(jFloatToRawIntBits, i12 > 0 ? vl8.a : vl8.b, ea3Var.f);
                float f2 = i9;
                boolean z2 = jwaVarA instanceof jwa.a;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f3 = f;
                if (z2) {
                    canvas2.save();
                    v5b v5bVar = ((jwa.a) jwaVarA).a;
                    qtc bounds = v5bVar.getBounds();
                    canvas2.translate(f2, f3 - ((bounds.d - bounds.b) / 2.0f));
                    if (!(v5bVar instanceof m80)) {
                        b0.u("Unable to obtain android.graphics.Path");
                        return null;
                    }
                    canvas2.drawPath(((m80) v5bVar).a, paint2);
                    canvas2.restore();
                } else if (jwaVarA instanceof jwa.c) {
                    zfd zfdVar = ((jwa.c) jwaVarA).a;
                    if (ak2.t(zfdVar)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (zfdVar.e >> 32));
                        canvas2.drawRoundRect(f2, f3 - (zfdVar.a() / 2.0f), (zfdVar.b() * i12) + f2, (zfdVar.a() / 2.0f) + f3, fIntBitsToFloat, fIntBitsToFloat, paint2);
                    } else {
                        m80 m80VarA = p80.a();
                        m80VarA.o(zfdVar);
                        canvas2.save();
                        canvas2.translate(f2, f3 - (zfdVar.a() / 2.0f));
                        canvas2.drawPath(m80VarA.a, paint2);
                        canvas2.restore();
                    }
                } else {
                    if (!(jwaVarA instanceof jwa.b)) {
                        l.g();
                        return null;
                    }
                    qtc qtcVar = ((jwa.b) jwaVarA).a;
                    float f4 = (qtcVar.d - qtcVar.b) / 2.0f;
                    canvas2.drawRect(f2, f3 - f4, k6.b(qtcVar.c, qtcVar.a, i12, f2), f4 + f3, paint2);
                }
                return j6g.a;
            }
        };
        if (!Float.isNaN(this.d)) {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(r12 * 255.0f));
        }
        gu5Var.invoke();
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.W;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
