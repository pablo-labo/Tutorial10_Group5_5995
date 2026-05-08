package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ct9 extends xs9 {
    public static final ct9 c = new ct9(1, 2);

    @Override // defpackage.xs9
    public final void a(sze szeVar) {
        szeVar.getClass();
        szeVar.D("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        szeVar.D("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        szeVar.D("DROP TABLE IF EXISTS alarmInfo");
        szeVar.D("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
