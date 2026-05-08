package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.a;
import defpackage.gs3;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class q extends gs3 {
    public static final float[] b0 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public ReadableArray V;
    public a.b W;
    public SVGLength a;
    public Matrix a0;
    public SVGLength b;
    public SVGLength c;
    public SVGLength d;
    public SVGLength e;
    public SVGLength f;

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(a.EnumC0161a.b, new SVGLength[]{this.a, this.b, this.c, this.d, this.e, this.f}, this.W);
            aVar.c = this.V;
            Matrix matrix = this.a0;
            if (matrix != null) {
                aVar.f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.W == a.b.b) {
                aVar.g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }
}
