package defpackage;

import defpackage.eq7;
import defpackage.oq7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class br7 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ br7(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(new oq7.e(eq7.a.INSTANCE));
                break;
            default:
                this.b.invoke(null);
                break;
        }
        return j6g.a;
    }
}
