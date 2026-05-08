package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public final class d8 extends c8 {
    public static final SparseIntArray L0;
    public final LinearLayout J0;
    public long K0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L0 = sparseIntArray;
        sparseIntArray.put(R.id.debugProctorFilterEditText, 1);
        sparseIntArray.put(R.id.debugProctorCloseButton, 2);
        sparseIntArray.put(R.id.debugProctorSaveButton, 3);
        sparseIntArray.put(R.id.debugProctorComposeView, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d8(vd3 vd3Var, View view) {
        Object[] objArr = new Object[5];
        qpg.X(view, objArr, L0, true);
        super(vd3Var, view, (Button) objArr[2], (ComposeView) objArr[4], (EditText) objArr[1], (Button) objArr[3]);
        this.K0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.J0 = linearLayout;
        linearLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.K0 = 2L;
        }
        a0();
    }

    @Override // defpackage.qpg
    public final void U() {
        long j;
        synchronized (this) {
            j = this.K0;
            this.K0 = 0L;
        }
        oc9 oc9Var = this.H0;
        long j2 = j & 3;
        int i = (j2 == 0 || oc9Var == null) ? 0 : oc9Var.a;
        if (j2 != 0) {
            yog.a(this.J0, i);
        }
    }

    @Override // defpackage.qpg
    public final boolean V() {
        synchronized (this) {
            try {
                return this.K0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qpg
    public final boolean Y(Object obj, int i, int i2) {
        return false;
    }

    @Override // defpackage.c8
    public final void e0(oc9 oc9Var) {
        this.H0 = oc9Var;
        synchronized (this) {
            this.K0 |= 1;
        }
        K(1);
        a0();
    }
}
