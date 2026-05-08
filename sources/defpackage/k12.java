package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k12 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ int c;

    public /* synthetic */ k12(int i, int i2, gu5 gu5Var) {
        this.a = i2;
        this.b = gu5Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                m12.a(this.b, bVar, ka2.L(this.c | 1));
                break;
            default:
                num.intValue();
                aad.b(this.b, bVar, ka2.L(this.c | 1));
                break;
        }
        return j6g.a;
    }
}
