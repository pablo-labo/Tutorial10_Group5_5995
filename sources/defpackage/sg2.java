package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class sg2 implements fg2, kg2 {
    public static final pg2 h = new pg2();
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashSet d;
    public final tx4 e;
    public final AtomicReference<Boolean> f;
    public final mg2 g;

    public sg2(ArrayList arrayList, ArrayList arrayList2, mg2 mg2Var) {
        a5g a5gVar = a5g.a;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference<>();
        tx4 tx4Var = new tx4();
        this.e = tx4Var;
        this.g = mg2Var;
        ArrayList<uf2> arrayList3 = new ArrayList();
        arrayList3.add(uf2.c(tx4Var, tx4.class, kxe.class, w6c.class));
        arrayList3.add(uf2.c(this, kg2.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            uf2 uf2Var = (uf2) it.next();
            if (uf2Var != null) {
                arrayList3.add(uf2Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((j6c) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.g.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((uf2) it4.next()).b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.d.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                fc3.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.a.keySet());
                arrayList6.addAll(arrayList3);
                fc3.a(arrayList6);
            }
            for (final uf2 uf2Var2 : arrayList3) {
                this.a.put(uf2Var2, new cn8(new j6c() { // from class: qg2
                    @Override // defpackage.j6c
                    public final Object get() {
                        uf2 uf2Var3 = uf2Var2;
                        return uf2Var3.f.d(new l7d(uf2Var3, this.a));
                    }
                }));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = this.f.get();
        if (bool != null) {
            g(this.a, bool.booleanValue());
        }
    }

    @Override // defpackage.fg2
    public final synchronized <T> j6c<Set<T>> a(y8c<T> y8cVar) {
        kt8 kt8Var = (kt8) this.c.get(y8cVar);
        if (kt8Var != null) {
            return kt8Var;
        }
        return h;
    }

    @Override // defpackage.fg2
    public final synchronized <T> j6c<T> b(y8c<T> y8cVar) {
        yid.b(y8cVar, "Null interface requested.");
        return (j6c) this.b.get(y8cVar);
    }

    @Override // defpackage.fg2
    public final <T> wr3<T> f(y8c<T> y8cVar) {
        j6c<T> j6cVarB = b(y8cVar);
        return j6cVarB == null ? new mva(mva.c, mva.d) : j6cVarB instanceof mva ? (mva) j6cVarB : new mva(null, j6cVarB);
    }

    public final void g(HashMap map, boolean z) {
        int i;
        ArrayDeque<px4> arrayDeque;
        Set<Map.Entry> setEntrySet;
        Iterator it = map.entrySet().iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            uf2 uf2Var = (uf2) entry.getKey();
            j6c j6cVar = (j6c) entry.getValue();
            int i2 = uf2Var.d;
            if (i2 == 1 || (i2 == 2 && z)) {
                j6cVar.get();
            }
        }
        tx4 tx4Var = this.e;
        synchronized (tx4Var) {
            try {
                arrayDeque = tx4Var.b;
                if (arrayDeque != null) {
                    tx4Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } finally {
            }
        }
        if (arrayDeque != null) {
            for (px4 px4Var : arrayDeque) {
                px4Var.getClass();
                synchronized (tx4Var) {
                    try {
                        ArrayDeque arrayDeque2 = tx4Var.b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(px4Var);
                        } else {
                            synchronized (tx4Var) {
                                try {
                                    Map map2 = (Map) tx4Var.a.get(null);
                                    setEntrySet = map2 == null ? Collections.EMPTY_SET : map2.entrySet();
                                } finally {
                                }
                            }
                            for (Map.Entry entry2 : setEntrySet) {
                                ((Executor) entry2.getValue()).execute(new z24(i, entry2, px4Var));
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void h() {
        HashMap map = this.b;
        HashMap map2 = this.c;
        for (uf2 uf2Var : this.a.keySet()) {
            for (my3 my3Var : uf2Var.c) {
                boolean z = my3Var.b == 2;
                y8c<?> y8cVar = my3Var.a;
                if (z && !map2.containsKey(y8cVar)) {
                    Set set = Collections.EMPTY_SET;
                    kt8 kt8Var = new kt8();
                    kt8Var.b = null;
                    kt8Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    kt8Var.a.addAll(set);
                    map2.put(y8cVar, kt8Var);
                } else if (map.containsKey(y8cVar)) {
                    continue;
                } else {
                    int i = my3Var.b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + uf2Var + ": " + y8cVar);
                    }
                    if (i != 2) {
                        map.put(y8cVar, new mva(mva.c, mva.d));
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uf2 uf2Var = (uf2) it.next();
            if (uf2Var.e == 0) {
                j6c j6cVar = (j6c) this.a.get(uf2Var);
                Iterator it2 = uf2Var.b.iterator();
                while (it2.hasNext()) {
                    y8c y8cVar = (y8c) it2.next();
                    HashMap map = this.b;
                    if (map.containsKey(y8cVar)) {
                        arrayList2.add(new yi0(2, (mva) ((j6c) map.get(y8cVar)), j6cVar));
                    } else {
                        map.put(y8cVar, j6cVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final ArrayList j() {
        HashMap map = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            uf2 uf2Var = (uf2) entry.getKey();
            if (uf2Var.e != 0) {
                j6c j6cVar = (j6c) entry.getValue();
                Iterator it = uf2Var.b.iterator();
                while (it.hasNext()) {
                    y8c y8cVar = (y8c) it.next();
                    if (!map2.containsKey(y8cVar)) {
                        map2.put(y8cVar, new HashSet());
                    }
                    ((Set) map2.get(y8cVar)).add(j6cVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                kt8 kt8Var = (kt8) map.get(entry2.getKey());
                Iterator it2 = ((Set) entry2.getValue()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new gy0(1, kt8Var, (j6c) it2.next()));
                }
            } else {
                y8c y8cVar2 = (y8c) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                kt8 kt8Var2 = new kt8();
                kt8Var2.b = null;
                kt8Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                kt8Var2.a.addAll(set);
                map.put(y8cVar2, kt8Var2);
            }
        }
        return arrayList;
    }
}
