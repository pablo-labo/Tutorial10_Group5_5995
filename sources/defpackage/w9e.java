package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import defpackage.g21;
import defpackage.h21;
import defpackage.v11;
import defpackage.v33;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import x2d.a;

/* JADX INFO: loaded from: classes2.dex */
public final class w9e {
    public final w33 a;
    public final c43 b;
    public final mf3 c;
    public final e39 d;
    public final jjg e;
    public final nr6 f;

    public w9e(w33 w33Var, c43 c43Var, mf3 mf3Var, e39 e39Var, jjg jjgVar, nr6 nr6Var) {
        this.a = w33Var;
        this.b = c43Var;
        this.c = mf3Var;
        this.d = e39Var;
        this.e = jjgVar;
        this.f = nr6Var;
    }

    public static g21 a(g21 g21Var, e39 e39Var, jjg jjgVar) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        g21.a aVarG = g21Var.g();
        String strB = e39Var.b.b();
        if (strB != null) {
            aVarG.e = new q21(strB);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        sh8 reference = jjgVar.d.a.getReference();
        synchronized (reference) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
        }
        List<v33.c> listD = d(mapUnmodifiableMap);
        sh8 reference2 = jjgVar.e.a.getReference();
        synchronized (reference2) {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(reference2.a));
        }
        List<v33.c> listD2 = d(mapUnmodifiableMap2);
        if (!listD.isEmpty() || !listD2.isEmpty()) {
            h21.a aVarH = g21Var.c.h();
            aVarH.b = listD;
            aVarH.c = listD2;
            String strConcat = aVarH.a == null ? " execution" : "";
            if (aVarH.g == null) {
                strConcat = strConcat.concat(" uiOrientation");
            }
            if (!strConcat.isEmpty()) {
                r6.g("Missing required properties:".concat(strConcat));
                return null;
            }
            aVarG.c = new h21(aVarH.a, aVarH.b, aVarH.c, aVarH.d, aVarH.e, aVarH.f, aVarH.g.intValue());
        }
        return aVarG.a();
    }

    public static v33.e.d b(g21 g21Var, jjg jjgVar) {
        List listUnmodifiableList;
        ted tedVar = jjgVar.f;
        synchronized (tedVar) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(tedVar.a));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            sed sedVar = (sed) listUnmodifiableList.get(i);
            String strF = sedVar.f();
            if (strF == null) {
                ja.k("Null variantId");
                return null;
            }
            String strD = sedVar.d();
            if (strD == null) {
                ja.k("Null rolloutId");
                return null;
            }
            s21 s21Var = new s21(strD, strF);
            String strB = sedVar.b();
            if (strB == null) {
                ja.k("Null parameterKey");
                return null;
            }
            String strC = sedVar.c();
            if (strC == null) {
                ja.k("Null parameterValue");
                return null;
            }
            arrayList.add(new r21(s21Var, strB, strC, sedVar.e()));
        }
        if (arrayList.isEmpty()) {
            return g21Var;
        }
        g21.a aVarG = g21Var.g();
        aVarG.f = new t21(arrayList);
        return aVarG.a();
    }

    public static w9e c(Context context, nr6 nr6Var, oa5 oa5Var, qk0 qk0Var, e39 e39Var, jjg jjgVar, ws9 ws9Var, nbe nbeVar, jb6 jb6Var, x23 x23Var) {
        w33 w33Var = new w33(context, nr6Var, qk0Var, ws9Var, nbeVar);
        c43 c43Var = new c43(oa5Var, nbeVar, x23Var);
        x33 x33Var = mf3.b;
        etf.b(context);
        return new w9e(w33Var, c43Var, new mf3(new x2d(etf.a().c(new as1(mf3.c, mf3.d)).a("FIREBASE_CRASHLYTICS_REPORT", new dt4("json"), mf3.e), nbeVar.b(), jb6Var)), e39Var, jjgVar, nr6Var);
    }

    public static List<v33.c> d(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                ja.k("Null key");
                return null;
            }
            String value = entry.getValue();
            if (value == null) {
                ja.k("Null value");
                return null;
            }
            arrayList.add(new z11(key, value));
        }
        Collections.sort(arrayList, new ol2(2));
        return Collections.unmodifiableList(arrayList);
    }

    public final void e(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        ws9 ws9Var;
        boolean zEquals = str2.equals("crash");
        w33 w33Var = this.a;
        Context context = w33Var.a;
        int i = context.getResources().getConfiguration().orientation;
        ws9 ws9Var2 = w33Var.d;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        kuf kufVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            kufVar = new kuf(th2.getLocalizedMessage(), th2.getClass().getName(), ws9Var2.d(th2.getStackTrace()), kufVar);
        }
        v33.e.d.a.c cVarB = xnb.a.b(context);
        Boolean boolValueOf = cVarB.a() > 0 ? Boolean.valueOf(cVarB.a() != 100) : null;
        ArrayList arrayListA = xnb.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = kufVar.c;
        String name = thread.getName();
        if (name == null) {
            ja.k("Null name");
            return;
        }
        List listD = w33.d(stackTraceElementArr, 4);
        if (listD == null) {
            ja.k("Null frames");
            return;
        }
        arrayList.add(new m21(4, name, listD));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (key.equals(thread)) {
                    ws9Var = ws9Var2;
                } else {
                    StackTraceElement[] stackTraceElementArrD = ws9Var2.d(entry.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        ja.k("Null name");
                        return;
                    }
                    ws9Var = ws9Var2;
                    List listD2 = w33.d(stackTraceElementArrD, 0);
                    if (listD2 == null) {
                        ja.k("Null frames");
                        return;
                    }
                    arrayList.add(new m21(0, name2, listD2));
                }
                ws9Var2 = ws9Var;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        k21 k21VarC = w33.c(kufVar, 0);
        l21 l21Var = new l21(0L, "0", "0");
        List<v33.e.d.a.b.AbstractC0443a> listA = w33Var.a();
        if (listA == null) {
            ja.k("Null binaries");
            return;
        }
        g21 g21Var = new g21(j, str2, new h21(new i21(listUnmodifiableList, k21VarC, null, l21Var, listA), null, null, boolValueOf, cVarB, arrayListA, i), w33Var.b(i), null, null);
        e39 e39Var = this.d;
        jjg jjgVar = this.e;
        this.b.d(b(a(g21Var, e39Var, jjgVar), jjgVar), str, zEquals);
    }

    public final Task f(String str, Executor executor) {
        TaskCompletionSource<d43> taskCompletionSource;
        String str2;
        ArrayList<File> arrayListB = this.b.b();
        ArrayList<d43> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                x33 x33Var = c43.g;
                String strE = c43.e(file);
                x33Var.getClass();
                arrayList.add(new w11(x33.i(strE), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (d43 w11Var : arrayList) {
            if (str == null || str.equals(w11Var.c())) {
                mf3 mf3Var = this.c;
                if (w11Var.a().e() == null) {
                    try {
                        str2 = (String) dkg.a(this.f.d.getId());
                    } catch (Exception e2) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e2);
                        str2 = null;
                    }
                    v11.a aVarL = w11Var.a().l();
                    aVarL.e = str2;
                    w11Var = new w11(aVarL.a(), w11Var.c(), w11Var.b());
                }
                boolean z = str != null;
                x2d x2dVar = mf3Var.a;
                synchronized (x2dVar.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource<>();
                        if (z) {
                            ((AtomicInteger) x2dVar.i.a).getAndIncrement();
                            if (x2dVar.f.size() < x2dVar.e) {
                                cr8 cr8Var = cr8.c;
                                cr8Var.k("Enqueueing report: " + w11Var.c());
                                cr8Var.k("Queue size: " + x2dVar.f.size());
                                x2dVar.g.execute(x2dVar.new a(w11Var, taskCompletionSource));
                                cr8Var.k("Closing task for report: " + w11Var.c());
                                taskCompletionSource.trySetResult(w11Var);
                            } else {
                                x2dVar.a();
                                String str3 = "Dropping report due to queue being full: " + w11Var.c();
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) x2dVar.i.b).getAndIncrement();
                                taskCompletionSource.trySetResult(w11Var);
                            }
                        } else {
                            x2dVar.b(w11Var, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new l6()));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
