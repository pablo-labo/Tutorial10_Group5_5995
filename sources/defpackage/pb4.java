package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import defpackage.p85;

/* JADX INFO: loaded from: classes.dex */
public final class pb4 implements p85 {
    public final Drawable a;
    public final nva b;

    public static final class a implements p85.a<Drawable> {
        @Override // p85.a
        public final p85 a(Object obj, nva nvaVar, xqc xqcVar) {
            return new pb4((Drawable) obj, nvaVar);
        }
    }

    public pb4(Drawable drawable, nva nvaVar) {
        this.a = drawable;
        this.b = nvaVar;
    }

    @Override // defpackage.p85
    public final Object a(lu2<? super l85> lu2Var) {
        Bitmap.Config[] configArr = ukg.a;
        Drawable bitmapDrawable = this.a;
        boolean z = bitmapDrawable instanceof VectorDrawable;
        if (z) {
            nva nvaVar = this.b;
            bitmapDrawable = new BitmapDrawable(nvaVar.a.getResources(), bc4.a(bitmapDrawable, z27.a(nvaVar), nvaVar.b, nvaVar.c, nvaVar.d == dib.b));
        }
        return new y07(r37.b(bitmapDrawable), z, we3.b);
    }
}
