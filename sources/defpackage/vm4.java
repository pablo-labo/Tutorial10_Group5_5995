package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vm4 implements Function2 {
    public final /* synthetic */ gu5 V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object a0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object b0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ vu5 c0;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ wu5 e;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ List f;
    public final /* synthetic */ Object f0;

    public /* synthetic */ vm4(String str, gu5 gu5Var, gu5 gu5Var2, wu5 wu5Var, Function2 function2, zie zieVar, zie zieVar2, List list, String str2, Integer num, gu5 gu5Var3, Function1 function1, b5g b5gVar, boolean z, x73 x73Var, Function1 function12, int i) {
        this.b = str;
        this.V = gu5Var;
        this.W = gu5Var2;
        this.e = wu5Var;
        this.Y = function2;
        this.Z = zieVar;
        this.a0 = zieVar2;
        this.f = list;
        this.d = str2;
        this.b0 = num;
        this.X = gu5Var3;
        this.c0 = function1;
        this.e0 = b5gVar;
        this.c = z;
        this.f0 = x73Var;
        this.d0 = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f0;
        Object obj4 = this.e0;
        Object obj5 = this.d0;
        vu5 vu5Var = this.c0;
        Object obj6 = this.b0;
        Object obj7 = this.a0;
        Object obj8 = this.Z;
        Object obj9 = this.Y;
        Object obj10 = this.X;
        Object obj11 = this.W;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                hn4.b(this.b, this.V, (gu5) obj11, this.e, (Function2) obj9, (zie) obj8, (zie) obj7, this.f, this.d, (Integer) obj6, (gu5) obj10, (Function1) vu5Var, (b5g) obj4, this.c, (x73) obj3, (Function1) obj5, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(49);
                hr9.b(this.b, this.c, this.d, (Float) obj11, (String) obj10, this.e, (String) obj9, (String) obj8, (String) obj7, this.f, (List) obj6, this.V, (wu5) vu5Var, (bj1) obj5, (fgd) obj4, (e) obj3, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ vm4(String str, boolean z, String str2, Float f, String str3, wu5 wu5Var, String str4, String str5, String str6, List list, List list2, gu5 gu5Var, wu5 wu5Var2, bj1 bj1Var, fgd fgdVar, e eVar, int i) {
        this.b = str;
        this.c = z;
        this.d = str2;
        this.W = f;
        this.X = str3;
        this.e = wu5Var;
        this.Y = str4;
        this.Z = str5;
        this.a0 = str6;
        this.f = list;
        this.b0 = list2;
        this.V = gu5Var;
        this.c0 = wu5Var2;
        this.d0 = bj1Var;
        this.e0 = fgdVar;
        this.f0 = eVar;
    }
}
