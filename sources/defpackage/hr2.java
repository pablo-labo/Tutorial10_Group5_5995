package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hr2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1c b;

    public /* synthetic */ hr2(x1c x1cVar, int i) {
        this.a = i;
        this.b = x1cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        x1c x1cVar = this.b;
        switch (i) {
            case 0:
                ((gme) x1cVar.X).setValue(yz7.a(x1cVar.m(), null, null, null, null, (Boolean) obj, null, null, null, null, null, null, null, null, null, 16367));
                break;
            default:
                ((rxb) obj).getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-home-screen", "profile-tab", null, null, 12));
                x1cVar.y(rxb.a);
                break;
        }
        return j6g.a;
    }
}
