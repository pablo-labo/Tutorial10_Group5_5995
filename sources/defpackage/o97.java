package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o97 {
    public final int a;
    public final String b;
    public final a c;
    public final d d;
    public final b e;
    public final c f;
    public final e g;
    public final f h;
    public final g i;
    public final h j;

    public static final class a {
        public final e a;
        public final C0340a b;
        public final b c;
        public final c d;
        public final d e;
        public final f f;

        /* JADX INFO: renamed from: o97$a$a, reason: collision with other inner class name */
        public static final class C0340a {
            public final long a;
            public final long b;
            public final long c;
            public final long d;
            public final c e;
            public final d f;
            public final C0341a g;
            public final b h;
            public final e i;

            /* JADX INFO: renamed from: o97$a$a$a, reason: collision with other inner class name */
            public static final class C0341a {
                public final long a;
                public final long b;
                public final long c;
                public final f d;
                public final e e;
                public final b f;
                public final c g;
                public final C0342a h;
                public final d i;

                /* JADX INFO: renamed from: o97$a$a$a$a, reason: collision with other inner class name */
                public static final class C0342a {
                    public final long a;
                    public final long b;
                    public final long c;
                    public final C0343a d;

                    /* JADX INFO: renamed from: o97$a$a$a$a$a, reason: collision with other inner class name */
                    public static final class C0343a {
                        public final long a;
                        public final long b;
                        public final long c;

                        public C0343a(long j, long j2, long j3) {
                            this.a = j;
                            this.b = j2;
                            this.c = j3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C0343a)) {
                                return false;
                            }
                            C0343a c0343a = (C0343a) obj;
                            return da2.c(this.a, c0343a.a) && da2.c(this.b, c0343a.b) && da2.c(this.c, c0343a.c);
                        }

                        public final int hashCode() {
                            int i = da2.j;
                            return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                        }

                        public final String toString() {
                            String strI = da2.i(this.a);
                            String strI2 = da2.i(this.b);
                            return l6.i(u40.f("Weak(base=", strI, ", hover=", strI2, ", active="), da2.i(this.c), ")");
                        }
                    }

                    public C0342a(long j, long j2, long j3, C0343a c0343a) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                        this.d = c0343a;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0342a)) {
                            return false;
                        }
                        C0342a c0342a = (C0342a) obj;
                        return da2.c(this.a, c0342a.a) && da2.c(this.b, c0342a.b) && da2.c(this.c, c0342a.c) && this.d.equals(c0342a.d);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return this.d.hashCode() + ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        String strI3 = da2.i(this.c);
                        StringBuilder sbF = u40.f("Destructive(base=", strI, ", hover=", strI2, ", active=");
                        sbF.append(strI3);
                        sbF.append(", weak=");
                        sbF.append(this.d);
                        sbF.append(")");
                        return sbF.toString();
                    }
                }

                /* JADX INFO: renamed from: o97$a$a$a$b */
                public static final class b {
                    public final long a;
                    public final long b;
                    public final long c;

                    public b(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return da2.c(this.a, bVar.a) && da2.c(this.b, bVar.b) && da2.c(this.c, bVar.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Inverse(base=", strI, ", hover=", strI2, ", active="), da2.i(this.c), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$a$a$c */
                public static final class c {
                    public final long a;
                    public final long b;
                    public final long c;

                    public c(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof c)) {
                            return false;
                        }
                        c cVar = (c) obj;
                        return da2.c(this.a, cVar.a) && da2.c(this.b, cVar.b) && da2.c(this.c, cVar.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Primary(base=", strI, ", hover=", strI2, ", active="), da2.i(this.c), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$a$a$d */
                public static final class d {
                    public final long a;
                    public final long b;
                    public final long c;

                    public d(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof d)) {
                            return false;
                        }
                        d dVar = (d) obj;
                        return da2.c(this.a, dVar.a) && da2.c(this.b, dVar.b) && da2.c(this.c, dVar.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Transparent(base=", strI, ", hover=", strI2, ", active="), da2.i(this.c), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$a$a$e */
                public static final class e {
                    public final long a;
                    public final long b;
                    public final long c;

                    public e(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof e)) {
                            return false;
                        }
                        e eVar = (e) obj;
                        return da2.c(this.a, eVar.a) && da2.c(this.b, eVar.b) && da2.c(this.c, eVar.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Weak(base=", strI, ", hover=", strI2, ", active="), da2.i(this.c), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$a$a$f */
                public static final class f {
                    public final long a;
                    public final long b;
                    public final long c;

                    public f(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof f)) {
                            return false;
                        }
                        f fVar = (f) obj;
                        return da2.c(this.a, fVar.a) && da2.c(this.b, fVar.b) && da2.c(this.c, fVar.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Weaker(base=", strI, ", hover=", strI2, ", active="), da2.i(this.c), ")");
                    }
                }

                public C0341a(long j, long j2, long j3, f fVar, e eVar, b bVar, c cVar, C0342a c0342a, d dVar) {
                    this.a = j;
                    this.b = j2;
                    this.c = j3;
                    this.d = fVar;
                    this.e = eVar;
                    this.f = bVar;
                    this.g = cVar;
                    this.h = c0342a;
                    this.i = dVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0341a)) {
                        return false;
                    }
                    C0341a c0341a = (C0341a) obj;
                    return da2.c(this.a, c0341a.a) && da2.c(this.b, c0341a.b) && da2.c(this.c, c0341a.c) && this.d.equals(c0341a.d) && this.e.equals(c0341a.e) && this.f.equals(c0341a.f) && this.g.equals(c0341a.g) && this.h.equals(c0341a.h) && this.i.equals(c0341a.i);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31)) * 31);
                }

                public final String toString() {
                    String strI = da2.i(this.a);
                    String strI2 = da2.i(this.b);
                    String strI3 = da2.i(this.c);
                    StringBuilder sbF = u40.f("Action(base=", strI, ", hover=", strI2, ", active=");
                    sbF.append(strI3);
                    sbF.append(", weaker=");
                    sbF.append(this.d);
                    sbF.append(", weak=");
                    sbF.append(this.e);
                    sbF.append(", inverse=");
                    sbF.append(this.f);
                    sbF.append(", primary=");
                    sbF.append(this.g);
                    sbF.append(", destructive=");
                    sbF.append(this.h);
                    sbF.append(", transparent=");
                    sbF.append(this.i);
                    sbF.append(")");
                    return sbF.toString();
                }
            }

            /* JADX INFO: renamed from: o97$a$a$b */
            public static final class b {
                public final long a;
                public final long b;
                public final long c;
                public final long d;

                public b(long j, long j2, long j3, long j4) {
                    this.a = j;
                    this.b = j2;
                    this.c = j3;
                    this.d = j4;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return da2.c(this.a, bVar.a) && da2.c(this.b, bVar.b) && da2.c(this.c, bVar.c) && da2.c(this.d, bVar.d);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.d) + ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
                }

                public final String toString() {
                    String strI = da2.i(this.a);
                    String strI2 = da2.i(this.b);
                    return z3.n(u40.f("Inverse(base=", strI, ", weaker=", strI2, ", weak="), da2.i(this.c), ", strong=", da2.i(this.d), ")");
                }
            }

            /* JADX INFO: renamed from: o97$a$a$c */
            public static final class c {
                public final long a;
                public final long b;

                public c(long j, long j2) {
                    this.a = j;
                    this.b = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return da2.c(this.a, cVar.a) && da2.c(this.b, cVar.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return akb.k("Page(base=", da2.i(this.a), ", strong=", da2.i(this.b), ")");
                }
            }

            /* JADX INFO: renamed from: o97$a$a$d */
            public static final class d {
                public final long a;
                public final long b;

                public d(long j, long j2) {
                    this.a = j;
                    this.b = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return da2.c(this.a, dVar.a) && da2.c(this.b, dVar.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return akb.k("Primary(base=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                }
            }

            /* JADX INFO: renamed from: o97$a$a$e */
            public static final class e {
                public final b a;
                public final c b;
                public final C0344a c;
                public final C0345e d;
                public final f e;

                /* JADX INFO: renamed from: o97$a$a$e$a, reason: collision with other inner class name */
                public static final class C0344a implements d {
                    public final long a;
                    public final long b;
                    public final long c;

                    public C0344a(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    @Override // o97.a.C0340a.e.d
                    public final long a() {
                        return this.b;
                    }

                    @Override // o97.a.C0340a.e.d
                    public final long b() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0344a)) {
                            return false;
                        }
                        C0344a c0344a = (C0344a) obj;
                        return da2.c(this.a, c0344a.a) && da2.c(this.b, c0344a.b) && da2.c(this.c, c0344a.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Critical(base=", strI, ", weak=", strI2, ", weaker="), da2.i(this.c), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$a$e$b */
                public static final class b implements d {
                    public final long a;
                    public final long b;
                    public final long c;

                    public b(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    @Override // o97.a.C0340a.e.d
                    public final long a() {
                        return this.b;
                    }

                    @Override // o97.a.C0340a.e.d
                    public final long b() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return da2.c(this.a, bVar.a) && da2.c(this.b, bVar.b) && da2.c(this.c, bVar.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Generic(base=", strI, ", weak=", strI2, ", weaker="), da2.i(this.c), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$a$e$c */
                public static final class c implements d {
                    public final long a;
                    public final long b;
                    public final long c;

                    public c(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    @Override // o97.a.C0340a.e.d
                    public final long a() {
                        return this.b;
                    }

                    @Override // o97.a.C0340a.e.d
                    public final long b() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof c)) {
                            return false;
                        }
                        c cVar = (c) obj;
                        return da2.c(this.a, cVar.a) && da2.c(this.b, cVar.b) && da2.c(this.c, cVar.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Info(base=", strI, ", weak=", strI2, ", weaker="), da2.i(this.c), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$a$e$d */
                public interface d {
                    long a();

                    long b();
                }

                /* JADX INFO: renamed from: o97$a$a$e$e, reason: collision with other inner class name */
                public static final class C0345e implements d {
                    public final long a;
                    public final long b;
                    public final long c;

                    public C0345e(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    @Override // o97.a.C0340a.e.d
                    public final long a() {
                        return this.b;
                    }

                    @Override // o97.a.C0340a.e.d
                    public final long b() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0345e)) {
                            return false;
                        }
                        C0345e c0345e = (C0345e) obj;
                        return da2.c(this.a, c0345e.a) && da2.c(this.b, c0345e.b) && da2.c(this.c, c0345e.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Success(base=", strI, ", weak=", strI2, ", weaker="), da2.i(this.c), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$a$e$f */
                public static final class f implements d {
                    public final long a;
                    public final long b;
                    public final long c;

                    public f(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    @Override // o97.a.C0340a.e.d
                    public final long a() {
                        return this.b;
                    }

                    @Override // o97.a.C0340a.e.d
                    public final long b() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof f)) {
                            return false;
                        }
                        f fVar = (f) obj;
                        return da2.c(this.a, fVar.a) && da2.c(this.b, fVar.b) && da2.c(this.c, fVar.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Warning(base=", strI, ", weak=", strI2, ", weaker="), da2.i(this.c), ")");
                    }
                }

                public e(b bVar, c cVar, C0344a c0344a, C0345e c0345e, f fVar) {
                    this.a = bVar;
                    this.b = cVar;
                    this.c = c0344a;
                    this.d = c0345e;
                    this.e = fVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c.equals(eVar.c) && this.d.equals(eVar.d) && this.e.equals(eVar.e);
                }

                public final int hashCode() {
                    return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
                }

                public final String toString() {
                    return "Status(generic=" + this.a + ", info=" + this.b + ", critical=" + this.c + ", success=" + this.d + ", warning=" + this.e + ")";
                }
            }

            public C0340a(long j, long j2, long j3, long j4, c cVar, d dVar, C0341a c0341a, b bVar, e eVar) {
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = j4;
                this.e = cVar;
                this.f = dVar;
                this.g = c0341a;
                this.h = bVar;
                this.i = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0340a)) {
                    return false;
                }
                C0340a c0340a = (C0340a) obj;
                return da2.c(this.a, c0340a.a) && da2.c(this.b, c0340a.b) && da2.c(this.c, c0340a.c) && da2.c(this.d, c0340a.d) && this.e.equals(c0340a.e) && this.f.equals(c0340a.f) && this.g.equals(c0340a.g) && this.h.equals(c0340a.h) && this.i.equals(c0340a.i);
            }

            public final int hashCode() {
                int i = da2.j;
                return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ia.d(ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                String strI = da2.i(this.a);
                String strI2 = da2.i(this.b);
                String strI3 = da2.i(this.c);
                String strI4 = da2.i(this.d);
                StringBuilder sbF = u40.f("Background(base=", strI, ", weaker=", strI2, ", weak=");
                ia.r(sbF, strI3, ", strong=", strI4, ", page=");
                sbF.append(this.e);
                sbF.append(", primary=");
                sbF.append(this.f);
                sbF.append(", action=");
                sbF.append(this.g);
                sbF.append(", inverse=");
                sbF.append(this.h);
                sbF.append(", status=");
                sbF.append(this.i);
                sbF.append(")");
                return sbF.toString();
            }
        }

        public static final class b {
            public final long a;
            public final long b;
            public final long c;
            public final long d;
            public final long e;
            public final C0346a f;
            public final C0349b g;

            /* JADX INFO: renamed from: o97$a$b$a, reason: collision with other inner class name */
            public static final class C0346a {
                public final long a;
                public final long b;
                public final long c;
                public final C0348b d;
                public final C0347a e;

                /* JADX INFO: renamed from: o97$a$b$a$a, reason: collision with other inner class name */
                public static final class C0347a {
                    public final long a;
                    public final long b;
                    public final long c;

                    public C0347a(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0347a)) {
                            return false;
                        }
                        C0347a c0347a = (C0347a) obj;
                        return da2.c(this.a, c0347a.a) && da2.c(this.b, c0347a.b) && da2.c(this.c, c0347a.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Destructive(base=", strI, ", hover=", strI2, ", active="), da2.i(this.c), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$b$a$b, reason: collision with other inner class name */
                public static final class C0348b {
                    public final long a;
                    public final long b;
                    public final long c;

                    public C0348b(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0348b)) {
                            return false;
                        }
                        C0348b c0348b = (C0348b) obj;
                        return da2.c(this.a, c0348b.a) && da2.c(this.b, c0348b.b) && da2.c(this.c, c0348b.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Weak(base=", strI, ", hover=", strI2, ", active="), da2.i(this.c), ")");
                    }
                }

                public C0346a(long j, long j2, long j3, C0348b c0348b, C0347a c0347a) {
                    this.a = j;
                    this.b = j2;
                    this.c = j3;
                    this.d = c0348b;
                    this.e = c0347a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0346a)) {
                        return false;
                    }
                    C0346a c0346a = (C0346a) obj;
                    return da2.c(this.a, c0346a.a) && da2.c(this.b, c0346a.b) && da2.c(this.c, c0346a.c) && this.d.equals(c0346a.d) && this.e.equals(c0346a.e);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return this.e.hashCode() + ((this.d.hashCode() + ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
                }

                public final String toString() {
                    String strI = da2.i(this.a);
                    String strI2 = da2.i(this.b);
                    String strI3 = da2.i(this.c);
                    StringBuilder sbF = u40.f("Action(base=", strI, ", hover=", strI2, ", active=");
                    sbF.append(strI3);
                    sbF.append(", weak=");
                    sbF.append(this.d);
                    sbF.append(", destructive=");
                    sbF.append(this.e);
                    sbF.append(")");
                    return sbF.toString();
                }
            }

            /* JADX INFO: renamed from: o97$a$b$b, reason: collision with other inner class name */
            public static final class C0349b {
                public final long a;
                public final long b;
                public final C0350a c;
                public final long d;
                public final long e;

                /* JADX INFO: renamed from: o97$a$b$b$a, reason: collision with other inner class name */
                public static final class C0350a {
                    public final long a;
                    public final long b;

                    public C0350a(long j, long j2) {
                        this.a = j;
                        this.b = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0350a)) {
                            return false;
                        }
                        C0350a c0350a = (C0350a) obj;
                        return da2.c(this.a, c0350a.a) && da2.c(this.b, c0350a.b);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                    }

                    public final String toString() {
                        return akb.k("Critical(base=", da2.i(this.a), ", strong=", da2.i(this.b), ")");
                    }
                }

                public C0349b(long j, long j2, C0350a c0350a, long j3, long j4) {
                    this.a = j;
                    this.b = j2;
                    this.c = c0350a;
                    this.d = j3;
                    this.e = j4;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0349b)) {
                        return false;
                    }
                    C0349b c0349b = (C0349b) obj;
                    return da2.c(this.a, c0349b.a) && da2.c(this.b, c0349b.b) && this.c.equals(c0349b.c) && da2.c(this.d, c0349b.d) && da2.c(this.e, c0349b.e);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.e) + ia.d((this.c.hashCode() + ia.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
                }

                public final String toString() {
                    String strI = da2.i(this.a);
                    String strI2 = da2.i(this.b);
                    String strI3 = da2.i(this.d);
                    String strI4 = da2.i(this.e);
                    StringBuilder sbF = u40.f("Status(generic=", strI, ", info=", strI2, ", critical=");
                    sbF.append(this.c);
                    sbF.append(", success=");
                    sbF.append(strI3);
                    sbF.append(", warning=");
                    return l6.i(sbF, strI4, ")");
                }
            }

            public b(long j, long j2, long j3, long j4, long j5, C0346a c0346a, C0349b c0349b) {
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = j4;
                this.e = j5;
                this.f = c0346a;
                this.g = c0349b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return da2.c(this.a, bVar.a) && da2.c(this.b, bVar.b) && da2.c(this.c, bVar.c) && da2.c(this.d, bVar.d) && da2.c(this.e, bVar.e) && this.f.equals(bVar.f) && this.g.equals(bVar.g);
            }

            public final int hashCode() {
                int i = da2.j;
                return this.g.hashCode() + ((this.f.hashCode() + ia.d(ia.d(ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
            }

            public final String toString() {
                String strI = da2.i(this.a);
                String strI2 = da2.i(this.b);
                String strI3 = da2.i(this.c);
                String strI4 = da2.i(this.d);
                String strI5 = da2.i(this.e);
                StringBuilder sbF = u40.f("Border(base=", strI, ", weak=", strI2, ", inverse=");
                ia.r(sbF, strI3, ", primary=", strI4, ", strong=");
                sbF.append(strI5);
                sbF.append(", action=");
                sbF.append(this.f);
                sbF.append(", status=");
                sbF.append(this.g);
                sbF.append(")");
                return sbF.toString();
            }
        }

        public static final class c {
            public final C0351a a;
            public final b b;
            public final C0353c c;

            /* JADX INFO: renamed from: o97$a$c$a, reason: collision with other inner class name */
            public static final class C0351a {
                public final List<da2> a;
                public final List<Float> b;

                public C0351a(List<da2> list, List<Float> list2) {
                    this.a = list;
                    this.b = list2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0351a)) {
                        return false;
                    }
                    C0351a c0351a = (C0351a) obj;
                    return this.a.equals(c0351a.a) && this.b.equals(c0351a.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "Gradient(colors=" + this.a + ", stops=" + this.b + ")";
                }
            }

            public static final class b {
                public final long a;
                public final C0352a b;

                /* JADX INFO: renamed from: o97$a$c$b$a, reason: collision with other inner class name */
                public static final class C0352a {
                    public final long a;

                    public C0352a(long j) {
                        this.a = j;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0352a) && da2.c(this.a, ((C0352a) obj).a);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.a);
                    }

                    public final String toString() {
                        return l5.m("Inverse(base=", da2.i(this.a), ")");
                    }
                }

                public b(long j, C0352a c0352a) {
                    this.a = j;
                    this.b = c0352a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return da2.c(this.a, bVar.a) && this.b.equals(bVar.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return this.b.hashCode() + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return "IndeedLogo(base=" + da2.i(this.a) + ", inverse=" + this.b + ")";
                }
            }

            /* JADX INFO: renamed from: o97$a$c$c, reason: collision with other inner class name */
            public static final class C0353c {
                public final long a;
                public final long b;

                public C0353c(long j, long j2) {
                    this.a = j;
                    this.b = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0353c)) {
                        return false;
                    }
                    C0353c c0353c = (C0353c) obj;
                    return da2.c(this.a, c0353c.a) && da2.c(this.b, c0353c.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return akb.k("Spinner(base=", da2.i(this.a), ", inverse=", da2.i(this.b), ")");
                }
            }

            public c(C0351a c0351a, b bVar, C0353c c0353c) {
                this.a = c0351a;
                this.b = bVar;
                this.c = c0353c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c.equals(cVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "Component(skeleton=" + this.a + ", indeedLogo=" + this.b + ", spinner=" + this.c + ")";
            }
        }

        public static final class d {
            public final C0355d a;
            public final c b;
            public final g c;
            public final f d;
            public final h e;
            public final b f;
            public final C0354a g;
            public final e h;

            /* JADX INFO: renamed from: o97$a$d$a, reason: collision with other inner class name */
            public static final class C0354a {
                public final long a;
                public final long b;

                public C0354a(long j, long j2) {
                    this.a = j;
                    this.b = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0354a)) {
                        return false;
                    }
                    C0354a c0354a = (C0354a) obj;
                    return da2.c(this.a, c0354a.a) && da2.c(this.b, c0354a.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return akb.k("Aqua(strong=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                }
            }

            public static final class b {
                public final long a;
                public final long b;

                public b(long j, long j2) {
                    this.a = j;
                    this.b = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return da2.c(this.a, bVar.a) && da2.c(this.b, bVar.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return akb.k("Blue(strong=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                }
            }

            public static final class c {
                public final long a;
                public final long b;

                public c(long j, long j2) {
                    this.a = j;
                    this.b = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return da2.c(this.a, cVar.a) && da2.c(this.b, cVar.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return akb.k("Earth(strong=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                }
            }

            /* JADX INFO: renamed from: o97$a$d$d, reason: collision with other inner class name */
            public static final class C0355d {
                public final long a;
                public final long b;

                public C0355d(long j, long j2) {
                    this.a = j;
                    this.b = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0355d)) {
                        return false;
                    }
                    C0355d c0355d = (C0355d) obj;
                    return da2.c(this.a, c0355d.a) && da2.c(this.b, c0355d.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return akb.k("Gray(strong=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                }
            }

            public static final class e {
                public final long a;
                public final long b;

                public e(long j, long j2) {
                    this.a = j;
                    this.b = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return da2.c(this.a, eVar.a) && da2.c(this.b, eVar.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return akb.k("Green(strong=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                }
            }

            public static final class f {
                public final long a;
                public final long b;

                public f(long j, long j2) {
                    this.a = j;
                    this.b = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    f fVar = (f) obj;
                    return da2.c(this.a, fVar.a) && da2.c(this.b, fVar.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return akb.k("Magenta(strong=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                }
            }

            public static final class g {
                public final long a;
                public final long b;

                public g(long j, long j2) {
                    this.a = j;
                    this.b = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof g)) {
                        return false;
                    }
                    g gVar = (g) obj;
                    return da2.c(this.a, gVar.a) && da2.c(this.b, gVar.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return akb.k("Orange(strong=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                }
            }

            public static final class h {
                public final long a;
                public final long b;

                public h(long j, long j2) {
                    this.a = j;
                    this.b = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof h)) {
                        return false;
                    }
                    h hVar = (h) obj;
                    return da2.c(this.a, hVar.a) && da2.c(this.b, hVar.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return akb.k("Purple(strong=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                }
            }

            public d(C0355d c0355d, c cVar, g gVar, f fVar, h hVar, b bVar, C0354a c0354a, e eVar) {
                this.a = c0355d;
                this.b = cVar;
                this.c = gVar;
                this.d = fVar;
                this.e = hVar;
                this.f = bVar;
                this.g = c0354a;
                this.h = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c) && this.d.equals(dVar.d) && this.e.equals(dVar.e) && this.f.equals(dVar.f) && this.g.equals(dVar.g) && this.h.equals(dVar.h);
            }

            public final int hashCode() {
                return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Expressive(gray=" + this.a + ", earth=" + this.b + ", orange=" + this.c + ", magenta=" + this.d + ", purple=" + this.e + ", blue=" + this.f + ", aqua=" + this.g + ", green=" + this.h + ")";
            }
        }

        public static final class e {
            public final long a;
            public final long b;
            public final long c;
            public final long d;
            public final long e;
            public final long f;
            public final C0356a g;
            public final b h;

            /* JADX INFO: renamed from: o97$a$e$a, reason: collision with other inner class name */
            public static final class C0356a {
                public final long a;
                public final long b;
                public final long c;
                public final d d;
                public final b e;
                public final c f;
                public final C0357a g;

                /* JADX INFO: renamed from: o97$a$e$a$a, reason: collision with other inner class name */
                public static final class C0357a {
                    public final long a;
                    public final long b;
                    public final long c;

                    public C0357a(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0357a)) {
                            return false;
                        }
                        C0357a c0357a = (C0357a) obj;
                        return da2.c(this.a, c0357a.a) && da2.c(this.b, c0357a.b) && da2.c(this.c, c0357a.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Destructive(base=", strI, ", hover=", strI2, ", active="), da2.i(this.c), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$e$a$b */
                public static final class b {
                    public final long a;
                    public final long b;
                    public final long c;

                    public b(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return da2.c(this.a, bVar.a) && da2.c(this.b, bVar.b) && da2.c(this.c, bVar.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Inverse(base=", strI, ", hover=", strI2, ", active="), da2.i(this.c), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$e$a$c */
                public static final class c {
                    public final long a;
                    public final long b;
                    public final long c;

                    public c(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof c)) {
                            return false;
                        }
                        c cVar = (c) obj;
                        return da2.c(this.a, cVar.a) && da2.c(this.b, cVar.b) && da2.c(this.c, cVar.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Primary(base=", strI, ", hover=", strI2, ", active="), da2.i(this.c), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$e$a$d */
                public static final class d {
                    public final long a;
                    public final long b;
                    public final long c;

                    public d(long j, long j2, long j3) {
                        this.a = j;
                        this.b = j2;
                        this.c = j3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof d)) {
                            return false;
                        }
                        d dVar = (d) obj;
                        return da2.c(this.a, dVar.a) && da2.c(this.b, dVar.b) && da2.c(this.c, dVar.c);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        String strI = da2.i(this.a);
                        String strI2 = da2.i(this.b);
                        return l6.i(u40.f("Strong(base=", strI, ", hover=", strI2, ", active="), da2.i(this.c), ")");
                    }
                }

                public C0356a(long j, long j2, long j3, d dVar, b bVar, c cVar, C0357a c0357a) {
                    this.a = j;
                    this.b = j2;
                    this.c = j3;
                    this.d = dVar;
                    this.e = bVar;
                    this.f = cVar;
                    this.g = c0357a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0356a)) {
                        return false;
                    }
                    C0356a c0356a = (C0356a) obj;
                    return da2.c(this.a, c0356a.a) && da2.c(this.b, c0356a.b) && da2.c(this.c, c0356a.c) && this.d.equals(c0356a.d) && this.e.equals(c0356a.e) && this.f.equals(c0356a.f) && this.g.equals(c0356a.g);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31);
                }

                public final String toString() {
                    String strI = da2.i(this.a);
                    String strI2 = da2.i(this.b);
                    String strI3 = da2.i(this.c);
                    StringBuilder sbF = u40.f("Action(base=", strI, ", hover=", strI2, ", active=");
                    sbF.append(strI3);
                    sbF.append(", strong=");
                    sbF.append(this.d);
                    sbF.append(", inverse=");
                    sbF.append(this.e);
                    sbF.append(", primary=");
                    sbF.append(this.f);
                    sbF.append(", destructive=");
                    sbF.append(this.g);
                    sbF.append(")");
                    return sbF.toString();
                }
            }

            public static final class b {
                public final C0359b a;
                public final c b;
                public final C0358a c;
                public final C0360e d;
                public final f e;

                /* JADX INFO: renamed from: o97$a$e$b$a, reason: collision with other inner class name */
                public static final class C0358a implements d {
                    public final long a;
                    public final long b;

                    public C0358a(long j, long j2) {
                        this.a = j;
                        this.b = j2;
                    }

                    @Override // o97.a.e.b.d
                    public final long a() {
                        return this.b;
                    }

                    @Override // o97.a.e.b.d
                    public final long b() {
                        return this.a;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0358a)) {
                            return false;
                        }
                        C0358a c0358a = (C0358a) obj;
                        return da2.c(this.a, c0358a.a) && da2.c(this.b, c0358a.b);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                    }

                    public final String toString() {
                        return akb.k("Critical(base=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                    }
                }

                /* JADX INFO: renamed from: o97$a$e$b$b, reason: collision with other inner class name */
                public static final class C0359b implements d {
                    public final long a;
                    public final long b;

                    public C0359b(long j, long j2) {
                        this.a = j;
                        this.b = j2;
                    }

                    @Override // o97.a.e.b.d
                    public final long a() {
                        return this.b;
                    }

                    @Override // o97.a.e.b.d
                    public final long b() {
                        return this.a;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0359b)) {
                            return false;
                        }
                        C0359b c0359b = (C0359b) obj;
                        return da2.c(this.a, c0359b.a) && da2.c(this.b, c0359b.b);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                    }

                    public final String toString() {
                        return akb.k("Generic(base=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                    }
                }

                public static final class c implements d {
                    public final long a;
                    public final long b;

                    public c(long j, long j2) {
                        this.a = j;
                        this.b = j2;
                    }

                    @Override // o97.a.e.b.d
                    public final long a() {
                        return this.b;
                    }

                    @Override // o97.a.e.b.d
                    public final long b() {
                        return this.a;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof c)) {
                            return false;
                        }
                        c cVar = (c) obj;
                        return da2.c(this.a, cVar.a) && da2.c(this.b, cVar.b);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                    }

                    public final String toString() {
                        return akb.k("Info(base=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                    }
                }

                public interface d {
                    long a();

                    long b();
                }

                /* JADX INFO: renamed from: o97$a$e$b$e, reason: collision with other inner class name */
                public static final class C0360e implements d {
                    public final long a;
                    public final long b;

                    public C0360e(long j, long j2) {
                        this.a = j;
                        this.b = j2;
                    }

                    @Override // o97.a.e.b.d
                    public final long a() {
                        return this.b;
                    }

                    @Override // o97.a.e.b.d
                    public final long b() {
                        return this.a;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0360e)) {
                            return false;
                        }
                        C0360e c0360e = (C0360e) obj;
                        return da2.c(this.a, c0360e.a) && da2.c(this.b, c0360e.b);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                    }

                    public final String toString() {
                        return akb.k("Success(base=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                    }
                }

                public static final class f implements d {
                    public final long a;
                    public final long b;

                    public f(long j, long j2) {
                        this.a = j;
                        this.b = j2;
                    }

                    @Override // o97.a.e.b.d
                    public final long a() {
                        return this.b;
                    }

                    @Override // o97.a.e.b.d
                    public final long b() {
                        return this.a;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof f)) {
                            return false;
                        }
                        f fVar = (f) obj;
                        return da2.c(this.a, fVar.a) && da2.c(this.b, fVar.b);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                    }

                    public final String toString() {
                        return akb.k("Warning(base=", da2.i(this.a), ", weak=", da2.i(this.b), ")");
                    }
                }

                public b(C0359b c0359b, c cVar, C0358a c0358a, C0360e c0360e, f fVar) {
                    this.a = c0359b;
                    this.b = cVar;
                    this.c = c0358a;
                    this.d = c0360e;
                    this.e = fVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d) && this.e.equals(bVar.e);
                }

                public final int hashCode() {
                    return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
                }

                public final String toString() {
                    return "Status(generic=" + this.a + ", info=" + this.b + ", critical=" + this.c + ", success=" + this.d + ", warning=" + this.e + ")";
                }
            }

            public e(long j, long j2, long j3, long j4, long j5, long j6, C0356a c0356a, b bVar) {
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = j4;
                this.e = j5;
                this.f = j6;
                this.g = c0356a;
                this.h = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return da2.c(this.a, eVar.a) && da2.c(this.b, eVar.b) && da2.c(this.c, eVar.c) && da2.c(this.d, eVar.d) && da2.c(this.e, eVar.e) && da2.c(this.f, eVar.f) && this.g.equals(eVar.g) && this.h.equals(eVar.h);
            }

            public final int hashCode() {
                int i = da2.j;
                return this.h.hashCode() + ((this.g.hashCode() + ia.d(ia.d(ia.d(ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31);
            }

            public final String toString() {
                String strI = da2.i(this.a);
                String strI2 = da2.i(this.b);
                String strI3 = da2.i(this.c);
                String strI4 = da2.i(this.d);
                String strI5 = da2.i(this.e);
                String strI6 = da2.i(this.f);
                StringBuilder sbF = u40.f("Foreground(base=", strI, ", weak=", strI2, ", strong=");
                ia.r(sbF, strI3, ", primary=", strI4, ", accent=");
                ia.r(sbF, strI5, ", inverse=", strI6, ", action=");
                sbF.append(this.g);
                sbF.append(", status=");
                sbF.append(this.h);
                sbF.append(")");
                return sbF.toString();
            }
        }

        public static final class f {
            public final long a;
            public final long b;
            public final long c;
            public final C0361a d;
            public final b e;

            /* JADX INFO: renamed from: o97$a$f$a, reason: collision with other inner class name */
            public static final class C0361a {
                public final C0362a a;
                public final C0362a b;

                /* JADX INFO: renamed from: o97$a$f$a$a, reason: collision with other inner class name */
                public static final class C0362a {
                    public final long a;
                    public final long b;

                    public C0362a(long j, long j2) {
                        this.a = j;
                        this.b = j2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0362a)) {
                            return false;
                        }
                        C0362a c0362a = (C0362a) obj;
                        return da2.c(this.a, c0362a.a) && da2.c(this.b, c0362a.b);
                    }

                    public final int hashCode() {
                        int i = da2.j;
                        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                    }

                    public final String toString() {
                        return akb.k("Gradient(start=", da2.i(this.a), ", end=", da2.i(this.b), ")");
                    }
                }

                public C0361a(C0362a c0362a, C0362a c0362a2) {
                    this.a = c0362a;
                    this.b = c0362a2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0361a)) {
                        return false;
                    }
                    C0361a c0361a = (C0361a) obj;
                    return this.a.equals(c0361a.a) && this.b.equals(c0361a.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "Ai(weak=" + this.a + ", strong=" + this.b + ")";
                }
            }

            public static final class b {
                public final long a;
                public final long b;

                public b(long j, long j2) {
                    this.a = j;
                    this.b = j2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return da2.c(this.a, bVar.a) && da2.c(this.b, bVar.b);
                }

                public final int hashCode() {
                    int i = da2.j;
                    return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
                }

                public final String toString() {
                    return akb.k("Premium(start=", da2.i(this.a), ", end=", da2.i(this.b), ")");
                }
            }

            public f(long j, long j2, long j3, C0361a c0361a, b bVar) {
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = c0361a;
                this.e = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return da2.c(this.a, fVar.a) && da2.c(this.b, fVar.b) && da2.c(this.c, fVar.c) && this.d.equals(fVar.d) && this.e.equals(fVar.e);
            }

            public final int hashCode() {
                int i = da2.j;
                return this.e.hashCode() + ((this.d.hashCode() + ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
            }

            public final String toString() {
                String strI = da2.i(this.a);
                String strI2 = da2.i(this.b);
                String strI3 = da2.i(this.c);
                StringBuilder sbF = u40.f("Utility(overlay=", strI, ", shadow=", strI2, ", highlightSearch=");
                sbF.append(strI3);
                sbF.append(", ai=");
                sbF.append(this.d);
                sbF.append(", premium=");
                sbF.append(this.e);
                sbF.append(")");
                return sbF.toString();
            }
        }

        public a(e eVar, C0340a c0340a, b bVar, c cVar, d dVar, f fVar) {
            this.a = eVar;
            this.b = c0340a;
            this.c = bVar;
            this.d = cVar;
            this.e = dVar;
            this.f = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "SemanticColors(foreground=" + this.a + ", background=" + this.b + ", border=" + this.c + ", component=" + this.d + ", expressive=" + this.e + ", utility=" + this.f + ")";
        }
    }

    public static final class b {
        public final long a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;
        public final long h;

        public b(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = j4;
            this.e = j5;
            this.f = j6;
            this.g = j7;
            this.h = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bkf.a(this.a, bVar.a) && bkf.a(this.b, bVar.b) && bkf.a(this.c, bVar.c) && bkf.a(this.d, bVar.d) && bkf.a(this.e, bVar.e) && bkf.a(this.f, bVar.f) && bkf.a(this.g, bVar.g) && bkf.a(this.h, bVar.h);
        }

        public final int hashCode() {
            ckf[] ckfVarArr = bkf.b;
            return Long.hashCode(this.h) + ia.d(ia.d(ia.d(ia.d(ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            String strD = bkf.d(this.a);
            String strD2 = bkf.d(this.b);
            String strD3 = bkf.d(this.c);
            String strD4 = bkf.d(this.d);
            String strD5 = bkf.d(this.e);
            String strD6 = bkf.d(this.f);
            String strD7 = bkf.d(this.g);
            String strD8 = bkf.d(this.h);
            StringBuilder sbF = u40.f("SemanticFontSizes(l8=", strD, ", l7=", strD2, ", l6=");
            ia.r(sbF, strD3, ", l5=", strD4, ", l4=");
            ia.r(sbF, strD5, ", l3=", strD6, ", l2=");
            return z3.n(sbF, strD7, ", l1=", strD8, ")");
        }
    }

    public static final class c {
        public final to5 a;
        public final to5 b;
        public final to5 c;

        public c(to5 to5Var, to5 to5Var2, to5 to5Var3) {
            to5Var.getClass();
            to5Var2.getClass();
            to5Var3.getClass();
            this.a = to5Var;
            this.b = to5Var2;
            this.c = to5Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c);
        }

        public final int hashCode() {
            return (((this.a.a * 31) + this.b.a) * 31) + this.c.a;
        }

        public final String toString() {
            return "SemanticFontWeights(normal=" + this.a + ", medium=" + this.b + ", bold=" + this.c + ")";
        }
    }

    public static final class d {
        public final pn5 a;

        public d(pn5 pn5Var) {
            pn5Var.getClass();
            this.a = pn5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SemanticFonts(default=" + this.a + ")";
        }
    }

    public static final class e {
        public final long a;
        public final long b;
        public final long c;
        public final long d;

        public e(long j, long j2, long j3, long j4) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return bkf.a(this.a, eVar.a) && bkf.a(this.b, eVar.b) && bkf.a(this.c, eVar.c) && bkf.a(this.d, eVar.d);
        }

        public final int hashCode() {
            ckf[] ckfVarArr = bkf.b;
            return Long.hashCode(this.d) + ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            String strD = bkf.d(this.a);
            String strD2 = bkf.d(this.b);
            return z3.n(u40.f("SemanticLineHeights(tighter=", strD, ", tight=", strD2, ", normal="), bkf.d(this.c), ", loose=", bkf.d(this.d), ")");
        }
    }

    public static final class f {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public f(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return j94.c(0.0f, 0.0f) && j94.c(this.a, fVar.a) && j94.c(this.b, fVar.b) && j94.c(this.c, fVar.c) && j94.c(this.d, fVar.d);
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + k6.c(k6.c(k6.c(Float.hashCode(0.0f) * 31, this.a, 31), this.b, 31), this.c, 31);
        }

        public final String toString() {
            String strE = j94.e(0.0f);
            String strE2 = j94.e(this.a);
            String strE3 = j94.e(this.b);
            String strE4 = j94.e(this.c);
            String strE5 = j94.e(this.d);
            StringBuilder sbF = u40.f("SemanticRadii(none=", strE, ", small=", strE2, ", medium=");
            ia.r(sbF, strE3, ", large=", strE4, ", full=");
            return l6.i(sbF, strE5, ")");
        }
    }

    public static final class g {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && j94.c(4.0f, 4.0f) && j94.c(8.0f, 8.0f) && j94.c(12.0f, 12.0f) && j94.c(16.0f, 16.0f) && j94.c(24.0f, 24.0f) && j94.c(32.0f, 32.0f) && j94.c(48.0f, 48.0f) && j94.c(64.0f, 64.0f) && j94.c(80.0f, 80.0f) && j94.c(96.0f, 96.0f) && j94.c(128.0f, 128.0f) && j94.c(160.0f, 160.0f) && j94.c(192.0f, 192.0f) && j94.c(6.0f, 6.0f) && j94.c(10.0f, 10.0f) && j94.c(14.0f, 14.0f) && j94.c(3.0f, 3.0f) && j94.c(5.0f, 5.0f) && j94.c(9.0f, 9.0f) && j94.c(13.0f, 13.0f);
        }

        public final int hashCode() {
            return Float.hashCode(13.0f) + k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(Float.hashCode(4.0f) * 31, 8.0f, 31), 12.0f, 31), 16.0f, 31), 24.0f, 31), 32.0f, 31), 48.0f, 31), 64.0f, 31), 80.0f, 31), 96.0f, 31), 128.0f, 31), 160.0f, 31), 192.0f, 31), 6.0f, 31), 10.0f, 31), 14.0f, 31), 3.0f, 31), 5.0f, 31), 9.0f, 31);
        }

        public final String toString() {
            String strE = j94.e(4.0f);
            String strE2 = j94.e(8.0f);
            String strE3 = j94.e(12.0f);
            String strE4 = j94.e(16.0f);
            String strE5 = j94.e(24.0f);
            String strE6 = j94.e(32.0f);
            String strE7 = j94.e(48.0f);
            String strE8 = j94.e(64.0f);
            String strE9 = j94.e(80.0f);
            String strE10 = j94.e(96.0f);
            String strE11 = j94.e(128.0f);
            String strE12 = j94.e(160.0f);
            String strE13 = j94.e(192.0f);
            String strE14 = j94.e(6.0f);
            String strE15 = j94.e(10.0f);
            String strE16 = j94.e(14.0f);
            String strE17 = j94.e(3.0f);
            String strE18 = j94.e(5.0f);
            String strE19 = j94.e(9.0f);
            String strE20 = j94.e(13.0f);
            StringBuilder sbF = u40.f("SemanticSpace(s1=", strE, ", s2=", strE2, ", s3=");
            ia.r(sbF, strE3, ", s4=", strE4, ", s5=");
            ia.r(sbF, strE5, ", s6=", strE6, ", s7=");
            ia.r(sbF, strE7, ", s8=", strE8, ", s9=");
            ia.r(sbF, strE9, ", s10=", strE10, ", s11=");
            ia.r(sbF, strE11, ", s12=", strE12, ", s13=");
            ia.r(sbF, strE13, ", sc2=", strE14, ", sc3=");
            ia.r(sbF, strE15, ", sc4=", strE16, ", scb1=");
            ia.r(sbF, strE17, ", scb2=", strE18, ", scb3=");
            return z3.n(sbF, strE19, ", scb4=", strE20, ")");
        }
    }

    public static final class h {
        public final tjf a;
        public final tjf b;
        public final tjf c;
        public final tjf d;
        public final tjf e;
        public final tjf f;
        public final tjf g;
        public final tjf h;

        public h(tjf tjfVar, tjf tjfVar2, tjf tjfVar3, tjf tjfVar4, tjf tjfVar5, tjf tjfVar6, tjf tjfVar7, tjf tjfVar8) {
            this.a = tjfVar;
            this.b = tjfVar2;
            this.c = tjfVar3;
            this.d = tjfVar4;
            this.e = tjfVar5;
            this.f = tjfVar6;
            this.g = tjfVar7;
            this.h = tjfVar8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a.equals(hVar.a) && this.b.equals(hVar.b) && this.c.equals(hVar.c) && this.d.equals(hVar.d) && this.e.equals(hVar.e) && this.f.equals(hVar.f) && this.g.equals(hVar.g) && this.h.equals(hVar.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + t40.c(t40.c(t40.c(t40.c(t40.c(t40.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            return "SemanticText(level8=" + this.a + ", level7=" + this.b + ", level6=" + this.c + ", level5=" + this.d + ", level4=" + this.e + ", level3=" + this.f + ", level2=" + this.g + ", level1=" + this.h + ")";
        }
    }

    public o97(int i, String str, a aVar, d dVar, b bVar, c cVar, e eVar, f fVar, g gVar, h hVar) {
        this.a = i;
        this.b = str;
        this.c = aVar;
        this.d = dVar;
        this.e = bVar;
        this.f = cVar;
        this.g = eVar;
        this.h = fVar;
        this.i = gVar;
        this.j = hVar;
    }

    public final g a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o97)) {
            return false;
        }
        o97 o97Var = (o97) obj;
        return this.a == o97Var.a && this.b.equals(o97Var.b) && this.c.equals(o97Var.c) && this.d.equals(o97Var.d) && this.e.equals(o97Var.e) && this.f.equals(o97Var.f) && this.g.equals(o97Var.g) && this.h.equals(o97Var.h) && this.i.equals(o97Var.i) && this.j.equals(o97Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.a.hashCode() + ((this.c.hashCode() + akb.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = m6.j(this.a, "IndeedThemeProvider(version=", ", name=", this.b, ", colors=");
        sbJ.append(this.c);
        sbJ.append(", fonts=");
        sbJ.append(this.d);
        sbJ.append(", fontSizes=");
        sbJ.append(this.e);
        sbJ.append(", fontWeights=");
        sbJ.append(this.f);
        sbJ.append(", lineHeights=");
        sbJ.append(this.g);
        sbJ.append(", radii=");
        sbJ.append(this.h);
        sbJ.append(", space=");
        sbJ.append(this.i);
        sbJ.append(", text=");
        sbJ.append(this.j);
        sbJ.append(")");
        return sbJ.toString();
    }
}
