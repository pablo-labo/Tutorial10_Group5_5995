package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kih {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public kih(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        fib.f(str);
        fib.f(str2);
        fib.b(j >= 0);
        fib.b(j2 >= 0);
        fib.b(j3 >= 0);
        fib.b(j5 >= 0);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    public final kih a(long j) {
        return new kih(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }

    public final kih b(Long l, Long l2, Boolean bool) {
        return new kih(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public kih(long j, String str, String str2) {
        this(str, str2, 0L, 0L, 0L, j, 0L, null, null, null, null);
    }
}
