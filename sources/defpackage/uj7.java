package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uj7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ uj7(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String str = this.b;
        b bVar = (b) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vj7.i(str, bVar, ka2.L(1));
                break;
            default:
                nof.d(str, bVar, ka2.L(7));
                break;
        }
        return j6g.a;
    }
}
