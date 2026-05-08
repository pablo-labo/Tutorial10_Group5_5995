package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.horcrux.svg.a;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class o extends h {
    public static final float[] k0 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public SVGLength V;
    public SVGLength W;
    public SVGLength a0;
    public a.b b0;
    public a.b c0;
    public float d0;
    public float e0;
    public SVGLength f;
    public float f0;
    public float g0;
    public String h0;
    public int i0;
    public Matrix j0;

    @Override // com.horcrux.svg.h, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(a.EnumC0161a.c, new SVGLength[]{this.f, this.V, this.W, this.a0}, this.b0);
            aVar.e = this.c0 == a.b.a;
            aVar.h = this;
            Matrix matrix = this.j0;
            if (matrix != null) {
                aVar.f = matrix;
            }
            SvgView svgView = getSvgView();
            a.b bVar = this.b0;
            a.b bVar2 = a.b.b;
            if (bVar == bVar2 || this.c0 == bVar2) {
                aVar.g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }
}
