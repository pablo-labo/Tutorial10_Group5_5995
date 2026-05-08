package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yja implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yja(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                aka.b((bka) this.c, (b) obj, ka2.L(this.b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                qxb.g((gu5) this.c, (b) obj, ka2.L(this.b | 1));
                break;
        }
        return j6g.a;
    }
}
