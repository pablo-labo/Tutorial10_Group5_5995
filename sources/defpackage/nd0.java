package defpackage;

import androidx.compose.animation.i;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.ui.e;
import defpackage.af1;
import defpackage.c20;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class nd0 {
    public static final void a(boolean z, e eVar, final ah2 ah2Var, b bVar, final int i) {
        final boolean z2;
        final e eVar2;
        c cVarH = bVar.h(747117089);
        int i2 = (cVarH.a(z) ? 4 : 2) | i | (cVarH.K(eVar) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            mv4 mv4VarK = ku4.k(null, 3);
            af1.b bVar2 = c20.a.j;
            z2 = z;
            eVar2 = eVar;
            i.e(z2, eVar2, mv4VarK.b(ku4.c(bVar2, 13)), ku4.m(null, 3).b(ku4.i(bVar2, 13)), null, bh2.c(-898831111, new ld0(ah2Var, 0), cVarH), cVarH, (i2 & 14) | 200064 | (i2 & 112), 16);
        } else {
            z2 = z;
            eVar2 = eVar;
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z2, eVar2, ah2Var, i) { // from class: md0
                public final /* synthetic */ boolean a;
                public final /* synthetic */ e b;
                public final /* synthetic */ ah2 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(385);
                    nd0.a(this.a, this.b, this.c, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
