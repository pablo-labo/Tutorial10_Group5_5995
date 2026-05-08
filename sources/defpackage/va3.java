package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class va3 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vu5 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ va3(int i, vu5 vu5Var, Object obj, Object obj2) {
        this.a = i;
        this.b = vu5Var;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        vu5 vu5Var = this.b;
        switch (i) {
            case 0:
                ((Function2) vu5Var).invoke((fo7) obj2, (String) obj);
                break;
            default:
                Function1 function1 = (Function1) vu5Var;
                av8 av8Var = (av8) obj2;
                ((g4a) obj).setValue(Boolean.FALSE);
                function1.invoke(av8Var != null ? av8Var.a : null);
                break;
        }
        return j6g.a;
    }
}
