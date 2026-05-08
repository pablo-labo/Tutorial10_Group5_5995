package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iz1 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ iz1(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(null);
                break;
            case 1:
                this.b.invoke(new jhf("", 0L, 6));
                break;
            case 2:
                this.b.invoke(null);
                break;
            default:
                this.b.invoke("MaybeNextTime");
                break;
        }
        return j6g.a;
    }
}
