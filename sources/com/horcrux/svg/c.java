package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import defpackage.s55;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class c extends h {
    @Override // com.horcrux.svg.h, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        s55.n("ReactNative", "RNSVG: ClipPath can't be drawn, it should be defined as a child component for `Defs` ");
    }

    @Override // com.horcrux.svg.h, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    public final boolean isResponsible() {
        return false;
    }

    @Override // com.horcrux.svg.RenderableView
    public final void mergeProperties(RenderableView renderableView) {
    }

    @Override // com.horcrux.svg.h, com.horcrux.svg.RenderableView
    public final void resetProperties() {
    }

    @Override // com.horcrux.svg.h, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        getSvgView().defineClipPath(this, this.mName);
    }
}
