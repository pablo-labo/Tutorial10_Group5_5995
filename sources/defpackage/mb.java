package defpackage;

import defpackage.kv0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ mb(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                g4aVar.setValue(bool);
                return j6g.a;
            case 1:
                g4aVar.setValue((ig3) obj);
                return j6g.a;
            case 2:
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                g4aVar.setValue(jhfVar);
                return j6g.a;
            case 3:
                g4aVar.setValue((String) obj);
                return j6g.a;
            case 4:
                String str = (String) obj;
                str.getClass();
                List list = (List) g4aVar.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!wl7.b((String) obj2, str)) {
                        arrayList.add(obj2);
                    }
                }
                g4aVar.setValue(arrayList);
                return j6g.a;
            case 5:
                ((kv0.b.C0300b) obj).getClass();
                g4aVar.setValue(Boolean.TRUE);
                return j6g.a;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                List list2 = (List) g4aVar.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!wl7.b((String) obj3, str2)) {
                        arrayList2.add(obj3);
                    }
                }
                g4aVar.setValue(arrayList2);
                return j6g.a;
            case 7:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((Function1) g4aVar.getValue()).invoke(f)).floatValue());
            default:
                String str3 = (String) obj;
                str3.getClass();
                g4aVar.setValue(str3);
                return j6g.a;
        }
    }
}
