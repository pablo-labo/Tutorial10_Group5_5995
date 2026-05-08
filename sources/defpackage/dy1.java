package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dy1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o97 b;

    public /* synthetic */ dy1(o97 o97Var, int i) {
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
                    vq6.b(z2b.a(R.drawable.ic_idl_close_24, 0, bVar), ak2.I(R.string.desc_close, bVar), null, o97Var.c.a.c, bVar, 0, 4);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fif.b(ak2.I(R.string.messaging_attachment_alert_title, bVar2), null, 0L, o97Var.e.e, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131062);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
