package defpackage;

import defpackage.js9;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hke implements js9.a {
    public final ArrayList a;

    public static final class a {
        public final long a;
        public final long b;
        public final int c;

        public a(long j, int i, long j2) {
            ka2.l(j < j2);
            this.a = j;
            this.b = j2;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
        }

        public final String toString() {
            String str = vjg.a;
            Locale locale = Locale.US;
            StringBuilder sbI = w40.i(this.a, "Segment: startTimeMs=", ", endTimeMs=");
            sbI.append(this.b);
            sbI.append(", speedDivisor=");
            sbI.append(this.c);
            return sbI.toString();
        }
    }

    public hke(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((a) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((a) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((a) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        ka2.l(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hke.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((hke) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
