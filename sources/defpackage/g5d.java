package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class g5d implements j5d<Uri, Bitmap> {
    public final l5d a;
    public final bh1 b;

    public g5d(l5d l5dVar, bh1 bh1Var) {
        this.a = l5dVar;
        this.b = bh1Var;
    }

    @Override // defpackage.j5d
    public final boolean a(Uri uri, ova ovaVar) {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // defpackage.j5d
    public final f5d<Bitmap> b(Uri uri, int i, int i2, ova ovaVar) {
        f5d f5dVarC = this.a.c(uri, ovaVar);
        if (f5dVarC == null) {
            return null;
        }
        return yb4.a(this.b, (Drawable) ((wb4) f5dVarC).get(), i, i2);
    }
}
