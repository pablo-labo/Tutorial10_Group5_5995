package androidx.work.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import defpackage.a3h;
import defpackage.a4h;
import defpackage.ak2;
import defpackage.at5;
import defpackage.c2h;
import defpackage.c3h;
import defpackage.d2h;
import defpackage.ejc;
import defpackage.gfd;
import defpackage.jjb;
import defpackage.km7;
import defpackage.ln2;
import defpackage.m7f;
import defpackage.oy3;
import defpackage.pg8;
import defpackage.qf3;
import defpackage.ql0;
import defpackage.qze;
import defpackage.s3h;
import defpackage.tze;
import defpackage.uqf;
import defpackage.v2f;
import defpackage.v40;
import defpackage.x7;
import defpackage.y3h;
import defpackage.z2f;
import defpackage.zpd;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile y3h l;
    public volatile x7 m;
    public volatile zpd n;
    public volatile z2f o;
    public volatile ql0 p;
    public volatile uqf q;
    public volatile ln2 r;

    public class a extends gfd.a {
        public a() {
            super(16);
        }

        @Override // gfd.a
        public final void a(at5 at5Var) {
            SQLiteDatabase sQLiteDatabase = at5Var.a;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // gfd.a
        public final void b(at5 at5Var) {
            SQLiteDatabase sQLiteDatabase = at5Var.a;
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
        }

        @Override // gfd.a
        public final void c() {
        }

        @Override // gfd.a
        public final void d(at5 at5Var) {
            at5Var.a.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.t(new qze(at5Var));
        }

        @Override // gfd.a
        public final void e(at5 at5Var) {
            pg8.n(new qze(at5Var));
        }

        @Override // gfd.a
        public final gfd.b f(at5 at5Var) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new m7f.a(1, 1, "work_spec_id", "TEXT", null, true));
            map.put("prerequisite_id", new m7f.a(2, 1, "prerequisite_id", "TEXT", null, true));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new m7f.c(Arrays.asList("work_spec_id"), Arrays.asList("id"), "WorkSpec", "CASCADE", "CASCADE"));
            hashSet.add(new m7f.c(Arrays.asList("prerequisite_id"), Arrays.asList("id"), "WorkSpec", "CASCADE", "CASCADE"));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new m7f.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new m7f.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            m7f m7fVar = new m7f("Dependency", map, hashSet, hashSet2);
            m7f m7fVarA = m7f.a(at5Var, "Dependency");
            if (!m7fVar.equals(m7fVarA)) {
                return new gfd.b(v40.f("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", m7fVar, "\n Found:\n", m7fVarA), false);
            }
            HashMap map2 = new HashMap(27);
            map2.put("id", new m7f.a(1, 1, "id", "TEXT", null, true));
            map2.put("state", new m7f.a(0, 1, "state", "INTEGER", null, true));
            map2.put("worker_class_name", new m7f.a(0, 1, "worker_class_name", "TEXT", null, true));
            map2.put("input_merger_class_name", new m7f.a(0, 1, "input_merger_class_name", "TEXT", null, false));
            map2.put("input", new m7f.a(0, 1, "input", "BLOB", null, true));
            map2.put("output", new m7f.a(0, 1, "output", "BLOB", null, true));
            map2.put("initial_delay", new m7f.a(0, 1, "initial_delay", "INTEGER", null, true));
            map2.put("interval_duration", new m7f.a(0, 1, "interval_duration", "INTEGER", null, true));
            map2.put("flex_duration", new m7f.a(0, 1, "flex_duration", "INTEGER", null, true));
            map2.put("run_attempt_count", new m7f.a(0, 1, "run_attempt_count", "INTEGER", null, true));
            map2.put("backoff_policy", new m7f.a(0, 1, "backoff_policy", "INTEGER", null, true));
            map2.put("backoff_delay_duration", new m7f.a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
            map2.put("last_enqueue_time", new m7f.a(0, 1, "last_enqueue_time", "INTEGER", null, true));
            map2.put("minimum_retention_duration", new m7f.a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
            map2.put("schedule_requested_at", new m7f.a(0, 1, "schedule_requested_at", "INTEGER", null, true));
            map2.put("run_in_foreground", new m7f.a(0, 1, "run_in_foreground", "INTEGER", null, true));
            map2.put("out_of_quota_policy", new m7f.a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
            map2.put("period_count", new m7f.a(0, 1, "period_count", "INTEGER", "0", true));
            map2.put("generation", new m7f.a(0, 1, "generation", "INTEGER", "0", true));
            map2.put("required_network_type", new m7f.a(0, 1, "required_network_type", "INTEGER", null, true));
            map2.put("requires_charging", new m7f.a(0, 1, "requires_charging", "INTEGER", null, true));
            map2.put("requires_device_idle", new m7f.a(0, 1, "requires_device_idle", "INTEGER", null, true));
            map2.put("requires_battery_not_low", new m7f.a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
            map2.put("requires_storage_not_low", new m7f.a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
            map2.put("trigger_content_update_delay", new m7f.a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
            map2.put("trigger_max_content_delay", new m7f.a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
            map2.put("content_uri_triggers", new m7f.a(0, 1, "content_uri_triggers", "BLOB", null, true));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new m7f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new m7f.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            m7f m7fVar2 = new m7f("WorkSpec", map2, hashSet3, hashSet4);
            m7f m7fVarA2 = m7f.a(at5Var, "WorkSpec");
            if (!m7fVar2.equals(m7fVarA2)) {
                return new gfd.b(v40.f("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", m7fVar2, "\n Found:\n", m7fVarA2), false);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new m7f.a(1, 1, "tag", "TEXT", null, true));
            map3.put("work_spec_id", new m7f.a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new m7f.c(Arrays.asList("work_spec_id"), Arrays.asList("id"), "WorkSpec", "CASCADE", "CASCADE"));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new m7f.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            m7f m7fVar3 = new m7f("WorkTag", map3, hashSet5, hashSet6);
            m7f m7fVarA3 = m7f.a(at5Var, "WorkTag");
            if (!m7fVar3.equals(m7fVarA3)) {
                return new gfd.b(v40.f("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", m7fVar3, "\n Found:\n", m7fVarA3), false);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new m7f.a(1, 1, "work_spec_id", "TEXT", null, true));
            map4.put("generation", new m7f.a(2, 1, "generation", "INTEGER", "0", true));
            map4.put("system_id", new m7f.a(0, 1, "system_id", "INTEGER", null, true));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new m7f.c(Arrays.asList("work_spec_id"), Arrays.asList("id"), "WorkSpec", "CASCADE", "CASCADE"));
            m7f m7fVar4 = new m7f("SystemIdInfo", map4, hashSet7, new HashSet(0));
            m7f m7fVarA4 = m7f.a(at5Var, "SystemIdInfo");
            if (!m7fVar4.equals(m7fVarA4)) {
                return new gfd.b(v40.f("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", m7fVar4, "\n Found:\n", m7fVarA4), false);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new m7f.a(1, 1, "name", "TEXT", null, true));
            map5.put("work_spec_id", new m7f.a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new m7f.c(Arrays.asList("work_spec_id"), Arrays.asList("id"), "WorkSpec", "CASCADE", "CASCADE"));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new m7f.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            m7f m7fVar5 = new m7f("WorkName", map5, hashSet8, hashSet9);
            m7f m7fVarA5 = m7f.a(at5Var, "WorkName");
            if (!m7fVar5.equals(m7fVarA5)) {
                return new gfd.b(v40.f("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", m7fVar5, "\n Found:\n", m7fVarA5), false);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new m7f.a(1, 1, "work_spec_id", "TEXT", null, true));
            map6.put(ReactProgressBarViewManager.PROP_PROGRESS, new m7f.a(0, 1, ReactProgressBarViewManager.PROP_PROGRESS, "BLOB", null, true));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new m7f.c(Arrays.asList("work_spec_id"), Arrays.asList("id"), "WorkSpec", "CASCADE", "CASCADE"));
            m7f m7fVar6 = new m7f("WorkProgress", map6, hashSet10, new HashSet(0));
            m7f m7fVarA6 = m7f.a(at5Var, "WorkProgress");
            if (!m7fVar6.equals(m7fVarA6)) {
                return new gfd.b(v40.f("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", m7fVar6, "\n Found:\n", m7fVarA6), false);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new m7f.a(1, 1, "key", "TEXT", null, true));
            map7.put("long_value", new m7f.a(0, 1, "long_value", "INTEGER", null, false));
            m7f m7fVar7 = new m7f("Preference", map7, new HashSet(0), new HashSet(0));
            m7f m7fVarA7 = m7f.a(at5Var, "Preference");
            return !m7fVar7.equals(m7fVarA7) ? new gfd.b(v40.f("Preference(androidx.work.impl.model.Preference).\n Expected:\n", m7fVar7, "\n Found:\n", m7fVarA7), false) : new gfd.b(null, true);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public final v2f A() {
        z2f z2fVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new z2f(this);
                }
                z2fVar = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2fVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final a3h B() {
        ql0 ql0Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new ql0(this);
                }
                ql0Var = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ql0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c3h C() {
        uqf uqfVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new uqf(this);
                }
                uqfVar = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uqfVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s3h D() {
        y3h y3hVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new y3h(this);
                }
                y3hVar = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return y3hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final a4h E() {
        zpd zpdVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new zpd(this);
                }
                zpdVar = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zpdVar;
    }

    @Override // defpackage.xed
    public final km7 f() {
        return new km7(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.xed
    public final tze h(qf3 qf3Var) {
        gfd gfdVar = new gfd(qf3Var, new a(), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e");
        Context context = qf3Var.a;
        context.getClass();
        return qf3Var.c.c(new tze.b(context, qf3Var.b, gfdVar, false, false));
    }

    @Override // defpackage.xed
    public final List i(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new c2h(13, 14), new d2h(14, 15));
    }

    @Override // defpackage.xed
    public final Set<Class<? extends ak2>> n() {
        return new HashSet();
    }

    @Override // defpackage.xed
    public final Map<Class<?>, List<Class<?>>> p() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(s3h.class, list);
        map.put(oy3.class, list);
        map.put(a4h.class, list);
        map.put(v2f.class, list);
        map.put(a3h.class, list);
        map.put(c3h.class, list);
        map.put(jjb.class, list);
        map.put(ejc.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final oy3 y() {
        x7 x7Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new x7(this);
                }
                x7Var = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return x7Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final jjb z() {
        ln2 ln2Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new ln2(this);
                }
                ln2Var = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ln2Var;
    }
}
