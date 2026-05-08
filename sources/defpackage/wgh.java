package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.net.RumRequestFactory;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzw;
import defpackage.jph;
import defpackage.lph;
import defpackage.nph;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wgh extends bei {
    public final bhh d;
    public final pdi e;
    public static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] V = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] W = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    public static final String[] X = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] Y = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", RumRequestFactory.RETRY_COUNT_KEY, "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] Z = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] a0 = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] b0 = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    public wgh(fei feiVar) {
        super(feiVar);
        this.e = new pdi(this.a.c0);
        this.d = new bhh(this, this.a.a);
    }

    public static void y(ContentValues contentValues, Object obj) {
        fib.f("value");
        fib.i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            l5.q("Invalid value type");
        }
    }

    @VisibleForTesting
    public final void A(ArrayList arrayList) {
        b();
        g();
        fib.i(arrayList);
        if (arrayList.size() == 0) {
            l5.q("Given Integer is zero");
            return;
        }
        if (this.a.a.getDatabasePath("google_app_measurement.db").exists()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strG = ja.g(uz.c(2, strJoin), "(", strJoin, ")");
            if (K(ja.g(strG.length() + 80, "SELECT COUNT(1) FROM queue WHERE rowid IN ", strG, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                zzr().X.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM = m();
                StringBuilder sb = new StringBuilder(strG.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strG);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseM.execSQL(sb.toString());
            } catch (SQLiteException e) {
                zzr().f.a(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void B(kih kihVar) {
        fib.i(kihVar);
        b();
        g();
        ContentValues contentValues = new ContentValues();
        String str = kihVar.a;
        contentValues.put("app_id", str);
        contentValues.put("name", kihVar.b);
        contentValues.put("lifetime_count", Long.valueOf(kihVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(kihVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(kihVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(kihVar.g));
        contentValues.put("last_bundled_day", kihVar.h);
        contentValues.put("last_sampled_complex_event_id", kihVar.i);
        contentValues.put("last_sampling_rate", kihVar.j);
        contentValues.put("current_session_count", Long.valueOf(kihVar.e));
        Boolean bool = kihVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzr().f.a(ewh.l(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            zzr().f.c("Error storing event aggregates. appId", ewh.l(str), e);
        }
    }

    public final void C(nph nphVar, boolean z) {
        b();
        g();
        fib.f(nphVar.w1());
        if (!nphVar.e1()) {
            bg.h();
            return;
        }
        Z();
        this.a.c0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jF1 = nphVar.f1();
        svh<Long> svhVar = djh.D;
        if (jF1 < jCurrentTimeMillis - svhVar.a(null).longValue() || nphVar.f1() > svhVar.a(null).longValue() + jCurrentTimeMillis) {
            zzr().X.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", ewh.l(nphVar.w1()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(nphVar.f1()));
        }
        try {
            byte[] bArrJ = j().J(nphVar.b());
            zzr().c0.a(Integer.valueOf(bArrJ.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", nphVar.w1());
            contentValues.put("bundle_end_timestamp", Long.valueOf(nphVar.f1()));
            contentValues.put("data", bArrJ);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (nphVar.c0()) {
                contentValues.put(RumRequestFactory.RETRY_COUNT_KEY, Integer.valueOf(nphVar.k0()));
            }
            try {
                if (m().insert("queue", null, contentValues) == -1) {
                    zzr().f.a(ewh.l(nphVar.w1()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                zzr().f.c("Error storing bundle. appId", ewh.l(nphVar.w1()), e);
            }
        } catch (IOException e2) {
            zzr().f.c("Data loss. Failed to serialize bundle. appId", ewh.l(nphVar.w1()), e2);
        }
    }

    public final void D(gxh gxhVar) {
        b();
        g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", gxhVar.n());
        contentValues.put("app_instance_id", gxhVar.r());
        contentValues.put("gmp_app_id", gxhVar.u());
        i0i i0iVar = gxhVar.a;
        a0i a0iVar = i0iVar.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        contentValues.put("resettable_device_id_hash", gxhVar.e);
        a0i a0iVar2 = i0iVar.Y;
        i0i.i(a0iVar2);
        a0iVar2.b();
        contentValues.put("last_bundle_index", Long.valueOf(gxhVar.g));
        a0i a0iVar3 = i0iVar.Y;
        i0i.i(a0iVar3);
        a0iVar3.b();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(gxhVar.h));
        a0i a0iVar4 = i0iVar.Y;
        i0i.i(a0iVar4);
        a0iVar4.b();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(gxhVar.i));
        contentValues.put("app_version", gxhVar.K());
        contentValues.put("app_store", gxhVar.O());
        contentValues.put("gmp_version", Long.valueOf(gxhVar.Q()));
        contentValues.put("dev_cert_hash", Long.valueOf(gxhVar.S()));
        contentValues.put("measurement_enabled", Boolean.valueOf(gxhVar.V()));
        a0i a0iVar5 = i0iVar.Y;
        i0i.i(a0iVar5);
        a0iVar5.b();
        contentValues.put("day", Long.valueOf(gxhVar.x));
        a0i a0iVar6 = i0iVar.Y;
        i0i.i(a0iVar6);
        a0iVar6.b();
        contentValues.put("daily_public_events_count", Long.valueOf(gxhVar.y));
        i0i.i(a0iVar6);
        a0iVar6.b();
        contentValues.put("daily_events_count", Long.valueOf(gxhVar.z));
        i0i.i(a0iVar6);
        a0iVar6.b();
        contentValues.put("daily_conversions_count", Long.valueOf(gxhVar.A));
        a0i a0iVar7 = i0iVar.Y;
        i0i.i(a0iVar7);
        a0iVar7.b();
        contentValues.put("config_fetched_time", Long.valueOf(gxhVar.F));
        a0i a0iVar8 = i0iVar.Y;
        i0i.i(a0iVar8);
        a0iVar8.b();
        contentValues.put("failed_config_fetch_time", Long.valueOf(gxhVar.G));
        contentValues.put("app_version_int", Long.valueOf(gxhVar.M()));
        contentValues.put("firebase_instance_id", gxhVar.F());
        i0i.i(a0iVar6);
        a0iVar6.b();
        contentValues.put("daily_error_events_count", Long.valueOf(gxhVar.B));
        i0i.i(a0iVar6);
        a0iVar6.b();
        contentValues.put("daily_realtime_events_count", Long.valueOf(gxhVar.C));
        a0i a0iVar9 = i0iVar.Y;
        i0i.i(a0iVar9);
        a0iVar9.b();
        contentValues.put("health_monitor_sample", gxhVar.D);
        contentValues.put("android_id", Long.valueOf(gxhVar.g()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(gxhVar.h()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(gxhVar.i()));
        contentValues.put("admob_app_id", gxhVar.x());
        contentValues.put("dynamite_version", Long.valueOf(gxhVar.U()));
        if (gxhVar.j() != null) {
            if (gxhVar.j().size() == 0) {
                zzr().X.a(gxhVar.n(), "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", gxhVar.j()));
            }
        }
        lgi.a();
        if (this.a.V.k(gxhVar.n(), djh.n0)) {
            contentValues.put("ga_app_id", gxhVar.A());
        }
        try {
            SQLiteDatabase sQLiteDatabaseM = m();
            if (sQLiteDatabaseM.update("apps", contentValues, "app_id = ?", new String[]{gxhVar.n()}) == 0 && sQLiteDatabaseM.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzr().f.a(ewh.l(gxhVar.n()), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            zzr().f.c("Error storing app. appId", ewh.l(gxhVar.n()), e);
        }
    }

    public final boolean E(zzw zzwVar) {
        b();
        g();
        if (Q(zzwVar.a, zzwVar.c.b) == null && K("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzwVar.a}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzwVar.a);
        contentValues.put("origin", zzwVar.b);
        contentValues.put("name", zzwVar.c.b);
        y(contentValues, zzwVar.c.s0());
        contentValues.put(AppStateModule.APP_STATE_ACTIVE, Boolean.valueOf(zzwVar.e));
        contentValues.put("trigger_event_name", zzwVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(zzwVar.W));
        e();
        contentValues.put("timed_out_event", yei.T(zzwVar.V));
        contentValues.put("creation_timestamp", Long.valueOf(zzwVar.d));
        e();
        contentValues.put("triggered_event", yei.T(zzwVar.X));
        contentValues.put("triggered_timestamp", Long.valueOf(zzwVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(zzwVar.Y));
        e();
        contentValues.put("expired_event", yei.T(zzwVar.Z));
        try {
            if (m().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzr().f.a(ewh.l(zzwVar.a), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            zzr().f.c("Error storing conditional user property", ewh.l(zzwVar.a), e);
            return true;
        }
    }

    public final boolean F(String str, int i, gnh gnhVar) {
        g();
        b();
        fib.f(str);
        fib.i(gnhVar);
        if (TextUtils.isEmpty(gnhVar.w())) {
            zzr().X.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", ewh.l(str), Integer.valueOf(i), String.valueOf(gnhVar.u() ? Integer.valueOf(gnhVar.v()) : null));
            return false;
        }
        byte[] bArrB = gnhVar.b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", gnhVar.u() ? Integer.valueOf(gnhVar.v()) : null);
        contentValues.put("event_name", gnhVar.w());
        contentValues.put("session_scoped", gnhVar.D() ? Boolean.valueOf(gnhVar.E()) : null);
        contentValues.put("data", bArrB);
        try {
            if (m().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzr().f.a(ewh.l(str), "Failed to insert event filter (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            zzr().f.c("Error storing event filter. appId", ewh.l(str), e);
            return false;
        }
    }

    public final boolean G(String str, int i, jnh jnhVar) {
        g();
        b();
        fib.f(str);
        fib.i(jnhVar);
        if (TextUtils.isEmpty(jnhVar.u())) {
            zzr().X.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", ewh.l(str), Integer.valueOf(i), String.valueOf(jnhVar.s() ? Integer.valueOf(jnhVar.t()) : null));
            return false;
        }
        byte[] bArrB = jnhVar.b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", jnhVar.s() ? Integer.valueOf(jnhVar.t()) : null);
        contentValues.put("property_name", jnhVar.u());
        contentValues.put("session_scoped", jnhVar.y() ? Boolean.valueOf(jnhVar.z()) : null);
        contentValues.put("data", bArrB);
        try {
            if (m().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzr().f.a(ewh.l(str), "Failed to insert property filter (got -1). appId");
            return false;
        } catch (SQLiteException e) {
            zzr().f.c("Error storing property filter. appId", ewh.l(str), e);
            return false;
        }
    }

    public final boolean H(oih oihVar, long j, boolean z) {
        b();
        g();
        String str = oihVar.a;
        fib.f(str);
        nei neiVarJ = j();
        jph.a aVarJ = jph.J();
        long j2 = oihVar.e;
        if (aVarJ.c) {
            aVarJ.k();
            aVarJ.c = false;
        }
        jph.B(j2, (jph) aVarJ.b);
        zzan zzanVar = oihVar.f;
        zzanVar.getClass();
        Bundle bundle = zzanVar.a;
        for (String str2 : bundle.keySet()) {
            lph.a aVarN = lph.N();
            aVarN.p(str2);
            neiVarJ.C(aVarN, bundle.get(str2));
            aVarJ.p(aVarN);
        }
        byte[] bArrB = ((jph) aVarJ.m()).b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("name", oihVar.b);
        contentValues.put(NdkCrashLog.TIMESTAMP_KEY_NAME, Long.valueOf(oihVar.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", bArrB);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (m().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzr().f.a(ewh.l(str), "Failed to insert raw event (got -1). appId");
            return false;
        } catch (SQLiteException e) {
            zzr().f.c("Error storing raw event. appId", ewh.l(str), e);
            return false;
        }
    }

    public final boolean I(bfi bfiVar) {
        String str = bfiVar.b;
        b();
        g();
        String str2 = bfiVar.a;
        String str3 = bfiVar.c;
        if (Q(str2, str3) == null) {
            if (yei.L(str3)) {
                long jK = K("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2});
                wmi wmiVar = this.a.V;
                wmiVar.getClass();
                ((gci) ybi.b.zza()).getClass();
                if (jK >= (wmiVar.k(null, djh.J0) ? Math.max(Math.min(wmiVar.i(str2, djh.G), 100), 25) : 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3) && K("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(bfiVar.d));
        y(contentValues, bfiVar.e);
        try {
            if (m().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzr().f.a(ewh.l(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            zzr().f.c("Error storing user property. appId", ewh.l(str2), e);
            return true;
        }
    }

    public final long J() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                zzr().f.a(e, "Error querying raw events");
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final long K(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                zzr().f.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<zzw> L(String str, String str2, String str3) {
        fib.f(str);
        b();
        g();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return v(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00d8: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:15:0x00d8 */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gxh M(java.lang.String r36) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgh.M(java.lang.String):gxh");
    }

    public final void N(String str, String str2) {
        fib.f(str);
        fib.f(str2);
        b();
        g();
        try {
            m().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzr().f.d("Error deleting user property. appId", ewh.l(str), d().p(str2), e);
        }
    }

    public final void O(String str, ArrayList arrayList) {
        fib.f(str);
        g();
        b();
        SQLiteDatabase sQLiteDatabaseM = m();
        try {
            long jK = K("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, this.a.V.i(str, djh.F)));
            if (jK <= iMax) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                Integer num = (Integer) arrayList.get(i);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            String strJoin = TextUtils.join(",", arrayList2);
            String strG = ja.g(uz.c(2, strJoin), "(", strJoin, ")");
            sQLiteDatabaseM.delete("audience_filter_values", ja.g(strG.length() + 140, "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", strG, " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)});
        } catch (SQLiteException e) {
            zzr().f.c("Database error querying filters. appId", ewh.l(str), e);
        }
    }

    public final long P(String str) {
        fib.f(str);
        b();
        g();
        try {
            return m().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, this.a.V.i(str, djh.q))))});
        } catch (SQLiteException e) {
            this.zzr().f.c("Error deleting over the limit events. appId", ewh.l(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0062: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:16:0x0061 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bfi Q(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            defpackage.fib.f(r11)
            defpackage.fib.f(r12)
            r10.b()
            r10.g()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.m()     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L72
            java.lang.String r3 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L72
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L72
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L72
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L6b
            if (r0 != 0) goto L34
            r2.close()
            return r1
        L34:
            r0 = 0
            long r7 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L6b
            r0 = 1
            java.lang.Object r9 = r10.q(r2, r0)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L6b
            r0 = 2
            java.lang.String r5 = r2.getString(r0)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L6b
            bfi r3 = new bfi     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L6b
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L64
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L64
            if (r11 == 0) goto L67
            ewh r11 = r10.zzr()     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L64
            jwh r11 = r11.f     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L64
            java.lang.String r12 = "Got multiple records for user property, expected one. appId"
            swh r0 = defpackage.ewh.l(r4)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L64
            r11.a(r0, r12)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L64
            goto L67
        L60:
            r0 = move-exception
            r10 = r0
            r1 = r2
            goto L94
        L64:
            r0 = move-exception
        L65:
            r11 = r0
            goto L77
        L67:
            r2.close()
            return r3
        L6b:
            r0 = move-exception
            r4 = r11
            r6 = r12
            goto L65
        L6f:
            r0 = move-exception
            r10 = r0
            goto L94
        L72:
            r0 = move-exception
            r4 = r11
            r6 = r12
            r11 = r0
            r2 = r1
        L77:
            ewh r12 = r10.zzr()     // Catch: java.lang.Throwable -> L60
            jwh r12 = r12.f     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "Error querying user property. appId"
            swh r3 = defpackage.ewh.l(r4)     // Catch: java.lang.Throwable -> L60
            bwh r10 = r10.d()     // Catch: java.lang.Throwable -> L60
            java.lang.String r10 = r10.p(r6)     // Catch: java.lang.Throwable -> L60
            r12.d(r0, r3, r10, r11)     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L93
            r2.close()
        L93:
            return r1
        L94:
            if (r1 == 0) goto L99
            r1.close()
        L99:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgh.Q(java.lang.String, java.lang.String):bfi");
    }

    public final zzw R(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        fib.f(str);
        fib.f(str2);
        b();
        g();
        Cursor cursor = null;
        try {
            cursorQuery = m().query("conditional_properties", new String[]{"origin", "value", AppStateModule.APP_STATE_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    Object objQ = q(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    nei neiVarJ = j();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzao> creator = zzao.CREATOR;
                    str3 = str2;
                    try {
                        zzw zzwVar = new zzw(str, string, new zzkq(cursorQuery.getLong(8), objQ, str3, string), cursorQuery.getLong(6), z, string2, (zzao) neiVarJ.n(blob, creator), j, (zzao) j().n(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzao) j().n(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            zzr().f.c("Got multiple records for conditional property, expected one", ewh.l(str), d().p(str3));
                        }
                        cursorQuery.close();
                        return zzwVar;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str2;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        zzr().f.d("Error querying conditional property", ewh.l(str), d().p(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void S(String str, String str2) {
        fib.f(str);
        fib.f(str2);
        b();
        g();
        try {
            m().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzr().f.d("Error deleting conditional property", ewh.l(str), d().p(str2), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<defpackage.gnh>> T(java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            r11 = this;
            r11.g()
            r11.b()
            defpackage.fib.f(r12)
            defpackage.fib.f(r13)
            ht0 r1 = new ht0
            r1.<init>()
            android.database.sqlite.SQLiteDatabase r2 = r11.m()
            r10 = 0
            java.lang.String r3 = "event_filters"
            java.lang.String r0 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4}     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L93
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L93
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L93
            boolean r0 = r13.moveToFirst()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            if (r0 != 0) goto L40
            java.util.Map r11 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            r13.close()
            return r11
        L39:
            r0 = move-exception
            r11 = r0
            r10 = r13
            goto Lc1
        L3e:
            r0 = move-exception
            goto L95
        L40:
            r0 = 1
            byte[] r0 = r13.getBlob(r0)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            gnh$a r2 = defpackage.gnh.F()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e java.io.IOException -> L76
            dzh$a r0 = defpackage.nei.u(r2, r0)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e java.io.IOException -> L76
            gnh$a r0 = (gnh.a) r0     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e java.io.IOException -> L76
            dzh r0 = r0.m()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e java.io.IOException -> L76
            gnh r0 = (defpackage.gnh) r0     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e java.io.IOException -> L76
            r2 = 0
            int r2 = r13.getInt(r2)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            if (r3 != 0) goto L72
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
        L72:
            r3.add(r0)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            goto L86
        L76:
            r0 = move-exception
            ewh r2 = r11.zzr()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            jwh r2 = r2.f     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            java.lang.String r3 = "Failed to merge filter. appId"
            swh r4 = defpackage.ewh.l(r12)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            r2.c(r3, r4, r0)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
        L86:
            boolean r0 = r13.moveToNext()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            if (r0 != 0) goto L40
            r13.close()
            return r1
        L90:
            r0 = move-exception
            r11 = r0
            goto Lc1
        L93:
            r0 = move-exception
            r13 = r10
        L95:
            ewh r1 = r11.zzr()     // Catch: java.lang.Throwable -> L39
            jwh r1 = r1.f     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "Database error querying filters. appId"
            swh r3 = defpackage.ewh.l(r12)     // Catch: java.lang.Throwable -> L39
            r1.c(r2, r3, r0)     // Catch: java.lang.Throwable -> L39
            defpackage.gfi.a()     // Catch: java.lang.Throwable -> L39
            i0i r11 = r11.a     // Catch: java.lang.Throwable -> L39
            wmi r11 = r11.V     // Catch: java.lang.Throwable -> L39
            svh<java.lang.Boolean> r0 = defpackage.djh.R0     // Catch: java.lang.Throwable -> L39
            boolean r11 = r11.k(r12, r0)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto Lbb
            java.util.Map r11 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L39
            if (r13 == 0) goto Lba
            r13.close()
        Lba:
            return r11
        Lbb:
            if (r13 == 0) goto Lc0
            r13.close()
        Lc0:
            return r10
        Lc1:
            if (r10 == 0) goto Lc6
            r10.close()
        Lc6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgh.T(java.lang.String, java.lang.String):java.util.Map");
    }

    public final void U() {
        g();
        m().beginTransaction();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<defpackage.jnh>> V(java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            r11 = this;
            r11.g()
            r11.b()
            defpackage.fib.f(r12)
            defpackage.fib.f(r13)
            ht0 r1 = new ht0
            r1.<init>()
            android.database.sqlite.SQLiteDatabase r2 = r11.m()
            r10 = 0
            java.lang.String r3 = "property_filters"
            java.lang.String r0 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4}     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L93
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L93
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L93
            boolean r0 = r13.moveToFirst()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            if (r0 != 0) goto L40
            java.util.Map r11 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            r13.close()
            return r11
        L39:
            r0 = move-exception
            r11 = r0
            r10 = r13
            goto Lc1
        L3e:
            r0 = move-exception
            goto L95
        L40:
            r0 = 1
            byte[] r0 = r13.getBlob(r0)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            jnh$a r2 = defpackage.jnh.A()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e java.io.IOException -> L76
            dzh$a r0 = defpackage.nei.u(r2, r0)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e java.io.IOException -> L76
            jnh$a r0 = (jnh.a) r0     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e java.io.IOException -> L76
            dzh r0 = r0.m()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e java.io.IOException -> L76
            jnh r0 = (defpackage.jnh) r0     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e java.io.IOException -> L76
            r2 = 0
            int r2 = r13.getInt(r2)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            if (r3 != 0) goto L72
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
        L72:
            r3.add(r0)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            goto L86
        L76:
            r0 = move-exception
            ewh r2 = r11.zzr()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            jwh r2 = r2.f     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            java.lang.String r3 = "Failed to merge filter"
            swh r4 = defpackage.ewh.l(r12)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            r2.c(r3, r4, r0)     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
        L86:
            boolean r0 = r13.moveToNext()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3e
            if (r0 != 0) goto L40
            r13.close()
            return r1
        L90:
            r0 = move-exception
            r11 = r0
            goto Lc1
        L93:
            r0 = move-exception
            r13 = r10
        L95:
            ewh r1 = r11.zzr()     // Catch: java.lang.Throwable -> L39
            jwh r1 = r1.f     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "Database error querying filters. appId"
            swh r3 = defpackage.ewh.l(r12)     // Catch: java.lang.Throwable -> L39
            r1.c(r2, r3, r0)     // Catch: java.lang.Throwable -> L39
            defpackage.gfi.a()     // Catch: java.lang.Throwable -> L39
            i0i r11 = r11.a     // Catch: java.lang.Throwable -> L39
            wmi r11 = r11.V     // Catch: java.lang.Throwable -> L39
            svh<java.lang.Boolean> r0 = defpackage.djh.R0     // Catch: java.lang.Throwable -> L39
            boolean r11 = r11.k(r12, r0)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto Lbb
            java.util.Map r11 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L39
            if (r13 == 0) goto Lba
            r13.close()
        Lba:
            return r11
        Lbb:
            if (r13 == 0) goto Lc0
            r13.close()
        Lc0:
            return r10
        Lc1:
            if (r10 == 0) goto Lc6
            r10.close()
        Lc6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgh.V(java.lang.String, java.lang.String):java.util.Map");
    }

    @VisibleForTesting
    public final long W(String str) {
        long jO;
        fib.f(str);
        fib.f("first_open_count");
        b();
        g();
        SQLiteDatabase sQLiteDatabaseM = m();
        sQLiteDatabaseM.beginTransaction();
        long j = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder("first_open_count".length() + 32);
                sb.append("select first_open_count from app2 where app_id=?");
                jO = o(sb.toString(), new String[]{str}, -1L);
            } finally {
                sQLiteDatabaseM.endTransaction();
            }
        } catch (SQLiteException e) {
            e = e;
        }
        if (jO == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", (Integer) 0);
            contentValues.put("previous_install_count", (Integer) 0);
            if (sQLiteDatabaseM.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                zzr().f.c("Failed to insert column (got -1). appId", ewh.l(str), "first_open_count");
                return -1L;
            }
            jO = 0;
            zzr().f.d("Error inserting column. appId", ewh.l(str), "first_open_count", e);
            return j;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + jO));
            if (sQLiteDatabaseM.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                zzr().f.c("Failed to update column (got 0). appId", ewh.l(str), "first_open_count");
                return -1L;
            }
            sQLiteDatabaseM.setTransactionSuccessful();
            return jO;
        } catch (SQLiteException e2) {
            e = e2;
            j = jO;
        }
    }

    public final void X() {
        g();
        m().endTransaction();
    }

    public final long Y(String str) {
        fib.f(str);
        return o("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void Z() {
        b();
        g();
        i0i i0iVar = this.a;
        if (i0iVar.a.getDatabasePath("google_app_measurement.db").exists()) {
            long jA = f().W.a();
            i0iVar.c0.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > djh.y.a(null).longValue()) {
                f().W.b(jElapsedRealtime);
                b();
                g();
                if (i0iVar.a.getDatabasePath("google_app_measurement.db").exists()) {
                    SQLiteDatabase sQLiteDatabaseM = m();
                    i0iVar.c0.getClass();
                    int iDelete = sQLiteDatabaseM.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(djh.D.a(null).longValue())});
                    if (iDelete > 0) {
                        zzr().c0.a(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    @Override // defpackage.bei
    public final boolean i() {
        return false;
    }

    public final void l() {
        g();
        m().setTransactionSuccessful();
    }

    @VisibleForTesting
    public final SQLiteDatabase m() {
        b();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.zzr().X.a(e, "Error opening database");
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String n() throws java.lang.Throwable {
        /*
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.m()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1d
            if (r2 == 0) goto L1f
            r2 = 0
            java.lang.String r4 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1d
            r0.close()
            return r4
        L1a:
            r4 = move-exception
            r1 = r0
            goto L38
        L1d:
            r2 = move-exception
            goto L27
        L1f:
            r0.close()
            return r1
        L23:
            r4 = move-exception
            goto L38
        L25:
            r2 = move-exception
            r0 = r1
        L27:
            ewh r4 = r4.zzr()     // Catch: java.lang.Throwable -> L1a
            jwh r4 = r4.f     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "Database error getting next bundle app id"
            r4.a(r2, r3)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L37
            r0.close()
        L37:
            return r1
        L38:
            if (r1 == 0) goto L3d
            r1.close()
        L3d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgh.n():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long o(java.lang.String r3, java.lang.String[] r4, long r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.m()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            if (r4 == 0) goto L1c
            r4 = 0
            long r2 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            r1.close()
            return r2
        L18:
            r2 = move-exception
            goto L2c
        L1a:
            r4 = move-exception
            goto L20
        L1c:
            r1.close()
            return r5
        L20:
            ewh r2 = r2.zzr()     // Catch: java.lang.Throwable -> L18
            jwh r2 = r2.f     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = "Database error"
            r2.c(r5, r3, r4)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L2c:
            if (r1 == 0) goto L31
            r1.close()
        L31:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgh.o(java.lang.String, java.lang.String[], long):long");
    }

    public final long p(nph nphVar) {
        b();
        g();
        fib.f(nphVar.w1());
        byte[] bArrB = nphVar.b();
        long jM = j().m(bArrB);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", nphVar.w1());
        contentValues.put("metadata_fingerprint", Long.valueOf(jM));
        contentValues.put("metadata", bArrB);
        try {
            m().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jM;
        } catch (SQLiteException e) {
            zzr().f.c("Error storing raw event metadata. appId", ewh.l(nphVar.w1()), e);
            throw e;
        }
    }

    @VisibleForTesting
    public final Object q(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzr().f.b("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            zzr().f.a(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        zzr().f.b("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String r(long r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.b()
            r3.g()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.m()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 != 0) goto L33
            ewh r5 = r3.zzr()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            jwh r5 = r5.c0     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.b(r1)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r0
        L2e:
            r3 = move-exception
            r0 = r4
            goto L51
        L31:
            r5 = move-exception
            goto L40
        L33:
            r5 = 0
            java.lang.String r3 = r4.getString(r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r3
        L3c:
            r3 = move-exception
            goto L51
        L3e:
            r5 = move-exception
            r4 = r0
        L40:
            ewh r3 = r3.zzr()     // Catch: java.lang.Throwable -> L2e
            jwh r3 = r3.f     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "Error selecting expired configs"
            r3.a(r5, r1)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L50
            r4.close()
        L50:
            return r0
        L51:
            if (r0 == 0) goto L56
            r0.close()
        L56:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgh.r(long):java.lang.String");
    }

    public final List s(int i, int i2, String str) {
        byte[] bArrI;
        b();
        g();
        fib.b(i > 0);
        fib.b(i2 > 0);
        fib.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m().query("queue", new String[]{"rowid", "data", RumRequestFactory.RETRY_COUNT_KEY}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!cursorQuery.moveToFirst()) {
                    List list = Collections.EMPTY_LIST;
                    cursorQuery.close();
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                do {
                    long j = cursorQuery.getLong(0);
                    try {
                        bArrI = j().I(cursorQuery.getBlob(1));
                    } catch (IOException e) {
                        zzr().f.c("Failed to unzip queued bundle. appId", ewh.l(str), e);
                    }
                    if (!arrayList.isEmpty() && bArrI.length + length > i2) {
                        break;
                    }
                    try {
                        nph.a aVar = (nph.a) nei.u(nph.p0(), bArrI);
                        if (!cursorQuery.isNull(2)) {
                            int i3 = cursorQuery.getInt(2);
                            if (aVar.c) {
                                aVar.k();
                                aVar.c = false;
                            }
                            nph.Q0((nph) aVar.b, i3);
                        }
                        length += bArrI.length;
                        arrayList.add(Pair.create((nph) aVar.m(), Long.valueOf(j)));
                    } catch (IOException e2) {
                        zzr().f.c("Failed to merge queued bundle. appId", ewh.l(str), e2);
                    }
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                } while (length <= i2);
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e3) {
                zzr().f.c("Error querying bundles. appId", ewh.l(str), e3);
                List list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    cursor.close();
                }
                return list2;
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<defpackage.bfi> t(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            defpackage.fib.f(r12)
            r11.b()
            r11.g()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r11.m()     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteException -> L8a
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L50
            if (r3 != 0) goto L3b
            r2.close()
            return r0
        L3b:
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L50
            r3 = 1
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L50
            if (r3 != 0) goto L49
            java.lang.String r3 = ""
        L49:
            r6 = r3
            goto L53
        L4b:
            r0 = move-exception
            r11 = r0
            r1 = r2
            goto Lb9
        L50:
            r0 = move-exception
            r5 = r12
            goto L8d
        L53:
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L50
            r3 = 3
            java.lang.Object r10 = r11.q(r2, r3)     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L50
            if (r10 != 0) goto L70
            ewh r3 = r11.zzr()     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L50
            jwh r3 = r3.f     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L50
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            swh r5 = defpackage.ewh.l(r12)     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L50
            r3.a(r5, r4)     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L50
            r5 = r12
            goto L79
        L70:
            bfi r4 = new bfi     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L50
            r5 = r12
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L85
            r0.add(r4)     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L85
        L79:
            boolean r12 = r2.moveToNext()     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L85
            if (r12 != 0) goto L83
            r2.close()
            return r0
        L83:
            r12 = r5
            goto L3b
        L85:
            r0 = move-exception
            goto L8d
        L87:
            r0 = move-exception
            r11 = r0
            goto Lb9
        L8a:
            r0 = move-exception
            r5 = r12
            r2 = r1
        L8d:
            ewh r12 = r11.zzr()     // Catch: java.lang.Throwable -> L4b
            jwh r12 = r12.f     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = "Error querying user properties. appId"
            swh r4 = defpackage.ewh.l(r5)     // Catch: java.lang.Throwable -> L4b
            r12.c(r3, r4, r0)     // Catch: java.lang.Throwable -> L4b
            defpackage.gfi.a()     // Catch: java.lang.Throwable -> L4b
            i0i r11 = r11.a     // Catch: java.lang.Throwable -> L4b
            wmi r11 = r11.V     // Catch: java.lang.Throwable -> L4b
            svh<java.lang.Boolean> r12 = defpackage.djh.R0     // Catch: java.lang.Throwable -> L4b
            boolean r11 = r11.k(r5, r12)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto Lb3
            java.util.List r11 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto Lb2
            r2.close()
        Lb2:
            return r11
        Lb3:
            if (r2 == 0) goto Lb8
            r2.close()
        Lb8:
            return r1
        Lb9:
            if (r1 == 0) goto Lbe
            r1.close()
        Lbe:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgh.t(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        zzr().f.a(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<defpackage.bfi> u(java.lang.String r21, java.lang.String r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgh.u(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        zzr().f.a(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzw> v(java.lang.String r21, java.lang.String[] r22) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgh.v(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final qgh w(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        fib.f(str);
        b();
        g();
        String[] strArr = {str};
        qgh qghVar = new qgh();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM = m();
                Cursor cursorQuery = sQLiteDatabaseM.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    zzr().X.a(ewh.l(str), "Not updating daily counts, app is not known. appId");
                    cursorQuery.close();
                    return qghVar;
                }
                if (cursorQuery.getLong(0) == j) {
                    qghVar.b = cursorQuery.getLong(1);
                    qghVar.a = cursorQuery.getLong(2);
                    qghVar.c = cursorQuery.getLong(3);
                    qghVar.d = cursorQuery.getLong(4);
                    qghVar.e = cursorQuery.getLong(5);
                }
                if (z) {
                    qghVar.b += j2;
                }
                if (z2) {
                    qghVar.a += j2;
                }
                if (z3) {
                    qghVar.c += j2;
                }
                if (z4) {
                    qghVar.d += j2;
                }
                if (z5) {
                    qghVar.e += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(qghVar.a));
                contentValues.put("daily_events_count", Long.valueOf(qghVar.b));
                contentValues.put("daily_conversions_count", Long.valueOf(qghVar.c));
                contentValues.put("daily_error_events_count", Long.valueOf(qghVar.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(qghVar.e));
                sQLiteDatabaseM.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return qghVar;
            } catch (SQLiteException e) {
                zzr().f.c("Error updating daily counts. appId", ewh.l(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return qghVar;
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.kih x(java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgh.x(java.lang.String, java.lang.String):kih");
    }

    public final void z(String str, Long l, long j, jph jphVar) {
        b();
        g();
        fib.i(jphVar);
        fib.f(str);
        fib.i(l);
        byte[] bArrB = jphVar.b();
        zzr().c0.c("Saving complex main event, appId, data size", d().l(str), Integer.valueOf(bArrB.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrB);
        try {
            if (m().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzr().f.a(ewh.l(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            zzr().f.c("Error storing complex main event. appId", ewh.l(str), e);
        }
    }
}
