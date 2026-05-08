package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import defpackage.xh8;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class cz2 implements xh8 {
    public static final Lazy a = boa.E(qt8.a, new b(new cz2()));

    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public a(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return z3.n(u40.f("DbCookie(host=", this.a, ", path=", this.b, ", name="), this.c, ", value=", this.d, ")");
        }
    }

    public static final class b extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(cz2 cz2Var) {
            super(0);
            this.$this_inject = cz2Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    public static ArrayList a(SQLiteDatabase sQLiteDatabase) throws IOException {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("cookies", new String[]{"host_key", "path", "name", "value"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                String string = null;
                String string2 = cursorQuery.isNull(0) ? null : cursorQuery.getString(0);
                String str = "";
                if (string2 == null) {
                    string2 = "";
                }
                String string3 = cursorQuery.isNull(1) ? null : cursorQuery.getString(1);
                if (string3 == null) {
                    string3 = "";
                }
                String string4 = cursorQuery.isNull(2) ? null : cursorQuery.getString(2);
                if (string4 == null) {
                    string4 = "";
                }
                if (!cursorQuery.isNull(3)) {
                    string = cursorQuery.getString(3);
                }
                if (string != null) {
                    str = string;
                }
                arrayList.add(new a(string2, string3, string4, str));
            } finally {
            }
        }
        j6g j6gVar = j6g.a;
        cursorQuery.close();
        return arrayList;
    }

    public static List b() throws IOException {
        SQLiteDatabase sQLiteDatabaseOpenDatabase;
        Lazy lazy = a;
        try {
            sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(new File(((Context) lazy.getValue()).getDataDir(), "app_webview/Cookies").getAbsolutePath(), null, 1);
        } catch (Throwable unused) {
            sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(new File(((Context) lazy.getValue()).getDataDir(), "app_webview/Default/Cookies").getAbsolutePath(), null, 1);
        }
        try {
            ArrayList arrayListA = a(sQLiteDatabaseOpenDatabase);
            sQLiteDatabaseOpenDatabase.close();
            return z92.p1(arrayListA, ak2.h(new hs(5), new iq0(4)));
        } finally {
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
