package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ip0 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ip0(fr0 fr0Var, e eVar, int i) {
        this.d = fr0Var;
        this.b = eVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.d;
        e eVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qq0.b((fr0) obj3, eVar, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                lbb.b(eVar, (ah2) obj3, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ ip0(e eVar, ah2 ah2Var, int i) {
        this.b = eVar;
        this.d = ah2Var;
        this.c = i;
    }
}
