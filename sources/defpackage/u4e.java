package defpackage;

import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class u4e {
    public final Region a = new Region();

    public final ph7 a() {
        Rect bounds = this.a.getBounds();
        return new ph7(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    public final void b(ph7 ph7Var) {
        this.a.set(ph7Var.a, ph7Var.b, ph7Var.c, ph7Var.d);
    }
}
