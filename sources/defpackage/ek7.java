package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ek7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ek7(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ik7.a((c88) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                cyb.b((gu5) obj3, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }
}
