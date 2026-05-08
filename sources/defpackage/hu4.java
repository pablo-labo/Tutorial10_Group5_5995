package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes2.dex */
public final class hu4 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.u.values().length];
            try {
                iArr[g.u.RECORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.u.UNION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final JsonObject a(JsonObject jsonObject, eu4 eu4Var, aq7 aq7Var) {
        List<du4> list;
        Object next;
        jsonObject.getClass();
        Map.Entry entry = (Map.Entry) z92.N0(jsonObject.a.entrySet());
        String str = (String) entry.getKey();
        LinkedHashMap linkedHashMap = new LinkedHashMap(la8.f((JsonElement) entry.getValue()));
        if (aq7Var != null && (list = aq7Var.a) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (wl7.b(((du4) next).b, eu4Var.getFullName())) {
                    break;
                }
            }
            du4 du4Var = (du4) next;
            if (du4Var != null) {
                String str2 = du4Var.a;
                if (linkedHashMap.get(str2) == null) {
                    eu4Var.c(linkedHashMap, str2);
                    j6g j6gVar = j6g.a;
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(jsonObject);
        linkedHashMap2.put(str, new JsonObject(linkedHashMap));
        return new JsonObject(linkedHashMap2);
    }

    public static final void b(cpe cpeVar, eu4 eu4Var) {
        cpeVar.getClass();
        for (g.f fVar : cpeVar.a().C()) {
            g gVar = fVar.d;
            g.u uVarK = gVar.K();
            int i = uVarK == null ? -1 : a.a[uVarK.ordinal()];
            if (i == 1) {
                g gVarA = cpeVar.a();
                gVarA.getClass();
                if (eu4Var.b(gVarA)) {
                    eu4Var.a(cpeVar, fVar.c);
                }
            } else if (i == 2) {
                List<g> listL = gVar.L();
                listL.getClass();
                List<g> list = listL;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            g gVar2 = (g) it.next();
                            if (gVar2.K() == g.u.RECORD && eu4Var.b(gVar2)) {
                                eu4Var.a(cpeVar, fVar.c);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
