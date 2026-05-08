package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public final class irc {
    public static final j74 a(w27 w27Var, yr3 yr3Var) {
        z9f z9fVar = w27Var.c;
        if (!(z9fVar instanceof yrg)) {
            return new hc0(yr3Var);
        }
        View viewB = ((yrg) z9fVar).b();
        Object tag = viewB.getTag(R.id.coil3_request_manager);
        csg csgVar = tag instanceof csg ? (csg) tag : null;
        if (csgVar == null) {
            synchronized (viewB) {
                try {
                    Object tag2 = viewB.getTag(R.id.coil3_request_manager);
                    csgVar = tag2 instanceof csg ? (csg) tag2 : null;
                    if (csgVar == null) {
                        csgVar = new csg(viewB);
                        viewB.addOnAttachStateChangeListener(csgVar);
                        viewB.setTag(R.id.coil3_request_manager, csgVar);
                    }
                } finally {
                }
            }
        }
        synchronized (csgVar) {
            zrg zrgVar = csgVar.b;
            if (zrgVar != null) {
                Bitmap.Config[] configArr = ukg.a;
                if (wl7.b(Looper.myLooper(), Looper.getMainLooper()) && csgVar.e) {
                    csgVar.e = false;
                    zrgVar.c = yr3Var;
                    return zrgVar;
                }
            }
            uqe uqeVar = csgVar.c;
            if (uqeVar != null) {
                uqeVar.h(null);
            }
            csgVar.c = null;
            zrg zrgVar2 = new zrg(csgVar.a, yr3Var);
            csgVar.b = zrgVar2;
            return zrgVar2;
        }
    }
}
