package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i0f implements Function2<b, Integer, j6g> {
    public final /* synthetic */ ah2 V;
    public final /* synthetic */ e a;
    public final /* synthetic */ dce b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ bj1 e;
    public final /* synthetic */ float f;

    public i0f(e eVar, dce dceVar, long j, float f, bj1 bj1Var, float f2, ah2 ah2Var) {
        this.a = eVar;
        this.b = dceVar;
        this.c = j;
        this.d = f;
        this.e = bj1Var;
        this.f = f2;
        this.V = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            e eVarC = m0f.c(this.a, this.b, m0f.d(this.c, (mp4) bVar2.M(np4.a), this.d, bVar2), this.e, this.f);
            Object objV = bVar2.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new zg(10);
                bVar2.p(objV);
            }
            e eVarB = b5e.b(eVarC, false, (Function1) objV);
            j6g j6gVar = j6g.a;
            Object objV2 = bVar2.v();
            if (objV2 == c0020a) {
                objV2 = f0f.a;
                bVar2.p(objV2);
            }
            e eVarB2 = f1f.b(eVarB, j6gVar, (PointerInputEventHandler) objV2);
            ag9 ag9VarD = hl1.d(c20.a.a, true);
            int iG = bVar2.G();
            t8b t8bVarM = bVar2.m();
            e eVarC2 = c.c(bVar2, eVarB2);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            if (bVar2.j() == null) {
                pg8.B();
                throw null;
            }
            bVar2.B();
            if (bVar2.f()) {
                bVar2.y(aVar);
            } else {
                bVar2.n();
            }
            ygg.y(bVar2, ag9VarD, gl2.a.g);
            ygg.y(bVar2, t8bVarM, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                uz.g(iG, bVar2, iG, c0251a);
            }
            ygg.y(bVar2, eVarC2, gl2.a.d);
            this.V.invoke(bVar2, 0);
            bVar2.q();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
