package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class jl5 implements fhd, il5 {
    public static final jl5 a = new jl5();

    @Override // defpackage.fhd
    public final e a(e eVar, float f) {
        if (f <= 0.0d) {
            yd7.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return eVar.o(new LayoutWeightElement(f, true));
    }
}
