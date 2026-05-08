package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y2e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4e b;

    public /* synthetic */ y2e(j4e j4eVar, int i) {
        this.a = i;
        this.b = j4eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        j4e j4eVar = this.b;
        switch (i) {
            case 0:
                return new f3e(j4eVar);
            default:
                j4eVar.m((p2e) obj);
                return j6g.a;
        }
    }
}
