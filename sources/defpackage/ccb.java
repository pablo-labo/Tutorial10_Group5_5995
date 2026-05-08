package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@sy3
public final class ccb implements pa7 {
    public final boolean a;
    public final float b;
    public final g4a c;

    public ccb() {
        throw null;
    }

    public ccb(boolean z, float f, g4a g4aVar) {
        this.a = z;
        this.b = f;
        this.c = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pa7
    @sy3
    public final qa7 b(ei7 ei7Var, b bVar) {
        long jA;
        bVar.L(988743187);
        wdd wddVar = (wdd) bVar.M(xdd.a);
        g4a g4aVar = this.c;
        if (((da2) g4aVar.getValue()).a != 16) {
            bVar.L(-303557454);
            bVar.F();
            jA = ((da2) g4aVar.getValue()).a;
        } else {
            bVar.L(-303499670);
            jA = wddVar.a(bVar);
            bVar.F();
        }
        g4a g4aVarG = r.g(new da2(jA), bVar);
        g4a g4aVarG2 = r.g(wddVar.b(bVar), bVar);
        bVar.L(331259447);
        ViewGroup viewGroupD = web.d((View) bVar.M(AndroidCompositionLocals_androidKt.f));
        boolean zK = ((((458752 & 0) ^ 196608) > 131072 && bVar.K(this)) || (0 & 196608) == 131072) | ((((0 & 14) ^ 6) > 4 && bVar.K(ei7Var)) || (0 & 6) == 4) | bVar.K(viewGroupD);
        Object objV = bVar.v();
        Object obj = b.a.a;
        if (zK || objV == obj) {
            Object l90Var = new l90(this.a, this.b, g4aVarG, g4aVarG2, viewGroupD);
            bVar.p(l90Var);
            objV = l90Var;
        }
        l90 l90Var2 = (l90) objV;
        bVar.F();
        boolean zK2 = bVar.K(ei7Var) | bVar.x(l90Var2);
        Object objV2 = bVar.v();
        if (zK2 || objV2 == obj) {
            objV2 = new hdd(ei7Var, l90Var2, null);
            bVar.p(objV2);
        }
        to4.f(l90Var2, ei7Var, (Function2) objV2, bVar);
        bVar.F();
        return l90Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccb)) {
            return false;
        }
        ccb ccbVar = (ccb) obj;
        return this.a == ccbVar.a && j94.c(this.b, ccbVar.b) && wl7.b(this.c, ccbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k6.c(Boolean.hashCode(this.a) * 31, this.b, 31);
    }
}
