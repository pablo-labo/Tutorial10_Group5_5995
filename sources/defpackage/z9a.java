package defpackage;

import defpackage.ude;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z9a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z9a(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj2;
                q6d q6dVar = (q6d) obj;
                q6dVar.getClass();
                if (((List) obj3).contains(q6dVar)) {
                    function1.invoke(q6dVar);
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 1:
                th7 th7Var = (th7) obj;
                ((p9d) obj3).i(th7Var.a);
                ((Function1) obj2).invoke(th7Var);
                break;
            default:
                g4a g4aVar = (g4a) obj2;
                Integer num = (Integer) obj;
                num.getClass();
                g4aVar.setValue(num);
                ((ude) obj3).m(new ude.c.o(((Number) g4aVar.getValue()).intValue()));
                break;
        }
        return j6g.a;
    }
}
