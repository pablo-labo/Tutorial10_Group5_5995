package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public interface tze extends Closeable {

    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public static void a(String str) {
            if (str.equalsIgnoreCase(":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = wl7.c(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        public void b(at5 at5Var) {
        }

        public abstract void c(at5 at5Var);

        public void d(at5 at5Var, int i, int i2) {
            throw new SQLiteException(k20.l("Can't downgrade database from version ", i, i2, " to "));
        }

        public void e(at5 at5Var) {
        }

        public abstract void f(at5 at5Var, int i, int i2);
    }

    public static final class b {
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;
        public final boolean e;

        public b(Context context, String str, a aVar, boolean z, boolean z2) {
            context.getClass();
            aVar.getClass();
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
            this.e = z2;
        }
    }

    public interface c {
        tze c(b bVar);
    }

    String getDatabaseName();

    sze getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
