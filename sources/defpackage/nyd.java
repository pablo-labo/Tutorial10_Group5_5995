package defpackage;

import defpackage.l3d;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class nyd {
    public final mic a;
    public final long b;
    public final long c;

    public static abstract class a extends nyd {
        public final long d;
        public final long e;
        public final List<d> f;
        public final long g;
        public final long h;
        public final long i;

        public a(mic micVar, long j, long j2, long j3, long j4, List<d> list, long j5, long j6, long j7) {
            super(micVar, j, j2);
            this.d = j3;
            this.e = j4;
            this.f = list;
            this.i = j5;
            this.g = j6;
            this.h = j7;
        }

        public final long b(long j, long j2) {
            long jD = d(j);
            return jD != -1 ? jD : (int) (f((j2 - this.h) + this.i, j) - c(j, j2));
        }

        public final long c(long j, long j2) {
            long jD = d(j);
            long j3 = this.d;
            if (jD == -1) {
                long j4 = this.g;
                if (j4 != -9223372036854775807L) {
                    return Math.max(j3, f((j2 - this.h) - j4, j));
                }
            }
            return j3;
        }

        public abstract long d(long j);

        public final long e(long j, long j2) {
            long j3 = this.b;
            long j4 = this.d;
            List<d> list = this.f;
            if (list != null) {
                return (list.get((int) (j - j4)).b * 1000000) / j3;
            }
            long jD = d(j2);
            return (jD == -1 || j != (j4 + jD) - 1) ? (this.e * 1000000) / j3 : j2 - g(j);
        }

        public final long f(long j, long j2) {
            long jD = d(j2);
            long j3 = this.d;
            if (jD != 0) {
                if (this.f != null) {
                    long j4 = (jD + j3) - 1;
                    long j5 = j3;
                    while (j5 <= j4) {
                        long j6 = ((j4 - j5) / 2) + j5;
                        long jG = g(j6);
                        if (jG < j) {
                            j5 = j6 + 1;
                        } else {
                            if (jG <= j) {
                                return j6;
                            }
                            j4 = j6 - 1;
                        }
                    }
                    return j5 == j3 ? j5 : j4;
                }
                long j7 = (j / ((this.e * 1000000) / this.b)) + j3;
                if (j7 >= j3) {
                    return jD == -1 ? j7 : Math.min(j7, (j3 + jD) - 1);
                }
            }
            return j3;
        }

        public final long g(long j) {
            List<d> list = this.f;
            long j2 = this.d;
            long j3 = list != null ? list.get((int) (j - j2)).a - this.c : (j - j2) * this.e;
            String str = vjg.a;
            return vjg.X(j3, 1000000L, this.b, RoundingMode.DOWN);
        }

        public abstract mic h(l3d.a aVar, long j);

        public boolean i() {
            return this.f != null;
        }
    }

    public static final class b extends a {
        public final List<mic> j;

        public b(mic micVar, long j, long j2, long j3, long j4, List<d> list, long j5, List<mic> list2, long j6, long j7) {
            super(micVar, j, j2, j3, j4, list, j5, j6, j7);
            this.j = list2;
        }

        @Override // nyd.a
        public final long d(long j) {
            return this.j.size();
        }

        @Override // nyd.a
        public final mic h(l3d.a aVar, long j) {
            return this.j.get((int) (j - this.d));
        }

        @Override // nyd.a
        public final boolean i() {
            return true;
        }
    }

    public static final class c extends a {
        public final uig j;
        public final uig k;
        public final long l;

        public c(mic micVar, long j, long j2, long j3, long j4, long j5, List<d> list, long j6, uig uigVar, uig uigVar2, long j7, long j8) {
            super(micVar, j, j2, j3, j5, list, j6, j7, j8);
            this.j = uigVar;
            this.k = uigVar2;
            this.l = j4;
        }

        @Override // defpackage.nyd
        public final mic a(l3d l3dVar) {
            uig uigVar = this.j;
            if (uigVar == null) {
                return this.a;
            }
            androidx.media3.common.a aVar = l3dVar.a;
            return new mic(0L, uigVar.a(aVar.a, 0L, aVar.j, 0L), -1L);
        }

        @Override // nyd.a
        public final long d(long j) {
            if (this.f != null) {
                return r0.size();
            }
            long j2 = this.l;
            if (j2 != -1) {
                return (j2 - this.d) + 1;
            }
            if (j == -9223372036854775807L) {
                return -1L;
            }
            BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
            BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
            RoundingMode roundingMode = RoundingMode.CEILING;
            int i = ff1.a;
            return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
        }

        @Override // nyd.a
        public final mic h(l3d.a aVar, long j) {
            List<d> list = this.f;
            long j2 = this.d;
            long j3 = list != null ? list.get((int) (j - j2)).a : (j - j2) * this.e;
            androidx.media3.common.a aVar2 = aVar.a;
            return new mic(0L, this.k.a(aVar2.a, j, aVar2.j, j3), -1L);
        }
    }

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
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.a == dVar.a && this.b == dVar.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    public nyd(mic micVar, long j, long j2) {
        this.a = micVar;
        this.b = j;
        this.c = j2;
    }

    public mic a(l3d l3dVar) {
        return this.a;
    }

    public static class e extends nyd {
        public final long d;
        public final long e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(mic micVar, long j, long j2, long j3, long j4) {
            super(micVar, j, j2);
            this.d = j3;
            this.e = j4;
        }
    }
}
