package defpackage;

import android.database.Cursor;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.iz8;
import defpackage.mfd;
import defpackage.o7d;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class ln2 implements x3b, jjb, OnCompleteListener, Continuation, OnTokenCanceledListener {
    public final Object a;
    public final Object b;

    public ln2(k1a k1aVar, g62 g62Var, rs9 rs9Var) {
        rlf rlfVar = new rlf(g62Var, rs9Var, new yl2());
        this.a = k1aVar;
        this.b = rlfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ln2 d(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L27 java.lang.Error -> L2a java.io.IOException -> L2c
            ln2 r2 = new ln2     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            return r2
        L21:
            r2 = move-exception
            goto L36
        L23:
            r2 = move-exception
            goto L36
        L25:
            r2 = move-exception
            goto L36
        L27:
            r2 = move-exception
        L28:
            r0 = r1
            goto L36
        L2a:
            r2 = move-exception
            goto L28
        L2c:
            r2 = move-exception
            goto L28
        L2e:
            r2 = move-exception
        L2f:
            r5 = r1
            r0 = r5
            goto L36
        L32:
            r2 = move-exception
            goto L2f
        L34:
            r2 = move-exception
            goto L2f
        L36:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L42
            r0.release()     // Catch: java.io.IOException -> L42
        L42:
            if (r5 == 0) goto L47
            r5.close()     // Catch: java.io.IOException -> L47
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln2.d(android.content.Context):ln2");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.x3b
    public Object a(yd8 yd8Var, ArrayList arrayList) {
        Object aVar;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Class clsP = jh2.p(yd8Var);
        Object w3bVar = concurrentHashMap.get(clsP);
        if (w3bVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsP, (w3bVar = new w3b()))) != null) {
            w3bVar = objPutIfAbsent;
        }
        w3b w3bVar2 = (w3b) w3bVar;
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new hg8((zf8) it.next()));
        }
        ConcurrentHashMap<List<hg8>, o7d<KSerializer<T>>> concurrentHashMap2 = w3bVar2.a;
        Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                aVar = (KSerializer) ((Function2) this.a).invoke(yd8Var, arrayList);
            } catch (Throwable th) {
                aVar = new o7d.a(th);
            }
            o7d o7dVar = new o7d(aVar);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, (o7d<KSerializer<T>>) o7dVar);
            obj = objPutIfAbsent2 == null ? o7dVar : objPutIfAbsent2;
        }
        return ((o7d) obj).b();
    }

    @Override // defpackage.jjb
    public Long b(String str) throws IOException {
        xed xedVar = (xed) this.a;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT long_value FROM Preference where `key`=?");
        mfdVarA.n(1, str);
        xedVar.b();
        Cursor cursorI = pg8.I(xedVar, mfdVarA, false);
        try {
            Long lValueOf = null;
            if (cursorI.moveToFirst() && !cursorI.isNull(0)) {
                lValueOf = Long.valueOf(cursorI.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.jjb
    public void c(ijb ijbVar) throws Throwable {
        xed xedVar = (xed) this.a;
        xedVar.b();
        xedVar.c();
        try {
            ((kjb) this.b).j(ijbVar);
            xedVar.w();
        } finally {
            xedVar.s();
        }
    }

    public void e() {
        try {
            ((FileLock) this.b).release();
            ((FileChannel) this.a).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public void onCanceled() {
        try {
            ((ish) this.a).q((iz8.a) this.b, true, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((j9h) this.b).b.remove((TaskCompletionSource) this.a);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ws9 ws9Var = (ws9) this.a;
        Pair pair = (Pair) this.b;
        synchronized (ws9Var) {
            ((ht0) ws9Var.c).remove(pair);
        }
        return task;
    }

    public ln2(j9h j9hVar, TaskCompletionSource taskCompletionSource) {
        this.b = j9hVar;
        this.a = taskCompletionSource;
    }

    public ln2(WorkDatabase workDatabase) {
        this.a = workDatabase;
        this.b = new kjb(workDatabase);
    }

    public /* synthetic */ ln2(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ln2(Function2 function2) {
        this.a = function2;
        this.b = new ConcurrentHashMap();
    }
}
