package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class v79 implements kt0 {
    public final rd6<a, Object> a = new rd6<>();
    public final b b = new b();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    public static final class a implements yfb {
        public final b a;
        public int b;
        public Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.yfb
        public final void a() {
            this.a.H(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    public static final class b extends o81 {
        public final yfb I() {
            return new a(this);
        }
    }

    public v79(int i) {
        this.e = i;
    }

    @Override // defpackage.kt0
    public final synchronized void a(int i) {
        try {
            if (i >= 40) {
                b();
            } else if (i >= 20 || i == 15) {
                f(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.kt0
    public final synchronized void b() {
        f(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kt0
    public final synchronized <T> T c(int i, Class<T> cls) {
        a aVar;
        int i2;
        try {
            Integer numCeilingKey = i(cls).ceilingKey(Integer.valueOf(i));
            boolean z = numCeilingKey != null && ((i2 = this.f) == 0 || this.e / i2 >= 2 || numCeilingKey.intValue() <= i * 8);
            b bVar = this.b;
            if (z) {
                int iIntValue = numCeilingKey.intValue();
                yfb yfbVarI = (yfb) ((ArrayDeque) bVar.c).poll();
                if (yfbVarI == null) {
                    yfbVarI = bVar.I();
                }
                aVar = (a) yfbVarI;
                aVar.b = iIntValue;
                aVar.c = cls;
            } else {
                yfb yfbVarI2 = (yfb) ((ArrayDeque) bVar.c).poll();
                if (yfbVarI2 == null) {
                    yfbVarI2 = bVar.I();
                }
                aVar = (a) yfbVarI2;
                aVar.b = i;
                aVar.c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T) h(aVar, cls);
    }

    @Override // defpackage.kt0
    public final synchronized Object d() {
        a aVar;
        b bVar = this.b;
        yfb yfbVarI = (yfb) ((ArrayDeque) bVar.c).poll();
        if (yfbVarI == null) {
            yfbVarI = bVar.I();
        }
        aVar = (a) yfbVarI;
        aVar.b = 8;
        aVar.c = byte[].class;
        return h(aVar, byte[].class);
    }

    public final void e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapI = i(cls);
        Integer num = navigableMapI.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapI.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapI.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void f(int i) {
        while (this.f > i) {
            Object objC = this.a.c();
            beb.d(objC);
            ws0 ws0VarG = g(objC.getClass());
            this.f -= ws0VarG.b() * ws0VarG.c(objC);
            e(ws0VarG.c(objC), objC.getClass());
            if (Log.isLoggable(ws0VarG.a(), 2)) {
                Log.v(ws0VarG.a(), "evicted: " + ws0VarG.c(objC));
            }
        }
    }

    public final <T> ws0<T> g(Class<T> cls) {
        ws0<T> wq1Var;
        HashMap map = this.d;
        ws0<T> ws0Var = (ws0) map.get(cls);
        if (ws0Var != null) {
            return ws0Var;
        }
        if (cls.equals(int[].class)) {
            wq1Var = new xh7();
        } else {
            if (!cls.equals(byte[].class)) {
                l5.q("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            wq1Var = new wq1();
        }
        map.put(cls, wq1Var);
        return wq1Var;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        ws0<T> ws0VarG = g(cls);
        T t = (T) this.a.a(aVar);
        if (t != null) {
            this.f -= ws0VarG.b() * ws0VarG.c(t);
            e(ws0VarG.c(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(ws0VarG.a(), 2)) {
            Log.v(ws0VarG.a(), "Allocated " + aVar.b + " bytes");
        }
        return ws0VarG.newArray(aVar.b);
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap map = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    @Override // defpackage.kt0
    public final synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        ws0<T> ws0VarG = g(cls);
        int iC = ws0VarG.c(t);
        int iB = ws0VarG.b() * iC;
        if (iB <= this.e / 2) {
            b bVar = this.b;
            yfb yfbVarI = (yfb) ((ArrayDeque) bVar.c).poll();
            if (yfbVarI == null) {
                yfbVarI = bVar.I();
            }
            a aVar = (a) yfbVarI;
            aVar.b = iC;
            aVar.c = cls;
            this.a.b(aVar, t);
            NavigableMap<Integer, Integer> navigableMapI = i(cls);
            Integer num = navigableMapI.get(Integer.valueOf(aVar.b));
            Integer numValueOf = Integer.valueOf(aVar.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapI.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            f(this.e);
        }
    }
}
