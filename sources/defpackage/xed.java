package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import defpackage.tze;
import defpackage.v03;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b&\u0018\u0000 \u00042\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, d2 = {"Lxed;", "", "<init>", "()V", "Companion", "d", "a", "e", "b", "c", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class xed {
    public eu2 a;
    public v03 b;
    public Executor c;
    public brf d;
    public ved e;
    public km7 f;
    public boolean h;
    public final f82 g = new f82(new f(0, this, xed.class, "onClosed", "onClosed()V", 0));
    public final ThreadLocal<Integer> i = new ThreadLocal<>();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public static class a<T extends xed> {
        public final yd8<T> a;
        public final Context b;
        public final String c;
        public final ArrayList d;
        public final ArrayList e;
        public Executor f;
        public Executor g;
        public q20 h;
        public boolean i;
        public final d j;
        public final long k;
        public final e l;
        public final LinkedHashSet m;
        public final LinkedHashSet n;
        public final ArrayList o;
        public boolean p;
        public boolean q;
        public final boolean r;

        public a(Context context, Class<T> cls, String str) {
            context.getClass();
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.j = d.a;
            this.k = -1L;
            this.l = new e();
            this.m = new LinkedHashSet();
            this.n = new LinkedHashSet();
            this.o = new ArrayList();
            this.p = true;
            this.r = true;
            this.a = fwc.a.b(cls);
            this.b = context;
            this.c = str;
        }

        public final void a(xs9... xs9VarArr) {
            for (xs9 xs9Var : xs9VarArr) {
                Integer numValueOf = Integer.valueOf(xs9Var.a);
                LinkedHashSet linkedHashSet = this.n;
                linkedHashSet.add(numValueOf);
                linkedHashSet.add(Integer.valueOf(xs9Var.b));
            }
            xs9[] xs9VarArr2 = (xs9[]) Arrays.copyOf(xs9VarArr, xs9VarArr.length);
            e eVar = this.l;
            eVar.getClass();
            for (xs9 xs9Var2 : xs9VarArr2) {
                eVar.a(xs9Var2);
            }
        }

        public final T b() {
            String name;
            efd efdVar;
            tze tzeVarA;
            tze tzeVarA2;
            boolean zContainsKey;
            Executor executor = this.f;
            if (executor == null && this.g == null) {
                xr0 xr0Var = yr0.f;
                this.g = xr0Var;
                this.f = xr0Var;
            } else if (executor != null && this.g == null) {
                this.g = executor;
            } else if (executor == null) {
                this.f = this.g;
            }
            LinkedHashSet linkedHashSet = this.n;
            linkedHashSet.getClass();
            LinkedHashSet linkedHashSet2 = this.m;
            linkedHashSet2.getClass();
            if (!linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                        h5.k(p6.c(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                        return null;
                    }
                }
            }
            tze.c ct5Var = this.h;
            if (ct5Var == null) {
                ct5Var = new ct5();
            }
            tze.c cVar = ct5Var;
            if (this.k > 0) {
                if (this.c != null) {
                    l5.q("Required value was null.");
                    return null;
                }
                l5.q("Cannot create auto-closing database for an in-memory database.");
                return null;
            }
            boolean z = this.i;
            d dVar = this.j;
            dVar.getClass();
            Context context = this.b;
            context.getClass();
            if (dVar == d.a) {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                dVar = (activityManager == null || activityManager.isLowRamDevice()) ? d.b : d.c;
            }
            d dVar2 = dVar;
            Executor executor2 = this.f;
            if (executor2 == null) {
                l5.q("Required value was null.");
                return null;
            }
            Executor executor3 = this.g;
            if (executor3 == null) {
                l5.q("Required value was null.");
                return null;
            }
            qf3 qf3Var = new qf3(context, this.c, cVar, this.l, this.d, z, dVar2, executor2, executor3, null, this.p, this.q, linkedHashSet2, null, null, null, this.e, this.o, false, null, null);
            qf3Var.v = this.r;
            Class clsP = jh2.p(this.a);
            Package r0 = clsP.getPackage();
            if (r0 == null || (name = r0.getName()) == null) {
                name = "";
            }
            String canonicalName = clsP.getCanonicalName();
            canonicalName.getClass();
            if (name.length() != 0) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strReplace = canonicalName.replace(JwtParser.SEPARATOR_CHAR, '_');
            strReplace.getClass();
            String strConcat = strReplace.concat("_Impl");
            try {
                Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + JwtParser.SEPARATOR_CHAR + strConcat, true, clsP.getClassLoader());
                cls.getClass();
                T t = (T) cls.getDeclaredConstructor(null).newInstance(null);
                t.getClass();
                t.k = qf3Var.v;
                try {
                    ffd ffdVarG = t.g();
                    ffdVarG.getClass();
                    efdVar = (efd) ffdVarG;
                } catch (ela unused) {
                    efdVar = null;
                }
                t.e = efdVar == null ? new ved(qf3Var, new bt(t, 15)) : new ved(qf3Var, efdVar);
                t.f = t.f();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set<yd8<? extends ak2>> setM = t.m();
                int size = setM.size();
                boolean[] zArr = new boolean[size];
                Iterator<yd8<? extends ak2>> it2 = setM.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    int i = -1;
                    List<ak2> list = qf3Var.r;
                    if (zHasNext) {
                        yd8<? extends ak2> next = it2.next();
                        int size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i2 = size2 - 1;
                                if (next.n(list.get(size2))) {
                                    zArr[size2] = true;
                                    i = size2;
                                    break;
                                }
                                if (i2 < 0) {
                                    break;
                                }
                                size2 = i2;
                            }
                        }
                        if (i < 0) {
                            o6.m("A required auto migration spec (", next.p(), ") is missing in the database configuration.");
                            return null;
                        }
                        linkedHashMap.put(next, list.get(i));
                    } else {
                        int size3 = list.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i3 = size3 - 1;
                                if (size3 >= size || !zArr[size3]) {
                                    break;
                                }
                                if (i3 < 0) {
                                    break;
                                }
                                size3 = i3;
                            }
                            l5.q("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            return null;
                        }
                        for (xs9 xs9Var : t.e(linkedHashMap)) {
                            int i4 = xs9Var.a;
                            int i5 = xs9Var.b;
                            e eVar = qf3Var.d;
                            LinkedHashMap linkedHashMap2 = eVar.a;
                            if (linkedHashMap2.containsKey(Integer.valueOf(i4))) {
                                Map map = (Map) linkedHashMap2.get(Integer.valueOf(i4));
                                if (map == null) {
                                    map = bs4.a;
                                }
                                zContainsKey = map.containsKey(Integer.valueOf(i5));
                            } else {
                                zContainsKey = false;
                            }
                            if (!zContainsKey) {
                                eVar.a(xs9Var);
                            }
                        }
                        LinkedHashMap linkedHashMapO = t.o();
                        boolean[] zArr2 = new boolean[linkedHashMapO.size()];
                        Iterator it3 = linkedHashMapO.entrySet().iterator();
                        while (true) {
                            boolean zHasNext2 = it3.hasNext();
                            List<Object> list2 = qf3Var.q;
                            if (!zHasNext2) {
                                int size4 = list2.size() - 1;
                                if (size4 >= 0) {
                                    while (true) {
                                        int i6 = size4 - 1;
                                        if (!zArr2[size4]) {
                                            l5.q(v40.e(list2.get(size4), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                                            return null;
                                        }
                                        if (i6 < 0) {
                                            break;
                                        }
                                        size4 = i6;
                                    }
                                }
                                t.c = qf3Var.h;
                                t.d = new brf(qf3Var.i);
                                Executor executor4 = t.c;
                                if (executor4 == null) {
                                    wl7.g("internalQueryExecutor");
                                    throw null;
                                }
                                eu2 eu2VarA = f13.a(v03.a.C0438a.c(pi3.e(executor4), wea.a()));
                                t.a = eu2VarA;
                                v03 v03Var = eu2VarA.a;
                                brf brfVar = t.d;
                                if (brfVar == null) {
                                    wl7.g("internalTransactionExecutor");
                                    throw null;
                                }
                                t.b = v03Var.d1(pi3.e(brfVar));
                                t.h = qf3Var.f;
                                ved vedVar = t.e;
                                if (vedVar == null) {
                                    wl7.g("connectionManager");
                                    throw null;
                                }
                                tze tzeVarJ = vedVar.j();
                                if (tzeVarJ == null) {
                                    tzeVarA = null;
                                    break;
                                }
                                tzeVarA = tzeVarJ;
                                while (!(tzeVarA instanceof cib)) {
                                    if (!(tzeVarA instanceof bt3)) {
                                        tzeVarA = null;
                                        break;
                                    }
                                    tzeVarA = ((bt3) tzeVarA).a();
                                }
                                ved vedVar2 = t.e;
                                if (vedVar2 == null) {
                                    wl7.g("connectionManager");
                                    throw null;
                                }
                                tze tzeVarJ2 = vedVar2.j();
                                if (tzeVarJ2 == null) {
                                    tzeVarA2 = null;
                                    break;
                                }
                                tzeVarA2 = tzeVarJ2;
                                while (!(tzeVarA2 instanceof iz0)) {
                                    if (!(tzeVarA2 instanceof bt3)) {
                                        tzeVarA2 = null;
                                        break;
                                    }
                                    tzeVarA2 = ((bt3) tzeVarA2).a();
                                }
                                if (((iz0) tzeVarA2) == null) {
                                    return t;
                                }
                                throw null;
                            }
                            Map.Entry entry = (Map.Entry) it3.next();
                            yd8 yd8Var = (yd8) entry.getKey();
                            for (yd8 yd8Var2 : (List) entry.getValue()) {
                                int size5 = list2.size() - 1;
                                if (size5 >= 0) {
                                    while (true) {
                                        int i7 = size5 - 1;
                                        if (yd8Var2.n(list2.get(size5))) {
                                            zArr2[size5] = true;
                                            break;
                                        }
                                        if (i7 < 0) {
                                            break;
                                        }
                                        size5 = i7;
                                    }
                                    size5 = -1;
                                } else {
                                    size5 = -1;
                                }
                                if (size5 < 0) {
                                    throw new IllegalArgumentException(("A required type converter (" + yd8Var2.p() + ") for " + yd8Var.p() + " is missing in the database configuration.").toString());
                                }
                                Object obj = list2.get(size5);
                                yd8Var2.getClass();
                                obj.getClass();
                                t.j.put(yd8Var2, obj);
                            }
                        }
                    }
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Cannot find implementation for " + clsP.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot access the constructor " + clsP.getCanonicalName(), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Failed to create an instance of " + clsP.getCanonicalName(), e3);
            }
        }
    }

    public static abstract class b {
        public void a(sze szeVar) {
            szeVar.getClass();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final d c;
        public static final /* synthetic */ d[] d;

        static {
            d dVar = new d("AUTOMATIC", 0);
            a = dVar;
            d dVar2 = new d("TRUNCATE", 1);
            b = dVar2;
            d dVar3 = new d("WRITE_AHEAD_LOGGING", 2);
            c = dVar3;
            d = new d[]{dVar, dVar2, dVar3};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) d.clone();
        }
    }

    public static class e {
        public final LinkedHashMap a = new LinkedHashMap();

        public final void a(xs9 xs9Var) {
            xs9Var.getClass();
            int i = xs9Var.a;
            int i2 = xs9Var.b;
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.a;
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + xs9Var);
            }
            treeMap2.put(Integer.valueOf(i2), xs9Var);
        }
    }

    public /* synthetic */ class f extends qv5 implements gu5<j6g> {
        @Override // defpackage.gu5
        public final j6g invoke() throws Exception {
            xed xedVar = (xed) this.receiver;
            eu2 eu2Var = xedVar.a;
            if (eu2Var == null) {
                wl7.g("coroutineScope");
                throw null;
            }
            f13.c(eu2Var, null);
            xedVar.k();
            ved vedVar = xedVar.e;
            if (vedVar != null) {
                vedVar.f.close();
                return j6g.a;
            }
            wl7.g("connectionManager");
            throw null;
        }
    }

    public final void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            r6.g("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!q() || r() || this.i.get() == null) {
            return;
        }
        r6.g("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    @sy3
    public final void c() throws Throwable {
        a();
        a();
        sze writableDatabase = l().getWritableDatabase();
        if (!writableDatabase.y1()) {
            boa.N(new mm7(k(), null));
        }
        if (writableDatabase.F1()) {
            writableDatabase.U();
        } else {
            writableDatabase.y();
        }
    }

    public abstract void d();

    public List e(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kc9.V(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(jh2.p((yd8) entry.getKey()), entry.getValue());
        }
        return i(linkedHashMap2);
    }

    public abstract km7 f();

    public ffd g() {
        throw new ela(0);
    }

    @sy3
    public tze h(qf3 qf3Var) {
        qf3Var.getClass();
        throw new ela(0);
    }

    @sy3
    public List i(LinkedHashMap linkedHashMap) {
        return zr4.a;
    }

    public final e13 j() {
        eu2 eu2Var = this.a;
        if (eu2Var != null) {
            return eu2Var;
        }
        wl7.g("coroutineScope");
        throw null;
    }

    public final km7 k() {
        km7 km7Var = this.f;
        if (km7Var != null) {
            return km7Var;
        }
        wl7.g("internalTracker");
        throw null;
    }

    public final tze l() {
        ved vedVar = this.e;
        if (vedVar == null) {
            wl7.g("connectionManager");
            throw null;
        }
        tze tzeVarJ = vedVar.j();
        if (tzeVarJ != null) {
            return tzeVarJ;
        }
        r6.g("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set<yd8<? extends ak2>> m() {
        Set<Class<? extends ak2>> setN = n();
        ArrayList arrayList = new ArrayList(t92.r0(setN, 10));
        Iterator<T> it = setN.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            cls.getClass();
            arrayList.add(fwc.a.b(cls));
        }
        return z92.E1(arrayList);
    }

    @sy3
    public Set<Class<? extends ak2>> n() {
        return is4.a;
    }

    public LinkedHashMap o() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = p().entrySet();
        int iV = kc9.V(t92.r0(setEntrySet, 10));
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            cls.getClass();
            yd8 yd8VarB = fwc.a.b(cls);
            List<Class> list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            for (Class cls2 : list2) {
                cls2.getClass();
                arrayList.add(fwc.a.b(cls2));
            }
            Pair pair = new Pair(yd8VarB, arrayList);
            linkedHashMap.put(pair.d(), pair.e());
        }
        return linkedHashMap;
    }

    public Map<Class<?>, List<Class<?>>> p() {
        return bs4.a;
    }

    public final boolean q() {
        ved vedVar = this.e;
        if (vedVar != null) {
            return vedVar.j() != null;
        }
        wl7.g("connectionManager");
        throw null;
    }

    public final boolean r() {
        return u() && l().getWritableDatabase().y1();
    }

    public final void s() {
        l().getWritableDatabase().c0();
        if (r()) {
            return;
        }
        km7 km7VarK = k();
        km7VarK.b.f(km7VarK.e, km7VarK.f);
    }

    public final void t(zhd zhdVar) {
        zhdVar.getClass();
        km7 km7VarK = k();
        ztf ztfVar = km7VarK.b;
        ztfVar.getClass();
        iid iidVarQ1 = zhdVar.Q1("PRAGMA query_only");
        try {
            iidVarQ1.M1();
            boolean zB1 = iidVarQ1.b1();
            pi3.d(iidVarQ1, null);
            if (!zB1) {
                zkd.y(zhdVar, "PRAGMA temp_store = MEMORY");
                zkd.y(zhdVar, "PRAGMA recursive_triggers = 1");
                zkd.y(zhdVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (ztfVar.d) {
                    zkd.y(zhdVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    zkd.y(zhdVar, wve.I("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                coa coaVar = ztfVar.h;
                ReentrantLock reentrantLock = coaVar.a;
                reentrantLock.lock();
                try {
                    coaVar.d = true;
                    j6g j6gVar = j6g.a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (km7VarK.g) {
            }
        } finally {
        }
    }

    public final boolean u() {
        ved vedVar = this.e;
        if (vedVar == null) {
            wl7.g("connectionManager");
            throw null;
        }
        sze szeVar = vedVar.g;
        if (szeVar != null) {
            return szeVar.isOpen();
        }
        return false;
    }

    public final <V> V v(Callable<V> callable) throws Throwable {
        c();
        try {
            V vCall = callable.call();
            w();
            return vCall;
        } finally {
            s();
        }
    }

    @sy3
    public final void w() {
        l().getWritableDatabase().T();
    }

    public final Object x(boolean z, Function2 function2, pu2 pu2Var) {
        ved vedVar = this.e;
        if (vedVar != null) {
            return vedVar.f.F0(z, function2, pu2Var);
        }
        wl7.g("connectionManager");
        throw null;
    }
}
