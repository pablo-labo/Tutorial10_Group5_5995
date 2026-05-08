package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class et9 extends xs9 {
    public static final et9 c = new et9(4, 5);

    @Override // defpackage.xs9
    public final void a(sze szeVar) {
        szeVar.getClass();
        szeVar.D("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        szeVar.D("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
