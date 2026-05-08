package defpackage;

import android.view.KeyEvent;
import defpackage.cfe;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class t4 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ t4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((bj8) obj).y0((s14) obj2);
                return null;
            case 1:
                KeyEvent keyEvent = ((ng8) obj).a;
                keyEvent.getClass();
                boolean z = false;
                if (pg8.A(keyEvent) == 2) {
                    long jA = ak2.a(keyEvent.getKeyCode());
                    if (lg8.a(jA, lg8.i) || lg8.a(jA, lg8.g)) {
                        z = true;
                        ((fm5) obj2).c(1);
                    }
                }
                return Boolean.valueOf(z);
            default:
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                c0106a.c((String) obj2, zib.c);
                return j6g.a;
        }
    }
}
