package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f23 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f23(svb svbVar, Function1 function1, o97 o97Var) {
        this.c = svbVar;
        this.b = function1;
        this.d = o97Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Function1 function1 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                g23.a(function1, (z13) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                break;
            default:
                svb svbVar = (svb) obj4;
                o97 o97Var = (o97) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    for (p6c p6cVar : svbVar.n) {
                        String str = p6cVar.d;
                        if (str == null || zve.U(str)) {
                            bVar.L(-1075659776);
                        } else {
                            bVar.L(-1073533889);
                            boolean zK = bVar.K(function1) | bVar.K(p6cVar);
                            Object objV = bVar.v();
                            if (zK || objV == b.a.a) {
                                objV = new as(18, function1, p6cVar);
                                bVar.p(objV);
                            }
                            uub.a((gu5) objV, false, null, null, null, bh2.c(-674287700, new jh(8, p6cVar, o97Var), bVar), bVar, 196608, 30);
                        }
                        bVar.F();
                    }
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ f23(Function1 function1, z13 z13Var, gu5 gu5Var, int i) {
        this.b = function1;
        this.c = z13Var;
        this.d = gu5Var;
    }
}
