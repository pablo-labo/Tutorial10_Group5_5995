package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dsb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1c b;

    public /* synthetic */ dsb(x1c x1cVar, int i) {
        this.a = i;
        this.b = x1cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        x1c x1cVar = this.b;
        switch (i) {
            case 0:
                ms7 ms7Var = (ms7) obj;
                ms7Var.getClass();
                int iOrdinal = ms7Var.ordinal();
                if (iOrdinal == 0) {
                    x1cVar.u();
                } else if (iOrdinal == 1 || iOrdinal == 2) {
                    x1cVar.t();
                } else {
                    l.g();
                }
                break;
            default:
                x1cVar.z(((Long) obj).longValue());
                break;
        }
        return j6g.a;
    }
}
