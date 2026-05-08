package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.vs0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qi implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qi(e eVar, ss8 ss8Var, gza gzaVar, vs0.l lVar, c20.b bVar, nh5 nh5Var, boolean z, Function1 function1, int i) {
        this.d = eVar;
        this.e = ss8Var;
        this.f = gzaVar;
        this.V = lVar;
        this.W = bVar;
        this.X = nh5Var;
        this.b = z;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.X;
        Object obj4 = this.W;
        Object obj5 = this.V;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(16777217);
                mj.a(this.b, (go4) obj8, this.c, (gu5) obj7, (t41) obj6, (List) obj5, (b5g) obj4, (hw9) obj3, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(1);
                hn8.a((e) obj8, (ss8) obj7, (gza) obj6, (vs0.l) obj5, (c20.b) obj4, (nh5) obj3, this.b, this.c, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ qi(boolean z, go4 go4Var, Function1 function1, gu5 gu5Var, t41 t41Var, List list, b5g b5gVar, hw9 hw9Var, int i) {
        this.b = z;
        this.d = go4Var;
        this.c = function1;
        this.e = gu5Var;
        this.f = t41Var;
        this.V = list;
        this.W = b5gVar;
        this.X = hw9Var;
    }
}
