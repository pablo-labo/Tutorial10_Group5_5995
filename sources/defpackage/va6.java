package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class va6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ va6(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.c("launchedFromRegPromo", Boolean.valueOf(z));
                return j6g.a;
            default:
                ((m74) obj).getClass();
                return new pxb(z);
        }
    }
}
