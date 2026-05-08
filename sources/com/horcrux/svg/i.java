package com.horcrux.svg;

import android.graphics.Bitmap;
import com.horcrux.svg.events.SvgLoadEvent;
import defpackage.b91;
import defpackage.dmc;
import defpackage.j82;
import defpackage.n82;
import defpackage.s55;
import defpackage.ye3;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends b91 {
    public final /* synthetic */ j a;

    public i(j jVar) {
        this.a = jVar;
    }

    @Override // defpackage.b91
    public final void d(ye3 ye3Var) {
        this.a.b0.set(false);
        s55.q(ye3Var.e(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
    }

    @Override // defpackage.b91
    public final void e(ye3 ye3Var) {
        if (ye3Var.d()) {
            n82 n82Var = (n82) ye3Var.getResult();
            try {
                f((n82Var == null || !(n82Var.P() instanceof j82)) ? null : ((j82) n82Var.P()).t1());
            } finally {
                n82.G(n82Var);
            }
        }
    }

    public final void f(Bitmap bitmap) {
        j jVar = this.a;
        dmc.e(jVar.mContext, jVar.getId()).a(new SvgLoadEvent(dmc.h(jVar), jVar.getId(), jVar.mContext, jVar.e, bitmap.getWidth(), bitmap.getHeight()));
        jVar.b0.set(false);
        SvgView svgView = jVar.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
    }
}
