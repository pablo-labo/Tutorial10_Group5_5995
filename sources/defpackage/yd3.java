package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.xp2;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class yd3 implements xp2.a, Continuation {
    public final Object a;
    public final Object b;
    public final Object c;

    public yd3(uqf uqfVar, y1h y1hVar) {
        uqfVar.getClass();
        bq2 bq2Var = (bq2) uqfVar.a;
        bq2Var.getClass();
        oe1 oe1Var = new oe1(bq2Var);
        se1 se1Var = (se1) uqfVar.d;
        se1Var.getClass();
        re1 re1Var = new re1(se1Var);
        bq2 bq2Var2 = (bq2) uqfVar.c;
        bq2Var2.getClass();
        cue cueVar = new cue(bq2Var2);
        bq2 bq2Var3 = (bq2) uqfVar.b;
        bq2Var3.getClass();
        xp2[] xp2VarArr = {oe1Var, re1Var, cueVar, new qfa(bq2Var3), new gha(bq2Var3), new nga(bq2Var3), new kga(bq2Var3)};
        this.b = y1hVar;
        this.c = xp2VarArr;
        this.a = new Object();
    }

    @Override // xp2.a
    public void a(ArrayList arrayList) {
        arrayList.getClass();
        synchronized (this.a) {
            y1h y1hVar = (y1h) this.b;
            if (y1hVar != null) {
                y1hVar.a(arrayList);
                j6g j6gVar = j6g.a;
            }
        }
    }

    @Override // xp2.a
    public void b(ArrayList arrayList) {
        arrayList.getClass();
        synchronized (this.a) {
            try {
                ArrayList<r3h> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (c(((r3h) obj).a)) {
                        arrayList2.add(obj);
                    }
                }
                for (r3h r3hVar : arrayList2) {
                    z39.d().a(z1h.a, "Constraints met for " + r3hVar);
                }
                y1h y1hVar = (y1h) this.b;
                if (y1hVar != null) {
                    y1hVar.f(arrayList2);
                    j6g j6gVar = j6g.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(String str) {
        xp2 xp2Var;
        boolean z;
        str.getClass();
        synchronized (this.a) {
            try {
                xp2[] xp2VarArr = (xp2[]) this.c;
                int length = xp2VarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        xp2Var = null;
                        break;
                    }
                    xp2Var = xp2VarArr[i];
                    xp2Var.getClass();
                    T t = xp2Var.d;
                    if (t != 0 && xp2Var.c(t) && xp2Var.c.contains(str)) {
                        break;
                    }
                    i++;
                }
                if (xp2Var != null) {
                    z39.d().a(z1h.a, "Work " + str + " constrained by " + xp2Var.getClass().getSimpleName());
                }
                z = xp2Var == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void d(Iterable iterable) {
        iterable.getClass();
        synchronized (this.a) {
            try {
                for (xp2 xp2Var : (xp2[]) this.c) {
                    if (xp2Var.e != null) {
                        xp2Var.e = null;
                        xp2Var.e(null, xp2Var.d);
                    }
                }
                for (xp2 xp2Var2 : (xp2[]) this.c) {
                    xp2Var2.d(iterable);
                }
                for (xp2 xp2Var3 : (xp2[]) this.c) {
                    if (xp2Var3.e != this) {
                        xp2Var3.e = this;
                        xp2Var3.e(this, xp2Var3.d);
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.a) {
            try {
                for (xp2 xp2Var : (xp2[]) this.c) {
                    ArrayList arrayList = xp2Var.b;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        xp2Var.a.b(xp2Var);
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        final FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.b;
        final String str = (String) this.a;
        final String str2 = (String) this.c;
        final String strJ = firebaseInstanceId.j();
        ekh ekhVarF = firebaseInstanceId.f(str, str2);
        if (!firebaseInstanceId.e(ekhVarF)) {
            return Tasks.forResult(new egh(strJ, ekhVarF.a));
        }
        ws9 ws9Var = firebaseInstanceId.e;
        synchronized (ws9Var) {
            Pair pair = new Pair(str, str2);
            Task task2 = (Task) ((ht0) ws9Var.c).get(pair);
            if (task2 != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String strValueOf = String.valueOf(pair);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
                    sb.append("Joining ongoing request for: ");
                    sb.append(strValueOf);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                return task2;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf2 = String.valueOf(pair);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
                sb2.append("Making new request for: ");
                sb2.append(strValueOf2);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
            nli nliVar = firebaseInstanceId.d;
            nliVar.getClass();
            Task taskContinueWithTask = nliVar.a(strJ, str, str2, new Bundle()).continueWith(nliVar.d, new mxg()).onSuccessTask(firebaseInstanceId.a, new SuccessContinuation(firebaseInstanceId, str, str2, strJ) { // from class: kji
                public final FirebaseInstanceId a;
                public final String b;
                public final String c;
                public final String d;

                {
                    this.a = firebaseInstanceId;
                    this.b = str;
                    this.c = str2;
                    this.d = strJ;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    FirebaseInstanceId firebaseInstanceId2 = this.a;
                    String str3 = this.b;
                    String str4 = this.c;
                    String str5 = this.d;
                    String str6 = (String) obj;
                    ikh ikhVar = FirebaseInstanceId.i;
                    String strK = firebaseInstanceId2.k();
                    String strD = firebaseInstanceId2.c.d();
                    synchronized (ikhVar) {
                        String strA = ekh.a(System.currentTimeMillis(), str6, strD);
                        if (strA != null) {
                            SharedPreferences.Editor editorEdit = ikhVar.a.edit();
                            editorEdit.putString(ikh.d(strK, str3, str4), strA);
                            editorEdit.commit();
                        }
                    }
                    return Tasks.forResult(new egh(str5, str6));
                }
            }).continueWithTask((ThreadPoolExecutor) ws9Var.b, new ln2(ws9Var, pair));
            ((ht0) ws9Var.c).put(pair, taskContinueWithTask);
            return taskContinueWithTask;
        }
    }

    public /* synthetic */ yd3(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }
}
