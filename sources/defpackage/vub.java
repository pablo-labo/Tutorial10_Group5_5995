package defpackage;

import defpackage.sp7;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vub implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1c b;

    public /* synthetic */ vub(x1c x1cVar, int i) {
        this.a = i;
        this.b = x1cVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        x1c x1cVar = this.b;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-home-screen", "dismiss", null, null, 12));
                ((gme) x1cVar.Y).setValue(b5g.a);
                return j6g.a;
            default:
                g3a<jz2<j6g>> g3aVar = x1cVar.n0;
                j6g j6gVar = j6g.a;
                g3aVar.k(new jz2<>(j6gVar));
                return j6gVar;
        }
    }
}
