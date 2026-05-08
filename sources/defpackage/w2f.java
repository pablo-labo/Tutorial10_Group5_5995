package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w2f extends qv4<u2f> {
    @Override // defpackage.ha1
    public final String d() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // defpackage.qv4
    public final void h(zze zzeVar, u2f u2fVar) {
        String str = u2fVar.a;
        if (str == null) {
            zzeVar.u(1);
        } else {
            zzeVar.n(1, str);
        }
        zzeVar.q(2, r4.b);
        zzeVar.q(3, r4.c);
    }
}
