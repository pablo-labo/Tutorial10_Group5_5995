package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kjb extends qv4<ijb> {
    @Override // defpackage.ha1
    public final String d() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // defpackage.qv4
    public final void h(zze zzeVar, ijb ijbVar) {
        ijb ijbVar2 = ijbVar;
        zzeVar.n(1, ijbVar2.a);
        zzeVar.q(2, ijbVar2.b.longValue());
    }
}
