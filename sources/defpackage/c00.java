package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c00 implements OnFailureListener, sxh {
    public Object a;

    public /* synthetic */ c00(Object obj) {
        this.a = obj;
    }

    public Object a() {
        jqh jqhVar = (jqh) this.a;
        Cursor cursorQuery = jqhVar.a.query(jqhVar.b, jqh.h, null, null, null);
        if (cursorQuery == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            Map ht0Var = count <= 256 ? new ht0(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                ht0Var.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return ht0Var;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // defpackage.sxh
    public void b(String str, int i, Throwable th, byte[] bArr, Map map) {
        fei feiVar = (fei) this.a;
        i0i i0iVar = feiVar.X;
        feiVar.H();
        feiVar.D();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                feiVar.f0 = false;
                feiVar.o();
                throw th2;
            }
        }
        ArrayList<Long> arrayList = feiVar.j0;
        feiVar.j0 = null;
        if ((i == 200 || i == 204) && th == null) {
            try {
                eyh eyhVar = i0iVar.W;
                i0i.c(eyhVar);
                uyh uyhVar = eyhVar.e;
                i0iVar.c0.getClass();
                uyhVar.b(System.currentTimeMillis());
                eyh eyhVar2 = i0iVar.W;
                i0i.c(eyhVar2);
                eyhVar2.f.b(0L);
                feiVar.K();
                ewh ewhVar = i0iVar.X;
                i0i.i(ewhVar);
                ewhVar.c0.c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                feiVar.z().U();
                try {
                    for (Long l : arrayList) {
                        try {
                            wgh wghVarZ = feiVar.z();
                            long jLongValue = l.longValue();
                            wghVarZ.b();
                            wghVarZ.g();
                            try {
                                if (wghVarZ.m().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) != 1) {
                                    throw new SQLiteException("Deleted fewer rows from queue than expected");
                                }
                            } catch (SQLiteException e) {
                                wghVarZ.zzr().f.a(e, "Failed to delete a bundle in a queue table");
                                throw e;
                            }
                        } catch (SQLiteException e2) {
                            ArrayList arrayList2 = feiVar.k0;
                            if (arrayList2 == null || !arrayList2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    feiVar.z().l();
                    feiVar.z().X();
                    feiVar.k0 = null;
                    nxh nxhVar = feiVar.b;
                    fei.v(nxhVar);
                    if (nxhVar.n() && feiVar.J()) {
                        feiVar.E();
                    } else {
                        feiVar.l0 = -1L;
                        feiVar.K();
                    }
                    feiVar.a0 = 0L;
                } catch (Throwable th3) {
                    feiVar.z().X();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                ewh ewhVar2 = i0iVar.X;
                i0i.i(ewhVar2);
                ewhVar2.f.a(e3, "Database error while trying to delete uploaded bundles");
                i0iVar.c0.getClass();
                feiVar.a0 = SystemClock.elapsedRealtime();
                ewh ewhVar3 = i0iVar.X;
                i0i.i(ewhVar3);
                ewhVar3.c0.a(Long.valueOf(feiVar.a0), "Disable upload, time");
            }
        } else {
            ewh ewhVar4 = i0iVar.X;
            jh2 jh2Var = i0iVar.c0;
            eyh eyhVar3 = i0iVar.W;
            i0i.i(ewhVar4);
            ewhVar4.c0.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            i0i.c(eyhVar3);
            uyh uyhVar2 = eyhVar3.f;
            jh2Var.getClass();
            uyhVar2.b(System.currentTimeMillis());
            if (i == 503 || i == 429) {
                eyhVar3.V.b(System.currentTimeMillis());
            }
            feiVar.z().A(arrayList);
            feiVar.K();
        }
        feiVar.f0 = false;
        feiVar.o();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        exc.getClass();
        ((np7) cr8.p(np7.class)).c("AgeSignalUtils", "Failed call ageSignalsManager.checkAgeSignals", false, exc);
        ((jjd) this.a).resumeWith(null);
    }
}
