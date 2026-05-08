package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.l5;
import defpackage.lpf;
import defpackage.r6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {
    public static final ThreadLocal<m> e = new ThreadLocal<>();
    public static final a f = new a();
    public long b;
    public long c;
    public final ArrayList<RecyclerView> a = new ArrayList<>();
    public final ArrayList<c> d = new ArrayList<>();

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.d;
            if ((recyclerView == null) == (cVar4.d == null)) {
                boolean z = cVar3.a;
                if (z == cVar4.a) {
                    int i = cVar4.b - cVar3.b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar3.c - cVar4.c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
                if (z) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b {
        public int a;
        public int b;
        public int[] c;
        public int d;

        public final void a(int i, int i2) {
            if (i < 0) {
                l5.q("Layout positions must be non-negative");
                return;
            }
            if (i2 < 0) {
                l5.q("Pixel distance must be non-negative");
                return;
            }
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        }

        public final void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.f0;
            if (recyclerView.e0 == null || mVar == null || !mVar.i) {
                return;
            }
            if (z) {
                if (!recyclerView.e.g()) {
                    mVar.i(recyclerView.e0.c(), this);
                }
            } else if (!recyclerView.O()) {
                mVar.h(this.a, this.b, recyclerView.X0, this);
            }
            int i = this.d;
            if (i > mVar.j) {
                mVar.j = i;
                mVar.k = z;
                recyclerView.c.m();
            }
        }
    }

    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }

    public static RecyclerView.b0 c(RecyclerView recyclerView, int i, long j) {
        int iH = recyclerView.f.h();
        for (int i2 = 0; i2 < iH; i2++) {
            RecyclerView.b0 b0VarM = RecyclerView.M(recyclerView.f.g(i2));
            if (b0VarM.c == i && !b0VarM.f()) {
                return null;
            }
        }
        RecyclerView.t tVar = recyclerView.c;
        try {
            recyclerView.T();
            RecyclerView.b0 b0VarK = tVar.k(i, j);
            if (b0VarK != null) {
                if (!b0VarK.e() || b0VarK.f()) {
                    tVar.a(b0VarK, false);
                } else {
                    tVar.h(b0VarK.a);
                }
            }
            recyclerView.U(false);
            return b0VarK;
        } catch (Throwable th) {
            recyclerView.U(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.l0) {
            if (RecyclerView.q1 && !this.a.contains(recyclerView)) {
                r6.g("attempting to post unregistered view!");
                return;
            } else if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b bVar = recyclerView.W0;
        bVar.a = i;
        bVar.b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r15) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<RecyclerView> arrayList = this.a;
        try {
            int i = lpf.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                }
            }
            this.b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.b = 0L;
            int i3 = lpf.a;
            Trace.endSection();
            throw th;
        }
    }
}
