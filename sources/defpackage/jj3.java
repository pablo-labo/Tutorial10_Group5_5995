package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jj3 implements gu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jj3(int i, g4a g4aVar) {
        this.b = i;
        this.c = g4aVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((g4a) obj).setValue(Integer.valueOf(i2));
                break;
            default:
                ((Function1) obj).invoke(Integer.valueOf(i2));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ jj3(Function1 function1, int i) {
        this.c = function1;
        this.b = i;
    }
}
