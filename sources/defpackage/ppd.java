package defpackage;

import defpackage.hpd;
import defpackage.jpd;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class ppd {
    public static void a(jpd jpdVar, g gVar) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar);
        while (true) {
            Object objPoll = arrayDeque.poll();
            if (objPoll == null) {
                jpdVar.getClass();
                return;
            }
            if (objPoll instanceof Supplier) {
                jpd.a aVar = (jpd.a) ((Supplier) objPoll).get();
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    continue;
                } else if (iOrdinal == 1) {
                    jpdVar.getClass();
                    return;
                } else if (iOrdinal != 3) {
                    b0.u("Invalid action ".concat(String.valueOf(aVar)));
                    return;
                } else {
                    while (arrayDeque.peek() instanceof g) {
                        arrayDeque.remove();
                    }
                }
            } else {
                final g gVar2 = (g) objPoll;
                if (identityHashMap.containsKey(gVar2)) {
                    c(jpdVar, gVar2);
                } else {
                    int iOrdinal2 = gVar2.K().ordinal();
                    if (iOrdinal2 == 0) {
                        b(jpdVar, gVar2, arrayDeque, new Iterable() { // from class: kpd
                            @Override // java.lang.Iterable
                            public final Iterator iterator() {
                                return ((ArrayDeque) gVar2.C().stream().map(new lpd()).collect(Collectors.toCollection(new mpd()))).descendingIterator();
                            }
                        });
                        identityHashMap.put(gVar2, gVar2);
                    } else if (iOrdinal2 == 2) {
                        b(jpdVar, gVar2, arrayDeque, Collections.singleton(gVar2.x()));
                        identityHashMap.put(gVar2, gVar2);
                    } else if (iOrdinal2 == 3) {
                        b(jpdVar, gVar2, arrayDeque, Collections.singleton(gVar2.M()));
                        identityHashMap.put(gVar2, gVar2);
                    } else if (iOrdinal2 != 4) {
                        c(jpdVar, gVar2);
                    } else {
                        b(jpdVar, gVar2, arrayDeque, gVar2.L());
                        identityHashMap.put(gVar2, gVar2);
                    }
                }
            }
        }
    }

    public static void b(final jpd jpdVar, final g gVar, final ArrayDeque arrayDeque, Iterable iterable) {
        hpd.a aVar = (hpd.a) jpdVar;
        IdentityHashMap<g, g> identityHashMap = aVar.b;
        if (gVar.K() == g.u.RECORD && !identityHashMap.containsKey(gVar)) {
            if (!hpd.a(gVar)) {
                String strH = gVar.H();
                String strW = gVar.w();
                String strI = gVar.I();
                identityHashMap.put(gVar, new g.q(new g.m(strH, strI), strW, gVar.O()));
            } else {
                if (!hpd.a(gVar)) {
                    l5.q("Not a unresolved schema: ".concat(String.valueOf(gVar)));
                    return;
                }
                String strE = gVar.e("org.apache.avro.idl.unresolved.name");
                g gVar2 = (g) aVar.a.apply(strE);
                if (gVar2 == null) {
                    r40.l(l5.l("Undefined schema: ", strE));
                    return;
                }
                identityHashMap.put(gVar, identityHashMap.computeIfAbsent(gVar2, new dx5(aVar, 1)));
            }
        }
        arrayDeque.push(new Supplier() { // from class: npd
            @Override // java.util.function.Supplier
            public final Object get() {
                g aVar2;
                g vVar;
                IdentityHashMap<g, g> identityHashMap2 = ((hpd.a) jpdVar).b;
                g gVar3 = gVar;
                g.u uVarK = gVar3.K();
                int iOrdinal = uVarK.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 2) {
                        g gVar4 = identityHashMap2.get(gVar3.x());
                        Objects.requireNonNull(gVar4);
                        aVar2 = new g.a(gVar4);
                    } else if (iOrdinal == 3) {
                        g gVar5 = identityHashMap2.get(gVar3.M());
                        Objects.requireNonNull(gVar5);
                        aVar2 = new g.l(gVar5);
                    } else {
                        if (iOrdinal != 4) {
                            r6.g(t40.l("Illegal type ", String.valueOf(uVarK), ", schema ", String.valueOf(gVar3)));
                            return null;
                        }
                        List<g> listL = gVar3.L();
                        ArrayList arrayList = new ArrayList(listL.size());
                        Iterator<g> it = listL.iterator();
                        while (it.hasNext()) {
                            g gVar6 = identityHashMap2.get(it.next());
                            Objects.requireNonNull(gVar6);
                            arrayList.add(gVar6);
                        }
                        vVar = new g.v(new g.j(arrayList));
                        hpd.a.a(gVar3, vVar);
                        identityHashMap2.put(gVar3, vVar);
                    }
                    vVar = aVar2;
                    hpd.a.a(gVar3, vVar);
                    identityHashMap2.put(gVar3, vVar);
                } else if (!hpd.a(gVar3)) {
                    g gVar7 = identityHashMap2.get(gVar3);
                    if (!gVar7.N()) {
                        List<g.f> listC = gVar3.C();
                        ArrayList arrayList2 = new ArrayList(listC.size());
                        for (g.f fVar : listC) {
                            g.f fVar2 = new g.f(fVar.b, identityHashMap2.get(fVar.d), fVar.e, fVar.f, fVar.V);
                            fVar2.j(fVar);
                            if (fVar.W != null) {
                                fVar2.W = new LinkedHashSet(fVar.W);
                            }
                            arrayList2.add(fVar2);
                        }
                        gVar7.X(arrayList2);
                        hpd.a.a(gVar3, gVar7);
                    }
                }
                return jpd.a.a;
            }
        });
        iterable.forEach(new Consumer() { // from class: opd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayDeque.push((g) obj);
            }
        });
    }

    public static void c(jpd jpdVar, g gVar) {
        hpd.a aVar = (hpd.a) jpdVar;
        aVar.getClass();
        boolean zContains = hpd.a.c.contains(gVar.K());
        IdentityHashMap<g, g> identityHashMap = aVar.b;
        if (!zContains) {
            identityHashMap.put(gVar, gVar);
        } else {
            if (identityHashMap.containsKey(gVar)) {
                return;
            }
            r6.g(l5.m("Schema ", String.valueOf(gVar), " must be already processed"));
        }
    }
}
