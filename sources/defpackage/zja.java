package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zja implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ vu5 d;

    public /* synthetic */ zja(int i, e eVar, gu5 gu5Var, int i2) {
        this.b = i;
        this.c = eVar;
        this.d = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                aka.a(this.b, (e) this.c, (gu5) this.d, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                lhb.a((mhb) this.c, (Function1) this.d, (b) obj, ka2.L(this.b | 1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ zja(mhb mhbVar, Function1 function1, int i) {
        this.c = mhbVar;
        this.d = function1;
        this.b = i;
    }
}
