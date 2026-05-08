package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ol4 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ol4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                f68 f68Var = (f68) obj6;
                Function1 function1 = (Function1) obj5;
                g4a g4aVar = (g4a) obj4;
                b bVar = (b) obj2;
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                bVar.L(-315045815);
                f68.a.getClass();
                f68[] f68VarArr = (f68[]) u63.a0(f68.c, f68.d, f68.e, f68.f, f68.V, f68.W).toArray(new f68[0]);
                ArrayList<f68> arrayList = new ArrayList();
                for (f68 f68Var2 : f68VarArr) {
                    if (!u63.a0(f68.X.a(), f68.f.a()).contains(f68Var2.a())) {
                        arrayList.add(f68Var2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                for (f68 f68Var3 : arrayList) {
                    boolean z = f68Var3 == f68Var;
                    String strI = ak2.I(olb.c(f68Var3), bVar);
                    boolean zK = bVar.K(function1) | bVar.d(f68Var3.ordinal());
                    Object objV = bVar.v();
                    if (zK || objV == c0020a) {
                        objV = new jn1(1, function1, f68Var3, g4aVar);
                        bVar.p(objV);
                    }
                    arrayList2.add(new ax6(strI, (gu5) objV, z ? fv6.A1 : null, z, false, 484));
                }
                bVar.F();
                Object objV2 = bVar.v();
                if (objV2 == c0020a) {
                    objV2 = new lg4(2, g4aVar);
                    bVar.p(objV2);
                }
                z60.a((gu5) objV2, null, bh2.c(172339957, new ok4(arrayList2, i2), bVar), bVar, 390, 2);
                break;
            default:
                g gVar = (g) obj6;
                vsb vsbVar = (vsb) obj5;
                wu5 wu5Var = (wu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zX = bVar2.x(gVar) | bVar2.x(vsbVar) | bVar2.K(wu5Var);
                    Object objV3 = bVar2.v();
                    if (zX || objV3 == c0020a) {
                        objV3 = new a67(2, gVar, vsbVar, wu5Var);
                        bVar2.p(objV3);
                    }
                    q1c.c(48, (gu5) objV3, bVar2, "Review Work Area Suggestion", true);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
