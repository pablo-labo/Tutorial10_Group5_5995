package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nb implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ b5g e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nb(String str, svb svbVar, Function1 function1, gu5 gu5Var, Function1 function12, b5g b5gVar, int i) {
        this.f = str;
        this.V = svbVar;
        this.b = function1;
        this.c = gu5Var;
        this.d = function12;
        this.e = b5gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.V;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(262145);
                vb.a((List) obj4, this.b, this.d, this.c, this.e, (hw9) obj3, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(1);
                ll4.a((String) obj4, (svb) obj3, this.b, this.c, this.d, this.e, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ nb(List list, Function1 function1, Function1 function12, gu5 gu5Var, b5g b5gVar, hw9 hw9Var, int i) {
        this.f = list;
        this.b = function1;
        this.d = function12;
        this.c = gu5Var;
        this.e = b5gVar;
        this.V = hw9Var;
    }
}
