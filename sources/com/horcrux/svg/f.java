package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import defpackage.gs3;
import defpackage.mkf;
import defpackage.tb5;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class f extends gs3 {
    public final HashMap<String, Bitmap> a;
    public tb5 b;
    public tb5 c;
    public final FilterRegion d;

    public f(mkf mkfVar) {
        super(mkfVar);
        this.a = new HashMap<>();
        this.d = new FilterRegion();
    }

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        SvgView svgView;
        if (this.mName == null || (svgView = getSvgView()) == null) {
            return;
        }
        svgView.defineFilter(this, this.mName);
    }
}
