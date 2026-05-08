package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;
import defpackage.gs7;
import defpackage.ys7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k1c implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ vu5 d;

    public /* synthetic */ k1c(int i, vu5 vu5Var, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = vu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        vu5 vu5Var = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        int i2 = 1;
        byte b = 0;
        switch (i) {
            case 0:
                final g gVar = (g) obj5;
                final vsb vsbVar = (vsb) obj4;
                final wu5 wu5Var = (wu5) vu5Var;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zX = bVar.x(gVar) | bVar.x(vsbVar) | bVar.K(wu5Var);
                    Object objV = bVar.v();
                    if (zX || objV == b.a.a) {
                        objV = new gu5() { // from class: xyb
                            @Override // defpackage.gu5
                            public final Object invoke() {
                                List<sjb> list;
                                sjb sjbVar;
                                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                                lr5 lr5VarU = gVar.u();
                                lr5VarU.getClass();
                                g4h g4hVar = vsbVar.n;
                                vr7Var.a(lr5VarU, new gs7.i(new ys7((g4hVar == null || (list = g4hVar.c) == null || (sjbVar = list.get(0)) == null) ? null : pi3.k(new ys7.a(sjbVar.a, sjbVar.b))), new wzb(wu5Var, 0)));
                                return j6g.a;
                            }
                        };
                        bVar.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar, "Review Work Well Being Suggestion", true);
                } else {
                    bVar.D();
                }
                break;
            default:
                gu5 gu5Var = (gu5) obj5;
                gu5 gu5Var2 = (gu5) obj4;
                gu5 gu5Var3 = (gu5) vu5Var;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q9f.f(bh2.c(1761367272, new ema(gu5Var, i2), bVar2), bVar2, 6);
                    q9f.b(0, bVar2);
                    q9f.f(bh2.c(1794032799, new grb(3, gu5Var2), bVar2), bVar2, 6);
                    q9f.b(0, bVar2);
                    q9f.f(bh2.c(-1611970784, new f9f(b == true ? 1 : 0, gu5Var3), bVar2), bVar2, 6);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
