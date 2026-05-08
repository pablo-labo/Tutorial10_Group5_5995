package defpackage;

import android.database.Cursor;
import androidx.work.b;
import androidx.work.impl.WorkDatabase_Impl;
import defpackage.mfd;
import defpackage.r3h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class y3h implements s3h {
    public final WorkDatabase_Impl a;
    public final oda b;
    public final z9c c;
    public final aac d;
    public final d3h e;
    public final tda f;
    public final uda g;
    public final vda h;
    public final x3h i;
    public final t3h j;
    public final u3h k;

    public y3h(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new oda(workDatabase_Impl, 1);
        new y9c(workDatabase_Impl, 1);
        this.c = new z9c(workDatabase_Impl, 1);
        this.d = new aac(workDatabase_Impl, 1);
        this.e = new d3h(workDatabase_Impl, 1);
        this.f = new tda(workDatabase_Impl, 2);
        this.g = new uda(workDatabase_Impl, 1);
        this.h = new vda(workDatabase_Impl, 1);
        this.i = new x3h(workDatabase_Impl);
        this.j = new t3h(workDatabase_Impl);
        this.k = new u3h(workDatabase_Impl);
        new v3h(workDatabase_Impl);
        new w3h(workDatabase_Impl);
    }

    @Override // defpackage.s3h
    public final void a(String str) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        z9c z9cVar = this.c;
        zze zzeVarC = z9cVar.c();
        if (str == null) {
            zzeVarC.u(1);
        } else {
            zzeVarC.n(1, str);
        }
        workDatabase_Impl.c();
        try {
            zzeVarC.J();
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.s();
            z9cVar.g(zzeVarC);
        }
    }

    @Override // defpackage.s3h
    public final void b(String str) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        d3h d3hVar = this.e;
        zze zzeVarC = d3hVar.c();
        if (str == null) {
            zzeVarC.u(1);
        } else {
            zzeVarC.n(1, str);
        }
        workDatabase_Impl.c();
        try {
            zzeVarC.J();
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.s();
            d3hVar.g(zzeVarC);
        }
    }

    @Override // defpackage.s3h
    public final int c(long j, String str) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        t3h t3hVar = this.j;
        zze zzeVarC = t3hVar.c();
        zzeVarC.q(1, j);
        if (str == null) {
            zzeVarC.u(2);
        } else {
            zzeVarC.n(2, str);
        }
        workDatabase_Impl.c();
        try {
            int iJ = zzeVarC.J();
            workDatabase_Impl.w();
            return iJ;
        } finally {
            workDatabase_Impl.s();
            t3hVar.g(zzeVarC);
        }
    }

    @Override // defpackage.s3h
    public final ArrayList d(long j) throws Throwable {
        mfd mfdVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        mfdVarA.q(1, j);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            iB = r93.b(cursorI, "id");
            iB2 = r93.b(cursorI, "state");
            iB3 = r93.b(cursorI, "worker_class_name");
            iB4 = r93.b(cursorI, "input_merger_class_name");
            iB5 = r93.b(cursorI, "input");
            iB6 = r93.b(cursorI, "output");
            iB7 = r93.b(cursorI, "initial_delay");
            iB8 = r93.b(cursorI, "interval_duration");
            iB9 = r93.b(cursorI, "flex_duration");
            iB10 = r93.b(cursorI, "run_attempt_count");
            iB11 = r93.b(cursorI, "backoff_policy");
            iB12 = r93.b(cursorI, "backoff_delay_duration");
            iB13 = r93.b(cursorI, "last_enqueue_time");
            iB14 = r93.b(cursorI, "minimum_retention_duration");
            mfdVar = mfdVarA;
        } catch (Throwable th) {
            th = th;
            mfdVar = mfdVarA;
        }
        try {
            int iB15 = r93.b(cursorI, "schedule_requested_at");
            int iB16 = r93.b(cursorI, "run_in_foreground");
            int iB17 = r93.b(cursorI, "out_of_quota_policy");
            int iB18 = r93.b(cursorI, "period_count");
            int iB19 = r93.b(cursorI, "generation");
            int iB20 = r93.b(cursorI, "required_network_type");
            int iB21 = r93.b(cursorI, "requires_charging");
            int iB22 = r93.b(cursorI, "requires_device_idle");
            int iB23 = r93.b(cursorI, "requires_battery_not_low");
            int iB24 = r93.b(cursorI, "requires_storage_not_low");
            int iB25 = r93.b(cursorI, "trigger_content_update_delay");
            int iB26 = r93.b(cursorI, "trigger_max_content_delay");
            int iB27 = r93.b(cursorI, "content_uri_triggers");
            int i = iB14;
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                byte[] blob = null;
                String string = cursorI.isNull(iB) ? null : cursorI.getString(iB);
                s2h s2hVarD = pyd.D(cursorI.getInt(iB2));
                String string2 = cursorI.isNull(iB3) ? null : cursorI.getString(iB3);
                String string3 = cursorI.isNull(iB4) ? null : cursorI.getString(iB4);
                b bVarA = b.a(cursorI.isNull(iB5) ? null : cursorI.getBlob(iB5));
                b bVarA2 = b.a(cursorI.isNull(iB6) ? null : cursorI.getBlob(iB6));
                long j2 = cursorI.getLong(iB7);
                long j3 = cursorI.getLong(iB8);
                long j4 = cursorI.getLong(iB9);
                int i2 = cursorI.getInt(iB10);
                b81 b81VarA = pyd.A(cursorI.getInt(iB11));
                long j5 = cursorI.getLong(iB12);
                long j6 = cursorI.getLong(iB13);
                int i3 = i;
                long j7 = cursorI.getLong(i3);
                int i4 = iB13;
                int i5 = iB15;
                long j8 = cursorI.getLong(i5);
                iB15 = i5;
                int i6 = iB16;
                boolean z = cursorI.getInt(i6) != 0;
                iB16 = i6;
                int i7 = iB17;
                iwa iwaVarC = pyd.C(cursorI.getInt(i7));
                iB17 = i7;
                int i8 = iB18;
                int i9 = cursorI.getInt(i8);
                iB18 = i8;
                int i10 = iB19;
                int i11 = cursorI.getInt(i10);
                iB19 = i10;
                int i12 = iB20;
                dha dhaVarB = pyd.B(cursorI.getInt(i12));
                iB20 = i12;
                int i13 = iB21;
                boolean z2 = cursorI.getInt(i13) != 0;
                iB21 = i13;
                int i14 = iB22;
                boolean z3 = cursorI.getInt(i14) != 0;
                iB22 = i14;
                int i15 = iB23;
                boolean z4 = cursorI.getInt(i15) != 0;
                iB23 = i15;
                int i16 = iB24;
                boolean z5 = cursorI.getInt(i16) != 0;
                iB24 = i16;
                int i17 = iB25;
                long j9 = cursorI.getLong(i17);
                iB25 = i17;
                int i18 = iB26;
                long j10 = cursorI.getLong(i18);
                iB26 = i18;
                int i19 = iB27;
                if (!cursorI.isNull(i19)) {
                    blob = cursorI.getBlob(i19);
                }
                iB27 = i19;
                arrayList.add(new r3h(string, s2hVarD, string2, string3, bVarA, bVarA2, j2, j3, j4, new jq2(dhaVarB, z2, z3, z4, z5, j9, j10, pyd.c(blob)), i2, b81VarA, j5, j6, j7, j8, z, iwaVarC, i9, i11));
                iB13 = i4;
                i = i3;
            }
            cursorI.close();
            mfdVar.s();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorI.close();
            mfdVar.s();
            throw th;
        }
    }

    @Override // defpackage.s3h
    public final int e(s2h s2hVar, String str) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        aac aacVar = this.d;
        zze zzeVarC = aacVar.c();
        zzeVarC.q(1, pyd.V(s2hVar));
        if (str == null) {
            zzeVarC.u(2);
        } else {
            zzeVarC.n(2, str);
        }
        workDatabase_Impl.c();
        try {
            int iJ = zzeVarC.J();
            workDatabase_Impl.w();
            return iJ;
        } finally {
            workDatabase_Impl.s();
            aacVar.g(zzeVarC);
        }
    }

    @Override // defpackage.s3h
    public final ArrayList f() throws Throwable {
        mfd mfdVar;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            int iB = r93.b(cursorI, "id");
            int iB2 = r93.b(cursorI, "state");
            int iB3 = r93.b(cursorI, "worker_class_name");
            int iB4 = r93.b(cursorI, "input_merger_class_name");
            int iB5 = r93.b(cursorI, "input");
            int iB6 = r93.b(cursorI, "output");
            int iB7 = r93.b(cursorI, "initial_delay");
            int iB8 = r93.b(cursorI, "interval_duration");
            int iB9 = r93.b(cursorI, "flex_duration");
            int iB10 = r93.b(cursorI, "run_attempt_count");
            int iB11 = r93.b(cursorI, "backoff_policy");
            int iB12 = r93.b(cursorI, "backoff_delay_duration");
            int iB13 = r93.b(cursorI, "last_enqueue_time");
            int iB14 = r93.b(cursorI, "minimum_retention_duration");
            mfdVar = mfdVarA;
            try {
                int iB15 = r93.b(cursorI, "schedule_requested_at");
                int iB16 = r93.b(cursorI, "run_in_foreground");
                int iB17 = r93.b(cursorI, "out_of_quota_policy");
                int iB18 = r93.b(cursorI, "period_count");
                int iB19 = r93.b(cursorI, "generation");
                int iB20 = r93.b(cursorI, "required_network_type");
                int iB21 = r93.b(cursorI, "requires_charging");
                int iB22 = r93.b(cursorI, "requires_device_idle");
                int iB23 = r93.b(cursorI, "requires_battery_not_low");
                int iB24 = r93.b(cursorI, "requires_storage_not_low");
                int iB25 = r93.b(cursorI, "trigger_content_update_delay");
                int iB26 = r93.b(cursorI, "trigger_max_content_delay");
                int iB27 = r93.b(cursorI, "content_uri_triggers");
                int i = iB14;
                ArrayList arrayList = new ArrayList(cursorI.getCount());
                while (cursorI.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorI.isNull(iB) ? null : cursorI.getString(iB);
                    s2h s2hVarD = pyd.D(cursorI.getInt(iB2));
                    String string2 = cursorI.isNull(iB3) ? null : cursorI.getString(iB3);
                    String string3 = cursorI.isNull(iB4) ? null : cursorI.getString(iB4);
                    b bVarA = b.a(cursorI.isNull(iB5) ? null : cursorI.getBlob(iB5));
                    b bVarA2 = b.a(cursorI.isNull(iB6) ? null : cursorI.getBlob(iB6));
                    long j = cursorI.getLong(iB7);
                    long j2 = cursorI.getLong(iB8);
                    long j3 = cursorI.getLong(iB9);
                    int i2 = cursorI.getInt(iB10);
                    b81 b81VarA = pyd.A(cursorI.getInt(iB11));
                    long j4 = cursorI.getLong(iB12);
                    long j5 = cursorI.getLong(iB13);
                    int i3 = i;
                    long j6 = cursorI.getLong(i3);
                    i = i3;
                    int i4 = iB15;
                    long j7 = cursorI.getLong(i4);
                    iB15 = i4;
                    int i5 = iB16;
                    boolean z = cursorI.getInt(i5) != 0;
                    iB16 = i5;
                    int i6 = iB17;
                    iwa iwaVarC = pyd.C(cursorI.getInt(i6));
                    iB17 = i6;
                    int i7 = iB18;
                    int i8 = cursorI.getInt(i7);
                    iB18 = i7;
                    int i9 = iB19;
                    int i10 = cursorI.getInt(i9);
                    iB19 = i9;
                    int i11 = iB20;
                    dha dhaVarB = pyd.B(cursorI.getInt(i11));
                    iB20 = i11;
                    int i12 = iB21;
                    boolean z2 = cursorI.getInt(i12) != 0;
                    iB21 = i12;
                    int i13 = iB22;
                    boolean z3 = cursorI.getInt(i13) != 0;
                    iB22 = i13;
                    int i14 = iB23;
                    boolean z4 = cursorI.getInt(i14) != 0;
                    iB23 = i14;
                    int i15 = iB24;
                    boolean z5 = cursorI.getInt(i15) != 0;
                    iB24 = i15;
                    int i16 = iB25;
                    long j8 = cursorI.getLong(i16);
                    iB25 = i16;
                    int i17 = iB26;
                    long j9 = cursorI.getLong(i17);
                    iB26 = i17;
                    int i18 = iB27;
                    if (!cursorI.isNull(i18)) {
                        blob = cursorI.getBlob(i18);
                    }
                    iB27 = i18;
                    arrayList.add(new r3h(string, s2hVarD, string2, string3, bVarA, bVarA2, j, j2, j3, new jq2(dhaVarB, z2, z3, z4, z5, j8, j9, pyd.c(blob)), i2, b81VarA, j4, j5, j6, j7, z, iwaVarC, i8, i10));
                }
                cursorI.close();
                mfdVar.s();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorI.close();
                mfdVar.s();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mfdVar = mfdVarA;
        }
    }

    @Override // defpackage.s3h
    public final ArrayList g(String str) throws IOException {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            mfdVarA.u(1);
        } else {
            mfdVarA.n(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                arrayList.add(cursorI.isNull(0) ? null : cursorI.getString(0));
            }
            return arrayList;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.s3h
    public final s2h h(String str) throws IOException {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            mfdVarA.u(1);
        } else {
            mfdVarA.n(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            s2h s2hVarD = null;
            if (cursorI.moveToFirst()) {
                Integer numValueOf = cursorI.isNull(0) ? null : Integer.valueOf(cursorI.getInt(0));
                if (numValueOf != null) {
                    s2hVarD = pyd.D(numValueOf.intValue());
                }
            }
            return s2hVarD;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.s3h
    public final r3h i(String str) throws Throwable {
        mfd mfdVar;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            mfdVarA.u(1);
        } else {
            mfdVarA.n(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            int iB = r93.b(cursorI, "id");
            int iB2 = r93.b(cursorI, "state");
            int iB3 = r93.b(cursorI, "worker_class_name");
            int iB4 = r93.b(cursorI, "input_merger_class_name");
            int iB5 = r93.b(cursorI, "input");
            int iB6 = r93.b(cursorI, "output");
            int iB7 = r93.b(cursorI, "initial_delay");
            int iB8 = r93.b(cursorI, "interval_duration");
            int iB9 = r93.b(cursorI, "flex_duration");
            int iB10 = r93.b(cursorI, "run_attempt_count");
            int iB11 = r93.b(cursorI, "backoff_policy");
            int iB12 = r93.b(cursorI, "backoff_delay_duration");
            int iB13 = r93.b(cursorI, "last_enqueue_time");
            int iB14 = r93.b(cursorI, "minimum_retention_duration");
            mfdVar = mfdVarA;
            try {
                int iB15 = r93.b(cursorI, "schedule_requested_at");
                int iB16 = r93.b(cursorI, "run_in_foreground");
                int iB17 = r93.b(cursorI, "out_of_quota_policy");
                int iB18 = r93.b(cursorI, "period_count");
                int iB19 = r93.b(cursorI, "generation");
                int iB20 = r93.b(cursorI, "required_network_type");
                int iB21 = r93.b(cursorI, "requires_charging");
                int iB22 = r93.b(cursorI, "requires_device_idle");
                int iB23 = r93.b(cursorI, "requires_battery_not_low");
                int iB24 = r93.b(cursorI, "requires_storage_not_low");
                int iB25 = r93.b(cursorI, "trigger_content_update_delay");
                int iB26 = r93.b(cursorI, "trigger_max_content_delay");
                int iB27 = r93.b(cursorI, "content_uri_triggers");
                r3h r3hVar = null;
                byte[] blob = null;
                if (cursorI.moveToFirst()) {
                    String string = cursorI.isNull(iB) ? null : cursorI.getString(iB);
                    s2h s2hVarD = pyd.D(cursorI.getInt(iB2));
                    String string2 = cursorI.isNull(iB3) ? null : cursorI.getString(iB3);
                    String string3 = cursorI.isNull(iB4) ? null : cursorI.getString(iB4);
                    b bVarA = b.a(cursorI.isNull(iB5) ? null : cursorI.getBlob(iB5));
                    b bVarA2 = b.a(cursorI.isNull(iB6) ? null : cursorI.getBlob(iB6));
                    long j = cursorI.getLong(iB7);
                    long j2 = cursorI.getLong(iB8);
                    long j3 = cursorI.getLong(iB9);
                    int i = cursorI.getInt(iB10);
                    b81 b81VarA = pyd.A(cursorI.getInt(iB11));
                    long j4 = cursorI.getLong(iB12);
                    long j5 = cursorI.getLong(iB13);
                    long j6 = cursorI.getLong(iB14);
                    long j7 = cursorI.getLong(iB15);
                    boolean z = cursorI.getInt(iB16) != 0;
                    iwa iwaVarC = pyd.C(cursorI.getInt(iB17));
                    int i2 = cursorI.getInt(iB18);
                    int i3 = cursorI.getInt(iB19);
                    dha dhaVarB = pyd.B(cursorI.getInt(iB20));
                    boolean z2 = cursorI.getInt(iB21) != 0;
                    boolean z3 = cursorI.getInt(iB22) != 0;
                    boolean z4 = cursorI.getInt(iB23) != 0;
                    boolean z5 = cursorI.getInt(iB24) != 0;
                    long j8 = cursorI.getLong(iB25);
                    long j9 = cursorI.getLong(iB26);
                    if (!cursorI.isNull(iB27)) {
                        blob = cursorI.getBlob(iB27);
                    }
                    r3hVar = new r3h(string, s2hVarD, string2, string3, bVarA, bVarA2, j, j2, j3, new jq2(dhaVarB, z2, z3, z4, z5, j8, j9, pyd.c(blob)), i, b81VarA, j4, j5, j6, j7, z, iwaVarC, i2, i3);
                }
                cursorI.close();
                mfdVar.s();
                return r3hVar;
            } catch (Throwable th) {
                th = th;
                cursorI.close();
                mfdVar.s();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mfdVar = mfdVarA;
        }
    }

    @Override // defpackage.s3h
    public final void j(r3h r3hVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.j(r3hVar);
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.s();
        }
    }

    @Override // defpackage.s3h
    public final ArrayList k(String str) throws IOException {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        mfdVarA.n(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                arrayList.add(cursorI.isNull(0) ? null : cursorI.getString(0));
            }
            return arrayList;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.s3h
    public final ArrayList l(String str) throws IOException {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        if (str == null) {
            mfdVarA.u(1);
        } else {
            mfdVarA.n(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                arrayList.add(b.a(cursorI.isNull(0) ? null : cursorI.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.s3h
    public final int m() throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        u3h u3hVar = this.k;
        zze zzeVarC = u3hVar.c();
        workDatabase_Impl.c();
        try {
            int iJ = zzeVarC.J();
            workDatabase_Impl.w();
            return iJ;
        } finally {
            workDatabase_Impl.s();
            u3hVar.g(zzeVarC);
        }
    }

    @Override // defpackage.s3h
    public final ArrayList n() throws Throwable {
        mfd mfdVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        mfdVarA.q(1, 200L);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            iB = r93.b(cursorI, "id");
            iB2 = r93.b(cursorI, "state");
            iB3 = r93.b(cursorI, "worker_class_name");
            iB4 = r93.b(cursorI, "input_merger_class_name");
            iB5 = r93.b(cursorI, "input");
            iB6 = r93.b(cursorI, "output");
            iB7 = r93.b(cursorI, "initial_delay");
            iB8 = r93.b(cursorI, "interval_duration");
            iB9 = r93.b(cursorI, "flex_duration");
            iB10 = r93.b(cursorI, "run_attempt_count");
            iB11 = r93.b(cursorI, "backoff_policy");
            iB12 = r93.b(cursorI, "backoff_delay_duration");
            iB13 = r93.b(cursorI, "last_enqueue_time");
            iB14 = r93.b(cursorI, "minimum_retention_duration");
            mfdVar = mfdVarA;
        } catch (Throwable th) {
            th = th;
            mfdVar = mfdVarA;
        }
        try {
            int iB15 = r93.b(cursorI, "schedule_requested_at");
            int iB16 = r93.b(cursorI, "run_in_foreground");
            int iB17 = r93.b(cursorI, "out_of_quota_policy");
            int iB18 = r93.b(cursorI, "period_count");
            int iB19 = r93.b(cursorI, "generation");
            int iB20 = r93.b(cursorI, "required_network_type");
            int iB21 = r93.b(cursorI, "requires_charging");
            int iB22 = r93.b(cursorI, "requires_device_idle");
            int iB23 = r93.b(cursorI, "requires_battery_not_low");
            int iB24 = r93.b(cursorI, "requires_storage_not_low");
            int iB25 = r93.b(cursorI, "trigger_content_update_delay");
            int iB26 = r93.b(cursorI, "trigger_max_content_delay");
            int iB27 = r93.b(cursorI, "content_uri_triggers");
            int i = iB14;
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                byte[] blob = null;
                String string = cursorI.isNull(iB) ? null : cursorI.getString(iB);
                s2h s2hVarD = pyd.D(cursorI.getInt(iB2));
                String string2 = cursorI.isNull(iB3) ? null : cursorI.getString(iB3);
                String string3 = cursorI.isNull(iB4) ? null : cursorI.getString(iB4);
                b bVarA = b.a(cursorI.isNull(iB5) ? null : cursorI.getBlob(iB5));
                b bVarA2 = b.a(cursorI.isNull(iB6) ? null : cursorI.getBlob(iB6));
                long j = cursorI.getLong(iB7);
                long j2 = cursorI.getLong(iB8);
                long j3 = cursorI.getLong(iB9);
                int i2 = cursorI.getInt(iB10);
                b81 b81VarA = pyd.A(cursorI.getInt(iB11));
                long j4 = cursorI.getLong(iB12);
                long j5 = cursorI.getLong(iB13);
                int i3 = i;
                long j6 = cursorI.getLong(i3);
                int i4 = iB13;
                int i5 = iB15;
                long j7 = cursorI.getLong(i5);
                iB15 = i5;
                int i6 = iB16;
                boolean z = cursorI.getInt(i6) != 0;
                iB16 = i6;
                int i7 = iB17;
                iwa iwaVarC = pyd.C(cursorI.getInt(i7));
                iB17 = i7;
                int i8 = iB18;
                int i9 = cursorI.getInt(i8);
                iB18 = i8;
                int i10 = iB19;
                int i11 = cursorI.getInt(i10);
                iB19 = i10;
                int i12 = iB20;
                dha dhaVarB = pyd.B(cursorI.getInt(i12));
                iB20 = i12;
                int i13 = iB21;
                boolean z2 = cursorI.getInt(i13) != 0;
                iB21 = i13;
                int i14 = iB22;
                boolean z3 = cursorI.getInt(i14) != 0;
                iB22 = i14;
                int i15 = iB23;
                boolean z4 = cursorI.getInt(i15) != 0;
                iB23 = i15;
                int i16 = iB24;
                boolean z5 = cursorI.getInt(i16) != 0;
                iB24 = i16;
                int i17 = iB25;
                long j8 = cursorI.getLong(i17);
                iB25 = i17;
                int i18 = iB26;
                long j9 = cursorI.getLong(i18);
                iB26 = i18;
                int i19 = iB27;
                if (!cursorI.isNull(i19)) {
                    blob = cursorI.getBlob(i19);
                }
                iB27 = i19;
                arrayList.add(new r3h(string, s2hVarD, string2, string3, bVarA, bVarA2, j, j2, j3, new jq2(dhaVarB, z2, z3, z4, z5, j8, j9, pyd.c(blob)), i2, b81VarA, j4, j5, j6, j7, z, iwaVarC, i9, i11));
                iB13 = i4;
                i = i3;
            }
            cursorI.close();
            mfdVar.s();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorI.close();
            mfdVar.s();
            throw th;
        }
    }

    @Override // defpackage.s3h
    public final ArrayList o(String str) throws IOException {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            mfdVarA.u(1);
        } else {
            mfdVarA.n(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                String string = cursorI.isNull(0) ? null : cursorI.getString(0);
                s2h s2hVarD = pyd.D(cursorI.getInt(1));
                string.getClass();
                r3h.a aVar = new r3h.a();
                aVar.a = string;
                aVar.b = s2hVarD;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.s3h
    public final ArrayList p(int i) throws Throwable {
        mfd mfdVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        mfdVarA.q(1, i);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            iB = r93.b(cursorI, "id");
            iB2 = r93.b(cursorI, "state");
            iB3 = r93.b(cursorI, "worker_class_name");
            iB4 = r93.b(cursorI, "input_merger_class_name");
            iB5 = r93.b(cursorI, "input");
            iB6 = r93.b(cursorI, "output");
            iB7 = r93.b(cursorI, "initial_delay");
            iB8 = r93.b(cursorI, "interval_duration");
            iB9 = r93.b(cursorI, "flex_duration");
            iB10 = r93.b(cursorI, "run_attempt_count");
            iB11 = r93.b(cursorI, "backoff_policy");
            iB12 = r93.b(cursorI, "backoff_delay_duration");
            iB13 = r93.b(cursorI, "last_enqueue_time");
            iB14 = r93.b(cursorI, "minimum_retention_duration");
            mfdVar = mfdVarA;
        } catch (Throwable th) {
            th = th;
            mfdVar = mfdVarA;
        }
        try {
            int iB15 = r93.b(cursorI, "schedule_requested_at");
            int iB16 = r93.b(cursorI, "run_in_foreground");
            int iB17 = r93.b(cursorI, "out_of_quota_policy");
            int iB18 = r93.b(cursorI, "period_count");
            int iB19 = r93.b(cursorI, "generation");
            int iB20 = r93.b(cursorI, "required_network_type");
            int iB21 = r93.b(cursorI, "requires_charging");
            int iB22 = r93.b(cursorI, "requires_device_idle");
            int iB23 = r93.b(cursorI, "requires_battery_not_low");
            int iB24 = r93.b(cursorI, "requires_storage_not_low");
            int iB25 = r93.b(cursorI, "trigger_content_update_delay");
            int iB26 = r93.b(cursorI, "trigger_max_content_delay");
            int iB27 = r93.b(cursorI, "content_uri_triggers");
            int i2 = iB14;
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                byte[] blob = null;
                String string = cursorI.isNull(iB) ? null : cursorI.getString(iB);
                s2h s2hVarD = pyd.D(cursorI.getInt(iB2));
                String string2 = cursorI.isNull(iB3) ? null : cursorI.getString(iB3);
                String string3 = cursorI.isNull(iB4) ? null : cursorI.getString(iB4);
                b bVarA = b.a(cursorI.isNull(iB5) ? null : cursorI.getBlob(iB5));
                b bVarA2 = b.a(cursorI.isNull(iB6) ? null : cursorI.getBlob(iB6));
                long j = cursorI.getLong(iB7);
                long j2 = cursorI.getLong(iB8);
                long j3 = cursorI.getLong(iB9);
                int i3 = cursorI.getInt(iB10);
                b81 b81VarA = pyd.A(cursorI.getInt(iB11));
                long j4 = cursorI.getLong(iB12);
                long j5 = cursorI.getLong(iB13);
                int i4 = i2;
                long j6 = cursorI.getLong(i4);
                int i5 = iB13;
                int i6 = iB15;
                long j7 = cursorI.getLong(i6);
                iB15 = i6;
                int i7 = iB16;
                boolean z = cursorI.getInt(i7) != 0;
                iB16 = i7;
                int i8 = iB17;
                iwa iwaVarC = pyd.C(cursorI.getInt(i8));
                iB17 = i8;
                int i9 = iB18;
                int i10 = cursorI.getInt(i9);
                iB18 = i9;
                int i11 = iB19;
                int i12 = cursorI.getInt(i11);
                iB19 = i11;
                int i13 = iB20;
                dha dhaVarB = pyd.B(cursorI.getInt(i13));
                iB20 = i13;
                int i14 = iB21;
                boolean z2 = cursorI.getInt(i14) != 0;
                iB21 = i14;
                int i15 = iB22;
                boolean z3 = cursorI.getInt(i15) != 0;
                iB22 = i15;
                int i16 = iB23;
                boolean z4 = cursorI.getInt(i16) != 0;
                iB23 = i16;
                int i17 = iB24;
                boolean z5 = cursorI.getInt(i17) != 0;
                iB24 = i17;
                int i18 = iB25;
                long j8 = cursorI.getLong(i18);
                iB25 = i18;
                int i19 = iB26;
                long j9 = cursorI.getLong(i19);
                iB26 = i19;
                int i20 = iB27;
                if (!cursorI.isNull(i20)) {
                    blob = cursorI.getBlob(i20);
                }
                iB27 = i20;
                arrayList.add(new r3h(string, s2hVarD, string2, string3, bVarA, bVarA2, j, j2, j3, new jq2(dhaVarB, z2, z3, z4, z5, j8, j9, pyd.c(blob)), i3, b81VarA, j4, j5, j6, j7, z, iwaVarC, i10, i12));
                iB13 = i5;
                i2 = i4;
            }
            cursorI.close();
            mfdVar.s();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorI.close();
            mfdVar.s();
            throw th;
        }
    }

    @Override // defpackage.s3h
    public final void q(String str, b bVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        tda tdaVar = this.f;
        zze zzeVarC = tdaVar.c();
        byte[] bArrB = b.b(bVar);
        if (bArrB == null) {
            zzeVarC.u(1);
        } else {
            zzeVarC.r(1, bArrB);
        }
        if (str == null) {
            zzeVarC.u(2);
        } else {
            zzeVarC.n(2, str);
        }
        workDatabase_Impl.c();
        try {
            zzeVarC.J();
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.s();
            tdaVar.g(zzeVarC);
        }
    }

    @Override // defpackage.s3h
    public final void r(long j, String str) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        uda udaVar = this.g;
        zze zzeVarC = udaVar.c();
        zzeVarC.q(1, j);
        if (str == null) {
            zzeVarC.u(2);
        } else {
            zzeVarC.n(2, str);
        }
        workDatabase_Impl.c();
        try {
            zzeVarC.J();
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.s();
            udaVar.g(zzeVarC);
        }
    }

    @Override // defpackage.s3h
    public final ArrayList s() throws Throwable {
        mfd mfdVar;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            int iB = r93.b(cursorI, "id");
            int iB2 = r93.b(cursorI, "state");
            int iB3 = r93.b(cursorI, "worker_class_name");
            int iB4 = r93.b(cursorI, "input_merger_class_name");
            int iB5 = r93.b(cursorI, "input");
            int iB6 = r93.b(cursorI, "output");
            int iB7 = r93.b(cursorI, "initial_delay");
            int iB8 = r93.b(cursorI, "interval_duration");
            int iB9 = r93.b(cursorI, "flex_duration");
            int iB10 = r93.b(cursorI, "run_attempt_count");
            int iB11 = r93.b(cursorI, "backoff_policy");
            int iB12 = r93.b(cursorI, "backoff_delay_duration");
            int iB13 = r93.b(cursorI, "last_enqueue_time");
            int iB14 = r93.b(cursorI, "minimum_retention_duration");
            mfdVar = mfdVarA;
            try {
                int iB15 = r93.b(cursorI, "schedule_requested_at");
                int iB16 = r93.b(cursorI, "run_in_foreground");
                int iB17 = r93.b(cursorI, "out_of_quota_policy");
                int iB18 = r93.b(cursorI, "period_count");
                int iB19 = r93.b(cursorI, "generation");
                int iB20 = r93.b(cursorI, "required_network_type");
                int iB21 = r93.b(cursorI, "requires_charging");
                int iB22 = r93.b(cursorI, "requires_device_idle");
                int iB23 = r93.b(cursorI, "requires_battery_not_low");
                int iB24 = r93.b(cursorI, "requires_storage_not_low");
                int iB25 = r93.b(cursorI, "trigger_content_update_delay");
                int iB26 = r93.b(cursorI, "trigger_max_content_delay");
                int iB27 = r93.b(cursorI, "content_uri_triggers");
                int i = iB14;
                ArrayList arrayList = new ArrayList(cursorI.getCount());
                while (cursorI.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorI.isNull(iB) ? null : cursorI.getString(iB);
                    s2h s2hVarD = pyd.D(cursorI.getInt(iB2));
                    String string2 = cursorI.isNull(iB3) ? null : cursorI.getString(iB3);
                    String string3 = cursorI.isNull(iB4) ? null : cursorI.getString(iB4);
                    b bVarA = b.a(cursorI.isNull(iB5) ? null : cursorI.getBlob(iB5));
                    b bVarA2 = b.a(cursorI.isNull(iB6) ? null : cursorI.getBlob(iB6));
                    long j = cursorI.getLong(iB7);
                    long j2 = cursorI.getLong(iB8);
                    long j3 = cursorI.getLong(iB9);
                    int i2 = cursorI.getInt(iB10);
                    b81 b81VarA = pyd.A(cursorI.getInt(iB11));
                    long j4 = cursorI.getLong(iB12);
                    long j5 = cursorI.getLong(iB13);
                    int i3 = i;
                    long j6 = cursorI.getLong(i3);
                    i = i3;
                    int i4 = iB15;
                    long j7 = cursorI.getLong(i4);
                    iB15 = i4;
                    int i5 = iB16;
                    boolean z = cursorI.getInt(i5) != 0;
                    iB16 = i5;
                    int i6 = iB17;
                    iwa iwaVarC = pyd.C(cursorI.getInt(i6));
                    iB17 = i6;
                    int i7 = iB18;
                    int i8 = cursorI.getInt(i7);
                    iB18 = i7;
                    int i9 = iB19;
                    int i10 = cursorI.getInt(i9);
                    iB19 = i9;
                    int i11 = iB20;
                    dha dhaVarB = pyd.B(cursorI.getInt(i11));
                    iB20 = i11;
                    int i12 = iB21;
                    boolean z2 = cursorI.getInt(i12) != 0;
                    iB21 = i12;
                    int i13 = iB22;
                    boolean z3 = cursorI.getInt(i13) != 0;
                    iB22 = i13;
                    int i14 = iB23;
                    boolean z4 = cursorI.getInt(i14) != 0;
                    iB23 = i14;
                    int i15 = iB24;
                    boolean z5 = cursorI.getInt(i15) != 0;
                    iB24 = i15;
                    int i16 = iB25;
                    long j8 = cursorI.getLong(i16);
                    iB25 = i16;
                    int i17 = iB26;
                    long j9 = cursorI.getLong(i17);
                    iB26 = i17;
                    int i18 = iB27;
                    if (!cursorI.isNull(i18)) {
                        blob = cursorI.getBlob(i18);
                    }
                    iB27 = i18;
                    arrayList.add(new r3h(string, s2hVarD, string2, string3, bVarA, bVarA2, j, j2, j3, new jq2(dhaVarB, z2, z3, z4, z5, j8, j9, pyd.c(blob)), i2, b81VarA, j4, j5, j6, j7, z, iwaVarC, i8, i10));
                }
                cursorI.close();
                mfdVar.s();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorI.close();
                mfdVar.s();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mfdVar = mfdVarA;
        }
    }

    @Override // defpackage.s3h
    public final boolean t() throws IOException {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        boolean z = false;
        mfd mfdVarA = mfd.a.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            if (cursorI.moveToFirst()) {
                if (cursorI.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.s3h
    public final int u(String str) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        x3h x3hVar = this.i;
        zze zzeVarC = x3hVar.c();
        if (str == null) {
            zzeVarC.u(1);
        } else {
            zzeVarC.n(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iJ = zzeVarC.J();
            workDatabase_Impl.w();
            return iJ;
        } finally {
            workDatabase_Impl.s();
            x3hVar.g(zzeVarC);
        }
    }

    @Override // defpackage.s3h
    public final int v(String str) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        vda vdaVar = this.h;
        zze zzeVarC = vdaVar.c();
        if (str == null) {
            zzeVarC.u(1);
        } else {
            zzeVarC.n(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iJ = zzeVarC.J();
            workDatabase_Impl.w();
            return iJ;
        } finally {
            workDatabase_Impl.s();
            vdaVar.g(zzeVarC);
        }
    }
}
