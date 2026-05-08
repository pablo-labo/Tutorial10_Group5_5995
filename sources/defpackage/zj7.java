package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zj7 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zj7(int i, gu5 gu5Var, gu5 gu5Var2, String str) {
        this.c = str;
        this.b = gu5Var;
        this.d = gu5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 7;
        gu5 gu5Var = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ak7.b((String) obj3, gu5Var, (gu5) obj4, (b) obj, ka2.L(7));
                return j6g.a;
            case 1:
                o97 o97Var = (o97) obj3;
                svb svbVar = (svb) obj4;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, e.a.b);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ob2VarA, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    boolean zK = bVar.K(gu5Var);
                    Object objV = bVar.v();
                    if (zK || objV == b.a.a) {
                        objV = new oy(4, gu5Var);
                        bVar.p(objV);
                    }
                    uub.a((gu5) objV, false, null, null, null, bh2.c(513692818, new gh(i2, o97Var, svbVar), bVar), bVar, 196608, 30);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                u8g.a((Function1) obj4, (String) obj3, gu5Var, (b) obj, ka2.L(55));
                return j6g.a;
        }
    }

    public /* synthetic */ zj7(gu5 gu5Var, o97 o97Var, svb svbVar) {
        this.b = gu5Var;
        this.c = o97Var;
        this.d = svbVar;
    }

    public /* synthetic */ zj7(Function1 function1, String str, gu5 gu5Var, int i) {
        this.d = function1;
        this.c = str;
        this.b = gu5Var;
    }
}
