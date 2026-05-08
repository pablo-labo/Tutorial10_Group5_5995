package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bgi implements cgi {
    public static final hsh a;

    static {
        mte mteVar = new mte(jrh.a());
        a = mteVar.c("measurement.client.sessions.check_on_reset_and_enable2", true);
        mteVar.c("measurement.client.sessions.check_on_startup", true);
        mteVar.c("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // defpackage.cgi
    public final boolean zzb() {
        return a.c().booleanValue();
    }
}
