package androidx.media3.session;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import androidx.media3.session.legacy.h;
import defpackage.aw5;
import defpackage.bh5;
import defpackage.e47;
import defpackage.gdb;
import defpackage.hz8;
import defpackage.ij9;
import defpackage.ka2;
import defpackage.qyc;
import defpackage.u37;
import defpackage.u59;
import defpackage.v8e;
import defpackage.v9e;
import defpackage.w20;
import defpackage.w8e;
import defpackage.ws1;
import defpackage.wu8;
import defpackage.x9e;
import defpackage.zng;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class r {
    public static final Object b = new Object();
    public static final HashMap<String, r> c = new HashMap<>();
    public final s a;

    public interface a {
        static hz8 b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ij9) it.next()).b == null) {
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    u37.a aVar = new u37.a();
                    aVar.m(unsupportedOperationException);
                    return aVar;
                }
            }
            return aw5.K1(list);
        }

        default u37 a(r rVar, d dVar, v8e v8eVar, Bundle bundle) {
            return aw5.K1(new x9e(-6));
        }
    }

    public static final class b {
        public static final w8e g;
        public static final gdb.a h;
        public final boolean a;
        public final w8e b;
        public final gdb.a c;
        public final e47<androidx.media3.session.a> d;
        public final e47<androidx.media3.session.a> e;
        public final Bundle f;

        static {
            HashSet hashSet = new HashSet();
            qyc qycVar = v8e.d;
            for (int i = 0; i < qycVar.d; i++) {
                hashSet.add(new v8e(((Integer) qycVar.get(i)).intValue()));
            }
            g = new w8e(hashSet);
            HashSet hashSet2 = new HashSet();
            qyc qycVar2 = v8e.e;
            for (int i2 = 0; i2 < qycVar2.d; i2++) {
                hashSet2.add(new v8e(((Integer) qycVar2.get(i2)).intValue()));
            }
            for (int i3 = 0; i3 < qycVar.d; i3++) {
                hashSet2.add(new v8e(((Integer) qycVar.get(i3)).intValue()));
            }
            new w8e(hashSet2);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i4 : gdb.a.C0248a.b) {
                ka2.q(!false);
                sparseBooleanArray.append(i4, true);
            }
            ka2.q(!false);
            h = new gdb.a(new bh5(sparseBooleanArray));
        }

        public b(boolean z, w8e w8eVar, gdb.a aVar, e47 e47Var, e47 e47Var2, Bundle bundle) {
            this.a = z;
            this.b = w8eVar;
            this.c = aVar;
            this.d = e47Var;
            this.e = e47Var2;
            this.f = bundle;
        }
    }

    public interface c {
        default void a(int i, v8e v8eVar) {
        }

        default void b(int i, wu8<?> wu8Var) {
        }

        default void c(int i, z zVar, gdb.a aVar, boolean z, boolean z2) {
        }

        default void d(int i) {
        }

        default void e(int i, Bundle bundle) {
        }

        default void f() {
        }

        default void g(int i, v9e v9eVar, boolean z, boolean z2, int i2) {
        }

        default void h(int i, gdb.a aVar) {
        }

        default void i(int i, x9e x9eVar) {
        }
    }

    public static final class d {
        public final h.b a;
        public final int b;
        public final int c;
        public final boolean d;
        public final c e;
        public final Bundle f;

        public d(h.b bVar, int i, int i2, boolean z, c cVar, Bundle bundle) {
            this.a = bVar;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = cVar;
            this.f = bundle;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            d dVar = (d) obj;
            c cVar = dVar.e;
            c cVar2 = this.e;
            return (cVar2 == null && cVar == null) ? this.a.equals(dVar.a) : Objects.equals(cVar2, cVar);
        }

        public final int hashCode() {
            return Objects.hash(this.e, this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
            h.b bVar = this.a;
            sb.append(bVar.a.a);
            sb.append(", uid=");
            return w20.k(sb, bVar.a.c, "}");
        }
    }

    public static final class e {
        public final e47<ij9> a;
        public final int b;
        public final long c;

        public e(List<ij9> list, int i, long j) {
            this.a = e47.j(list);
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b == eVar.b && this.c == eVar.c;
        }

        public final int hashCode() {
            return u59.b(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
        }
    }

    public r(Context context, String str, androidx.media3.exoplayer.d dVar, e47 e47Var, e47 e47Var2, e47 e47Var3, zng zngVar, Bundle bundle, Bundle bundle2, ws1 ws1Var) {
        synchronized (b) {
            HashMap<String, r> map = c;
            if (map.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=".concat(str));
            }
            map.put(str, this);
        }
        this.a = new s(this, context, str, dVar, e47Var, e47Var2, e47Var3, zngVar, bundle, bundle2, ws1Var);
    }

    public final gdb a() {
        return this.a.t.a;
    }

    public final void b() {
        try {
            synchronized (b) {
                c.remove(this.a.i);
            }
            this.a.u();
        } catch (Exception unused) {
        }
    }
}
