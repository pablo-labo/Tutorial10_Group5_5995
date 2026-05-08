package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ohi implements lhi {
    public static final hsh a;
    public static final hsh b;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.sdk.screen.manual_screen_view_logging", true);
        b = mteVar.c("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    @Override // defpackage.lhi
    public final boolean zzb() {
        return a.c().booleanValue();
    }

    @Override // defpackage.lhi
    public final boolean zzc() {
        return b.c().booleanValue();
    }
}
