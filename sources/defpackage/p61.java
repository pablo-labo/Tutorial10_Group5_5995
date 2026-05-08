package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p61 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ vu5 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p61(int i, int i2, vu5 vu5Var, Object obj) {
        this.a = i2;
        this.c = vu5Var;
        this.d = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                r61.a((Function1) this.c, (svb) this.d, (b) obj, ka2.L(this.b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                jl6.a((gu5) this.c, (gu5) this.d, (b) obj, ka2.L(this.b | 1));
                break;
        }
        return j6g.a;
    }
}
