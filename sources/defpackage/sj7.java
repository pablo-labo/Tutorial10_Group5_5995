package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sj7 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sj7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                o97 o97Var = (o97) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    cif.b(ak2.I(R.string.interview_prep_cta, bVar), null, o97Var.c.a.d, 0L, null, o97Var.f.c, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, o97Var.j.f, bVar, 0, 0, 64986);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                i7d i7dVar = (i7d) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c7d.a(null, i7dVar, null, bVar2, 0, 5);
                } else {
                    bVar2.D();
                }
                break;
            default:
                String str = (String) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    cif.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar3, 0, 0, 131070);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
