package defpackage;

import defpackage.lb8;
import defpackage.vr1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zpe extends o81 {
    public final i62 d;

    public zpe(i62 i62Var) {
        super(5);
        this.d = i62Var;
    }

    @Override // defpackage.o81
    public final Collection<gtc> F(Collection<String> collection, lt1 lt1Var) {
        Collection collectionI;
        List listZ1;
        o81 o81Var;
        lt1Var.getClass();
        Map<String, String> map = lt1Var.a;
        boolean zContainsKey = map.containsKey("memory-cache-only");
        Collection collection2 = zr4.a;
        if (zContainsKey) {
            return collection2;
        }
        try {
            collectionI = I(collection);
        } catch (Exception e) {
            Exception exc = new Exception("Unable to read records from the database", e);
            System.out.println((Object) "Apollo: unhandled exception");
            exc.printStackTrace();
            j6g j6gVar = j6g.a;
            collectionI = collection2;
        }
        if (map.containsKey("evict-after-read")) {
            Iterator it = collectionI.iterator();
            while (it.hasNext()) {
                String str = ((gtc) it.next()).a;
                i62 i62Var = this.d;
                i62Var.getClass();
                str.getClass();
                lb8 lb8Var = (lb8) i62Var.a;
                lb8Var.a.a0(-2079049329, "DELETE FROM records WHERE key=?", new jb8(str, 0));
                lb8Var.a(new kd(12), -2079049329);
            }
        }
        Collection<String> collection3 = collection;
        Collection collection4 = collectionI;
        ArrayList arrayList = new ArrayList(t92.r0(collection4, 10));
        Iterator it2 = collection4.iterator();
        while (it2.hasNext()) {
            arrayList.add(((gtc) it2.next()).a);
        }
        Collection collectionZ0 = w92.z0(z92.E1(arrayList));
        if (collectionZ0.isEmpty()) {
            listZ1 = z92.z1(collection3);
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : collection3) {
                if (!collectionZ0.contains(obj)) {
                    arrayList2.add(obj);
                }
            }
            listZ1 = arrayList2;
        }
        List list = listZ1;
        Collection collectionF = null;
        if (list.isEmpty()) {
            list = null;
        }
        List list2 = list;
        if (list2 != null && (o81Var = (o81) this.c) != null) {
            collectionF = o81Var.F(list2, lt1Var);
        }
        if (collectionF != null) {
            collection2 = collectionF;
        }
        return z92.h1(collectionI, collection2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, is4, java.util.Set<java.lang.String>] */
    @Override // defpackage.o81
    public final Set<String> G(Collection<gtc> collection, lt1 lt1Var) throws Throwable {
        Object objInvoke;
        collection.getClass();
        lt1Var.getClass();
        Map<String, String> map = lt1Var.a;
        boolean zContainsKey = map.containsKey("do-not-store");
        ?? r2 = is4.a;
        if (!zContainsKey && !map.containsKey("memory-cache-only")) {
            try {
                String str = map.get("apollo-date");
                Long lValueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
                luc lucVar = new luc();
                lucVar.element = r2;
                i62 i62Var = this.d;
                tp0 tp0Var = new tp0(this, collection, lucVar, lValueOf, 1);
                lb8 lb8Var = (lb8) i62Var.a;
                yqf yqfVar = (yqf) lb8Var.a.y0().b;
                yqf yqfVarC = yqfVar.c();
                try {
                    objInvoke = tp0Var.invoke();
                } catch (Throwable th) {
                    th = th;
                    objInvoke = null;
                }
                try {
                    yqfVar.f = true;
                    yqfVar.b();
                    lb8Var.b(yqfVar, yqfVarC, null, objInvoke);
                } catch (Throwable th2) {
                    th = th2;
                    yqfVar.b();
                    lb8Var.b(yqfVar, yqfVarC, th, objInvoke);
                }
                Set set = (Set) lucVar.element;
                o81 o81Var = (o81) this.c;
                ?? G = o81Var != null ? o81Var.G(collection, lt1Var) : 0;
                if (G == 0) {
                    G = r2;
                }
                return bbe.o(set, (Iterable) G);
            } catch (Exception e) {
                Exception exc = new Exception("Unable to merge records from the database", e);
                System.out.println((Object) "Apollo: unhandled exception");
                exc.printStackTrace();
                j6g j6gVar = j6g.a;
            }
        }
        return r2;
    }

    public final ArrayList I(Collection collection) {
        String string;
        ArrayList<List> arrayListF1 = z92.F1(collection, 999, 999);
        ArrayList arrayList = new ArrayList();
        for (List list : arrayListF1) {
            i62 i62Var = this.d;
            i62Var.getClass();
            list.getClass();
            lb8.a aVar = new lb8.a((lb8) i62Var.a, list, new q2(new mj2(8, (byte) 0), 15));
            h15 h15Var = new h15(aVar);
            Collection<String> collection2 = aVar.b;
            int size = collection2.size();
            if (size == 0) {
                string = "()";
            } else {
                StringBuilder sb = new StringBuilder(size + 2);
                sb.append("(?");
                int i = size - 1;
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(",?");
                }
                sb.append(')');
                string = sb.toString();
            }
            List<ltc> list2 = (List) aVar.c.a.L(null, "SELECT key, record FROM records WHERE key IN ".concat(string), h15Var, collection2.size(), new ui(aVar, 10)).getValue();
            ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
            for (ltc ltcVar : list2) {
                String str = ltcVar.a;
                String str2 = ltcVar.b;
                str.getClass();
                str2.getClass();
                zn1 zn1Var = new zn1();
                vr1 vr1Var = vr1.c;
                zn1Var.o0(vr1.a.c(str2));
                Object objA = ob8.a(e.a(new uo1(zn1Var)));
                gtc gtcVar = null;
                Map map = objA instanceof Map ? (Map) objA : null;
                if (map != null) {
                    gtcVar = new gtc(str, map);
                } else {
                    akb.n("error deserializing: ".concat(str2));
                }
                arrayList2.add(gtcVar);
            }
            w92.w0(arrayList, arrayList2);
        }
        return arrayList;
    }
}
