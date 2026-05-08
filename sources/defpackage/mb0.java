package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class mb0 implements opg {
    public final ViewConfiguration a;

    public mb0(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.opg
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.opg
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.opg
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return nb0.b(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.opg
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.opg
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.opg
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return nb0.a(this.a);
        }
        return 16.0f;
    }
}
