package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class py3 extends qv4<ly3> {
    @Override // defpackage.ha1
    public final String d() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // defpackage.qv4
    public final void h(zze zzeVar, ly3 ly3Var) {
        ly3 ly3Var2 = ly3Var;
        zzeVar.n(1, ly3Var2.a);
        String str = ly3Var2.b;
        if (str == null) {
            zzeVar.u(2);
        } else {
            zzeVar.n(2, str);
        }
    }
}
