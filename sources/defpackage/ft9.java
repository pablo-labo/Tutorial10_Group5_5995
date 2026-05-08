package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ft9 extends xs9 {
    public static final ft9 c = new ft9(6, 7);

    @Override // defpackage.xs9
    public final void a(sze szeVar) {
        szeVar.getClass();
        szeVar.D("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
