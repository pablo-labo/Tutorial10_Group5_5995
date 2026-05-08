package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.core.error.DefinitionOverrideException;

/* JADX INFO: loaded from: classes3.dex */
public final class vh8 {
    public final zpd a = new zpd(this);
    public final kg7 b = new kg7(this);
    public o81 c;

    public vh8() {
        new ConcurrentHashMap();
        new HashMap();
        as4 as4Var = new as4(4);
        as4Var.c = tu8.e;
        this.c = as4Var;
    }

    public final void a(List<rx9> list, boolean z) throws DefinitionOverrideException {
        Set setX = hh1.x(list);
        kg7 kg7Var = this.b;
        kg7Var.getClass();
        Set<rx9> set = setX;
        for (rx9 rx9Var : set) {
            for (Map.Entry<String, hg7<?>> entry : rx9Var.c.entrySet()) {
                String key = entry.getKey();
                hg7<?> value = entry.getValue();
                vh8 vh8Var = kg7Var.a;
                key.getClass();
                value.getClass();
                ue1<?> ue1Var = value.a;
                ConcurrentHashMap concurrentHashMap = kg7Var.b;
                if (concurrentHashMap.containsKey(key)) {
                    if (!z) {
                        throw new DefinitionOverrideException("Already existing definition for " + ue1Var + " at " + key);
                    }
                    o81 o81Var = vh8Var.c;
                    String str = "(+) override index '" + key + "' -> '" + ue1Var + '\'';
                    tu8 tu8Var = tu8.c;
                    if (o81Var.E(tu8Var)) {
                        o81Var.D(tu8Var, str);
                    }
                }
                o81 o81Var2 = vh8Var.c;
                String str2 = "(+) index '" + key + "' -> '" + ue1Var + '\'';
                tu8 tu8Var2 = tu8.a;
                if (o81Var2.E(tu8Var2)) {
                    o81Var2.D(tu8Var2, str2);
                }
                concurrentHashMap.put(key, value);
            }
            for (vge<?> vgeVar : rx9Var.b) {
                kg7Var.c.put(Integer.valueOf(vgeVar.a.hashCode()), vgeVar);
            }
        }
        zpd zpdVar = this.a;
        zpdVar.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((HashSet) zpdVar.a).addAll(((rx9) it.next()).d);
        }
    }

    public final void b(List<rx9> list) {
        Set<rx9> setX = hh1.x(list);
        kg7 kg7Var = this.b;
        kg7Var.getClass();
        for (rx9 rx9Var : setX) {
            ConcurrentHashMap concurrentHashMap = kg7Var.b;
            Set<String> setKeySet = rx9Var.c.keySet();
            setKeySet.getClass();
            for (String str : setKeySet) {
                if (concurrentHashMap.containsKey(str)) {
                    hg7 hg7Var = (hg7) concurrentHashMap.get(str);
                    if (hg7Var != null) {
                        hg7Var.b();
                    }
                    concurrentHashMap.remove(str);
                }
            }
        }
    }
}
