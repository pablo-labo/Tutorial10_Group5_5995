package androidx.compose.foundation.layout;

import defpackage.iy3;
import defpackage.lh7;
import defpackage.w31;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, Function1<? super iy3, lh7> function1) {
        return eVar.o(new OffsetPxElement(function1, new w31(function1, 2)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [qoa] */
    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, final float f, final float f2) {
        return eVar.o(new OffsetElement(f, f2, new Function1() { // from class: qoa
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wf7 wf7Var = (wf7) obj;
                wf7Var.getClass();
                llg llgVar = wf7Var.a;
                llgVar.b(new j94(f), "x");
                llgVar.b(new j94(f2), "y");
                return j6g.a;
            }
        }));
    }

    public static androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return b(eVar, f, f2);
    }
}
