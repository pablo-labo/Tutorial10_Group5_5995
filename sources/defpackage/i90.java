package defpackage;

import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import defpackage.q55;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i90 {
    public final xqc a;
    public final eg6 b;

    public i90(xqc xqcVar, la0 la0Var) {
        eg6 nn2Var;
        this.a = xqcVar;
        if (fg6.a) {
            nn2Var = new z37(false);
        } else {
            int i = Build.VERSION.SDK_INT;
            nn2Var = (i == 26 || i == 27) ? new nn2(19) : new z37(true);
        }
        this.b = nn2Var;
    }

    public static kv8 a(w27 w27Var) {
        z9f z9fVar = w27Var.c;
        Object context = z9fVar instanceof yrg ? ((yrg) z9fVar).b().getContext() : w27Var.a;
        while (!(context instanceof zv8)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((zv8) context).getLifecycle();
    }

    public static boolean b(w27 w27Var, Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            if (!((Boolean) r55.a(w27Var, z27.h)).booleanValue()) {
                return false;
            }
            z9f z9fVar = w27Var.c;
            if (z9fVar instanceof yrg) {
                View viewB = ((yrg) z9fVar).b();
                if (viewB.isAttachedToWindow() && !viewB.isHardwareAccelerated()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.nva c(defpackage.w27 r19, defpackage.iie r20) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i90.c(w27, iie):nva");
    }

    public final nva d(nva nvaVar) {
        boolean z;
        q55 q55Var = nvaVar.j;
        q55.b<Bitmap.Config> bVar = z27.c;
        if (((Bitmap.Config) r55.b(nvaVar, bVar)) != Bitmap.Config.HARDWARE || this.b.b()) {
            z = false;
        } else {
            q55Var.getClass();
            LinkedHashMap linkedHashMapI0 = lc9.i0(q55Var.a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapI0.put(bVar, config);
            } else {
                linkedHashMapI0.remove(bVar);
            }
            q55Var = new q55(aa2.b(linkedHashMapI0));
            z = true;
        }
        return z ? new nva(nvaVar.a, nvaVar.b, nvaVar.c, nvaVar.d, nvaVar.e, nvaVar.f, nvaVar.g, nvaVar.h, nvaVar.i, q55Var) : nvaVar;
    }
}
