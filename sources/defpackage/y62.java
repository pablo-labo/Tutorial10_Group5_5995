package defpackage;

import defpackage.xed;

/* JADX INFO: loaded from: classes.dex */
public final class y62 extends xed.b {
    public static final y62 a = new y62();

    @Override // xed.b
    public final void a(sze szeVar) {
        szeVar.getClass();
        szeVar.y();
        try {
            szeVar.D("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - 86400000) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            szeVar.T();
        } finally {
            szeVar.c0();
        }
    }
}
