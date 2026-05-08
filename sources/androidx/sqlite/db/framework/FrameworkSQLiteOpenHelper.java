package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import defpackage.aob;
import defpackage.at5;
import defpackage.d2f;
import defpackage.l;
import defpackage.sze;
import defpackage.t40;
import defpackage.tze;
import defpackage.zh;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper implements tze {
    public boolean V;
    public final Context a;
    public final String b;
    public final tze.a c;
    public final boolean d;
    public final boolean e;
    public final d2f f;

    public static final class OpenHelper extends SQLiteOpenHelper {
        public static final /* synthetic */ int W = 0;
        public boolean V;
        public final Context a;
        public final a b;
        public final tze.a c;
        public final boolean d;
        public boolean e;
        public final aob f;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$a;", "callbackName", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$a;", "a", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$a;", "", "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class CallbackException extends RuntimeException {
            private final a callbackName;
            private final Throwable cause;

            public CallbackException(a aVar, Throwable th) {
                super(th);
                this.callbackName = aVar;
                this.cause = th;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final a getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.cause;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a a;
            public static final a b;
            public static final a c;
            public static final a d;
            public static final a e;
            public static final /* synthetic */ a[] f;

            static {
                a aVar = new a("ON_CONFIGURE", 0);
                a = aVar;
                a aVar2 = new a("ON_CREATE", 1);
                b = aVar2;
                a aVar3 = new a("ON_UPGRADE", 2);
                c = aVar3;
                a aVar4 = new a("ON_DOWNGRADE", 3);
                d = aVar4;
                a aVar5 = new a("ON_OPEN", 4);
                e = aVar5;
                f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, final a aVar, final tze.a aVar2, boolean z) {
            super(context, str, null, aVar2.a, new DatabaseErrorHandler() { // from class: bt5
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    int i = FrameworkSQLiteOpenHelper.OpenHelper.W;
                    sQLiteDatabase.getClass();
                    FrameworkSQLiteOpenHelper.a aVar3 = aVar;
                    at5 at5Var = aVar3.a;
                    if (at5Var == null || !at5Var.a.equals(sQLiteDatabase)) {
                        at5Var = new at5(sQLiteDatabase);
                        aVar3.a = at5Var;
                    }
                    SQLiteDatabase sQLiteDatabase2 = at5Var.a;
                    aVar2.getClass();
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + at5Var + ".path");
                    if (!sQLiteDatabase2.isOpen()) {
                        String path = sQLiteDatabase2.getPath();
                        if (path != null) {
                            tze.a.a(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> attachedDbs = null;
                    try {
                        try {
                            attachedDbs = sQLiteDatabase2.getAttachedDbs();
                        } finally {
                            if (attachedDbs != null) {
                                Iterator<T> it = attachedDbs.iterator();
                                while (it.hasNext()) {
                                    Object obj = ((Pair) it.next()).second;
                                    obj.getClass();
                                    tze.a.a((String) obj);
                                }
                            } else {
                                String path2 = sQLiteDatabase2.getPath();
                                if (path2 != null) {
                                    tze.a.a(path2);
                                }
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        at5Var.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                }
            });
            context.getClass();
            aVar2.getClass();
            this.a = context;
            this.b = aVar;
            this.c = aVar2;
            this.d = z;
            this.f = new aob(str == null ? t40.h() : str, context.getCacheDir(), false);
        }

        public final sze a(boolean z) {
            aob aobVar = this.f;
            try {
                aobVar.a((this.V || getDatabaseName() == null) ? false : true);
                this.e = false;
                SQLiteDatabase sQLiteDatabaseP = p(z);
                if (!this.e) {
                    at5 at5VarH = h(sQLiteDatabaseP);
                    aobVar.b();
                    return at5VarH;
                }
                close();
                sze szeVarA = a(z);
                aobVar.b();
                return szeVarA;
            } catch (Throwable th) {
                aobVar.b();
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            aob aobVar = this.f;
            try {
                aobVar.a(aobVar.a);
                super.close();
                this.b.a = null;
                this.V = false;
            } finally {
                aobVar.b();
            }
        }

        public final at5 h(SQLiteDatabase sQLiteDatabase) {
            a aVar = this.b;
            aVar.getClass();
            at5 at5Var = aVar.a;
            if (at5Var != null && at5Var.a.equals(sQLiteDatabase)) {
                return at5Var;
            }
            at5 at5Var2 = new at5(sQLiteDatabase);
            aVar.a = at5Var2;
            return at5Var2;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            boolean z = this.e;
            tze.a aVar = this.c;
            if (!z && aVar.a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                aVar.b(h(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(a.a, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            try {
                this.c.c(h(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(a.b, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.getClass();
            this.e = true;
            try {
                this.c.d(h(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(a.d, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            if (!this.e) {
                try {
                    this.c.e(h(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new CallbackException(a.e, th);
                }
            }
            this.V = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.getClass();
            this.e = true;
            try {
                this.c.f(h(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(a.c, th);
            }
        }

        public final SQLiteDatabase p(boolean z) throws Throwable {
            SQLiteDatabase readableDatabase;
            SQLiteDatabase readableDatabase2;
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.V;
            Context context = this.a;
            if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                if (z) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    writableDatabase.getClass();
                    return writableDatabase;
                }
                SQLiteDatabase readableDatabase3 = getReadableDatabase();
                readableDatabase3.getClass();
                return readableDatabase3;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    if (z) {
                        readableDatabase2 = getWritableDatabase();
                        readableDatabase2.getClass();
                    } else {
                        readableDatabase2 = getReadableDatabase();
                        readableDatabase2.getClass();
                    }
                    return readableDatabase2;
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = (CallbackException) th;
                        Throwable cause = callbackException.getCause();
                        int iOrdinal = callbackException.getCallbackName().ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                            throw cause;
                        }
                        if (iOrdinal != 4) {
                            l.g();
                            return null;
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                        th = cause;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        if (z) {
                            readableDatabase = getWritableDatabase();
                            readableDatabase.getClass();
                        } else {
                            readableDatabase = getReadableDatabase();
                            readableDatabase.getClass();
                        }
                        return readableDatabase;
                    } catch (CallbackException e) {
                        throw e.getCause();
                    }
                }
            }
        }
    }

    public static final class a {
        public at5 a = null;
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, tze.a aVar, boolean z, boolean z2) {
        context.getClass();
        aVar.getClass();
        this.a = context;
        this.b = str;
        this.c = aVar;
        this.d = z;
        this.e = z2;
        this.f = new d2f(new zh(this, 7));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d2f d2fVar = this.f;
        if (d2fVar.a()) {
            ((OpenHelper) d2fVar.getValue()).close();
        }
    }

    @Override // defpackage.tze
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.tze
    public final sze getWritableDatabase() {
        return ((OpenHelper) this.f.getValue()).a(true);
    }

    @Override // defpackage.tze
    public final void setWriteAheadLoggingEnabled(boolean z) {
        d2f d2fVar = this.f;
        if (d2fVar.a()) {
            ((OpenHelper) d2fVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.V = z;
    }
}
