package com.infra.eventlogger.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import defpackage.ak2;
import defpackage.at5;
import defpackage.bac;
import defpackage.gfd;
import defpackage.km7;
import defpackage.m7f;
import defpackage.pg8;
import defpackage.qf3;
import defpackage.qze;
import defpackage.tze;
import defpackage.v40;
import defpackage.w9c;
import defpackage.xs9;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class EventLoggerDatabase_Impl extends EventLoggerDatabase {
    public volatile bac l;

    public class a extends gfd.a {
        public a() {
            super(3);
        }

        @Override // gfd.a
        public final void a(at5 at5Var) {
            SQLiteDatabase sQLiteDatabase = at5Var.a;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `QueuedEvent` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `createdAt` INTEGER NOT NULL, `eventPayload` TEXT, `avroEventPayload` BLOB, `jsonObjectPayload` TEXT)");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_QueuedEvent_createdAt` ON `QueuedEvent` (`createdAt`)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '00460ce577429553e6fcbd3d509eaefc')");
        }

        @Override // gfd.a
        public final void b(at5 at5Var) {
            at5Var.a.execSQL("DROP TABLE IF EXISTS `QueuedEvent`");
        }

        @Override // gfd.a
        public final void c() {
        }

        @Override // gfd.a
        public final void d(at5 at5Var) {
            EventLoggerDatabase_Impl.this.t(new qze(at5Var));
        }

        @Override // gfd.a
        public final void e(at5 at5Var) {
            pg8.n(new qze(at5Var));
        }

        @Override // gfd.a
        public final gfd.b f(at5 at5Var) {
            HashMap map = new HashMap(5);
            map.put("_id", new m7f.a(1, 1, "_id", "INTEGER", null, true));
            map.put("createdAt", new m7f.a(0, 1, "createdAt", "INTEGER", null, true));
            map.put("eventPayload", new m7f.a(0, 1, "eventPayload", "TEXT", null, false));
            map.put("avroEventPayload", new m7f.a(0, 1, "avroEventPayload", "BLOB", null, false));
            map.put("jsonObjectPayload", new m7f.a(0, 1, "jsonObjectPayload", "TEXT", null, false));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new m7f.d("index_QueuedEvent_createdAt", false, Arrays.asList("createdAt"), Arrays.asList("ASC")));
            m7f m7fVar = new m7f("QueuedEvent", map, hashSet, hashSet2);
            m7f m7fVarA = m7f.a(at5Var, "QueuedEvent");
            return !m7fVar.equals(m7fVarA) ? new gfd.b(v40.f("QueuedEvent(com.infra.eventlogger.persistence.QueuedEvent).\n Expected:\n", m7fVar, "\n Found:\n", m7fVarA), false) : new gfd.b(null, true);
        }
    }

    @Override // defpackage.xed
    public final km7 f() {
        return new km7(this, new HashMap(0), new HashMap(0), "QueuedEvent");
    }

    @Override // defpackage.xed
    public final tze h(qf3 qf3Var) {
        gfd gfdVar = new gfd(qf3Var, new a(), "00460ce577429553e6fcbd3d509eaefc", "d46b0023020ce1649504085469171f28");
        Context context = qf3Var.a;
        context.getClass();
        return qf3Var.c.c(new tze.b(context, qf3Var.b, gfdVar, false, false));
    }

    @Override // defpackage.xed
    public final List i(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new xs9[0]);
    }

    @Override // defpackage.xed
    public final Set<Class<? extends ak2>> n() {
        return new HashSet();
    }

    @Override // defpackage.xed
    public final Map<Class<?>, List<Class<?>>> p() {
        HashMap map = new HashMap();
        map.put(w9c.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.infra.eventlogger.persistence.EventLoggerDatabase
    public final w9c y() {
        bac bacVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new bac(this);
                }
                bacVar = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bacVar;
    }
}
