package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wf implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wf(pif pifVar, Object[] objArr, Function1 function1, int i) {
        this.d = pifVar;
        this.e = objArr;
        this.b = function1;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Function1<? super gcf, j6g> function1 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xf.b(function1, (ig3) obj3, (Function1) obj4, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((pif) obj4).b((Object[]) obj3, function1, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ wf(Function1 function1, ig3 ig3Var, Function1 function12, int i) {
        this.b = function1;
        this.e = ig3Var;
        this.d = function12;
        this.c = i;
    }
}
