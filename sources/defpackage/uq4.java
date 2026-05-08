package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class uq4 extends ReplacementSpan {
    public final dzf b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public short c = -1;
    public float d = 1.0f;

    public uq4(dzf dzfVar) {
        hh2.m(dzfVar, "rasterizer cannot be null");
        this.b = dzfVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        dzf dzfVar = this.b;
        this.d = fAbs / (dzfVar.b().a(14) != 0 ? r8.b.getShort(r1 + r8.a) : (short) 0);
        ps9 ps9VarB = dzfVar.b();
        int iA = ps9VarB.a(14);
        if (iA != 0) {
            ps9VarB.b.getShort(iA + ps9VarB.a);
        }
        short s = (short) ((dzfVar.b().a(12) != 0 ? r5.b.getShort(r7 + r5.a) : (short) 0) * this.d);
        this.c = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
