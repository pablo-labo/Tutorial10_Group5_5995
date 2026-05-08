package defpackage;

import androidx.compose.runtime.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o5b implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o5b(List list, int i, g4a g4aVar) {
        this.a = 2;
        this.c = list;
        this.b = i;
        this.d = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        int i = this.a;
        Object obj3 = this.d;
        int i2 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                p5b.a((Function1) obj4, (svb) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ygg.e((String) obj4, (Function2) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                g4a g4aVar = (g4a) obj3;
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str.getClass();
                Iterator it = ((List) obj4).iterator();
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
                    if (!wl7.b((sjb) obj5, sjbVar)) {
                        arrayList.add(obj5);
                    }
                }
                g4aVar.setValue(arrayList);
                if (sjbVar != null && zBooleanValue && ((List) g4aVar.getValue()).size() < i2) {
                    g4aVar.setValue(z92.g1(sjbVar, (List) g4aVar.getValue()));
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ o5b(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
