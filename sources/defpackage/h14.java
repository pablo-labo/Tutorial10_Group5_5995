package defpackage;

import androidx.fragment.app.g;
import defpackage.ff8;
import defpackage.te8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h14 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h14(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return z92.E1((Iterable) ((gu5) obj).invoke());
            case 1:
                return (List) obj;
            case 2:
                ke8 ke8Var = (ke8) obj;
                return ke8Var.x(ke8Var.getDescriptor().o().n(), te8.c.a);
            case 3:
                return new ff8.a((ff8) obj);
            case 4:
                gu5<? extends List<? extends p7g>> gu5Var = ((lha) obj).b;
                if (gu5Var != null) {
                    return gu5Var.invoke();
                }
                return null;
            default:
                return ((g) obj).getDefaultViewModelCreationExtras();
        }
    }
}
