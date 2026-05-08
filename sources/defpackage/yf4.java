package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yf4 implements Function2 {
    public final /* synthetic */ hw9 V;
    public final /* synthetic */ String W;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ gu5 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ b5g f;

    public /* synthetic */ yf4(String str, List list, List list2, Function1 function1, Function1 function12, gu5 gu5Var, Function1 function13, b5g b5gVar, hw9 hw9Var, int i) {
        this.W = str;
        this.b = list;
        this.X = list2;
        this.c = function1;
        this.e = function12;
        this.d = gu5Var;
        this.Y = function13;
        this.f = b5gVar;
        this.V = hw9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(134217729);
                eg4.a(this.W, this.b, (List) obj4, this.c, this.e, this.d, (Function1) obj3, this.f, this.V, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(2097153);
                hj4.a(this.b, (t41) obj4, this.c, this.d, this.e, this.f, this.V, this.W, (wj8) obj3, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ yf4(List list, t41 t41Var, Function1 function1, gu5 gu5Var, Function1 function12, b5g b5gVar, hw9 hw9Var, String str, wj8 wj8Var, int i) {
        this.b = list;
        this.X = t41Var;
        this.c = function1;
        this.d = gu5Var;
        this.e = function12;
        this.f = b5gVar;
        this.V = hw9Var;
        this.W = str;
        this.Y = wj8Var;
    }
}
