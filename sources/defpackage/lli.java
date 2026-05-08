package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import defpackage.jph;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lli {
    public jph a;
    public Long b;
    public long c;
    public final /* synthetic */ rji d;

    public lli(rji rjiVar) {
        this.d = rjiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final jph a(String str, jph jphVar) {
        jph jphVar2;
        long j;
        Pair pair;
        Object obj;
        String strC = jphVar.C();
        List<lph> listR = jphVar.r();
        rji rjiVar = this.d;
        nei neiVarJ = rjiVar.j();
        fei feiVar = rjiVar.b;
        Long l = (Long) neiVarJ.H("_eid", jphVar);
        boolean z = l != null;
        if (z && strC.equals("_ep")) {
            String str2 = (String) rjiVar.j().H("_en", jphVar);
            Cursor cursorRawQuery = null;
            if (TextUtils.isEmpty(str2)) {
                rjiVar.zzr().V.a(l, "Extra parameter without an event name. eventId");
                return null;
            }
            if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                wgh wghVarZ = feiVar.z();
                wghVarZ.b();
                wghVarZ.g();
                try {
                    try {
                        jphVar2 = null;
                        j = 0;
                    } catch (SQLiteException e) {
                        e = e;
                        jphVar2 = null;
                        j = 0;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        cursorRawQuery = wghVarZ.m().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l)});
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursorRawQuery = null;
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        throw th;
                    }
                    try {
                    } catch (SQLiteException e3) {
                        e = e3;
                        wghVarZ.zzr().f.a(e, "Error selecting main event");
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    }
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            Pair pairCreate = Pair.create((jph) ((jph.a) nei.u(jph.J(), cursorRawQuery.getBlob(0))).m(), Long.valueOf(cursorRawQuery.getLong(1)));
                            cursorRawQuery.close();
                            pair = pairCreate;
                        } catch (IOException e4) {
                            wghVarZ.zzr().f.d("Failed to merge main event. appId, eventId", ewh.l(str), l, e4);
                            cursorRawQuery.close();
                            pair = jphVar2;
                        }
                        if (pair != 0 || (obj = pair.first) == null) {
                            rjiVar.zzr().V.c("Extra parameter without existing main event. eventName, eventId", str2, l);
                            return jphVar2;
                        }
                        this.a = (jph) obj;
                        this.c = ((Long) pair.second).longValue();
                        this.b = (Long) rjiVar.j().H("_eid", this.a);
                    } else {
                        wghVarZ.zzr().c0.b("Main event not found");
                        cursorRawQuery.close();
                    }
                    pair = jphVar2;
                    if (pair != 0) {
                    }
                    rjiVar.zzr().V.c("Extra parameter without existing main event. eventName, eventId", str2, l);
                    return jphVar2;
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                j = 0;
            }
            long j2 = this.c - 1;
            this.c = j2;
            if (j2 <= j) {
                wgh wghVarZ2 = feiVar.z();
                wghVarZ2.b();
                wghVarZ2.zzr().c0.a(str, "Clearing complex main event info. appId");
                try {
                    wghVarZ2.m().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e5) {
                    wghVarZ2.zzr().f.a(e5, "Error clearing complex main event");
                }
            } else {
                feiVar.z().z(str, l, this.c, this.a);
            }
            ArrayList arrayList = new ArrayList();
            for (lph lphVar : this.a.r()) {
                rjiVar.j();
                if (nei.t(lphVar.y(), jphVar) == null) {
                    arrayList.add(lphVar);
                }
            }
            if (arrayList.isEmpty()) {
                rjiVar.zzr().V.a(str2, "No unique parameters in main event. eventName");
            } else {
                arrayList.addAll(listR);
                listR = arrayList;
            }
            strC = str2;
        } else if (z) {
            this.b = l;
            this.a = jphVar;
            Serializable serializableH = rjiVar.j().H("_epc", jphVar);
            long jLongValue = ((Long) (serializableH != null ? serializableH : 0L)).longValue();
            this.c = jLongValue;
            if (jLongValue <= 0) {
                rjiVar.zzr().V.a(strC, "Complex event with zero extra param count. eventName");
            } else {
                feiVar.z().z(str, l, this.c, jphVar);
            }
        }
        jph.a aVarQ = jphVar.q();
        if (aVarQ.c) {
            aVarQ.k();
            aVarQ.c = false;
        }
        jph.u(strC, (jph) aVarQ.b);
        if (aVarQ.c) {
            aVarQ.k();
            aVarQ.c = false;
        }
        jph.v((jph) aVarQ.b);
        if (aVarQ.c) {
            aVarQ.k();
            aVarQ.c = false;
        }
        jph.y((jph) aVarQ.b, listR);
        return (jph) aVarQ.m();
    }
}
