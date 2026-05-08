package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d30 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d30(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                ((z20) obj4).a(fFloatValue, ((Float) obj2).floatValue());
                ((iuc) obj3).element = fFloatValue;
                break;
            case 1:
                ((Integer) obj2).getClass();
                jr4.a((kr4) obj4, (e) obj3, (b) obj, ka2.L(49));
                break;
            case 2:
                e8a e8aVar = (e8a) obj4;
                Map map = (Map) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ks0.a(e8aVar, v7a.c(map, j7f.e, bVar), bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            case 3:
                break;
            case 4:
                ((Integer) obj2).getClass();
                mld.f((e8a) obj4, (ss8) obj3, (b) obj, ka2.L(1));
                break;
            default:
                g4a g4aVar = (g4a) obj3;
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str.getClass();
                Iterator<T> it = ((vsb) obj4).i.iterator();
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

    public /* synthetic */ d30(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
