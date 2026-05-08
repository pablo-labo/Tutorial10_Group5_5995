package defpackage;

import android.util.SparseIntArray;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public final class prb extends orb {
    public static final SparseIntArray I0;
    public long H0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(R.id.displayNameGuide, 2);
    }

    @Override // defpackage.qpg
    public final void U() {
        long j;
        synchronized (this) {
            j = this.H0;
            this.H0 = 0L;
        }
        gua guaVar = this.F0;
        long j2 = j & 7;
        String strD = null;
        if (j2 != 0) {
            g3a<String> g3aVar = guaVar != null ? guaVar.e : null;
            c0(0, g3aVar);
            if (g3aVar != null) {
                strD = g3aVar.d();
            }
        }
        if (j2 != 0) {
            dkf.a(this.D0, strD);
        }
    }

    @Override // defpackage.qpg
    public final boolean V() {
        synchronized (this) {
            try {
                return this.H0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qpg
    public final boolean Y(Object obj, int i, int i2) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.H0 |= 1;
        }
        return true;
    }

    @Override // defpackage.orb
    public final void e0(gua guaVar) {
        this.F0 = guaVar;
        synchronized (this) {
            this.H0 |= 2;
        }
        K(2);
        a0();
    }
}
