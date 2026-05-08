package defpackage;

import defpackage.a62;
import defpackage.hi8;
import defpackage.oi8;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class bqc implements oi8.c {
    public static final boolean i;
    public static final HashMap j;
    public int[] a;
    public String b;
    public int c;
    public String[] d;
    public String[] e;
    public String[] f;
    public hi8.a g;
    public String[] h;

    public static abstract class a implements oi8.b {
        public final ArrayList a = new ArrayList();

        @Override // oi8.b
        public final void a() {
            f((String[]) this.a.toArray(new String[0]));
        }

        @Override // oi8.b
        public final oi8.a b(a62 a62Var) {
            return null;
        }

        @Override // oi8.b
        public final void c(Object obj) {
            if (obj instanceof String) {
                this.a.add((String) obj);
            }
        }

        @Override // oi8.b
        public final void d(a62 a62Var, n8a n8aVar) {
        }

        @Override // oi8.b
        public final void e(d62 d62Var) {
        }

        public abstract void f(String[] strArr);
    }

    public class b implements oi8.a {
        public b() {
        }

        @Override // oi8.a
        public final void a() {
        }

        @Override // oi8.a
        public final void b(n8a n8aVar, d62 d62Var) {
        }

        @Override // oi8.a
        public final oi8.b c(n8a n8aVar) {
            String strC = n8aVar.c();
            if ("d1".equals(strC)) {
                return new cqc(this);
            }
            if ("d2".equals(strC)) {
                return new dqc(this);
            }
            return null;
        }

        @Override // oi8.a
        public final void d(n8a n8aVar, a62 a62Var, n8a n8aVar2) {
        }

        @Override // oi8.a
        public final oi8.a e(a62 a62Var, n8a n8aVar) {
            return null;
        }

        @Override // oi8.a
        public final void f(n8a n8aVar, Object obj) {
            String strC = n8aVar.c();
            boolean zEquals = "k".equals(strC);
            bqc bqcVar = bqc.this;
            if (zEquals) {
                if (obj instanceof Integer) {
                    hi8.a.a.getClass();
                    hi8.a aVar = (hi8.a) hi8.a.b.get((Integer) obj);
                    if (aVar == null) {
                        aVar = hi8.a.UNKNOWN;
                    }
                    bqcVar.g = aVar;
                    return;
                }
                return;
            }
            if ("mv".equals(strC)) {
                if (obj instanceof int[]) {
                    bqcVar.a = (int[]) obj;
                }
            } else {
                if ("xs".equals(strC)) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.isEmpty()) {
                            return;
                        }
                        bqcVar.b = str;
                        return;
                    }
                    return;
                }
                if (!"xi".equals(strC)) {
                    "pn".equals(strC);
                } else if (obj instanceof Integer) {
                    bqcVar.c = ((Integer) obj).intValue();
                }
            }
        }
    }

    public class c implements oi8.a {
        public c() {
        }

        @Override // oi8.a
        public final void a() {
        }

        @Override // oi8.a
        public final void b(n8a n8aVar, d62 d62Var) {
        }

        @Override // oi8.a
        public final oi8.b c(n8a n8aVar) {
            if ("b".equals(n8aVar.c())) {
                return new eqc(this);
            }
            return null;
        }

        @Override // oi8.a
        public final void d(n8a n8aVar, a62 a62Var, n8a n8aVar2) {
        }

        @Override // oi8.a
        public final oi8.a e(a62 a62Var, n8a n8aVar) {
            return null;
        }

        @Override // oi8.a
        public final void f(n8a n8aVar, Object obj) {
        }
    }

    public class d implements oi8.a {
        public d() {
        }

        @Override // oi8.a
        public final void a() {
        }

        @Override // oi8.a
        public final void b(n8a n8aVar, d62 d62Var) {
        }

        @Override // oi8.a
        public final oi8.b c(n8a n8aVar) {
            String strC = n8aVar.c();
            if ("data".equals(strC) || "filePartClassNames".equals(strC)) {
                return new fqc(this);
            }
            if ("strings".equals(strC)) {
                return new gqc(this);
            }
            return null;
        }

        @Override // oi8.a
        public final void d(n8a n8aVar, a62 a62Var, n8a n8aVar2) {
        }

        @Override // oi8.a
        public final oi8.a e(a62 a62Var, n8a n8aVar) {
            return null;
        }

        @Override // oi8.a
        public final void f(n8a n8aVar, Object obj) {
            String strC = n8aVar.c();
            boolean zEquals = "version".equals(strC);
            bqc bqcVar = bqc.this;
            if (zEquals) {
                if (obj instanceof int[]) {
                    bqcVar.a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strC)) {
                bqcVar.b = obj instanceof String ? (String) obj : null;
            }
        }
    }

    static {
        try {
            i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            i = false;
        }
        HashMap map = new HashMap();
        j = map;
        map.put(a62.a.b(new mq5("kotlin.jvm.internal.KotlinClass")), hi8.a.CLASS);
        map.put(a62.a.b(new mq5("kotlin.jvm.internal.KotlinFileFacade")), hi8.a.FILE_FACADE);
        map.put(a62.a.b(new mq5("kotlin.jvm.internal.KotlinMultifileClass")), hi8.a.MULTIFILE_CLASS);
        map.put(a62.a.b(new mq5("kotlin.jvm.internal.KotlinMultifileClassPart")), hi8.a.MULTIFILE_CLASS_PART);
        map.put(a62.a.b(new mq5("kotlin.jvm.internal.KotlinSyntheticClass")), hi8.a.SYNTHETIC_CLASS);
    }

    @Override // oi8.c
    public final void a() {
    }

    @Override // oi8.c
    public final oi8.a b(a62 a62Var, uuc uucVar) {
        hi8.a aVar;
        mq5 mq5VarA = a62Var.a();
        if (mq5VarA.equals(kc8.a)) {
            return new b();
        }
        if (mq5VarA.equals(kc8.o)) {
            return new c();
        }
        if (i || this.g != null || (aVar = (hi8.a) j.get(a62Var)) == null) {
            return null;
        }
        this.g = aVar;
        return new d();
    }
}
