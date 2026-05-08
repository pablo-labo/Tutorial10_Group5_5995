package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vqb implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ vqb(int i, gu5 gu5Var) {
        this.a = i;
        this.b = gu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nof.c(this.b, R.drawable.ic_idl_close_24, fv6.W1, ak2.I(R.string.desc_close, bVar), "CloseButton", null, bVar, 24960, 96);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q9f.e(6, this.b, bVar2, "Messaging");
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
