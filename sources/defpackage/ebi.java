package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ebi implements fbi {
    public static final hsh a;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.androidId.delete_feature", true);
        mteVar.c("measurement.log_androidId_enabled", false);
    }

    @Override // defpackage.fbi
    public final boolean zza() {
        return a.c().booleanValue();
    }
}
