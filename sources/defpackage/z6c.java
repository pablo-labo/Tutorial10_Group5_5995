package defpackage;

import defpackage.sp7;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z6c implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z6c(int i, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(z || ((cme) ((g7c) obj).e).g() > 0.5f);
            default:
                gu5 gu5Var = (gu5) obj;
                Pair pair = z ? new Pair("responsiveStatusEarnedSheet", "responsivenessEarnedCTA") : new Pair("responsiveStatusIntroSheet", "responsivenessIntroCTA");
                ((tp7) cr8.p(tp7.class)).b(new sp7.g((String) pair.a(), (String) pair.b(), null, null, 12));
                gu5Var.invoke();
                return j6g.a;
        }
    }
}
