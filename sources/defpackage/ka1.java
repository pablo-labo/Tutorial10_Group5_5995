package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ka1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ka1(gu5 gu5Var, String str, List list, String str2, int i) {
        this.c = gu5Var;
        this.d = str;
        this.f = list;
        this.e = str2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                la1.a((gu5) obj6, (String) obj5, (List) obj3, (String) obj4, (b) obj, ka2.L(this.b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                z5f.e((p5f) obj6, this.b, (Function1) obj5, (e13) obj4, (e2b) obj3, (b) obj, iL);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ ka1(p5f p5fVar, int i, Function1 function1, e13 e13Var, e2b e2bVar, int i2) {
        this.c = p5fVar;
        this.b = i;
        this.d = function1;
        this.e = e13Var;
        this.f = e2bVar;
    }
}
