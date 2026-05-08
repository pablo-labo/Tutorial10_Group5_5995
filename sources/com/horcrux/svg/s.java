package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import defpackage.n7g;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class s extends h {
    public float V;
    public float W;
    public float a0;
    public String b0;
    public int c0;
    public float f;

    @Override // com.horcrux.svg.h, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        saveDefinition();
    }

    public final void n(Canvas canvas, Paint paint, float f, float f2, float f3) {
        if (this.b0 != null) {
            float f4 = this.f;
            float f5 = this.mScale;
            float f6 = this.V;
            canvas.concat(n7g.c(new RectF(f4 * f5, f6 * f5, (f4 + this.W) * f5, (f6 + this.a0) * f5), new RectF(0.0f, 0.0f, f2, f3), this.b0, this.c0));
            super.draw(canvas, paint, f);
        }
    }
}
