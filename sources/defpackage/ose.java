package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ose {
    public final HashMap<String, nse> a = new HashMap<>();
    public final HashMap<nse, String> b = new HashMap<>();
    public final HashMap<String, List<nse>> c = new HashMap<>();
    public final HashMap<String, List<nse>> d = new HashMap<>();
    public final HashMap<String, List<nse>> e = new HashMap<>();
    public final HashMap<String, List<nse>> f = new HashMap<>();
    public final HashMap<String, List<nse>> g = new HashMap<>();
    public final HashMap<String, List<nse>> h = new HashMap<>();
    public final h00 i = new h00(5);

    public static void a(Map map, List list, nse nseVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            List linkedList = (List) map.get(str);
            if (linkedList == null) {
                linkedList = new LinkedList();
                map.put(str, linkedList);
            }
            linkedList.add(nseVar);
        }
    }

    public static void c(HashMap map, List list, nse nseVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) map.get((String) it.next());
            if (list2 != null) {
                list2.remove(nseVar);
            }
        }
    }

    public final synchronized void b(qqf qqfVar) {
        try {
            String str = qqfVar.a;
            if (str == null) {
                str = qqfVar.b;
            }
            LinkedList linkedList = new LinkedList();
            List<nse> list = this.f.get(str);
            if (list != null) {
                linkedList.addAll(list);
            }
            List<nse> list2 = this.f.get("*");
            if (list2 != null) {
                linkedList.addAll(list2);
            }
            if (!linkedList.isEmpty()) {
                o15.a(false, "ose", new eq2(3, linkedList, qqfVar));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(String str) {
        str.getClass();
        nse nseVarRemove = this.a.remove(str);
        if (nseVarRemove == null) {
            return;
        }
        this.b.remove(nseVarRemove);
        h00 h00Var = this.i;
        h00Var.getClass();
        ((HashMap) h00Var.a).remove(str);
        c(this.c, nseVarRemove.e(), nseVarRemove);
        c(this.d, nseVarRemove.g(), nseVarRemove);
        c(this.e, nseVarRemove.h(), nseVarRemove);
        c(this.f, zr4.a, nseVarRemove);
        c(this.g, nseVarRemove.b(), nseVarRemove);
        c(this.h, nseVarRemove.f(), nseVarRemove);
    }

    public final synchronized h00 e(rx4 rx4Var) {
        h00 h00Var;
        ise iseVar;
        try {
            rx4Var.getClass();
            if (rx4Var instanceof e4) {
                LinkedList<nse> linkedList = new LinkedList();
                List<nse> list = this.c.get(((e4) rx4Var).d());
                if (list != null) {
                    linkedList.addAll(list);
                }
                List<nse> list2 = this.c.get("*");
                if (list2 != null) {
                    linkedList.addAll(list2);
                }
                for (nse nseVar : linkedList) {
                    String str = this.b.get(nseVar);
                    if (str != null) {
                        h00 h00Var2 = this.i;
                        synchronized (h00Var2) {
                            iseVar = (ise) ((HashMap) h00Var2.a).get(str);
                        }
                    } else {
                        iseVar = null;
                    }
                    nseVar.getClass();
                    ise iseVar2 = new ise();
                    iseVar2.a = rx4Var;
                    iseVar2.b = iseVar;
                    iseVar2.c = nseVar;
                    if (str != null) {
                        h00 h00Var3 = this.i;
                        synchronized (h00Var3) {
                            ((HashMap) h00Var3.a).put(str, iseVar2);
                        }
                    }
                    iseVar2.a();
                }
            }
            h00 h00Var4 = this.i;
            synchronized (h00Var4) {
                h00Var = new h00(5);
                h00Var.a = new HashMap((HashMap) h00Var4.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return h00Var;
    }
}
