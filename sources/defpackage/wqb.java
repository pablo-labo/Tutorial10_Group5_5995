package defpackage;

import androidx.compose.runtime.b;
import defpackage.rh3;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wqb implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ vu5 e;

    public /* synthetic */ wqb(Object obj, Object obj2, Object obj3, vu5 vu5Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = vu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        vu5 vu5Var = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                final sh3 sh3Var = (sh3) obj6;
                final xu5 xu5Var = (xu5) obj5;
                final xu5 xu5Var2 = (xu5) obj4;
                final Function2 function2 = (Function2) vu5Var;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    yqb.c(bh2.c(-156405985, new wu5() { // from class: xqb
                        @Override // defpackage.wu5
                        public final Object q(Object obj7, Object obj8, Object obj9) {
                            b bVar2 = (b) obj8;
                            int iIntValue2 = ((Integer) obj9).intValue();
                            ((pb2) obj7).getClass();
                            int i2 = 1;
                            if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                for (rh3 rh3Var : sh3Var.c) {
                                    boolean z = rh3Var instanceof rh3.a;
                                    xu5 xu5Var3 = xu5Var;
                                    xu5 xu5Var4 = xu5Var2;
                                    b.a.C0020a c0020a = b.a.a;
                                    if (z) {
                                        bVar2.L(2100940219);
                                        rh3.a aVar = (rh3.a) rh3Var;
                                        String str = aVar.a;
                                        boolean zK = bVar2.K(rh3Var) | bVar2.K(xu5Var3) | bVar2.K(xu5Var4);
                                        Object objV = bVar2.v();
                                        if (zK || objV == c0020a) {
                                            objV = new rg4(1, aVar, xu5Var3, xu5Var4);
                                            bVar2.p(objV);
                                        }
                                        yqb.b(48, (gu5) objV, bVar2, str, false);
                                        bVar2.F();
                                    } else if (rh3Var instanceof rh3.c) {
                                        bVar2.L(2100976290);
                                        rh3.c cVar = (rh3.c) rh3Var;
                                        String str2 = cVar.a;
                                        boolean zK2 = bVar2.K(rh3Var) | bVar2.K(xu5Var3) | bVar2.K(xu5Var4);
                                        Object objV2 = bVar2.v();
                                        if (zK2 || objV2 == c0020a) {
                                            objV2 = new v6a(i2, cVar, xu5Var3, xu5Var4);
                                            bVar2.p(objV2);
                                        }
                                        yqb.b(48, (gu5) objV2, bVar2, str2, true);
                                        bVar2.F();
                                    } else if (rh3Var instanceof rh3.d) {
                                        bVar2.L(2101013061);
                                        rh3.d dVar = (rh3.d) rh3Var;
                                        String str3 = dVar.a;
                                        Function2 function22 = function2;
                                        boolean zK3 = bVar2.K(rh3Var) | bVar2.K(function22);
                                        Object objV3 = bVar2.v();
                                        if (zK3 || objV3 == c0020a) {
                                            objV3 = new s71(5, function22, dVar);
                                            bVar2.p(objV3);
                                        }
                                        yqb.b(48, (gu5) objV3, bVar2, str3, false);
                                        bVar2.F();
                                    } else {
                                        if (!(rh3Var instanceof rh3.b)) {
                                            bVar2.L(2100939689);
                                            bVar2.F();
                                            l.g();
                                            return null;
                                        }
                                        bVar2.L(2101028749);
                                        yqb.d(((rh3.b) rh3Var).a, bVar2, 0);
                                        bVar2.F();
                                    }
                                }
                            } else {
                                bVar2.D();
                            }
                            return j6g.a;
                        }
                    }, bVar), bVar, 6);
                } else {
                    bVar.D();
                }
                break;
            default:
                List list = (List) obj6;
                List list2 = (List) obj5;
                List list3 = (List) obj4;
                gu5 gu5Var = (gu5) vu5Var;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ml1) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l3h.a(list, list2, list3, gu5Var, bVar2, 0);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
