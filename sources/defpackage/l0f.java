package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class l0f {
    public static final ne4 a = new ne4(a.a);

    public static final class a extends mj8 implements gu5<j94> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final /* synthetic */ j94 invoke() {
            return new j94(0.0f);
        }
    }

    public static final void a(e eVar, dce dceVar, long j, long j2, float f, float f2, bj1 bj1Var, ah2 ah2Var, b bVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            eVar = e.a.b;
        }
        if ((i2 & 2) != 0) {
            dceVar = ytc.a;
        }
        if ((i2 & 4) != 0) {
            j = ((qa2) bVar.M(sa2.a)).p;
        }
        if ((i2 & 8) != 0) {
            j2 = sa2.b(j, bVar);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            bj1Var = null;
        }
        ne4 ne4Var = a;
        float f3 = f + ((j94) bVar.M(ne4Var)).a;
        rm2.b(new i6c[]{qs2.a.a(new da2(j2)), ne4Var.a(new j94(f3))}, bh2.c(-70914509, new h0f(eVar, dceVar, j, f3, bj1Var, f2, ah2Var), bVar), bVar, 56);
    }

    public static final void b(float f, int i, int i2, long j, long j2, bj1 bj1Var, ah2 ah2Var, gu5 gu5Var, d3a d3aVar, dce dceVar, b bVar, e eVar, boolean z) {
        float f2 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 0.0f : f;
        bj1 bj1Var2 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : bj1Var;
        ne4 ne4Var = a;
        float f3 = ((j94) bVar.M(ne4Var)).a + 0.0f;
        rm2.b(new i6c[]{qs2.a.a(new da2(j2)), ne4Var.a(new j94(f3))}, bh2.c(1279702876, new j0f(f3, f2, j, bj1Var2, ah2Var, gu5Var, d3aVar, dceVar, eVar, z), bVar), bVar, 56);
    }

    public static final e c(e eVar, dce dceVar, long j, bj1 bj1Var, float f) {
        dce dceVar2;
        e eVarB;
        e eVarB2 = e.a.b;
        if (f > 0.0f) {
            dceVar2 = dceVar;
            eVarB = androidx.compose.ui.graphics.a.b(eVarB2, 0.0f, 0.0f, 0.0f, f, dceVar2, 124895);
        } else {
            dceVar2 = dceVar;
            eVarB = eVarB2;
        }
        e eVarO = eVar.o(eVarB);
        if (bj1Var != null) {
            eVarB2 = ti1.b(eVarB2, bj1Var.a, bj1Var.b, dceVar2);
        }
        return ygg.h(androidx.compose.foundation.a.b(eVarO.o(eVarB2), j, dceVar2), dceVar2);
    }

    public static final long d(long j, float f, b bVar) {
        qa2 qa2Var = (qa2) bVar.M(sa2.a);
        boolean zBooleanValue = ((Boolean) bVar.M(sa2.b)).booleanValue();
        long j2 = qa2Var.p;
        if (!da2.c(j, j2) || !zBooleanValue) {
            return j;
        }
        if (j94.c(f, 0.0f)) {
            return j2;
        }
        return pnb.x(da2.b(qa2Var.t, ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f), j2);
    }
}
