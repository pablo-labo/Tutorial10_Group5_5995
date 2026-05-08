package defpackage;

import com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier;
import defpackage.efd;
import defpackage.iy8;
import defpackage.o7d;
import defpackage.xed;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class xa1 {
    public boolean a;
    public boolean b;

    public final class a implements aid {
        public final aid b;
        public final /* synthetic */ ved c;

        public a(ved vedVar, aid aidVar) {
            aidVar.getClass();
            this.c = vedVar;
            this.b = aidVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #6 {all -> 0x009e, blocks: (B:20:0x0046, B:22:0x004a, B:25:0x0059, B:29:0x0060, B:31:0x006a, B:33:0x0075, B:32:0x0070, B:27:0x005d, B:28:0x005f, B:45:0x0096, B:46:0x009d, B:24:0x0054), top: B:69:0x0046, outer: #1, inners: #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0096 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #6 {all -> 0x009e, blocks: (B:20:0x0046, B:22:0x004a, B:25:0x0059, B:29:0x0060, B:31:0x006a, B:33:0x0075, B:32:0x0070, B:27:0x005d, B:28:0x005f, B:45:0x0096, B:46:0x009d, B:24:0x0054), top: B:69:0x0046, outer: #1, inners: #3 }] */
        @Override // defpackage.aid
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.zhd a(java.lang.String r8) {
            /*
                Method dump skipped, instruction units count: 214
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: xa1.a.a(java.lang.String):zhd");
        }
    }

    public static final void a(ved vedVar, zhd zhdVar) throws Throwable {
        Object aVar;
        efd efdVar = vedVar.d;
        xed.d dVar = vedVar.c.g;
        xed.d dVar2 = xed.d.c;
        if (dVar == dVar2) {
            zkd.y(zhdVar, "PRAGMA journal_mode = WAL");
        } else {
            zkd.y(zhdVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (vedVar.d().g == dVar2) {
            zkd.y(zhdVar, "PRAGMA synchronous = NORMAL");
        } else {
            zkd.y(zhdVar, "PRAGMA synchronous = FULL");
        }
        b(zhdVar);
        iid iidVarQ1 = zhdVar.Q1("PRAGMA user_version");
        try {
            iidVarQ1.M1();
            int i = (int) iidVarQ1.getLong(0);
            pi3.d(iidVarQ1, null);
            if (i != efdVar.a) {
                zkd.y(zhdVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        vedVar.f(zhdVar);
                    } else {
                        vedVar.g(zhdVar, i, efdVar.a);
                    }
                    zkd.y(zhdVar, "PRAGMA user_version = " + efdVar.a);
                    aVar = j6g.a;
                } catch (Throwable th) {
                    aVar = new o7d.a(th);
                }
                if (!(aVar instanceof o7d.a)) {
                    zkd.y(zhdVar, "END TRANSACTION");
                }
                Throwable thA = o7d.a(aVar);
                if (thA != null) {
                    zkd.y(zhdVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            vedVar.h(zhdVar);
        } finally {
        }
    }

    public static void b(zhd zhdVar) {
        iid iidVarQ1 = zhdVar.Q1("PRAGMA busy_timeout");
        try {
            iidVarQ1.M1();
            long j = iidVarQ1.getLong(0);
            pi3.d(iidVarQ1, null);
            if (j < TimeBasedInteractionIdentifier.DEFAULT_TIME_THRESHOLD_MS) {
                zkd.y(zhdVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                pi3.d(iidVarQ1, th);
                throw th2;
            }
        }
    }

    public abstract List<xed.b> c();

    public abstract qf3 d();

    public abstract efd e();

    public final void f(zhd zhdVar) {
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (iidVarQ1.M1()) {
                if (iidVarQ1.getLong(0) == 0) {
                    z = true;
                }
            }
            pi3.d(iidVarQ1, null);
            e().a(zhdVar);
            if (!z) {
                efd.a aVarG = e().g(zhdVar);
                if (!aVarG.a) {
                    s40.i(aVarG.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            i(zhdVar);
            e().c(zhdVar);
            Iterator<T> it = c().iterator();
            while (it.hasNext()) {
                ((xed.b) it.next()).getClass();
                if (zhdVar instanceof qze) {
                    ((qze) zhdVar).a.getClass();
                }
            }
        } finally {
        }
    }

    public final void g(zhd zhdVar, int i, int i2) {
        zhdVar.getClass();
        List<xs9> listA = ys9.a(d().d, i, i2);
        if (listA != null) {
            e().f(zhdVar);
            for (xs9 xs9Var : listA) {
                xs9Var.getClass();
                if (!(zhdVar instanceof qze)) {
                    throw new ela("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                xs9Var.a(((qze) zhdVar).a);
            }
            efd.a aVarG = e().g(zhdVar);
            if (!aVarG.a) {
                s40.i(aVarG.b, "Migration didn't properly handle: ");
                return;
            } else {
                e().e(zhdVar);
                i(zhdVar);
                return;
            }
        }
        if (ys9.b(d(), i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (d().s) {
            iid iidVarQ1 = zhdVar.Q1("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                iy8 iy8VarS = u63.s();
                while (iidVarQ1.M1()) {
                    String strR1 = iidVarQ1.r1(0);
                    if (!wve.K(strR1, "sqlite_", false) && !strR1.equals("android_metadata")) {
                        iy8VarS.add(new Pair(strR1, Boolean.valueOf(wl7.b(iidVarQ1.r1(1), "view"))));
                    }
                }
                iy8 iy8VarL = iy8VarS.l();
                pi3.d(iidVarQ1, null);
                ListIterator listIterator = iy8VarL.listIterator(0);
                while (true) {
                    iy8.b bVar = (iy8.b) listIterator;
                    if (!bVar.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) bVar.next();
                    String str = (String) pair.a();
                    if (((Boolean) pair.b()).booleanValue()) {
                        zkd.y(zhdVar, "DROP VIEW IF EXISTS " + str);
                    } else {
                        zkd.y(zhdVar, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            e().b(zhdVar);
        }
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            ((xed.b) it.next()).getClass();
            if (zhdVar instanceof qze) {
                ((qze) zhdVar).a.getClass();
            }
        }
        e().a(zhdVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.zhd r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa1.h(zhd):void");
    }

    public final void i(zhd zhdVar) {
        zkd.y(zhdVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        zkd.y(zhdVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + e().b + "')");
    }
}
