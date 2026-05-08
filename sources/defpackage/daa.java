package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class daa implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ vu5 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ daa(Object obj, Object obj2, vu5 vu5Var, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = vu5Var;
        this.f = obj3;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.f;
        vu5 vu5Var = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((faa) obj5).f((String) obj4, (Function1) vu5Var, (ah2) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                erb.a(ka2.L(i2 | 1), (gu5) obj5, (gu5) obj4, (gu5) vu5Var, (jrb) obj3, (b) obj);
                break;
        }
        return j6g.a;
    }
}
