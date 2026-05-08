package defpackage;

import android.view.View;
import com.facebook.yoga.YogaNodeJNIBase;

/* JADX INFO: loaded from: classes2.dex */
public final class woc extends xm8 implements l6h {
    public int o0;
    public int p0;
    public boolean q0;

    public woc() {
        this.j0.Y(this);
    }

    @Override // defpackage.l6h
    public final long N(YogaNodeJNIBase yogaNodeJNIBase, float f, m6h m6hVar, float f2, m6h m6hVar2) {
        if (!this.q0) {
            mkf mkfVar = this.d;
            hh1.n(mkfVar);
            toc tocVar = new toc(mkfVar);
            tocVar.setShowText(false);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            tocVar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.o0 = tocVar.getMeasuredWidth();
            this.p0 = tocVar.getMeasuredHeight();
            this.q0 = true;
        }
        return wtf.e(this.o0, this.p0);
    }
}
