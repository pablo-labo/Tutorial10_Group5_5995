package defpackage;

import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class c79 implements b79 {
    public final yd2 a = hh1.e();
    public final g4a b = r.f(null);
    public final g4a c = r.f(null);
    public final az3 d;
    public final az3 e;

    public static final class a extends mj8 implements gu5<Boolean> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf((((s69) ((gme) c79.this.b).getValue()) == null && ((Throwable) ((gme) c79.this.c).getValue()) == null) ? false : true);
        }
    }

    public static final class b extends mj8 implements gu5<Boolean> {
        public b() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf(((Throwable) ((gme) c79.this.c).getValue()) != null);
        }
    }

    public static final class c extends mj8 implements gu5<Boolean> {
        public c() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf(((s69) ((gme) c79.this.b).getValue()) == null && ((Throwable) ((gme) c79.this.c).getValue()) == null);
        }
    }

    public static final class d extends mj8 implements gu5<Boolean> {
        public d() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf(((s69) ((gme) c79.this.b).getValue()) != null);
        }
    }

    public c79() {
        r.c(new c());
        this.d = r.c(new a());
        r.c(new b());
        this.e = r.c(new d());
    }

    @Override // defpackage.ese
    public final s69 getValue() {
        return (s69) ((gme) this.b).getValue();
    }
}
