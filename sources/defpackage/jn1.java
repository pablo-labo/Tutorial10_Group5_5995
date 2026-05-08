package defpackage;

import androidx.fragment.app.FragmentManager;
import defpackage.aq3;
import defpackage.oq7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jn1 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jn1(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ln1 ln1Var = (ln1) obj3;
                qtc qtcVarC2 = ln1.c2(ln1Var, (tia) obj2, (bn1) obj);
                if (qtcVarC2 != null) {
                    us2 us2Var = ln1Var.d0;
                    if (th7.b(us2Var.l0, 0L)) {
                        de7.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                    }
                }
                break;
            case 1:
                ((Function1) obj3).invoke((f68) obj2);
                ((g4a) obj).setValue(Boolean.TRUE);
                break;
            case 2:
                u63.Y((e13) obj3, null, null, new u57((hee) obj2, (g4a) obj, null), 3);
                break;
            default:
                ka2.H((String) obj3, false, false, (FragmentManager) obj2);
                aq3.a aVar = aq3.Companion;
                ((Function1) obj).invoke(new oq7.b());
                break;
        }
        return j6g.a;
    }
}
