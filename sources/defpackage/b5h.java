package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import defpackage.ogd;

/* JADX INFO: loaded from: classes2.dex */
public final class b5h {
    public static final ColorDrawable a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, ogd ogdVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            ogdVar.getClass();
            bgd bgdVar = new bgd(resources, bitmap, paint);
            b(bgdVar, ogdVar);
            return bgdVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            ngd ngdVar = new ngd((NinePatchDrawable) drawable);
            b(ngdVar, ogdVar);
            return ngdVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            s55.p("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        egd egdVar = new egd(((ColorDrawable) drawable).getColor());
        b(egdVar, ogdVar);
        return egdVar;
    }

    public static void b(agd agdVar, ogd ogdVar) {
        ogdVar.getClass();
        agdVar.m();
        agdVar.s(ogdVar.b);
        agdVar.g();
        agdVar.h();
        agdVar.r();
        agdVar.k(ogdVar.d);
        agdVar.n();
    }

    public static Drawable c(Drawable drawable, ogd ogdVar, Resources resources) {
        try {
            it5.a();
            if (drawable != null && ogdVar != null && ogdVar.a == ogd.a.b) {
                if (!(drawable instanceof up5)) {
                    return a(drawable, ogdVar, resources);
                }
                ub4 ub4Var = (up5) drawable;
                while (true) {
                    Object objQ = ub4Var.q();
                    if (objQ == ub4Var || !(objQ instanceof ub4)) {
                        break;
                    }
                    ub4Var = (ub4) objQ;
                }
                ub4Var.e(a(ub4Var.e(a), ogdVar, resources));
                return drawable;
            }
            return drawable;
        } finally {
            it5.a();
        }
    }

    public static Drawable d(Drawable drawable, ogd ogdVar) {
        try {
            it5.a();
            if (drawable != null && ogdVar != null && ogdVar.a == ogd.a.a) {
                kgd kgdVar = new kgd(drawable);
                b(kgdVar, ogdVar);
                kgdVar.X = ogdVar.c;
                kgdVar.invalidateSelf();
                return kgdVar;
            }
            return drawable;
        } finally {
            it5.a();
        }
    }

    public static Drawable e(Drawable drawable, dnd dndVar) {
        it5.a();
        if (drawable == null || dndVar == null) {
            it5.a();
            return drawable;
        }
        zmd zmdVar = new zmd(drawable, dndVar);
        it5.a();
        return zmdVar;
    }
}
