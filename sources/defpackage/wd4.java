package defpackage;

import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
@fd8
public final class wd4 implements Comparable<wd4> {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        int i = yd4.a;
        b = pg8.o(4611686018427387903L);
        c = pg8.o(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long j4 = j + j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return pg8.o(nic.E(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return pg8.q((j4 * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void c(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append(JwtParser.SEPARATOR_CHAR);
            String strZ = zve.Z(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strZ.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strZ.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strZ, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strZ, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int e(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return wl7.d(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final long f(long j) {
        return ((((int) j) & 1) != 1 || m(j)) ? p(j, be4.MILLISECONDS) : j >> 1;
    }

    public static final int h(long j) {
        if (m(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean m(long j) {
        return j == b || j == c;
    }

    public static final long n(long j, long j2) {
        if (m(j)) {
            if (!m(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            l5.q("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (m(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        return i == 0 ? (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? pg8.o(j3 / 1000000) : pg8.q(j3) : pg8.p(j3);
    }

    public static final double o(long j) {
        if (j == b) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == c) {
            return Double.NEGATIVE_INFINITY;
        }
        return jh2.j(j >> 1, (((int) j) & 1) == 0 ? be4.NANOSECONDS : be4.MILLISECONDS, be4.SECONDS);
    }

    public static final long p(long j, be4 be4Var) {
        if (j == b) {
            return Long.MAX_VALUE;
        }
        if (j == c) {
            return Long.MIN_VALUE;
        }
        return be4Var.a().convert(j >> 1, ((((int) j) & 1) == 0 ? be4.NANOSECONDS : be4.MILLISECONDS).a());
    }

    public static final long r(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = yd4.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(wd4 wd4Var) {
        return e(this.a, wd4Var.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wd4) {
            return this.a == ((wd4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long jR = this.a;
        if (jR == 0) {
            return "0s";
        }
        if (jR == b) {
            return "Infinity";
        }
        if (jR == c) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = jR < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (jR < 0) {
            jR = r(jR);
        }
        long jP = p(jR, be4.DAYS);
        int iP = m(jR) ? 0 : (int) (p(jR, be4.HOURS) % 24);
        int iP2 = m(jR) ? 0 : (int) (p(jR, be4.MINUTES) % 60);
        int iP3 = m(jR) ? 0 : (int) (p(jR, be4.SECONDS) % 60);
        int iH = h(jR);
        boolean z2 = jP != 0;
        boolean z3 = iP != 0;
        boolean z4 = iP2 != 0;
        boolean z5 = (iP3 == 0 && iH == 0) ? false : true;
        if (z2) {
            sb.append(jP);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iP);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iP2);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iP3 != 0 || z2 || z3 || z4) {
                c(sb, iP3, iH, 9, "s", false);
            } else if (iH >= 1000000) {
                c(sb, iH / 1000000, iH % 1000000, 6, "ms", false);
            } else if (iH >= 1000) {
                c(sb, iH / 1000, iH % 1000, 3, "us", false);
            } else {
                sb.append(iH);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
