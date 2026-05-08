package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v7d implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ int c;

    public /* synthetic */ v7d(int i, int i2, gu5 gu5Var) {
        this.a = i2;
        this.b = gu5Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b bVar = (b) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                w7d.a(this.b, bVar, ka2.L(this.c | 1));
                break;
            default:
                v9d.b(this.b, bVar, ka2.L(this.c | 1));
                break;
        }
        return j6g.a;
    }
}
