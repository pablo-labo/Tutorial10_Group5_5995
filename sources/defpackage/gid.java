package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gid implements p05 {
    public final ArrayList a;
    public SQLiteDatabase b;
    public r05 c;
    public final String[] d;

    public gid(Context context) {
        context.getClass();
        this.a = new ArrayList();
        this.d = new String[]{"id", "eventData", "dateCreated"};
        o15.b(new jpa(1, this, context));
    }

    @Override // defpackage.p05
    public final List<lq4> a(int i) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        Cursor cursorQuery;
        HashMap map;
        if (!e()) {
            return zr4.a;
        }
        g();
        ArrayList arrayList = new ArrayList();
        String strC = p6.c(i, "id DESC LIMIT ");
        ArrayList<Map> arrayList2 = new ArrayList();
        Cursor cursor = null;
        if (e() && (sQLiteDatabase = this.b) != null) {
            try {
                cursorQuery = sQLiteDatabase.query("events", this.d, null, null, null, null, strC);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                cursorQuery.moveToFirst();
                while (!cursorQuery.isAfterLast()) {
                    HashMap map2 = new HashMap();
                    map2.put("id", Long.valueOf(cursorQuery.getLong(0)));
                    byte[] blob = cursorQuery.getBlob(1);
                    blob.getClass();
                    yjg yjgVar = yjg.a;
                    try {
                        try {
                            try {
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                                Object object = objectInputStream.readObject();
                                map = object instanceof HashMap ? (HashMap) object : null;
                                objectInputStream.close();
                                byteArrayInputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                                map = null;
                                map2.put("eventData", map);
                                map2.put("dateCreated", cursorQuery.getString(2));
                                cursorQuery.moveToNext();
                                arrayList2.add(map2);
                            }
                        } catch (NullPointerException e2) {
                            e2.printStackTrace();
                            map = null;
                            map2.put("eventData", map);
                            map2.put("dateCreated", cursorQuery.getString(2));
                            cursorQuery.moveToNext();
                            arrayList2.add(map2);
                        }
                    } catch (ClassNotFoundException e3) {
                        e3.printStackTrace();
                        map = null;
                        map2.put("eventData", map);
                        map2.put("dateCreated", cursorQuery.getString(2));
                        cursorQuery.moveToNext();
                        arrayList2.add(map2);
                    }
                    map2.put("eventData", map);
                    map2.put("dateCreated", cursorQuery.getString(2));
                    cursorQuery.moveToNext();
                    arrayList2.add(map2);
                }
                cursorQuery.close();
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorQuery;
                if (cursor == null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        }
        for (Map map3 : arrayList2) {
            rqf rqfVar = new rqf();
            Object obj = map3.get("eventData");
            Map<String, ? extends Object> map4 = obj instanceof Map ? (Map) obj : null;
            if (map4 != null) {
                rqfVar.e(map4);
            }
            Object obj2 = map3.get("id");
            Long l = obj2 instanceof Long ? (Long) obj2 : null;
            if (l == null) {
                c49.b("gid", "Unable to get ID of an event extracted from the database.", new Object[0]);
            } else {
                arrayList.add(new lq4(rqfVar, l.longValue()));
            }
        }
        return arrayList;
    }

    @Override // defpackage.p05
    public final void b(long j, long j2) {
        if (e()) {
            g();
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase != null) {
                StringBuilder sb = new StringBuilder("\n                DELETE FROM events\n                WHERE id NOT IN (\n                    SELECT id\n                    FROM events\n                    WHERE dateCreated >= datetime('now','-");
                int i = wd4.d;
                sb.append(wd4.p(j2, be4.SECONDS));
                sb.append(" seconds')\n                    ORDER BY dateCreated DESC, id DESC\n                    LIMIT ");
                sb.append(j);
                sb.append("\n                )\n                ");
                sQLiteDatabase.execSQL(sve.w(sb.toString()));
            }
        }
    }

    @Override // defpackage.p05
    public final void c(rqf rqfVar) {
        if (e()) {
            g();
            f(rqfVar);
        } else {
            synchronized (this) {
                this.a.add(rqfVar);
            }
        }
    }

    @Override // defpackage.p05
    public final boolean d(ArrayList arrayList) {
        SQLiteDatabase sQLiteDatabase;
        if (!arrayList.isEmpty()) {
            int iDelete = -1;
            if (e() && (sQLiteDatabase = this.b) != null) {
                StringBuilder sb = new StringBuilder("id in (");
                yjg yjgVar = yjg.a;
                StringBuilder sb2 = new StringBuilder();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Long) arrayList.get(i)) != null) {
                        sb2.append(arrayList.get(i));
                        if (i < arrayList.size() - 1) {
                            sb2.append(",");
                        }
                    }
                }
                if (wve.D(sb2.toString(), ",", false)) {
                    sb2 = new StringBuilder(sb2.substring(0, sb2.length() - 1));
                }
                sb.append(sb2.toString());
                sb.append(')');
                iDelete = sQLiteDatabase.delete("events", sb.toString(), null);
            }
            c49.a("gid", "Removed events from database: %s", Integer.valueOf(iDelete));
            if (iDelete == arrayList.size()) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase != null ? sQLiteDatabase.isOpen() : false) {
                return true;
            }
        }
        return false;
    }

    public final void f(y6b y6bVar) {
        SQLiteDatabase sQLiteDatabase;
        byte[] byteArray;
        y6bVar.getClass();
        if (!e() || (sQLiteDatabase = this.b) == null) {
            return;
        }
        HashMap mapA = y6bVar.a();
        yjg yjgVar = yjg.a;
        mapA.getClass();
        HashMap map = new HashMap();
        for (Map.Entry entry : mapA.entrySet()) {
            map.put((String) entry.getKey(), entry.getValue().toString());
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            byteArrayOutputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            byteArray = null;
        }
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("eventData", byteArray);
        c49.a("gid", "Added event to database: %s", Long.valueOf(sQLiteDatabase.insert("events", null, contentValues)));
    }

    public final void g() {
        if (!e() || this.a.size() <= 0) {
            return;
        }
        synchronized (this) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    f((y6b) it.next());
                }
                this.a.clear();
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p05
    public final long size() {
        if (!e()) {
            return this.a.size();
        }
        g();
        return DatabaseUtils.queryNumEntries(this.b, "events");
    }
}
