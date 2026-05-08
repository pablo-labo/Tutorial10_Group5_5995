package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import defpackage.b39;
import defpackage.c2f;
import defpackage.u72;
import defpackage.y21;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class fid implements q05, c2f, s72 {
    public static final dt4 f = new dt4("proto");
    public final bpd a;
    public final b82 b;
    public final b82 c;
    public final z21 d;
    public final Provider<String> e;

    public interface a<T, U> {
        U apply(T t);
    }

    public static class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public fid(b82 b82Var, b82 b82Var2, z21 z21Var, bpd bpdVar, Provider<String> provider) {
        this.a = bpdVar;
        this.b = b82Var;
        this.c = b82Var2;
        this.d = z21Var;
        this.e = provider;
    }

    public static Long G(SQLiteDatabase sQLiteDatabase, v31 v31Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(v31Var.a, String.valueOf(mnb.a(v31Var.c))));
        byte[] bArr = v31Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String Q(Iterable<p8b> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<p8b> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T W(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // defpackage.q05
    public final void A(Iterable<p8b> iterable) {
        if (iterable.iterator().hasNext()) {
            v().compileStatement("DELETE FROM events WHERE _id in ".concat(Q(iterable))).execute();
        }
    }

    @Override // defpackage.q05
    public final void G0(final long j, final v31 v31Var) {
        N(new a() { // from class: cid
            @Override // fid.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                v31 v31Var2 = v31Var;
                String str = v31Var2.a;
                jnb jnbVar = v31Var2.c;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(mnb.a(jnbVar))}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put("priority", Integer.valueOf(mnb.a(jnbVar)));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // defpackage.q05
    public final Iterable G1(v31 v31Var) {
        return (Iterable) N(new z65(3, this, v31Var));
    }

    @Override // defpackage.q05
    public final j31 M(final v31 v31Var, final iy4 iy4Var) {
        jnb jnbVar = v31Var.c;
        String strG = iy4Var.g();
        String str = v31Var.a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + jnbVar + ", name=" + strG + " for destination " + str);
        }
        long jLongValue = ((Long) N(new a() { // from class: bid
            @Override // fid.a
            public final Object apply(Object obj) {
                long jInsert;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                fid fidVar = this.a;
                long jSimpleQueryForLong = fidVar.v().compileStatement("PRAGMA page_size").simpleQueryForLong() * fidVar.v().compileStatement("PRAGMA page_count").simpleQueryForLong();
                z21 z21Var = fidVar.d;
                long jE = z21Var.e();
                iy4 iy4Var2 = iy4Var;
                if (jSimpleQueryForLong >= jE) {
                    fidVar.s(1L, b39.a.CACHE_FULL, iy4Var2.g());
                    return -1L;
                }
                v31 v31Var2 = v31Var;
                Long lG = fid.G(sQLiteDatabase, v31Var2);
                if (lG != null) {
                    jInsert = lG.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", v31Var2.a);
                    contentValues.put("priority", Integer.valueOf(mnb.a(v31Var2.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = v31Var2.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iD = z21Var.d();
                byte[] bArr2 = iy4Var2.d().b;
                boolean z = bArr2.length <= iD;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", iy4Var2.g());
                contentValues2.put("timestamp_ms", Long.valueOf(iy4Var2.e()));
                contentValues2.put("uptime_ms", Long.valueOf(iy4Var2.h()));
                contentValues2.put("payload_encoding", iy4Var2.d().a.a);
                contentValues2.put("code", iy4Var2.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) iD));
                    for (int i = 1; i <= iCeil; i++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i - 1) * iD, Math.min(i * iD, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iy4Var2.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new j31(jLongValue, v31Var, iy4Var);
    }

    public final <T> T N(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase sQLiteDatabaseV = v();
        sQLiteDatabaseV.beginTransaction();
        try {
            T tApply = aVar.apply(sQLiteDatabaseV);
            sQLiteDatabaseV.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseV.endTransaction();
        }
    }

    @Override // defpackage.q05
    public final Iterable<atf> O() {
        return (Iterable) N(new s40());
    }

    public final ArrayList P(SQLiteDatabase sQLiteDatabase, final v31 v31Var, int i) {
        final ArrayList arrayList = new ArrayList();
        Long lG = G(sQLiteDatabase, v31Var);
        if (lG == null) {
            return arrayList;
        }
        W(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lG.toString()}, null, null, null, String.valueOf(i)), new a() { // from class: eid
            @Override // fid.a
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                while (true) {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    long j = cursor.getLong(0);
                    boolean z = cursor.getInt(7) != 0;
                    y21.a aVar = new y21.a();
                    aVar.f = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        ja.k("Null transportName");
                        break;
                    }
                    aVar.a = string;
                    aVar.d = Long.valueOf(cursor.getLong(2));
                    aVar.e = Long.valueOf(cursor.getLong(3));
                    if (z) {
                        String string2 = cursor.getString(4);
                        aVar.c = new xs4(string2 == null ? fid.f : new dt4(string2), cursor.getBlob(5));
                    } else {
                        String string3 = cursor.getString(4);
                        dt4 dt4Var = string3 == null ? fid.f : new dt4(string3);
                        Cursor cursorQuery = this.a.v().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int length2 = 0;
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i2);
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                            }
                            cursorQuery.close();
                            aVar.c = new xs4(dt4Var, bArr);
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        aVar.b = Integer.valueOf(cursor.getInt(6));
                    }
                    arrayList.add(new j31(j, v31Var, aVar.b()));
                }
                return null;
            }
        });
        return arrayList;
    }

    @Override // defpackage.q05
    public final long Y0(atf atfVar) {
        Cursor cursorRawQuery = v().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{atfVar.a(), String.valueOf(mnb.a(atfVar.c()))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            return lValueOf.longValue();
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.q05
    public final boolean Z0(v31 v31Var) {
        Boolean bool;
        SQLiteDatabase sQLiteDatabaseV = v();
        sQLiteDatabaseV.beginTransaction();
        try {
            Long lG = G(sQLiteDatabaseV, v31Var);
            if (lG == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = v().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lG.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            sQLiteDatabaseV.setTransactionSuccessful();
            sQLiteDatabaseV.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th2) {
            sQLiteDatabaseV.endTransaction();
            throw th2;
        }
    }

    @Override // defpackage.s72
    public final void a() {
        SQLiteDatabase sQLiteDatabaseV = v();
        sQLiteDatabaseV.beginTransaction();
        try {
            sQLiteDatabaseV.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseV.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.b.getTime()).execute();
            sQLiteDatabaseV.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseV.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.q05
    public final int d() {
        long time = this.b.getTime() - this.d.b();
        SQLiteDatabase sQLiteDatabaseV = v();
        sQLiteDatabaseV.beginTransaction();
        try {
            String[] strArr = {String.valueOf(time)};
            Cursor cursorRawQuery = sQLiteDatabaseV.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            while (cursorRawQuery.moveToNext()) {
                try {
                    s(cursorRawQuery.getInt(0), b39.a.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            cursorRawQuery.close();
            int iDelete = sQLiteDatabaseV.delete("events", "timestamp_ms < ?", strArr);
            sQLiteDatabaseV.setTransactionSuccessful();
            return iDelete;
        } finally {
            sQLiteDatabaseV.endTransaction();
        }
    }

    @Override // defpackage.c2f
    public final <T> T h(c2f.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseV = v();
        b82 b82Var = this.c;
        long time = b82Var.getTime();
        while (true) {
            try {
                sQLiteDatabaseV.beginTransaction();
                try {
                    T tB = aVar.b();
                    sQLiteDatabaseV.setTransactionSuccessful();
                    return tB;
                } finally {
                    sQLiteDatabaseV.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (b82Var.getTime() >= ((long) this.d.a()) + time) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // defpackage.s72
    public final u72 p() {
        int i = u72.e;
        u72.a aVar = new u72.a();
        aVar.a = null;
        aVar.b = new ArrayList();
        aVar.c = null;
        aVar.d = "";
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseV = v();
        sQLiteDatabaseV.beginTransaction();
        try {
            u72 u72Var = (u72) W(sQLiteDatabaseV.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new dq3(this, map, aVar));
            sQLiteDatabaseV.setTransactionSuccessful();
            return u72Var;
        } finally {
            sQLiteDatabaseV.endTransaction();
        }
    }

    @Override // defpackage.s72
    public final void s(final long j, final b39.a aVar, final String str) {
        N(new a() { // from class: did
            @Override // fid.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                b39.a aVar2 = aVar;
                String string = Integer.toString(aVar2.getNumber());
                String str2 = str;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string});
                try {
                    boolean z = cursorRawQuery.getCount() > 0;
                    cursorRawQuery.close();
                    long j2 = j;
                    if (z) {
                        sQLiteDatabase.execSQL(u40.c(j2, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str2, Integer.toString(aVar2.getNumber())});
                        return null;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(aVar2.getNumber()));
                    contentValues.put("events_dropped_count", Long.valueOf(j2));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    return null;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
        });
    }

    public final SQLiteDatabase v() {
        bpd bpdVar = this.a;
        Objects.requireNonNull(bpdVar);
        b82 b82Var = this.c;
        long time = b82Var.getTime();
        while (true) {
            try {
                return bpdVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (b82Var.getTime() >= ((long) this.d.a()) + time) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // defpackage.q05
    public final void w0(Iterable<p8b> iterable) {
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(Q(iterable));
            SQLiteDatabase sQLiteDatabaseV = v();
            sQLiteDatabaseV.beginTransaction();
            try {
                sQLiteDatabaseV.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseV.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        s(cursorRawQuery.getInt(0), b39.a.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseV.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseV.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseV.endTransaction();
            }
        }
    }
}
