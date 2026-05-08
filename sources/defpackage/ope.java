package defpackage;

import android.view.ViewConfiguration;
import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class ope {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final yi3 a(b bVar) {
        iy3 iy3Var = (iy3) bVar.M(um2.h);
        boolean zC = bVar.c(iy3Var.getDensity());
        Object objV = bVar.v();
        if (zC || objV == b.a.a) {
            objV = new zi3(new npe(iy3Var));
            bVar.p(objV);
        }
        return (yi3) objV;
    }
}
