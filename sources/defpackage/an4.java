package defpackage;

import androidx.compose.runtime.b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class an4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ an4(List list, List list2, Function1 function1, g4a g4aVar) {
        this.a = 0;
        this.b = list;
        this.c = list2;
        this.d = function1;
        this.e = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        y73 y73Var;
        a83 a83Var;
        w73 w73Var;
        a83 a83Var2;
        w73 w73Var2;
        a83 a83Var3;
        w73 w73Var3;
        Object next;
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj6;
                List list2 = (List) obj5;
                Function1 function1 = (Function1) obj4;
                g4a g4aVar = (g4a) obj3;
                int iIntValue = ((Integer) obj).intValue();
                ((Boolean) obj2).getClass();
                String str = null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            w73 w73Var4 = ((y73) next).a;
                            if (wl7.b(w73Var4 != null ? w73Var4.b : null, z92.R0(iIntValue, list2))) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    y73Var = (y73) next;
                } else {
                    y73Var = null;
                }
                g4aVar.setValue((y73Var == null || (a83Var3 = y73Var.b) == null || (w73Var3 = a83Var3.a) == null) ? null : w73Var3.a);
                if (iIntValue == list2.size() - 1) {
                    function1.invoke(null);
                } else {
                    String str2 = (y73Var == null || (a83Var2 = y73Var.b) == null || (w73Var2 = a83Var2.a) == null) ? null : w73Var2.b;
                    if (y73Var != null && (a83Var = y73Var.b) != null && (w73Var = a83Var.a) != null) {
                        str = w73Var.a;
                    }
                    function1.invoke(new dbf(str2, str));
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                tz6.c(ka2.L(1), (gu5) obj3, (fv6) obj5, (b) obj, (String) obj6, (String) obj4);
                break;
            default:
                ((Integer) obj2).getClass();
                d3d.a((i3d) obj6, (fnf) obj5, (gu5) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ an4(Object obj, Object obj2, Object obj3, gu5 gu5Var, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = gu5Var;
    }
}
