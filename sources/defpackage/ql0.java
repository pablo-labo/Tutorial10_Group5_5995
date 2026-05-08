package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import defpackage.mfd;
import defpackage.o7d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ql0 implements ag7, a3h {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public ql0(WorkDatabase_Impl workDatabase_Impl) {
        this.a = 3;
        this.b = workDatabase_Impl;
        this.c = new pda(workDatabase_Impl, 1);
    }

    @Override // defpackage.a3h
    public void a(z2h z2hVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((pda) this.c).j(z2hVar);
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.s();
        }
    }

    @Override // defpackage.a3h
    public ArrayList b(String str) throws IOException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
        if (str == null) {
            mfdVarA.u(1);
        } else {
            mfdVarA.n(1, str);
        }
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

    @Override // defpackage.ag7
    public void c(int i) {
        qw1 qw1Var = (qw1) this.b;
        try {
            if (qw1Var.v()) {
                qw1Var.resumeWith(i == 0 ? ((yf7) this.c).w0() : null);
            }
        } catch (Exception e) {
            if (qw1Var.v()) {
                qw1Var.resumeWith(new o7d.a(e));
            }
        }
    }

    public void d() {
        this.b = null;
        this.c = null;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return ((String) this.b) + ", " + ((String) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ql0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ ql0() {
        this.a = 1;
    }
}
