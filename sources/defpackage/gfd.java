package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import defpackage.iy8;
import defpackage.tze;
import defpackage.xed;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@sy3
public final class gfd extends tze.a {
    public qf3 b;
    public final List<xed.b> c;
    public final a d;
    public final String e;
    public final String f;

    @sy3
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public abstract void a(at5 at5Var);

        public abstract void b(at5 at5Var);

        public abstract void c();

        public abstract void d(at5 at5Var);

        public abstract void e(at5 at5Var);

        public abstract b f(at5 at5Var);
    }

    @sy3
    public static class b {
        public final boolean a;
        public final String b;

        public b(String str, boolean z) {
            this.a = z;
            this.b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfd(qf3 qf3Var, a aVar, String str, String str2) {
        super(aVar.a);
        qf3Var.getClass();
        this.c = qf3Var.e;
        this.b = qf3Var;
        this.d = aVar;
        this.e = str;
        this.f = str2;
    }

    @Override // tze.a
    public final void b(at5 at5Var) {
    }

    @Override // tze.a
    public final void c(at5 at5Var) throws IOException {
        Cursor cursorZ = at5Var.z(new hge("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z = false;
            if (cursorZ.moveToFirst()) {
                if (cursorZ.getInt(0) == 0) {
                    z = true;
                }
            }
            cursorZ.close();
            a aVar = this.d;
            aVar.a(at5Var);
            if (!z) {
                b bVarF = aVar.f(at5Var);
                if (!bVarF.a) {
                    o6.k(bVarF.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            SQLiteDatabase sQLiteDatabase = at5Var.a;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.e + "')");
            aVar.c();
            List<xed.b> list = this.c;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((xed.b) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0h.q(cursorZ, th);
                throw th2;
            }
        }
    }

    @Override // tze.a
    public final void d(at5 at5Var, int i, int i2) throws IOException {
        f(at5Var, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // tze.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.at5 r7) throws java.io.IOException {
        /*
            r6 = this;
            hge r0 = new hge
            java.lang.String r1 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            r0.<init>(r1)
            android.database.Cursor r0 = r7.z(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            if (r1 == 0) goto L1d
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1d
            r1 = 1
            goto L1e
        L1a:
            r6 = move-exception
            goto Lb2
        L1d:
            r1 = r2
        L1e:
            r0.close()
            gfd$a r0 = r6.d
            java.lang.String r3 = r6.e
            r4 = 0
            if (r1 == 0) goto L65
            hge r1 = new hge
            java.lang.String r5 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r5)
            android.database.Cursor r1 = r7.z(r1)
            boolean r5 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L40
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r6 = move-exception
            goto L5f
        L40:
            r2 = r4
        L41:
            r1.close()
            boolean r1 = r3.equals(r2)
            if (r1 != 0) goto L8a
            java.lang.String r1 = r6.f
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L53
            goto L8a
        L53:
            java.lang.String r6 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r7 = ", found: "
            java.lang.String r6 = defpackage.t40.l(r6, r3, r7, r2)
            defpackage.r6.g(r6)
            return
        L5f:
            throw r6     // Catch: java.lang.Throwable -> L60
        L60:
            r7 = move-exception
            defpackage.c0h.q(r1, r6)
            throw r7
        L65:
            gfd$b r1 = r0.f(r7)
            boolean r2 = r1.a
            if (r2 == 0) goto Laa
            android.database.sqlite.SQLiteDatabase r1 = r7.a
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r1.execSQL(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '"
            r2.<init>(r5)
            r2.append(r3)
            java.lang.String r3 = "')"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.execSQL(r2)
        L8a:
            r0.d(r7)
            java.util.List<xed$b> r0 = r6.c
            if (r0 == 0) goto La7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L97:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La7
            java.lang.Object r1 = r0.next()
            xed$b r1 = (xed.b) r1
            r1.a(r7)
            goto L97
        La7:
            r6.b = r4
            return
        Laa:
            java.lang.String r6 = "Pre-packaged database has an invalid schema: "
            java.lang.String r7 = r1.b
            defpackage.o6.k(r7, r6)
            return
        Lb2:
            throw r6     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r7 = move-exception
            defpackage.c0h.q(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfd.e(at5):void");
    }

    @Override // tze.a
    public final void f(at5 at5Var, int i, int i2) throws IOException {
        SQLiteDatabase sQLiteDatabase = at5Var.a;
        qf3 qf3Var = this.b;
        a aVar = this.d;
        if (qf3Var != null) {
            xed.e eVar = qf3Var.d;
            eVar.getClass();
            List<xs9> listA = ys9.a(eVar, i, i2);
            if (listA != null) {
                aVar.e(at5Var);
                for (xs9 xs9Var : listA) {
                    xs9Var.getClass();
                    xs9Var.a(at5Var);
                }
                b bVarF = aVar.f(at5Var);
                if (!bVarF.a) {
                    o6.k(bVarF.b, "Migration didn't properly handle: ");
                    return;
                }
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.e + "')");
                return;
            }
        }
        qf3 qf3Var2 = this.b;
        if (qf3Var2 == null || ys9.b(qf3Var2, i, i2)) {
            r6.g(w40.e("A migration from ", i, " to ", i2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            return;
        }
        if (qf3Var2.s) {
            Cursor cursorZ = at5Var.z(new hge("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                iy8 iy8VarS = u63.s();
                while (cursorZ.moveToNext()) {
                    String string = cursorZ.getString(0);
                    string.getClass();
                    if (!wve.K(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        iy8VarS.add(new Pair(string, Boolean.valueOf(wl7.b(cursorZ.getString(1), "view"))));
                    }
                }
                iy8 iy8VarL = iy8VarS.l();
                cursorZ.close();
                ListIterator listIterator = iy8VarL.listIterator(0);
                while (true) {
                    iy8.b bVar = (iy8.b) listIterator;
                    if (!bVar.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) bVar.next();
                    String str = (String) pair.a();
                    if (((Boolean) pair.b()).booleanValue()) {
                        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            aVar.b(at5Var);
        }
        List<xed.b> list = this.c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((xed.b) it.next()).getClass();
            }
        }
        aVar.a(at5Var);
    }
}
