package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.o85;

/* JADX INFO: loaded from: classes.dex */
public final class pg1 implements o85 {
    public final Bitmap a;
    public final qva b;

    public static final class a implements o85.a<Bitmap> {
        @Override // o85.a
        public final o85 a(Object obj, qva qvaVar) {
            return new pg1((Bitmap) obj, qvaVar);
        }
    }

    public pg1(Bitmap bitmap, qva qvaVar) {
        this.a = bitmap;
        this.b = qvaVar;
    }

    @Override // defpackage.o85
    public final Object a(lu2<? super m85> lu2Var) {
        return new xb4(new BitmapDrawable(this.b.a.getResources(), this.a), false, ze3.b);
    }
}
