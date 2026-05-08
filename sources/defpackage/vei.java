package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vei implements xei {
    public static final hsh a;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.sdk.referrer.delayed_install_referrer_api", false);
        mteVar.b(0L, "measurement.id.sdk.referrer.delayed_install_referrer_api");
    }

    @Override // defpackage.xei
    public final boolean zzb() {
        return a.c().booleanValue();
    }
}
