package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ns4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ns4(Object obj, int i, int i2) {
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
                os4.b((ks4) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                bma.b((gu5) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((yxb) obj3).c(ka2.L(i2 | 1), (b) obj);
                break;
        }
        return j6g.a;
    }
}
