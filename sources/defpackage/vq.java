package defpackage;

import androidx.compose.runtime.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vq implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vq(gu5 gu5Var, gu5 gu5Var2, int i) {
        this.b = gu5Var;
        this.c = gu5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        int i = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((g4a) obj3).setValue((String) obj);
                ((g4a) obj4).setValue((String) obj2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                fy1.b((gu5) obj3, (gu5) obj4, (b) obj, ka2.L(1));
                break;
            default:
                g4a g4aVar = (g4a) obj3;
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str.getClass();
                Iterator<T> it = ((vsb) obj4).e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((sjb) next).a.equals(str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                sjb sjbVar = (sjb) next;
                List list = (List) g4aVar.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (!((sjb) obj5).a.equals(sjbVar != null ? sjbVar.a : null)) {
                        arrayList.add(obj5);
                    }
                }
                g4aVar.setValue(arrayList);
                if (zBooleanValue && sjbVar != null) {
                    g4aVar.setValue(z92.g1(sjbVar, (List) g4aVar.getValue()));
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ vq(g4a g4aVar, g4a g4aVar2) {
        this.b = g4aVar;
        this.c = g4aVar2;
    }

    public /* synthetic */ vq(vsb vsbVar, g4a g4aVar) {
        this.c = vsbVar;
        this.b = g4aVar;
    }
}
