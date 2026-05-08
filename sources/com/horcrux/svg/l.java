package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.a;
import defpackage.gs3;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class l extends gs3 {
    public static final float[] W = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public Matrix V;
    public SVGLength a;
    public SVGLength b;
    public SVGLength c;
    public SVGLength d;
    public ReadableArray e;
    public a.b f;

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(a.EnumC0161a.a, new SVGLength[]{this.a, this.b, this.c, this.d}, this.f);
            aVar.c = this.e;
            Matrix matrix = this.V;
            if (matrix != null) {
                aVar.f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.f == a.b.b) {
                aVar.g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }
}
