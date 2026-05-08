package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class at9 extends xs9 {
    public static final at9 c = new at9(12, 13);

    @Override // defpackage.xs9
    public final void a(sze szeVar) {
        szeVar.getClass();
        szeVar.D("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        szeVar.D("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
