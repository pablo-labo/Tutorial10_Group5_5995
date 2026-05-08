package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class dh1 implements f5d<Bitmap>, kd7 {
    public final Bitmap a;
    public final bh1 b;

    public dh1(bh1 bh1Var, Bitmap bitmap) {
        beb.e(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        beb.e(bh1Var, "BitmapPool must not be null");
        this.b = bh1Var;
    }

    @Override // defpackage.f5d
    public final int a() {
        return xjg.c(this.a);
    }

    @Override // defpackage.f5d
    public final Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // defpackage.f5d
    public final Bitmap get() {
        return this.a;
    }

    @Override // defpackage.kd7
    public final void initialize() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.f5d
    public final void recycle() {
        this.b.d(this.a);
    }
}
