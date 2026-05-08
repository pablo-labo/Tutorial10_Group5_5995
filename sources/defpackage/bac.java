package defpackage;

import android.database.Cursor;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.persistence.EventLoggerDatabase;
import defpackage.mfd;
import defpackage.vf1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class bac implements w9c {
    public final xed a;
    public final x9c b;
    public final bb8 c = new bb8();
    public final y9c d;
    public final aac e;

    public bac(EventLoggerDatabase eventLoggerDatabase) {
        this.a = eventLoggerDatabase;
        this.b = new x9c(this, eventLoggerDatabase);
        this.d = new y9c(eventLoggerDatabase, 0);
        new z9c(eventLoggerDatabase, 0);
        this.e = new aac(eventLoggerDatabase, 0);
    }

    @Override // defpackage.w9c
    public final int a() throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        xed xedVar = this.a;
        xedVar.b();
        aac aacVar = this.e;
        zze zzeVarC = aacVar.c();
        zzeVarC.q(1, jCurrentTimeMillis);
        xedVar.c();
        try {
            int iJ = zzeVarC.J();
            xedVar.w();
            return iJ;
        } finally {
            xedVar.s();
            aacVar.g(zzeVarC);
        }
    }

    @Override // defpackage.w9c
    public final void b(List<v9c> list) throws Throwable {
        xed xedVar = this.a;
        xedVar.b();
        xedVar.c();
        try {
            y9c y9cVar = this.d;
            y9cVar.getClass();
            zze zzeVarC = y9cVar.c();
            try {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    zzeVarC.q(1, ((v9c) it.next()).a);
                    zzeVarC.J();
                }
                y9cVar.g(zzeVarC);
                xedVar.w();
            } catch (Throwable th) {
                y9cVar.g(zzeVarC);
                throw th;
            }
        } finally {
            xedVar.s();
        }
    }

    @Override // defpackage.w9c
    public final void c(EventPayload eventPayload) throws Throwable {
        g(new v9c(System.currentTimeMillis(), eventPayload, (byte[]) null, (JsonObject) null, 25));
    }

    @Override // defpackage.w9c
    public final void d(JsonObject jsonObject) throws Throwable {
        g(new v9c(System.currentTimeMillis(), (EventPayload) null, (byte[]) null, jsonObject, 13));
    }

    @Override // defpackage.w9c
    public final ArrayList e() throws IOException {
        bac bacVar = this;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT * FROM queuedevent ORDER BY createdAt ASC LIMIT ?");
        mfdVarA.q(1, 10L);
        xed xedVar = bacVar.a;
        xedVar.b();
        Cursor cursorI = pg8.I(xedVar, mfdVarA, false);
        try {
            int iB = r93.b(cursorI, "_id");
            int iB2 = r93.b(cursorI, "createdAt");
            int iB3 = r93.b(cursorI, "eventPayload");
            int iB4 = r93.b(cursorI, "avroEventPayload");
            int iB5 = r93.b(cursorI, "jsonObjectPayload");
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                long j = cursorI.getLong(iB);
                long j2 = cursorI.getLong(iB2);
                String string = cursorI.isNull(iB3) ? null : cursorI.getString(iB3);
                EventPayload eventPayload = string == null ? null : (EventPayload) k05.a.c(EventPayload.Companion.serializer(), string);
                byte[] blob = cursorI.isNull(iB4) ? null : cursorI.getBlob(iB4);
                String string2 = cursorI.isNull(iB5) ? null : cursorI.getString(iB5);
                bacVar.c.getClass();
                arrayList.add(new v9c(j, j2, eventPayload, blob, string2 == null ? null : (JsonObject) cb8.a.c(JsonObject.Companion.serializer(), string2)));
                bacVar = this;
            }
            return arrayList;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.w9c
    public final void f(cpe cpeVar) throws IOException {
        g54 g54Var;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            vf1.a aVar = new vf1.a(new zoe(), cpeVar.a());
            byteArrayOutputStream.write(aVar.c);
            ThreadLocal<qf1> threadLocal = yic.b;
            qf1 qf1Var = threadLocal.get();
            if (qf1Var == null || !qf1Var.getClass().equals(g54.class)) {
                g54Var = new g54(byteArrayOutputStream);
            } else {
                g54Var = (g54) qf1Var;
                g54Var.a = byteArrayOutputStream;
            }
            threadLocal.set(g54Var);
            ((gx5) aVar.a).c(cpeVar, g54Var);
            g54Var.flush();
            g(new v9c(System.currentTimeMillis(), (EventPayload) null, byteArrayOutputStream.toByteArray(), (JsonObject) null, 21));
            j6g j6gVar = j6g.a;
            byteArrayOutputStream.close();
        } finally {
        }
    }

    public final void g(v9c... v9cVarArr) throws Throwable {
        xed xedVar = this.a;
        xedVar.b();
        xedVar.c();
        try {
            x9c x9cVar = this.b;
            x9cVar.getClass();
            zze zzeVarC = x9cVar.c();
            try {
                for (v9c v9cVar : v9cVarArr) {
                    x9cVar.h(zzeVarC, v9cVar);
                    zzeVarC.A0();
                }
                x9cVar.g(zzeVarC);
                xedVar.w();
            } catch (Throwable th) {
                x9cVar.g(zzeVarC);
                throw th;
            }
        } finally {
            xedVar.s();
        }
    }
}
