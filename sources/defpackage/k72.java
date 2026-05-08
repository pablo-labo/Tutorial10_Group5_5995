package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.vs0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k72 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k72(v51 v51Var, u51 u51Var, e eVar, String str, String str2, int i) {
        this.e = v51Var;
        this.f = u51Var;
        this.b = eVar;
        this.d = str;
        this.V = str2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.V;
        Object obj4 = this.d;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(i2 | 1);
                l72.a((String) obj4, (List) obj6, (tjf) obj5, this.b, (Function1) obj3, (b) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(i2 | 1);
                zk5.b(this.b, (vs0.e) obj4, (vs0.l) obj6, (hl5) obj5, (ah2) obj3, (b) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = ka2.L(i2 | 1);
                e eVar = this.b;
                vr6.b((v51) obj6, (u51) obj5, eVar, (String) obj4, (String) obj3, (b) obj, iL3);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ k72(e eVar, vs0.e eVar2, vs0.l lVar, hl5 hl5Var, ah2 ah2Var, int i) {
        this.b = eVar;
        this.d = eVar2;
        this.e = lVar;
        this.f = hl5Var;
        this.V = ah2Var;
        this.c = i;
    }

    public /* synthetic */ k72(String str, List list, tjf tjfVar, e eVar, Function1 function1, int i) {
        this.d = str;
        this.e = list;
        this.f = tjfVar;
        this.b = eVar;
        this.V = function1;
        this.c = i;
    }
}
