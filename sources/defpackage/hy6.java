package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class hy6 implements wu5<pb2, b, Integer, j6g> {
    public final /* synthetic */ g4a<Boolean> V;
    public final /* synthetic */ o97 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dy6 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ to5 f;

    public hy6(o97 o97Var, boolean z, dy6 dy6Var, long j, String str, to5 to5Var, g4a<Boolean> g4aVar) {
        this.a = o97Var;
        this.b = z;
        this.c = dy6Var;
        this.d = j;
        this.e = str;
        this.f = to5Var;
        this.V = g4aVar;
    }

    @Override // defpackage.wu5
    public final j6g q(pb2 pb2Var, b bVar, Integer num) {
        b bVar2;
        b bVar3 = bVar;
        int iIntValue = num.intValue();
        pb2Var.getClass();
        if ((iIntValue & 17) == 16 && bVar3.i()) {
            bVar3.D();
        } else {
            vs0.i iVar = new vs0.i(4.0f, true, new us0(0));
            e.a aVar = e.a.b;
            e eVarV = g.v(g.d(aVar, 1.0f), c20.a.e, 2);
            ob2 ob2VarA = mb2.a(iVar, c20.a.n, bVar3, 48);
            int iHashCode = Long.hashCode(bVar3.k());
            t8b t8bVarM = bVar3.m();
            e eVarC = c.c(bVar3, eVarV);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            if (bVar3.j() == null) {
                pg8.B();
                throw null;
            }
            bVar3.B();
            if (bVar3.f()) {
                bVar3.y(aVar2);
            } else {
                bVar3.n();
            }
            ygg.y(bVar3, ob2VarA, gl2.a.g);
            ygg.y(bVar3, t8bVarM, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                uz.g(iHashCode, bVar3, iHashCode, c0251a);
            }
            ygg.y(bVar3, eVarC, gl2.a.d);
            boolean z = this.b;
            dy6 dy6Var = this.c;
            fv6 fv6Var = z ? dy6Var.c : dy6Var.b;
            ar6 ar6Var = z ? dy6Var.e : dy6Var.d;
            String str = this.e;
            String strConcat = str.concat("_Icon");
            long j = this.d;
            ev6.b(fv6Var, null, ar6Var, null, j, strConcat, bVar3, 0, 10);
            bVar3.L(1076754732);
            g4a<Boolean> g4aVar = this.V;
            if (g4aVar.getValue().booleanValue()) {
                String str2 = dy6Var.a;
                e eVarA = f.a(g.s(aVar, 48.0f, 84.0f), str.concat("_Label"));
                tjf tjfVarA = tjf.a(this.a.j.h, 0L, 0L, this.f, null, null, 0L, 0, 0L, null, null, 0, 16777211);
                dcf dcfVar = new dcf(3);
                bVar3.L(5004770);
                Object objV = bVar3.v();
                if (objV == b.a.a) {
                    objV = new uq(3, g4aVar);
                    bVar3.p(objV);
                }
                bVar3.F();
                bVar2 = bVar3;
                cif.b(str2, eVarA, j, 0L, null, null, null, 0L, null, dcfVar, 0L, 0, false, 1, 0, (Function1) objV, tjfVarA, bVar2, 0, 200064, 19960);
            } else {
                bVar2 = bVar3;
            }
            bVar2.F();
            bVar2.q();
        }
        return j6g.a;
    }
}
