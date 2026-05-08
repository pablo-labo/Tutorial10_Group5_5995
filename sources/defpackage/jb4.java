package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
public final class jb4 extends CharacterStyle implements UpdateAppearance {
    public final ib4 a;

    public jb4(ib4 ib4Var) {
        this.a = ib4Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            ib5 ib5Var = ib5.a;
            ib4 ib4Var = this.a;
            if (wl7.b(ib4Var, ib5Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(ib4Var instanceof bwe)) {
                l.g();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            bwe bweVar = (bwe) ib4Var;
            textPaint.setStrokeWidth(bweVar.a);
            textPaint.setStrokeMiter(bweVar.b);
            int i = bweVar.d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = bweVar.c;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            n80 n80Var = bweVar.e;
            textPaint.setPathEffect(n80Var != null ? n80Var.a : null);
        }
    }
}
