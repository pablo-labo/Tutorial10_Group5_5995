package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kj3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o97 b;

    public /* synthetic */ kj3(o97 o97Var, int i) {
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
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    cif.b(ak2.I(R.string.comment_label, bVar), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, bVar, 0, 0, 65534);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    wq6.b(z2b.a(R.drawable.messaging_send, 0, bVar2), ak2.I(R.string.messaging_send, bVar2), null, o97Var.c.b.a, bVar2, 0, 4);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
