package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ cb(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                function1.invoke(str);
                break;
            default:
                ((Boolean) obj).booleanValue();
                function1.invoke(Boolean.TRUE);
                break;
        }
        return j6g.a;
    }
}
