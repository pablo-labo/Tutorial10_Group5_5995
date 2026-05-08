package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kr2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1c b;

    public /* synthetic */ kr2(x1c x1cVar, int i) {
        this.a = i;
        this.b = x1cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        x1c x1cVar = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                x1cVar.F(str);
                break;
            default:
                x1cVar.z(((Long) obj).longValue());
                break;
        }
        return j6g.a;
    }
}
