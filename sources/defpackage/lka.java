package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class lka extends wb4<Drawable> {
    @Override // defpackage.f5d
    public final int a() {
        T t = this.a;
        return Math.max(1, t.getIntrinsicHeight() * t.getIntrinsicWidth() * 4);
    }

    @Override // defpackage.f5d
    public final Class<Drawable> b() {
        return this.a.getClass();
    }

    @Override // defpackage.f5d
    public final void recycle() {
    }
}
