package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.p85;

/* JADX INFO: loaded from: classes.dex */
public final class qg1 implements p85 {
    public final Bitmap a;
    public final nva b;

    public static final class a implements p85.a<Bitmap> {
        @Override // p85.a
        public final p85 a(Object obj, nva nvaVar, xqc xqcVar) {
            return new qg1((Bitmap) obj, nvaVar);
        }
    }

    public qg1(Bitmap bitmap, nva nvaVar) {
        this.a = bitmap;
        this.b = nvaVar;
    }

    @Override // defpackage.p85
    public final Object a(lu2<? super l85> lu2Var) {
        return new y07(r37.b(new BitmapDrawable(this.b.a.getResources(), this.a)), false, we3.b);
    }
}
