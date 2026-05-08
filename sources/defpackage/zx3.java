package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zx3 extends qv4 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zx3(xed xedVar, int i) {
        super(xedVar);
        this.d = i;
        switch (i) {
            case 1:
                super(xedVar);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.ha1
    public final String d() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO `DeletedRecentSearch` (`uid`,`accountId`,`whatQuery`,`whereQuery`,`searchTimestamp`,`createdAt`) VALUES (?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `UrlRegistryItem` (`id`,`locale`,`destinationUrl`,`label`) VALUES (?,?,?,?)";
        }
    }

    @Override // defpackage.qv4
    public final void h(zze zzeVar, Object obj) {
        switch (this.d) {
            case 0:
                xx3 xx3Var = (xx3) obj;
                zzeVar.n(1, xx3Var.a);
                zzeVar.n(2, xx3Var.b);
                zzeVar.n(3, xx3Var.c);
                zzeVar.n(4, xx3Var.d);
                zzeVar.q(5, xx3Var.e);
                zzeVar.q(6, xx3Var.f);
                break;
            default:
                fig figVar = (fig) obj;
                zzeVar.n(1, figVar.a);
                zzeVar.n(2, figVar.b);
                zzeVar.n(3, figVar.c);
                String str = figVar.d;
                if (str != null) {
                    zzeVar.n(4, str);
                } else {
                    zzeVar.u(4);
                }
                break;
        }
    }
}
