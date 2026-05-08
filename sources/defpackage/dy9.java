package defpackage;

import android.os.Trace;
import defpackage.v03;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class dy9 implements Iterable<zx9<?>>, ze8 {
    public final WeakReference<ohd> a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList c = new ArrayList();
    public boolean d;

    public static final class a implements gu5<e13> {
        public final /* synthetic */ zx9<T> a;

        public a(zx9<T> zx9Var) {
            this.a = zx9Var;
        }

        @Override // defpackage.gu5
        public final e13 invoke() {
            eq3 eq3Var = a74.a;
            eze ezeVarA = wea.a();
            eq3Var.getClass();
            return f13.a(v03.a.C0438a.c(eq3Var, ezeVarA).d1(new c13(this.a.b.a)));
        }
    }

    public static final class b {
        public final i05 a;
        public final Object b;
        public final Object c;

        public b(i05 i05Var, Object obj, Object obj2) {
            this.a = i05Var;
            this.b = obj;
            this.c = obj2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && wl7.b(this.b, bVar.b) && wl7.b(this.c, bVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Object obj = this.b;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.c;
            return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
        }

        public final String toString() {
            return "PostponedEvent(eventName=" + this.a + ", sender=" + this.b + ", payload=" + this.c + ")";
        }
    }

    public dy9(WeakReference<ohd> weakReference) {
        this.a = weakReference;
    }

    public static rqg d(zx9 zx9Var, Class cls) {
        Object next;
        zx9Var.getClass();
        Iterator<T> it = zx9Var.b.c.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((rqg) next).c.equals(cls)) {
                break;
            }
        }
        return (rqg) next;
    }

    public final boolean a(i05 i05Var, Object obj, spa spaVar) {
        synchronized (this) {
            if (this.d) {
                return false;
            }
            this.c.add(new b(i05Var, obj, spaVar));
            return true;
        }
    }

    public final zx9<?> b(String str) {
        str.getClass();
        return (zx9) this.b.get(str);
    }

    public final void f(i05 i05Var) {
        if (a(i05Var, null, null)) {
            return;
        }
        Iterator<zx9<?>> it = iterator();
        while (it.hasNext()) {
            it.next().c(i05Var);
        }
    }

    public final void g() {
        Object obj;
        Iterator<zx9<?>> it = iterator();
        while (it.hasNext()) {
            it.next().c(i05.a);
        }
        j();
        synchronized (this) {
            this.d = true;
            j6g j6gVar = j6g.a;
        }
        synchronized (this) {
            try {
                for (b bVar : this.c) {
                    for (zx9<?> zx9Var : this) {
                        i05 i05Var = bVar.a;
                        zx9Var.getClass();
                        Object obj2 = bVar.b;
                        if (obj2 != null && (obj = bVar.c) != null) {
                            zx9Var.d(i05Var, obj2, obj);
                        } else if (obj2 != null) {
                            zx9Var.b.d.get(i05Var);
                        } else {
                            zx9Var.c(i05Var);
                        }
                    }
                }
                this.c.clear();
                j6g j6gVar2 = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T extends sx9> void i(T t) {
        Trace.beginSection(jpf.g("[ExpoModulesCore] ".concat("ModuleRegistry.register(" + t.getClass() + ")")));
        try {
            ohd ohdVar = this.a.get();
            if (ohdVar == null) {
                throw new IllegalArgumentException("Cannot create a module for invalid runtime context.");
            }
            t.a = ohdVar;
            zx9 zx9Var = new zx9(t);
            new d2f(new a(zx9Var));
            this.b.put(zx9Var.b.a, zx9Var);
            j6g j6gVar = j6g.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<zx9<?>> iterator() {
        return this.b.values().iterator();
    }

    public final void j() {
        for (zx9<?> zx9Var : this) {
            Function2<hk0, lu2<? super j6g>, Object> function2 = zx9Var.b.e;
            if (function2 != null) {
                u63.Y(zx9Var.a.b().g, null, null, new ay9(function2, zx9Var, null), 3);
            }
        }
    }
}
