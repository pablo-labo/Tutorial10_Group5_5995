package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lb4 implements b6d {
    public Object a;
    public Object b;
    public Object c;

    public lb4(w62 w62Var, List list, lb4 lb4Var) {
        w62Var.getClass();
        list.getClass();
        this.a = w62Var;
        this.b = list;
        this.c = lb4Var;
    }

    @Override // defpackage.b6d
    public f5d c(f5d f5dVar, ova ovaVar) {
        Drawable drawable = (Drawable) f5dVar.get();
        if (drawable instanceof BitmapDrawable) {
            cg1 cg1Var = (cg1) this.b;
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            return cg1Var.c(bitmap != null ? new dh1((bh1) this.a, bitmap) : null, ovaVar);
        }
        if (drawable instanceof v86) {
            return ((u63) this.c).c(f5dVar, ovaVar);
        }
        return null;
    }
}
