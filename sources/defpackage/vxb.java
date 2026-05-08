package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.o97;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vxb implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vxb(raa raaVar, o97 o97Var, sof sofVar) {
        this.b = raaVar;
        this.c = o97Var;
        this.d = sofVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        e eVarA;
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((yxb) obj4).e(ka2.L(55), (gu5) obj3, (b) obj, (Function1) obj5);
                break;
            case 1:
                raa raaVar = (raa) obj4;
                o97 o97Var = (o97) obj5;
                sof sofVar = (sof) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVar = e.a.b;
                    if (raaVar != null) {
                        bVar.L(-603423323);
                        o97.g gVar = o97Var.i;
                        b4g.l(f.j(eVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), raaVar.e, raaVar.b, raaVar.f, bVar, 0, 0);
                        bVar.F();
                    } else {
                        bVar.L(-603087593);
                        String str = sofVar != null ? sofVar.a : null;
                        if (str == null) {
                            bVar.L(-603048751);
                            bVar.F();
                        } else {
                            bVar.L(-603048750);
                            tjf tjfVarA = tjf.a(o97Var.j.f, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211);
                            long j = o97Var.c.a.c;
                            String str2 = sofVar.d;
                            if (str2 != null && (eVarA = androidx.compose.ui.platform.f.a(eVar, str2)) != null) {
                                eVar = eVarA;
                            }
                            boolean zK = bVar.K(sofVar);
                            Object objV = bVar.v();
                            if (zK || objV == b.a.a) {
                                objV = new a3(sofVar, 25);
                                bVar.p(objV);
                            }
                            cif.b(str, b5e.b(eVar, false, (Function1) objV), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarA, bVar, 0, 0, 65528);
                            bVar = bVar;
                            bVar.F();
                            j6g j6gVar = j6g.a;
                        }
                        bVar.F();
                    }
                } else {
                    bVar.D();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                mfg.a((Function1) obj5, (String) obj4, (gu5) obj3, (b) obj, ka2.L(7));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ vxb(yxb yxbVar, Function1 function1, gu5 gu5Var, int i) {
        this.b = yxbVar;
        this.c = function1;
        this.d = gu5Var;
    }

    public /* synthetic */ vxb(Function1 function1, String str, gu5 gu5Var, int i) {
        this.c = function1;
        this.b = str;
        this.d = gu5Var;
    }
}
