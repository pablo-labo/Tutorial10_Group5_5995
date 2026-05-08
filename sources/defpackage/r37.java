package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class r37 {
    public static final Drawable a(k07 k07Var, Resources resources) {
        return k07Var instanceof qb4 ? ((qb4) k07Var).a : k07Var instanceof rg1 ? new BitmapDrawable(resources, ((rg1) k07Var).a) : new v07(k07Var);
    }

    public static final k07 b(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new rg1(((BitmapDrawable) drawable).getBitmap()) : new qb4(drawable);
    }
}
