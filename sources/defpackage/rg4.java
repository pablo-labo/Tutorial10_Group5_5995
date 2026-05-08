package defpackage;

import defpackage.rh3;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rg4 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rg4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj3;
                m61 m61Var = (m61) obj2;
                ((g4a) obj).setValue(Boolean.FALSE);
                function1.invoke(m61Var != null ? m61Var.a : null);
                break;
            default:
                rh3.a aVar = (rh3.a) obj3;
                xu5 xu5Var = (xu5) obj2;
                xu5 xu5Var2 = (xu5) obj;
                boolean z = aVar.c;
                String str = aVar.d;
                String str2 = aVar.b;
                if (z) {
                    xu5Var.j(str2, str, null, null);
                } else {
                    xu5Var2.j(str2, str, null, null);
                }
                break;
        }
        return j6g.a;
    }
}
