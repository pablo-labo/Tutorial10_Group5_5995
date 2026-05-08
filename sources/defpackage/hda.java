package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hda extends qv4<xe6> {
    @Override // defpackage.ha1
    public final String d() {
        return "INSERT OR REPLACE INTO `HamburgerMenuItem` (`id`,`isLoggedIn`,`locale`,`destinationUrl`,`label`,`subtitle`) VALUES (?,?,?,?,?,?)";
    }

    @Override // defpackage.qv4
    public final void h(zze zzeVar, xe6 xe6Var) {
        xe6 xe6Var2 = xe6Var;
        zzeVar.n(1, xe6Var2.a);
        zzeVar.q(2, xe6Var2.b ? 1L : 0L);
        zzeVar.n(3, xe6Var2.c);
        zzeVar.n(4, xe6Var2.d);
        zzeVar.n(5, xe6Var2.e);
        String str = xe6Var2.f;
        if (str == null) {
            zzeVar.u(6);
        } else {
            zzeVar.n(6, str);
        }
    }
}
