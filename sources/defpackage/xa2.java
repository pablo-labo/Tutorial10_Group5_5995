package defpackage;

import android.graphics.ColorSpace;

/* JADX INFO: loaded from: classes.dex */
public final class xa2 {
    public static final ColorSpace a(ta2 ta2Var) {
        if (wl7.b(ta2Var, ya2.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (wl7.b(ta2Var, ya2.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
