package androidx.compose.foundation.layout;

import defpackage.cd;
import defpackage.gza;
import defpackage.hza;
import defpackage.vl8;
import defpackage.wa;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static hza a(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new hza(f, f2, f, f2);
    }

    public static hza b(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new hza(f, f2, f3, f4);
    }

    public static final float c(gza gzaVar, vl8 vl8Var) {
        return vl8Var == vl8.a ? gzaVar.c(vl8Var) : gzaVar.b(vl8Var);
    }

    public static final float d(gza gzaVar, vl8 vl8Var) {
        return vl8Var == vl8.a ? gzaVar.b(vl8Var) : gzaVar.c(vl8Var);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, gza gzaVar) {
        return eVar.o(new PaddingValuesElement(gzaVar, new cd(gzaVar, 12)));
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, float f) {
        return eVar.o(new PaddingElement(f, f, f, f, new wa(13)));
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, final float f, final float f2) {
        return eVar.o(new PaddingElement(f, f2, f, f2, new Function1() { // from class: eza
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wf7 wf7Var = (wf7) obj;
                wf7Var.getClass();
                llg llgVar = wf7Var.a;
                llgVar.b(new j94(f), "horizontal");
                llgVar.b(new j94(f2), "vertical");
                return j6g.a;
            }
        }));
    }

    public static androidx.compose.ui.e h(androidx.compose.ui.e eVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return g(eVar, f, f2);
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, final float f, final float f2, final float f3, final float f4) {
        return eVar.o(new PaddingElement(f, f2, f3, f4, new Function1() { // from class: dza
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wf7 wf7Var = (wf7) obj;
                wf7Var.getClass();
                llg llgVar = wf7Var.a;
                llgVar.b(new j94(f), "start");
                llgVar.b(new j94(f2), "top");
                llgVar.b(new j94(f3), "end");
                llgVar.b(new j94(f4), "bottom");
                return j6g.a;
            }
        }));
    }

    public static androidx.compose.ui.e j(androidx.compose.ui.e eVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return i(eVar, f, f2, f3, f4);
    }
}
