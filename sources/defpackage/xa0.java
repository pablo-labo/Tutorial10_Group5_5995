package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xa0 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xa0(e eVar, ah2 ah2Var, int i) {
        this.b = eVar;
        this.d = ah2Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        e eVar = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ab0.b(eVar, (ah2) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                gz9.d((List) obj3, eVar, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ xa0(List list, e eVar, int i) {
        this.d = list;
        this.b = eVar;
        this.c = i;
    }
}
