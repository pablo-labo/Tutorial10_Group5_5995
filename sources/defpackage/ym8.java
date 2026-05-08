package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes2.dex */
public final class ym8 extends u2 {
    @Override // defpackage.u2
    public final Animation b(View view, int i, int i2, int i3, int i4) {
        boolean z = true;
        boolean z2 = (((int) view.getX()) == i && ((int) view.getY()) == i2) ? false : true;
        if (view.getWidth() == i3 && view.getHeight() == i4) {
            z = false;
        }
        if (z2 || z) {
            return new bhb(view, i, i2, i3, i4);
        }
        return null;
    }

    @Override // defpackage.u2
    public final boolean d() {
        return this.d > 0;
    }
}
