package defpackage;

import androidx.compose.runtime.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nt9 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nt9(hw9 hw9Var, String str, ArrayList arrayList, ah2 ah2Var, int i) {
        this.a = 1;
        this.b = hw9Var;
        this.c = str;
        this.d = arrayList;
        this.e = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 2;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                List<it9> list = (List) obj6;
                Function1 function1 = (Function1) obj5;
                o97 o97Var = (o97) obj4;
                Locale locale = (Locale) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    for (it9 it9Var : list) {
                        boolean zK = bVar.K(function1) | bVar.K(it9Var);
                        Object objV = bVar.v();
                        if (zK || objV == b.a.a) {
                            objV = new rr(10, function1, it9Var);
                            bVar.p(objV);
                        }
                        uub.a((gu5) objV, false, null, null, null, bh2.c(-1110390922, new lz1(it9Var, o97Var, locale, i2), bVar), bVar, 196608, 30);
                    }
                } else {
                    bVar.D();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                wja.a((hw9) obj6, (String) obj5, (ArrayList) obj4, (ah2) obj3, (b) obj, ka2.L(3081));
                break;
            case 2:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj6;
                k38 k38Var = (k38) obj5;
                Function2 function2 = (Function2) obj4;
                Locale locale2 = (Locale) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    List list2 = (List) linkedHashMap.get(k38Var);
                    if (list2 == null) {
                        bVar2.L(1117834910);
                    } else {
                        bVar2.L(1117834911);
                        qxb.f(list2, function2, locale2, bVar2, 0);
                    }
                    bVar2.F();
                } else {
                    bVar2.D();
                }
                break;
            default:
                x1e x1eVar = (x1e) obj6;
                gu5 gu5Var = (gu5) obj5;
                jta jtaVar = (jta) obj4;
                gu5 gu5Var2 = (gu5) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    bVar3.D();
                } else if (x1eVar.e && x1eVar.a == null) {
                    bVar3.L(-172163111);
                    cx2.a(gu5Var, bVar3, 0);
                    bVar3.F();
                } else {
                    bVar3.L(-172055417);
                    ax2.a(x1eVar, jtaVar, gu5Var, gu5Var2, bVar3, 0);
                    bVar3.F();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ nt9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
