package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class fug implements m55 {
    public o55 a;
    public zpf b;
    public b e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    public static final class a implements b {
        public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, DataOkHttpUploader.HTTP_CLIENT_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        public final o55 a;
        public final zpf b;
        public final gug c;
        public final int d;
        public final byte[] e;
        public final g4b f;
        public final int g;
        public final androidx.media3.common.a h;
        public int i;
        public long j;
        public int k;
        public long l;

        public a(o55 o55Var, zpf zpfVar, gug gugVar) throws ParserException {
            this.a = o55Var;
            this.b = zpfVar;
            this.c = gugVar;
            int i = gugVar.b;
            int iMax = Math.max(1, i / 10);
            this.g = iMax;
            g4b g4bVar = new g4b(gugVar.e);
            g4bVar.q();
            int iQ = g4bVar.q();
            this.d = iQ;
            int i2 = gugVar.a;
            int i3 = gugVar.c;
            int i4 = (((i3 - (i2 * 4)) * 8) / (gugVar.d * i2)) + 1;
            if (iQ != i4) {
                throw ParserException.a(null, "Expected frames per block: " + i4 + "; got: " + iQ);
            }
            int iF = vjg.f(iMax, iQ);
            this.e = new byte[iF * i3];
            this.f = new g4b(iQ * 2 * i2 * iF);
            int i5 = ((i3 * i) * 8) / iQ;
            a.C0036a c0036a = new a.C0036a();
            c0036a.m = st9.p("audio/raw");
            c0036a.h = i5;
            c0036a.i = i5;
            c0036a.n = iMax * 2 * i2;
            c0036a.E = i2;
            c0036a.F = i;
            c0036a.G = 2;
            this.h = new androidx.media3.common.a(c0036a);
        }

        @Override // fug.b
        public final void a(int i, long j) {
            this.a.b(new iug(this.c, this.d, i, j));
            this.b.d(this.h);
        }

        @Override // fug.b
        public final void b(long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0023->B:13:0x003f], REMOVE, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // fug.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean c(defpackage.n55 r25, long r26) {
            /*
                Method dump skipped, instruction units count: 327
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fug.a.c(n55, long):boolean");
        }

        public final void d(int i) {
            long j = this.j;
            long j2 = this.l;
            gug gugVar = this.c;
            long j3 = gugVar.b;
            String str = vjg.a;
            long jX = j + vjg.X(j2, 1000000L, j3, RoundingMode.DOWN);
            int i2 = i * 2 * gugVar.a;
            this.b.a(jX, 1, i2, this.k - i2, null);
            this.l += (long) i;
            this.k -= i2;
        }
    }

    public interface b {
        void a(int i, long j);

        void b(long j);

        boolean c(n55 n55Var, long j);
    }

    public static final class c implements b {
        public final o55 a;
        public final zpf b;
        public final gug c;
        public final androidx.media3.common.a d;
        public final int e;
        public long f;
        public int g;
        public long h;

        public c(o55 o55Var, zpf zpfVar, gug gugVar, String str, int i) throws ParserException {
            this.a = o55Var;
            this.b = zpfVar;
            this.c = gugVar;
            int i2 = gugVar.a;
            int i3 = gugVar.b;
            int i4 = (gugVar.d * i2) / 8;
            int i5 = gugVar.c;
            if (i5 != i4) {
                throw ParserException.a(null, "Expected block size: " + i4 + "; got: " + i5);
            }
            int i6 = i3 * i4;
            int i7 = i6 * 8;
            int iMax = Math.max(i4, i6 / 10);
            this.e = iMax;
            a.C0036a c0036a = new a.C0036a();
            c0036a.l = st9.p("audio/wav");
            c0036a.m = st9.p(str);
            c0036a.h = i7;
            c0036a.i = i7;
            c0036a.n = iMax;
            c0036a.E = i2;
            c0036a.F = i3;
            c0036a.G = i;
            this.d = new androidx.media3.common.a(c0036a);
        }

        @Override // fug.b
        public final void a(int i, long j) {
            this.a.b(new iug(this.c, 1, i, j));
            this.b.d(this.d);
        }

        @Override // fug.b
        public final void b(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }

        @Override // fug.b
        public final boolean c(n55 n55Var, long j) {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
                int iC = this.b.c(n55Var, (int) Math.min(i2 - i, j2), true);
                if (iC == -1) {
                    j2 = 0;
                } else {
                    this.g += iC;
                    j2 -= (long) iC;
                }
            }
            gug gugVar = this.c;
            int i3 = gugVar.c;
            int i4 = this.g / i3;
            if (i4 > 0) {
                long j3 = this.f;
                long j4 = this.h;
                long j5 = gugVar.b;
                String str = vjg.a;
                long jX = j3 + vjg.X(j4, 1000000L, j5, RoundingMode.DOWN);
                int i5 = i4 * i3;
                int i6 = this.g - i5;
                this.b.a(jX, 1, i5, i6, null);
                this.h += (long) i4;
                this.g = i6;
            }
            return j2 <= 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x021a, code lost:
    
        if (r13 != 65534) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0245  */
    @Override // defpackage.m55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(defpackage.n55 r26, defpackage.dhb r27) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fug.b(n55, dhb):int");
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) {
        return hug.a(n55Var);
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.b(j2);
        }
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.a = o55Var;
        this.b = o55Var.o(0, 1);
        o55Var.m();
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
