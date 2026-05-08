package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ha {
    public static final g a;
    public static final e b;
    public static final c c;
    public static final d d;
    public static final f e;
    public static final b f;
    public static final a g;
    public static final h h;
    public static final nma<String> i;
    public static final nma<Double> j;
    public static final nma<Integer> k;
    public static final nma<Boolean> l;
    public static final nma<Object> m;

    public static final class a implements ga<Object> {
        @Override // defpackage.ga
        public final Object a(mb8 mb8Var, lb3 lb3Var) {
            mb8Var.getClass();
            lb3Var.getClass();
            Object objA = defpackage.e.a(mb8Var);
            objA.getClass();
            return objA;
        }

        @Override // defpackage.ga
        public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
            hc8Var.getClass();
            lb3Var.getClass();
            obj.getClass();
            defpackage.f.a(hc8Var, obj);
        }
    }

    public static final class b implements ga<Boolean> {
        @Override // defpackage.ga
        public final Boolean a(mb8 mb8Var, lb3 lb3Var) {
            mb8Var.getClass();
            lb3Var.getClass();
            return Boolean.valueOf(mb8Var.nextBoolean());
        }

        @Override // defpackage.ga
        public final void b(hc8 hc8Var, lb3 lb3Var, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            hc8Var.getClass();
            lb3Var.getClass();
            hc8Var.V(zBooleanValue);
        }
    }

    public static final class c implements ga<Double> {
        @Override // defpackage.ga
        public final Double a(mb8 mb8Var, lb3 lb3Var) {
            mb8Var.getClass();
            lb3Var.getClass();
            return Double.valueOf(mb8Var.nextDouble());
        }

        @Override // defpackage.ga
        public final void b(hc8 hc8Var, lb3 lb3Var, Double d) {
            double dDoubleValue = d.doubleValue();
            hc8Var.getClass();
            lb3Var.getClass();
            hc8Var.K(dDoubleValue);
        }
    }

    public static final class d implements ga<Float> {
        @Override // defpackage.ga
        public final Float a(mb8 mb8Var, lb3 lb3Var) {
            mb8Var.getClass();
            lb3Var.getClass();
            return Float.valueOf((float) mb8Var.nextDouble());
        }

        @Override // defpackage.ga
        public final void b(hc8 hc8Var, lb3 lb3Var, Float f) {
            float fFloatValue = f.floatValue();
            hc8Var.getClass();
            lb3Var.getClass();
            hc8Var.K(fFloatValue);
        }
    }

    public static final class e implements ga<Integer> {
        @Override // defpackage.ga
        public final Integer a(mb8 mb8Var, lb3 lb3Var) {
            mb8Var.getClass();
            lb3Var.getClass();
            return Integer.valueOf(mb8Var.nextInt());
        }

        @Override // defpackage.ga
        public final void b(hc8 hc8Var, lb3 lb3Var, Integer num) {
            int iIntValue = num.intValue();
            hc8Var.getClass();
            lb3Var.getClass();
            hc8Var.F(iIntValue);
        }
    }

    public static final class f implements ga<Long> {
        @Override // defpackage.ga
        public final Long a(mb8 mb8Var, lb3 lb3Var) {
            mb8Var.getClass();
            lb3Var.getClass();
            return Long.valueOf(mb8Var.nextLong());
        }

        @Override // defpackage.ga
        public final void b(hc8 hc8Var, lb3 lb3Var, Long l) {
            long jLongValue = l.longValue();
            hc8Var.getClass();
            lb3Var.getClass();
            hc8Var.E(jLongValue);
        }
    }

    public static final class g implements ga<String> {
        @Override // defpackage.ga
        public final String a(mb8 mb8Var, lb3 lb3Var) {
            return ia.l(mb8Var, lb3Var);
        }

        @Override // defpackage.ga
        public final void b(hc8 hc8Var, lb3 lb3Var, String str) {
            String str2 = str;
            hc8Var.getClass();
            lb3Var.getClass();
            str2.getClass();
            hc8Var.T0(str2);
        }
    }

    public static final class h implements ga<zgg> {
        @Override // defpackage.ga
        public final zgg a(mb8 mb8Var, lb3 lb3Var) {
            throw ja.e(mb8Var, lb3Var, "File Upload used in output position");
        }

        @Override // defpackage.ga
        public final void b(hc8 hc8Var, lb3 lb3Var, zgg zggVar) {
            zgg zggVar2 = zggVar;
            hc8Var.getClass();
            lb3Var.getClass();
            zggVar2.getClass();
            hc8Var.C(zggVar2);
        }
    }

    static {
        g gVar = new g();
        a = gVar;
        e eVar = new e();
        b = eVar;
        c cVar = new c();
        c = cVar;
        d = new d();
        e = new f();
        b bVar = new b();
        f = bVar;
        a aVar = new a();
        g = aVar;
        h = new h();
        i = new nma<>(gVar);
        j = new nma<>(cVar);
        k = new nma<>(eVar);
        l = new nma<>(bVar);
        m = new nma<>(aVar);
    }

    public static final <T> cmb<T> a(ga<T> gaVar) {
        gaVar.getClass();
        return new cmb<>(gaVar);
    }
}
