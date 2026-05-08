package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.o97;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tk7 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o97 b;

    public /* synthetic */ tk7(o97 o97Var, int i) {
        this.a = i;
        this.b = o97Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        o97 o97Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strI = ak2.I(R.string.past, bVar);
                    o97.g gVar = o97Var.i;
                    cif.b(strI, f.j(e.a.b, 16.0f, 8.0f, 0.0f, 0.0f, 12), eu6.m, 0L, null, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, bVar, 0, 0, 65496);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    fif.b(ak2.I(R.string.messaging_send, bVar2), null, o97Var.c.a.h.c.a, o97Var.e.g, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131058);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
