package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qda extends qv4<taa> {
    @Override // defpackage.ha1
    public final String d() {
        return "INSERT OR REPLACE INTO `NavBarLeftItem` (`id`,`destinationUrl`,`label`,`logoUrl`) VALUES (?,?,?,?)";
    }

    @Override // defpackage.qv4
    public final void h(zze zzeVar, taa taaVar) {
        taa taaVar2 = taaVar;
        zzeVar.n(1, taaVar2.a);
        zzeVar.n(2, taaVar2.b);
        zzeVar.n(3, taaVar2.c);
        String str = taaVar2.d;
        if (str == null) {
            zzeVar.u(4);
        } else {
            zzeVar.n(4, str);
        }
    }
}
