package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tk8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o97 b;

    public /* synthetic */ tk8(o97 o97Var, int i) {
        this.a = i;
        this.b = o97Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        o97 o97Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = LaunchActivity.e1;
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m0f.a(null, null, o97Var.c.b.a, 0L, null, 0.0f, dj2.a, bVar, 1572864, 59);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ev6.a(fv6.q4, null, null, zq6.Xs, o97Var.c.b.i.a.b, ak2.I(R.string.messaging_participant_list_disclaimer, bVar2), null, bVar2, 3078, 70);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
