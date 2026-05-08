package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class go0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ String c;

    public /* synthetic */ go0(e eVar, String str, int i, int i2) {
        this.a = i2;
        this.b = eVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String str = this.c;
        e eVar = this.b;
        b bVar = (b) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ho0.a(ka2.L(7), bVar, eVar, str);
                break;
            default:
                s7b.c(ka2.L(1), bVar, eVar, str);
                break;
        }
        return j6g.a;
    }
}
