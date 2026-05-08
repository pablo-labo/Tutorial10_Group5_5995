package defpackage;

import android.database.Cursor;
import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.c60;
import defpackage.mfd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class x7 implements wu1, d8e, SuccessContinuation, oy3 {
    public final Object a;
    public Object b;

    public x7(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new py3(workDatabase_Impl);
    }

    @Override // defpackage.d8e
    public KSerializer a(yd8 yd8Var) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Class clsP = jh2.p(yd8Var);
        Object ht1Var = concurrentHashMap.get(clsP);
        if (ht1Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsP, (ht1Var = new ht1((KSerializer) ((Function1) this.a).invoke(yd8Var))))) != null) {
            ht1Var = objPutIfAbsent;
        }
        return ((ht1) ht1Var).a;
    }

    @Override // defpackage.oy3
    public ArrayList b(String str) throws IOException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
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

    @Override // defpackage.oy3
    public boolean c(String str) throws IOException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            mfdVarA.u(1);
        } else {
            mfdVarA.n(1, str);
        }
        workDatabase_Impl.b();
        boolean z = false;
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            if (cursorI.moveToFirst()) {
                z = cursorI.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.oy3
    public void d(ly3 ly3Var) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((py3) this.b).j(ly3Var);
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.s();
        }
    }

    @Override // defpackage.wu1
    public void e(View view, float[] fArr) {
        if9.d(fArr);
        g(view, fArr);
    }

    @Override // defpackage.oy3
    public boolean f(String str) throws IOException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            mfdVarA.u(1);
        } else {
            mfdVarA.n(1, str);
        }
        workDatabase_Impl.b();
        boolean z = false;
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            if (cursorI.moveToFirst()) {
                z = cursorI.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    public void g(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.a;
        Object parent = view.getParent();
        if (parent instanceof View) {
            g((View) parent, fArr);
            c60.a aVar = c60.a;
            if9.d(fArr2);
            if9.f(fArr2, -view.getScrollX(), -view.getScrollY());
            c60.b(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            if9.d(fArr2);
            if9.f(fArr2, left, top);
            c60.b(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.b;
            view.getLocationInWindow(iArr);
            c60.a aVar2 = c60.a;
            if9.d(fArr2);
            if9.f(fArr2, -view.getScrollX(), -view.getScrollY());
            c60.b(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            if9.d(fArr2);
            if9.f(fArr2, f, f2);
            c60.b(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        pg8.M(matrix, fArr2);
        c60.b(fArr, fArr2);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        hbe hbeVar = (hbe) obj;
        g33 g33Var = ((d33) this.b).e;
        if (hbeVar != null) {
            return Tasks.whenAll((Task<?>[]) new Task[]{g33.b(g33Var), g33Var.m.f(null, (Executor) this.a)});
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return Tasks.forResult(null);
    }

    public x7(ArrayList arrayList, MotionEvent motionEvent) {
        this.a = arrayList;
        this.b = motionEvent;
    }

    public x7(ConstraintLayout constraintLayout, ProgressBar progressBar, Toolbar toolbar) {
        this.a = progressBar;
        this.b = toolbar;
    }

    public x7(Function1 function1) {
        this.a = function1;
        this.b = new ConcurrentHashMap();
    }

    public x7(d33 d33Var, Executor executor, String str) {
        this.b = d33Var;
        this.a = executor;
    }

    public x7(float[] fArr) {
        this.a = fArr;
        this.b = new int[2];
    }
}
