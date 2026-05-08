package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oq0 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oq0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                fr0 fr0Var = (fr0) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qq0.b(fr0Var, null, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                ((cd) obj4).invoke((Throwable) obj);
                break;
            default:
                o97 o97Var = (o97) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    fif.b(ak2.I(R.string.contact_information_header, bVar2), f.a(e.a.b, "ContactInformationHeader"), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar2, 48, 0, 65532);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
