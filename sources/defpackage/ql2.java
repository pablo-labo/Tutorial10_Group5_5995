package defpackage;

import defpackage.cfe;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ql2 implements Function1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ql2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        switch (this.a) {
            case 0:
                mq5 mq5Var = (mq5) this.b;
                lf0 lf0Var = (lf0) obj;
                lf0Var.getClass();
                return lf0Var.p(mq5Var);
            case 1:
                bnb bnbVar = (bnb) this.b;
                xx9 xx9Var = (xx9) obj;
                xx9Var.getClass();
                return xx9Var.l().r(bnbVar);
            case 2:
                up1 up1Var = (up1) this.b;
                mq5 mq5Var2 = (mq5) obj;
                mq5Var2.getClass();
                Map map = (Map) up1Var.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    mq5 mq5Var3 = (mq5) entry.getKey();
                    if (!mq5Var2.equals(mq5Var3)) {
                        mq5Var3.getClass();
                        if (wl7.b(mq5Var2.a.c() ? null : mq5Var2.b(), mq5Var3)) {
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    return null;
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int length = oq5.a((mq5) ((Map.Entry) next).getKey(), mq5Var2).a.a.length();
                        do {
                            Object next2 = it.next();
                            int length2 = oq5.a((mq5) ((Map.Entry) next2).getKey(), mq5Var2).a.a.length();
                            if (length > length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    return entry2.getValue();
                }
                return null;
            case 3:
                String str = (String) this.b;
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                c0106a.c(str, zib.b, zib.c);
                return j6g.a;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ffb ffbVar = (ffb) this.b;
                if (ffbVar != null) {
                    ffbVar.d = zBooleanValue;
                }
                return j6g.a;
            default:
                ((List) this.b).get(((Number) obj).intValue());
                return null;
        }
    }

    public /* synthetic */ ql2() {
        this.a = 4;
    }
}
