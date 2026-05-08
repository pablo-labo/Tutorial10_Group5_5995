package defpackage;

import defpackage.hp9;
import defpackage.lx5;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uz4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uz4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                lx5.b bVar = (lx5.b) obj;
                w40.l(bVar, "subTabName", (String) obj4, "userJobStatus", (String) obj3);
                bVar.a("myjobsPageTk", ie7.Z);
                bVar.a("appTk", (String) obj2);
                break;
            case 1:
                Function1 function1 = (Function1) obj4;
                g4a g4aVar = (g4a) obj3;
                g4a g4aVar2 = (g4a) obj2;
                xm5 xm5Var = (xm5) obj;
                xm5Var.getClass();
                if (xm5Var.c() && !((Boolean) g4aVar.getValue()).booleanValue()) {
                    z = true;
                }
                g4aVar.setValue(Boolean.valueOf(xm5Var.c()));
                if (z && ((jhf) g4aVar2.getValue()).a.b.length() > 0) {
                    jhf jhfVar = (jhf) g4aVar2.getValue();
                    int length = ((jhf) g4aVar2.getValue()).a.b.length();
                    g4aVar2.setValue(jhf.a(jhfVar, null, cr8.c(length, length), 5));
                }
                Boolean bool = (Boolean) g4aVar.getValue();
                bool.booleanValue();
                function1.invoke(bool);
                break;
            default:
                List list = (List) obj4;
                Function1 function12 = (Function1) obj3;
                Function1 function13 = (Function1) obj2;
                ls8 ls8Var = (ls8) obj;
                ls8Var.getClass();
                ls8Var.c(list.size(), new hp9.d(new md1(6), list), new hp9.e(list), new ah2(802480018, new hp9.f(list, function12, function13, list.size() == 1), true));
                break;
        }
        return j6g.a;
    }
}
