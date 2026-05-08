package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nj4 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ g4a d;

    public /* synthetic */ nj4(Function1 function1, String str, g4a g4aVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = str;
        this.d = g4aVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.d;
        String str = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                g4aVar.setValue(Boolean.FALSE);
                function1.invoke(str);
                break;
            default:
                g4aVar.setValue(Boolean.FALSE);
                function1.invoke(str);
                break;
        }
        return j6g.a;
    }
}
