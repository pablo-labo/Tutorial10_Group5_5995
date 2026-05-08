package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import defpackage.mfd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class z2f implements v2f {
    public final WorkDatabase_Impl a;
    public final w2f b;
    public final x2f c;
    public final y2f d;

    public z2f(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new w2f(workDatabase_Impl);
        this.c = new x2f(workDatabase_Impl);
        this.d = new y2f(workDatabase_Impl);
    }

    @Override // defpackage.v2f
    public final void a(r2h r2hVar) throws Throwable {
        String str = r2hVar.a;
        int i = r2hVar.b;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        x2f x2fVar = this.c;
        zze zzeVarC = x2fVar.c();
        if (str == null) {
            zzeVarC.u(1);
        } else {
            zzeVarC.n(1, str);
        }
        zzeVarC.q(2, i);
        workDatabase_Impl.c();
        try {
            zzeVarC.J();
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.s();
            x2fVar.g(zzeVarC);
        }
    }

    @Override // defpackage.v2f
    public final ArrayList b() throws IOException {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
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

    @Override // defpackage.v2f
    public final u2f c(r2h r2hVar) throws IOException {
        String str = r2hVar.a;
        int i = r2hVar.b;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        if (str == null) {
            mfdVarA.u(1);
        } else {
            mfdVarA.n(1, str);
        }
        mfdVarA.q(2, i);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            int iB = r93.b(cursorI, "work_spec_id");
            int iB2 = r93.b(cursorI, "generation");
            int iB3 = r93.b(cursorI, "system_id");
            u2f u2fVar = null;
            String string = null;
            if (cursorI.moveToFirst()) {
                if (!cursorI.isNull(iB)) {
                    string = cursorI.getString(iB);
                }
                u2fVar = new u2f(string, cursorI.getInt(iB2), cursorI.getInt(iB3));
            }
            return u2fVar;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.v2f
    public final void d(u2f u2fVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.j(u2fVar);
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.s();
        }
    }

    @Override // defpackage.v2f
    public final void e(String str) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        y2f y2fVar = this.d;
        zze zzeVarC = y2fVar.c();
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
            y2fVar.g(zzeVarC);
        }
    }
}
