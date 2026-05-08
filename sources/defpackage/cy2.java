package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cy2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ cy2(e eVar, int i, int i2) {
        this.a = i2;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b bVar = (b) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                dy2.a(this.b, bVar, ka2.L(1));
                break;
            default:
                az4.a(this.b, bVar, ka2.L(1));
                break;
        }
        return j6g.a;
    }
}
