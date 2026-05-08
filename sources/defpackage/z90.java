package defpackage;

import defpackage.b9c;
import defpackage.l9c;
import defpackage.tze;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class z90 implements ype {
    public final tze a;
    public final ThreadLocal<yqf> b;
    public final d2f c;
    public final fa0 d;
    public final LinkedHashMap<String, Set<b9c.a>> e;

    public static class a extends tze.a {
        public final ga8 b;
        public final wz[] c;

        public a(wz... wzVarArr) {
            super(1);
            this.b = ga8.a;
            this.c = wzVarArr;
        }

        @Override // tze.a
        public final void c(at5 at5Var) {
            z90 z90Var = new z90(at5Var);
            this.b.getClass();
            z90Var.a0(null, "CREATE TABLE records (\n  _id INTEGER PRIMARY KEY AUTOINCREMENT,\n  key TEXT NOT NULL,\n  record TEXT NOT NULL\n)", null);
            z90Var.a0(null, "CREATE INDEX idx_records_key ON records(key)", null);
            l9c.a.getClass();
            l9c.a aVar = l9c.a.a;
        }

        @Override // tze.a
        public final void f(at5 at5Var, int i, int i2) {
            new z90(at5Var);
            wz[] wzVarArr = this.c;
            this.b.getClass();
            l9c.a.getClass();
            l9c.a aVar = l9c.a.a;
        }
    }

    public final class b extends yqf {
        public final yqf h;

        public b(yqf yqfVar) {
            this.h = yqfVar;
        }

        @Override // defpackage.yqf
        public final l9c.b a(boolean z) {
            z90 z90Var = z90.this;
            yqf yqfVar = this.h;
            if (yqfVar == null) {
                if (z) {
                    z90Var.h().T();
                    z90Var.h().c0();
                } else {
                    z90Var.h().c0();
                }
            }
            z90Var.b.set(yqfVar);
            l9c.a.getClass();
            return new l9c.b(l9c.a.b);
        }

        @Override // defpackage.yqf
        public final yqf c() {
            return this.h;
        }
    }

    public z90(tze tzeVar, at5 at5Var, int i) {
        this.a = tzeVar;
        if (!((tzeVar != null) ^ (at5Var != null))) {
            l5.q("Failed requirement.");
            throw null;
        }
        this.b = new ThreadLocal<>();
        this.c = new d2f(new aa0(this, at5Var));
        this.d = new fa0(i);
        this.e = new LinkedHashMap<>();
    }

    @Override // defpackage.ype
    public final l9c.b L(Integer num, String str, Function1 function1, int i, ui uiVar) {
        str.getClass();
        return new l9c.b(a(num, new da0(str, this, i), uiVar, new ea0(function1)));
    }

    @Override // defpackage.ype
    public final yqf V0() {
        return this.b.get();
    }

    public final <T> Object a(Integer num, gu5<? extends ga0> gu5Var, Function1<? super bqe, j6g> function1, Function1<? super ga0, ? extends T> function12) {
        fa0 fa0Var = this.d;
        ga0 ga0VarRemove = num != null ? fa0Var.remove(num) : null;
        if (ga0VarRemove == null) {
            ga0VarRemove = gu5Var.invoke();
        }
        if (function1 != null) {
            try {
                function1.invoke(ga0VarRemove);
            } catch (Throwable th) {
                if (num != null) {
                    ga0 ga0VarPut = fa0Var.put(num, ga0VarRemove);
                    if (ga0VarPut != null) {
                        ga0VarPut.close();
                    }
                } else {
                    ga0VarRemove.close();
                }
                throw th;
            }
        }
        T tInvoke = function12.invoke(ga0VarRemove);
        if (num == null) {
            ga0VarRemove.close();
            return tInvoke;
        }
        ga0 ga0VarPut2 = fa0Var.put(num, ga0VarRemove);
        if (ga0VarPut2 != null) {
            ga0VarPut2.close();
        }
        return tInvoke;
    }

    @Override // defpackage.ype
    public final l9c.b a0(Integer num, String str, Function1 function1) {
        return new l9c.b(a(num, new ba0(this, str), function1, ca0.b));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        j6g j6gVar;
        this.d.evictAll();
        tze tzeVar = this.a;
        if (tzeVar != null) {
            tzeVar.close();
            j6gVar = j6g.a;
        } else {
            j6gVar = null;
        }
        if (j6gVar == null) {
            h().close();
        }
    }

    @Override // defpackage.ype
    public final void e1(String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.e) {
            try {
                for (String str : strArr) {
                    Set<b9c.a> set = this.e.get(str);
                    if (set != null) {
                        linkedHashSet.addAll(set);
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((b9c.a) it.next()).a();
        }
    }

    public final sze h() {
        return (sze) this.c.getValue();
    }

    @Override // defpackage.ype
    public final l9c.b y0() {
        ThreadLocal<yqf> threadLocal = this.b;
        yqf yqfVar = threadLocal.get();
        b bVar = new b(yqfVar);
        threadLocal.set(bVar);
        if (yqfVar == null) {
            h().U();
        }
        return new l9c.b(bVar);
    }

    public /* synthetic */ z90(at5 at5Var) {
        this(null, at5Var, 1);
    }
}
