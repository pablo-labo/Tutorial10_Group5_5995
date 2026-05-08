package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pda extends qv4 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pda(xed xedVar, int i) {
        super(xedVar);
        this.d = i;
    }

    @Override // defpackage.ha1
    public final String d() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO `CategorizedHamburgerMenuItem` (`id`,`categoryId`,`isLoggedIn`,`locale`,`destinationUrl`,`label`,`subtitle`) VALUES (?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    @Override // defpackage.qv4
    public final void h(zze zzeVar, Object obj) {
        switch (this.d) {
            case 0:
                xy1 xy1Var = (xy1) obj;
                zzeVar.n(1, xy1Var.a);
                zzeVar.n(2, xy1Var.b);
                zzeVar.q(3, xy1Var.c ? 1L : 0L);
                zzeVar.n(4, xy1Var.d);
                zzeVar.n(5, xy1Var.e);
                zzeVar.n(6, xy1Var.f);
                String str = xy1Var.g;
                if (str != null) {
                    zzeVar.n(7, str);
                } else {
                    zzeVar.u(7);
                }
                break;
            default:
                z2h z2hVar = (z2h) obj;
                String str2 = z2hVar.a;
                if (str2 == null) {
                    zzeVar.u(1);
                } else {
                    zzeVar.n(1, str2);
                }
                zzeVar.n(2, z2hVar.b);
                break;
        }
    }
}
