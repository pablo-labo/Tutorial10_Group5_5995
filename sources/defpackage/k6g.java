package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class k6g implements j5d<Bitmap, Bitmap> {

    public static final class a implements f5d<Bitmap> {
        public final Bitmap a;

        public a(Bitmap bitmap) {
            this.a = bitmap;
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

        @Override // defpackage.f5d
        public final void recycle() {
        }
    }

    @Override // defpackage.j5d
    public final /* bridge */ /* synthetic */ boolean a(Bitmap bitmap, ova ovaVar) {
        return true;
    }

    @Override // defpackage.j5d
    public final f5d<Bitmap> b(Bitmap bitmap, int i, int i2, ova ovaVar) {
        return new a(bitmap);
    }
}
