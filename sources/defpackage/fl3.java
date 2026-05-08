package defpackage;

import com.apollographql.apollo.exception.CacheMissException;
import defpackage.g15;
import defpackage.lb3;
import defpackage.pua;
import defpackage.th0;
import defpackage.vs1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class fl3 implements th0 {
    public final cr8 b;
    public final wt1 c;
    public final nde d;
    public final pqc e;
    public final d2f f;
    public final okc g;

    public fl3(aqe aqeVar, cr8 cr8Var, wt1 wt1Var) {
        this.b = cr8Var;
        this.c = wt1Var;
        nde ndeVarD = wg2.d(0, 64, eo1.a, 1);
        this.d = ndeVarD;
        this.e = wg2.i(ndeVarD);
        this.f = new d2f(new qa(aqeVar, 6));
        this.g = new okc(2);
    }

    public final Object a(Set set, pu2 pu2Var) throws Throwable {
        if (set.isEmpty()) {
            th0.a.getClass();
            if (set != th0.a.b) {
                return j6g.a;
            }
        }
        Object objA = this.d.a(set, pu2Var);
        return objA == g13.a ? objA : j6g.a;
    }

    public final <D extends pua.a> D b(final pua<D> puaVar, lb3 lb3Var, final lt1 lt1Var) {
        puaVar.getClass();
        lb3Var.getClass();
        lt1Var.getClass();
        final g15.b bVarA = j15.a(puaVar, lb3Var);
        gu5 gu5Var = new gu5() { // from class: bl3
            @Override // defpackage.gu5
            public final Object invoke() {
                Pair pair;
                fl3 fl3Var = this;
                cva cvaVar = (cva) fl3Var.f.getValue();
                wt1 wt1Var = fl3Var.c;
                pua puaVar2 = puaVar;
                puaVar2.getClass();
                cvaVar.getClass();
                lt1 lt1Var2 = lt1Var;
                lt1Var2.getClass();
                String str = qt1.c.a;
                List<vd2> list = puaVar2.c().e;
                String str2 = puaVar2.c().b.M0().d;
                g15.b bVar = bVarA;
                vs1 vs1Var = new vs1(cvaVar, str, bVar, wt1Var, lt1Var2, list, str2);
                vs1.c cVar = new vs1.c(str, zr4.a, list, str2);
                ArrayList arrayList = vs1Var.g;
                arrayList.add(cVar);
                while (true) {
                    boolean zIsEmpty = arrayList.isEmpty();
                    LinkedHashMap linkedHashMap = vs1Var.f;
                    if (zIsEmpty) {
                        return new vs1.a(linkedHashMap);
                    }
                    ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((vs1.c) it.next()).a);
                    }
                    Collection<gtc> collectionF = vs1Var.a.F(arrayList2, vs1Var.d);
                    int iV = kc9.V(t92.r0(collectionF, 10));
                    if (iV < 16) {
                        iV = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iV);
                    for (Object obj : collectionF) {
                        linkedHashMap2.put(((gtc) obj).a, obj);
                    }
                    List<vs1.c> listZ1 = z92.z1(arrayList);
                    arrayList.clear();
                    for (vs1.c cVar2 : listZ1) {
                        String str3 = cVar2.a;
                        String str4 = cVar2.a;
                        List<Object> list2 = cVar2.b;
                        Object gtcVar = linkedHashMap2.get(str3);
                        Pair pair2 = null;
                        if (gtcVar == null) {
                            if (!wl7.b(str4, qt1.c.a)) {
                                throw new CacheMissException(str4, null);
                            }
                            gtcVar = new gtc(str4, bs4.a);
                        }
                        List<vd2> list3 = cVar2.c;
                        String str5 = cVar2.d;
                        gtc gtcVar2 = (gtc) gtcVar;
                        Object obj2 = gtcVar2.get("__typename");
                        ArrayList<pd2> arrayListB = vs1.b(list3, str5, bVar, obj2 instanceof String ? (String) obj2 : null);
                        ArrayList arrayList3 = new ArrayList();
                        for (pd2 pd2Var : arrayListB) {
                            Map<String, Object> map = bVar.a;
                            pd2Var.getClass();
                            String str6 = pd2Var.a;
                            if (ojd.j(pd2Var.c, map)) {
                                pair = pair2;
                            } else {
                                Object objA = vs1Var.c.a(pd2Var, bVar, (Map) gtcVar, gtcVar2.a);
                                vs1Var.c(objA, z92.g1(str6, list2), pd2Var.e, pd2Var.b.M0().d);
                                pair = new Pair(str6, objA);
                            }
                            if (pair != null) {
                                arrayList3.add(pair);
                            }
                            pair2 = null;
                        }
                        linkedHashMap.put(list2, lc9.f0(arrayList3));
                    }
                }
            }
        };
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.g.a).readLock();
        lock.lock();
        try {
            Object objInvoke = gu5Var.invoke();
            lock.unlock();
            ena enaVarA = puaVar.a();
            tb9 tb9Var = new tb9(((ys1) objInvoke).a());
            lb3.a aVar = new lb3.a();
            aVar.a.putAll(lb3Var.e);
            aVar.c = lb3Var.a;
            aVar.d = lb3Var.b;
            Map<String, Object> map = bVarA.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (wl7.b(entry.getValue(), Boolean.FALSE)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            aVar.c = linkedHashMap.keySet();
            return (D) ((g15.a) enaVarA.a(tb9Var, aVar.a()));
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.UUID r5, defpackage.pu2 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dl3
            if (r0 == 0) goto L13
            r0 = r6
            dl3 r0 = (defpackage.dl3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            dl3 r0 = new dl3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            if (r1 == 0) goto L30
            r4 = 1
            if (r1 != r4) goto L29
            java.lang.Object r4 = r0.L$0
            java.util.Set r4 = (java.util.Set) r4
            defpackage.r7d.b(r6)
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L30:
            defpackage.r7d.b(r6)
            r5.getClass()
            as r6 = new as
            r0 = 6
            r6.<init>(r0, r4, r5)
            okc r4 = r4.g
            java.lang.Object r4 = r4.c(r6)
            java.util.Set r4 = (java.util.Set) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl3.c(java.util.UUID, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.pua r5, pua.a r6, defpackage.lb3 r7, defpackage.lt1 r8, defpackage.pu2 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.el3
            if (r0 == 0) goto L13
            r0 = r9
            el3 r0 = (defpackage.el3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            el3 r0 = new el3
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            if (r1 == 0) goto L30
            r4 = 1
            if (r1 != r4) goto L29
            java.lang.Object r4 = r0.L$0
            java.util.Set r4 = (java.util.Set) r4
            defpackage.r7d.b(r9)
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L30:
            defpackage.r7d.b(r9)
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            cr8 r9 = r4.b
            java.util.LinkedHashMap r5 = defpackage.qua.a(r5, r6, r7, r9)
            java.util.Collection r5 = r5.values()
            cl3 r6 = new cl3
            r7 = 0
            r6.<init>(r7, r4, r5, r8)
            okc r4 = r4.g
            java.lang.Object r4 = r4.c(r6)
            java.util.Set r4 = (java.util.Set) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl3.d(pua, pua$a, lb3, lt1, pu2):java.lang.Object");
    }
}
