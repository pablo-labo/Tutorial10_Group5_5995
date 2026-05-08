package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import defpackage.o85;

/* JADX INFO: loaded from: classes.dex */
public final class ob4 implements o85 {
    public final Drawable a;
    public final qva b;

    public static final class a implements o85.a<Drawable> {
        @Override // o85.a
        public final o85 a(Object obj, qva qvaVar) {
            return new ob4((Drawable) obj, qvaVar);
        }
    }

    public ob4(Drawable drawable, qva qvaVar) {
        this.a = drawable;
        this.b = qvaVar;
    }

    @Override // defpackage.o85
    public final Object a(lu2<? super m85> lu2Var) {
        Bitmap.Config[] configArr = m.a;
        Drawable bitmapDrawable = this.a;
        boolean z = bitmapDrawable instanceof VectorDrawable;
        if (z) {
            qva qvaVar = this.b;
            bitmapDrawable = new BitmapDrawable(qvaVar.a.getResources(), hh1.r(bitmapDrawable, qvaVar.b, qvaVar.c, qvaVar.d, qvaVar.e));
        }
        return new xb4(bitmapDrawable, z, ze3.b);
    }
}
