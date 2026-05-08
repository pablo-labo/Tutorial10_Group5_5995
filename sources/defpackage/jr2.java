package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jr2 implements Function2 {
    public final /* synthetic */ vu5 V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ vu5 f;

    public /* synthetic */ jr2(x1c x1cVar, gu5 gu5Var, gu5 gu5Var2, List list, t41 t41Var, gu5 gu5Var3, gu5 gu5Var4, gu5 gu5Var5, gu5 gu5Var6, int i) {
        this.c = x1cVar;
        this.d = gu5Var;
        this.e = gu5Var2;
        this.b = list;
        this.Y = t41Var;
        this.f = gu5Var3;
        this.V = gu5Var4;
        this.W = gu5Var5;
        this.X = gu5Var6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.W;
        vu5 vu5Var = this.V;
        vu5 vu5Var2 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                pr2.a((x1c) obj8, (gu5) obj7, (gu5) obj6, this.b, (t41) obj3, (gu5) vu5Var2, (gu5) vu5Var, (gu5) obj5, (gu5) obj4, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(1);
                ym7.c(this.b, (ss8) obj8, (e8a) obj7, (bn7) obj6, (Function1) vu5Var2, (Function1) vu5Var, (String) obj5, (String) obj4, (Function1) obj3, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ jr2(List list, ss8 ss8Var, e8a e8aVar, bn7 bn7Var, Function1 function1, Function1 function12, String str, String str2, Function1 function13, int i) {
        this.b = list;
        this.c = ss8Var;
        this.d = e8aVar;
        this.e = bn7Var;
        this.f = function1;
        this.V = function12;
        this.W = str;
        this.X = str2;
        this.Y = function13;
    }
}
