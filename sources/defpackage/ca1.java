package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.IllegalViewOperationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ca1 extends u2 {
    @Override // defpackage.u2
    public final Animation b(View view, int i, int i2, int i3, int i4) {
        kd0 kd0Var = this.c;
        if (kd0Var == null) {
            throw new IllegalViewOperationException("Missing animated property from animation config");
        }
        int iOrdinal = kd0Var.ordinal();
        if (iOrdinal == 0) {
            return new qta(view, e() ? view.getAlpha() : 0.0f, e() ? 0.0f : view.getAlpha());
        }
        if (iOrdinal == 1) {
            return new ScaleAnimation(e() ? 1.0f : 0.0f, e() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
        }
        if (iOrdinal == 2) {
            return new ScaleAnimation(1.0f, 1.0f, e() ? 1.0f : 0.0f, e() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
        }
        if (iOrdinal != 3) {
            l.g();
            return null;
        }
        float f = e() ? 1.0f : 0.0f;
        float f2 = e() ? 0.0f : 1.0f;
        return new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
    }

    @Override // defpackage.u2
    public final boolean d() {
        return this.d > 0 && this.c != null;
    }

    public abstract boolean e();
}
