package org.apache.avro;

import com.datadog.android.log.LogAttributes;
import defpackage.bg;
import defpackage.e49;
import defpackage.h49;
import defpackage.l5;
import defpackage.p49;
import defpackage.r6;
import defpackage.t40;
import defpackage.uz;
import defpackage.w40;
import defpackage.z3;
import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final e49 a = h49.b(c.class);
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final a c;
    public static final m d;
    public static final b e;
    public static final i f;
    public static final h g;
    public static final k h;
    public static final j i;
    public static final l j;
    public static final e k;
    public static final d l;
    public static final f m;

    public static class a extends p49 {
        @Override // defpackage.p49
        public final void b(org.apache.avro.g gVar) {
            super.b(gVar);
            if (gVar.K() == g.u.BYTES) {
                return;
            }
            l5.q("BigDecimal can only be used with an underlying bytes type");
        }
    }

    public static class b extends p49 {
        @Override // defpackage.p49
        public final void b(org.apache.avro.g gVar) {
            super.b(gVar);
            if (gVar.K() == g.u.INT) {
                return;
            }
            l5.q("Date can only be used with an underlying int type");
        }
    }

    /* JADX INFO: renamed from: org.apache.avro.c$c, reason: collision with other inner class name */
    public static class C0376c extends p49 {
        public final int c;
        public final int d;

        public C0376c(org.apache.avro.g gVar) {
            super("decimal");
            if (!gVar.g("precision")) {
                l5.q("Invalid decimal: missing precision");
                throw null;
            }
            this.c = c("precision", gVar);
            if (gVar.g("scale")) {
                this.d = c("scale", gVar);
            } else {
                this.d = 0;
            }
        }

        public static int c(String str, org.apache.avro.g gVar) {
            Object objC = gVar.c(str);
            if (objC instanceof Integer) {
                return ((Integer) objC).intValue();
            }
            throw new IllegalArgumentException(t40.l("Expected int ", str, ": ", objC == null ? "null" : z3.m(String.valueOf(objC), ":", objC.getClass().getSimpleName())));
        }

        public static long d(org.apache.avro.g gVar) {
            if (gVar.K() == g.u.BYTES) {
                return 2147483647L;
            }
            if (gVar.K() != g.u.FIXED) {
                return 0L;
            }
            return Math.round(Math.floor(Math.log10(2.0d) * ((double) ((gVar.D() * 8) - 1))));
        }

        @Override // defpackage.p49
        public final void a(org.apache.avro.g gVar) {
            super.a(gVar);
            gVar.a(Integer.valueOf(this.c), "precision");
            gVar.a(Integer.valueOf(this.d), "scale");
        }

        @Override // defpackage.p49
        public final void b(org.apache.avro.g gVar) {
            super.b(gVar);
            if (gVar.K() != g.u.FIXED && gVar.K() != g.u.BYTES) {
                l5.q("Logical type decimal must be backed by fixed or bytes");
                return;
            }
            int i = this.c;
            if (i <= 0) {
                l5.q(bg.d(i, "Invalid decimal precision: ", " (must be positive)"));
                return;
            }
            if (i > d(gVar)) {
                l5.q(r6.d(d(gVar), ")", uz.f("fixed(", gVar.D(), ") cannot store ", i, " digits (max ")));
                return;
            }
            int i2 = this.d;
            if (i2 < 0) {
                l5.q(bg.d(i2, "Invalid decimal scale: ", " (must be positive)"));
            } else {
                if (i2 <= i) {
                    return;
                }
                l5.q(w40.e("Invalid decimal scale: ", i2, " (greater than precision: ", i, ")"));
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0376c.class == obj.getClass()) {
                C0376c c0376c = (C0376c) obj;
                if (this.c == c0376c.c && this.d == c0376c.d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.c * 31) + this.d;
        }
    }

    public static class d extends p49 {
        @Override // defpackage.p49
        public final void b(org.apache.avro.g gVar) {
            super.b(gVar);
            if (gVar.K() == g.u.LONG) {
                return;
            }
            l5.q("Local timestamp (micros) can only be used with an underlying long type");
        }
    }

    public static class e extends p49 {
        @Override // defpackage.p49
        public final void b(org.apache.avro.g gVar) {
            super.b(gVar);
            if (gVar.K() == g.u.LONG) {
                return;
            }
            l5.q("Local timestamp (millis) can only be used with an underlying long type");
        }
    }

    public static class f extends p49 {
        @Override // defpackage.p49
        public final void b(org.apache.avro.g gVar) {
            super.b(gVar);
            if (gVar.K() == g.u.LONG) {
                return;
            }
            l5.q("Local timestamp (micros) can only be used with an underlying long type");
        }
    }

    public interface g {
        p49 a();
    }

    public static class h extends p49 {
        @Override // defpackage.p49
        public final void b(org.apache.avro.g gVar) {
            super.b(gVar);
            if (gVar.K() == g.u.LONG) {
                return;
            }
            l5.q("Time (micros) can only be used with an underlying long type");
        }
    }

    public static class i extends p49 {
        @Override // defpackage.p49
        public final void b(org.apache.avro.g gVar) {
            super.b(gVar);
            if (gVar.K() == g.u.INT) {
                return;
            }
            l5.q("Time (millis) can only be used with an underlying int type");
        }
    }

    public static class j extends p49 {
        @Override // defpackage.p49
        public final void b(org.apache.avro.g gVar) {
            super.b(gVar);
            if (gVar.K() == g.u.LONG) {
                return;
            }
            l5.q("Timestamp (micros) can only be used with an underlying long type");
        }
    }

    public static class k extends p49 {
        @Override // defpackage.p49
        public final void b(org.apache.avro.g gVar) {
            super.b(gVar);
            if (gVar.K() == g.u.LONG) {
                return;
            }
            l5.q("Timestamp (millis) can only be used with an underlying long type");
        }
    }

    public static class l extends p49 {
        @Override // defpackage.p49
        public final void b(org.apache.avro.g gVar) {
            super.b(gVar);
            if (gVar.K() == g.u.LONG) {
                return;
            }
            l5.q("Timestamp (nanos) can only be used with an underlying long type");
        }
    }

    public static class m extends p49 {
        @Override // defpackage.p49
        public final void b(org.apache.avro.g gVar) {
            super.b(gVar);
            if (gVar.K() != g.u.STRING && gVar.K() != g.u.FIXED) {
                l5.q("Uuid can only be used with an underlying string or fixed type");
            } else {
                if (gVar.K() != g.u.FIXED || gVar.D() == 16) {
                    return;
                }
                l5.q("Uuid with fixed type must have a size of 16 bytes");
            }
        }
    }

    static {
        Iterator it = ServiceLoader.load(g.class).iterator();
        if (it.hasNext()) {
            Objects.requireNonNull((g) it.next(), "Logical type factory cannot be null");
            throw new UnsupportedOperationException("LogicalTypeFactory TypeName has not been provided");
        }
        c = new a("big-decimal");
        d = new m("uuid");
        "duration".intern();
        e = new b(LogAttributes.DATE);
        f = new i("time-millis");
        g = new h("time-micros");
        h = new k("timestamp-millis");
        i = new j("timestamp-micros");
        j = new l("timestamp-nanos");
        k = new e("local-timestamp-millis");
        l = new d("local-timestamp-micros");
        m = new f("local-timestamp-nanos");
    }
}
