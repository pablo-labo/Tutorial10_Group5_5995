package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class dn8 implements f5d<BitmapDrawable>, kd7 {
    public final Resources a;
    public final f5d<Bitmap> b;

    public dn8(Resources resources, f5d<Bitmap> f5dVar) {
        beb.e(resources, "Argument must not be null");
        this.a = resources;
        beb.e(f5dVar, "Argument must not be null");
        this.b = f5dVar;
    }

    @Override // defpackage.f5d
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.f5d
    public final Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.f5d
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.a, this.b.get());
    }

    @Override // defpackage.kd7
    public final void initialize() {
        f5d<Bitmap> f5dVar = this.b;
        if (f5dVar instanceof kd7) {
            ((kd7) f5dVar).initialize();
        }
    }

    @Override // defpackage.f5d
    public final void recycle() {
        this.b.recycle();
    }
}
