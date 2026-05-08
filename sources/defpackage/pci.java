package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pci implements ici {
    public static final hsh a;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.sdk.dynamite.allow_remote_dynamite2", false);
        mteVar.c("measurement.collection.init_params_control_enabled", true);
        mteVar.c("measurement.sdk.dynamite.use_dynamite3", true);
        mteVar.b(0L, "measurement.id.sdk.dynamite.use_dynamite");
    }

    @Override // defpackage.ici
    public final boolean zza() {
        return a.c().booleanValue();
    }
}
