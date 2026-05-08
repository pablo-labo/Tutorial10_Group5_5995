package defpackage;

import androidx.compose.runtime.b;
import defpackage.tq6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class of9 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Enum e;

    public /* synthetic */ of9(int i, gu5 gu5Var, Function1 function1, b5g b5gVar, int i2) {
        this.b = i;
        this.c = gu5Var;
        this.d = function1;
        this.e = b5gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                qf9.a(this.b, (gu5) this.c, (Function1) this.d, (b5g) this.e, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                u4f.b((tq6.c) this.c, (da2) this.d, (tq6.d) this.e, (b) obj, ka2.L(this.b | 1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ of9(tq6.c cVar, da2 da2Var, tq6.d dVar, int i) {
        this.c = cVar;
        this.d = da2Var;
        this.e = dVar;
        this.b = i;
    }
}
