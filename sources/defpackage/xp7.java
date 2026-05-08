package defpackage;

import defpackage.lx5;
import defpackage.sp7;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class xp7 extends ir7 {
    public final /* synthetic */ sp7.f a;
    public final /* synthetic */ lx5.b b;

    public xp7(sp7.f fVar, lx5.b bVar) {
        this.a = fVar;
        this.b = bVar;
    }

    @Override // defpackage.hr7
    public final void a(String str, String str2) {
        str.getClass();
        if (!str.equals("autoTrackedLastScreenName")) {
            this.b.a(str, str2);
            return;
        }
        String strL = l5.l("Duplicate autoTrackedLastScreenName key sent from ", this.a.b);
        ArrayList arrayList = lz2.a;
        w40.n(strL, "JSTEventLogImpl", strL, false);
    }

    @Override // defpackage.hr7
    public final void b(String str, Long l) {
        str.getClass();
        this.b.b(str, l);
    }
}
