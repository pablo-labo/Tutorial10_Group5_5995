package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class m extends h {
    public SVGLength V;
    public SVGLength W;
    public SVGLength a0;
    public String b0;
    public String c0;
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
            getSvgView().defineMarker(this, this.mName);
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }
}
