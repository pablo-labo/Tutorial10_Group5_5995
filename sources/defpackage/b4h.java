package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b4h extends qv4<z3h> {
    @Override // defpackage.ha1
    public final String d() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // defpackage.qv4
    public final void h(zze zzeVar, z3h z3hVar) {
        z3h z3hVar2 = z3hVar;
        String str = z3hVar2.a;
        if (str == null) {
            zzeVar.u(1);
        } else {
            zzeVar.n(1, str);
        }
        zzeVar.n(2, z3hVar2.b);
    }
}
