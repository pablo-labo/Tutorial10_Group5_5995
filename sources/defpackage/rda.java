package defpackage;

import androidx.work.b;

/* JADX INFO: loaded from: classes2.dex */
public final class rda extends qv4 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rda(xed xedVar, int i) {
        super(xedVar);
        this.d = i;
    }

    @Override // defpackage.ha1
    public final String d() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO `NavBarRightItem` (`id`,`destinationUrl`,`label`) VALUES (?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    @Override // defpackage.qv4
    public final void h(zze zzeVar, Object obj) throws Throwable {
        switch (this.d) {
            case 0:
                uaa uaaVar = (uaa) obj;
                zzeVar.n(1, uaaVar.a);
                zzeVar.n(2, uaaVar.b);
                zzeVar.n(3, uaaVar.c);
                break;
            default:
                b3h b3hVar = (b3h) obj;
                String str = b3hVar.a;
                if (str == null) {
                    zzeVar.u(1);
                } else {
                    zzeVar.n(1, str);
                }
                byte[] bArrB = b.b(b3hVar.b);
                if (bArrB != null) {
                    zzeVar.r(2, bArrB);
                } else {
                    zzeVar.u(2);
                }
                break;
        }
    }
}
