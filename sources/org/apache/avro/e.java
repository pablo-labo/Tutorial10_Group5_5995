package org.apache.avro;

import com.fasterxml.jackson.core.JsonFactory;
import defpackage.hpd;
import defpackage.j4b;
import defpackage.p6;
import defpackage.ppd;
import defpackage.r40;
import defpackage.r6;
import defpackage.wkf;
import defpackage.z3;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.avro.d;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static final HashMap e;
    public static final EnumSet f;
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final d c;
    public hpd.a d;

    static {
        HashMap map = new HashMap();
        e = map;
        map.put("string", g.u.STRING);
        map.put("bytes", g.u.BYTES);
        map.put("int", g.u.INT);
        map.put("long", g.u.LONG);
        map.put("float", g.u.FLOAT);
        map.put("double", g.u.DOUBLE);
        map.put("boolean", g.u.BOOLEAN);
        map.put("null", g.u.NULL);
        f = EnumSet.of(g.u.RECORD, g.u.ENUM, g.u.FIXED);
    }

    public e(d dVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.c = dVar;
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
        this.d = null;
    }

    public final g a(String str, String str2) {
        g.u uVar = (g.u) e.get(str);
        if (uVar != null) {
            return g.s(uVar);
        }
        String strM = (str2 == null || str.lastIndexOf(46) >= 0) ? str : z3.m(str2, ".", str);
        LinkedHashMap linkedHashMap = this.a;
        g gVar = (g) linkedHashMap.get(strM);
        LinkedHashMap linkedHashMap2 = this.b;
        if (gVar == null) {
            gVar = (g) linkedHashMap2.get(strM);
        }
        if (gVar == null) {
            g gVar2 = (g) linkedHashMap.get(str);
            gVar = gVar2 == null ? (g) linkedHashMap2.get(str) : gVar2;
        }
        if (gVar != null) {
            return gVar;
        }
        String strC = p6.c(hpd.a.getAndIncrement(), "UnresolvedSchema_");
        List list = Collections.EMPTY_LIST;
        JsonFactory jsonFactory = g.b;
        g.q qVar = new g.q(new g.m(strC, "org.apache.avro.compiler"));
        qVar.o("org.apache.avro.idl.unresolved.name", strM);
        return qVar;
    }

    public final void b(g.n nVar) {
        if (!f.contains(nVar.K())) {
            r40.l("You can only put a named schema into the context");
            return;
        }
        String str = nVar.name.c;
        String[] strArrSplit = str.split("\\.");
        for (int i = 0; i < strArrSplit.length - 1; i++) {
            d(strArrSplit[i], "Namespace part");
        }
        d(strArrSplit[strArrSplit.length - 1], "Name");
        g gVar = (g) this.a.get(str);
        if (gVar != null) {
            if (!nVar.equals(gVar)) {
                throw new SchemaParseException("Can't redefine: ".concat(str));
            }
            return;
        }
        this.d = null;
        g gVar2 = (g) this.b.putIfAbsent(str, nVar);
        if (gVar2 != null && !gVar2.equals(nVar)) {
            throw new SchemaParseException("Can't redefine: ".concat(str));
        }
    }

    public final g c(final g gVar) {
        if (!this.b.isEmpty()) {
            r6.g("Schemas cannot be resolved unless the ParseContext is committed.");
            return null;
        }
        hpd.a aVar = this.d;
        LinkedHashMap linkedHashMap = this.a;
        if (aVar == null) {
            wkf wkfVar = g.Z;
            d dVar = (d) wkfVar.get();
            try {
                wkfVar.set(this.c);
                Objects.requireNonNull(linkedHashMap);
                final hpd.a aVar2 = new hpd.a(new j4b(linkedHashMap));
                linkedHashMap.values().forEach(new Consumer() { // from class: k4b
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ppd.a(aVar2, (g) obj);
                    }
                });
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    final g gVar2 = (g) entry.getValue();
                    g gVar3 = aVar2.b.get(gVar2);
                    Objects.requireNonNull(gVar3, (Supplier<String>) new Supplier() { // from class: dpd
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return l5.m("Unknown schema: ", gVar2.E(), ". Was it resolved before?");
                        }
                    });
                    entry.setValue(gVar3);
                }
                this.d = aVar2;
                g.Z.set(dVar);
            } catch (Throwable th) {
                g.Z.set(dVar);
                throw th;
            }
        }
        if (f.contains(gVar.K()) && gVar.E() != null) {
            g gVar4 = (g) linkedHashMap.get(gVar.E());
            Objects.requireNonNull(gVar4, (Supplier<String>) new Supplier() { // from class: i4b
                @Override // java.util.function.Supplier
                public final Object get() {
                    return l5.l("Unknown schema: ", gVar.E());
                }
            });
            return gVar4;
        }
        ppd.a(this.d, gVar);
        g gVar5 = this.d.b.get(gVar);
        Objects.requireNonNull(gVar5, (Supplier<String>) new Supplier() { // from class: dpd
            @Override // java.util.function.Supplier
            public final Object get() {
                return l5.m("Unknown schema: ", gVar.E(), ". Was it resolved before?");
            }
        });
        return gVar5;
    }

    public final void d(String str, String str2) {
        d.c cVarA = this.c.a(str);
        if (cVarA == d.a) {
            return;
        }
        throw new SchemaParseException(str2 + " \"" + str + "\" is invalid: " + cVarA.a);
    }
}
