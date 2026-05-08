package defpackage;

import android.content.DialogInterface;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import defpackage.sp7;

/* JADX INFO: loaded from: classes2.dex */
public final class gy1 extends w0g {
    public final la g0;
    public final wy2 h0;
    public boolean i0;
    public boolean j0;

    public gy1(la laVar, wy2 wy2Var) {
        this.g0 = laVar;
        this.h0 = wy2Var;
    }

    @Override // defpackage.w0g
    public final void M(int i, b bVar) {
        c cVarH = bVar.h(797904112);
        int i2 = 4;
        int i3 = (cVarH.x(this) ? 4 : 2) | i;
        int i4 = 1;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new i30(this, i2);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new j30(this, 3);
                cVarH.p(objV2);
            }
            fy1.b(gu5Var, (gu5) objV2, cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new yo0(this, i, i4);
        }
    }

    @Override // defpackage.w0g, androidx.fragment.app.f, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (this.i0 || this.j0) {
            return;
        }
        this.h0.invoke();
        ((tp7) cr8.p(tp7.class)).b(new sp7.b("coWorkerPromo", "coWorkerPromoDismissed", u63.Z("coWorker"), null, 8));
    }
}
