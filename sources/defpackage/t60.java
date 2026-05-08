package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t60 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t60(yxb yxbVar, int i) {
        this.c = yxbVar;
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
                y60.b((e) obj3, (b) obj, ka2.L(1), i2);
                break;
            default:
                ((Integer) obj2).getClass();
                ((yxb) obj3).a(ka2.L(i2 | 1), (b) obj);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ t60(e eVar, int i, int i2) {
        this.c = eVar;
        this.b = i2;
    }
}
