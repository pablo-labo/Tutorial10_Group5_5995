package defpackage;

import android.graphics.Typeface;
import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public final class k51 implements xcb {
    public static Typeface a(String str, to5 to5Var, int i) {
        if (i == 0 && wl7.b(to5Var, to5.b0) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), to5Var.a, i == 1);
    }

    public static void b(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    @Override // defpackage.xcb
    public Typeface c(dz5 dz5Var, to5 to5Var, int i) {
        return a(dz5Var.f, to5Var, i);
    }

    @Override // defpackage.xcb
    public Typeface d(int i, to5 to5Var) {
        return a(null, to5Var, i);
    }
}
