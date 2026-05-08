package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import defpackage.ckc;
import defpackage.ie7;
import defpackage.j7e;
import defpackage.nmc;
import defpackage.s55;
import defpackage.sv0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = "RNCAsyncStorage")
public final class AsyncStorageModule extends NativeAsyncStorageModuleSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNCAsyncStorage";
    private final j7e executor;
    private ckc mReactDatabaseSupplier;
    private boolean mShuttingDown;

    public class a extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback a;
        public final /* synthetic */ ReadableArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ReactApplicationContext reactApplicationContext, Callback callback, ReadableArray readableArray) {
            super(reactApplicationContext);
            this.a = callback;
            this.b = readableArray;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final void doInBackgroundGuarded(Void[] voidArr) {
            AsyncStorageModule asyncStorageModule = AsyncStorageModule.this;
            boolean zEnsureDatabase = asyncStorageModule.ensureDatabase();
            Callback callback = this.a;
            if (!zEnsureDatabase) {
                callback.invoke(ie7.n("Database Error"), null);
                return;
            }
            String[] strArr = {"key", "value"};
            HashSet<String> hashSet = new HashSet();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            int i = 0;
            while (true) {
                ReadableArray readableArray = this.b;
                if (i >= readableArray.size()) {
                    callback.invoke(null, writableArrayCreateArray);
                    return;
                }
                int iMin = Math.min(readableArray.size() - i, AsyncStorageModule.MAX_SQL_KEYS);
                SQLiteDatabase sQLiteDatabaseP = asyncStorageModule.mReactDatabaseSupplier.p();
                String strA = sv0.a(iMin);
                String[] strArr2 = new String[iMin];
                for (int i2 = 0; i2 < iMin; i2++) {
                    strArr2[i2] = readableArray.getString(i + i2);
                }
                ReadableArray readableArray2 = readableArray;
                Cursor cursorQuery = sQLiteDatabaseP.query("catalystLocalStorage", strArr, strA, strArr2, null, null, null);
                hashSet.clear();
                try {
                    try {
                        if (cursorQuery.getCount() != readableArray2.size()) {
                            int i3 = i;
                            while (i3 < i + iMin) {
                                ReadableArray readableArray3 = readableArray2;
                                hashSet.add(readableArray3.getString(i3));
                                i3++;
                                readableArray2 = readableArray3;
                            }
                        }
                        if (cursorQuery.moveToFirst()) {
                            do {
                                WritableArray writableArrayCreateArray2 = Arguments.createArray();
                                writableArrayCreateArray2.pushString(cursorQuery.getString(0));
                                writableArrayCreateArray2.pushString(cursorQuery.getString(1));
                                writableArrayCreateArray.pushArray(writableArrayCreateArray2);
                                hashSet.remove(cursorQuery.getString(0));
                            } while (cursorQuery.moveToNext());
                        }
                        cursorQuery.close();
                        for (String str : hashSet) {
                            WritableArray writableArrayCreateArray3 = Arguments.createArray();
                            writableArrayCreateArray3.pushString(str);
                            writableArrayCreateArray3.pushNull();
                            writableArrayCreateArray.pushArray(writableArrayCreateArray3);
                        }
                        hashSet.clear();
                        i += AsyncStorageModule.MAX_SQL_KEYS;
                    } catch (Exception e) {
                        s55.o("ReactNative", e.getMessage(), e);
                        callback.invoke(ie7.n(e.getMessage()), null);
                        cursorQuery.close();
                        return;
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
        }
    }

    public class b extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback a;
        public final /* synthetic */ ReadableArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ReactApplicationContext reactApplicationContext, Callback callback, ReadableArray readableArray) {
            super(reactApplicationContext);
            this.a = callback;
            this.b = readableArray;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final void doInBackgroundGuarded(Void[] voidArr) {
            WritableMap writableMapN;
            SQLiteDatabase sQLiteDatabaseP;
            ReadableArray readableArray = this.b;
            AsyncStorageModule asyncStorageModule = AsyncStorageModule.this;
            boolean zEnsureDatabase = asyncStorageModule.ensureDatabase();
            Callback callback = this.a;
            if (!zEnsureDatabase) {
                callback.invoke(ie7.n("Database Error"));
                return;
            }
            SQLiteStatement sQLiteStatementCompileStatement = asyncStorageModule.mReactDatabaseSupplier.p().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                try {
                    asyncStorageModule.mReactDatabaseSupplier.p().beginTransaction();
                    for (int i = 0; i < readableArray.size(); i++) {
                        try {
                            if (readableArray.getArray(i).size() != 2) {
                                ie7.n("Invalid Value");
                                sQLiteDatabaseP = asyncStorageModule.mReactDatabaseSupplier.p();
                            } else if (readableArray.getArray(i).getString(0) == null) {
                                ie7.n("Invalid key");
                                sQLiteDatabaseP = asyncStorageModule.mReactDatabaseSupplier.p();
                            } else if (readableArray.getArray(i).getString(1) == null) {
                                ie7.n("Invalid Value");
                                sQLiteDatabaseP = asyncStorageModule.mReactDatabaseSupplier.p();
                            } else {
                                sQLiteStatementCompileStatement.clearBindings();
                                sQLiteStatementCompileStatement.bindString(1, readableArray.getArray(i).getString(0));
                                sQLiteStatementCompileStatement.bindString(2, readableArray.getArray(i).getString(1));
                                sQLiteStatementCompileStatement.execute();
                            }
                            sQLiteDatabaseP.endTransaction();
                            return;
                        } catch (Exception e) {
                            s55.o("ReactNative", e.getMessage(), e);
                            return;
                        }
                    }
                    asyncStorageModule.mReactDatabaseSupplier.p().setTransactionSuccessful();
                    try {
                        writableMapN = null;
                    } catch (Exception e2) {
                    }
                } catch (Exception e3) {
                    s55.o("ReactNative", e3.getMessage(), e3);
                    writableMapN = ie7.n(e3.getMessage());
                    try {
                        asyncStorageModule.mReactDatabaseSupplier.p().endTransaction();
                    } catch (Exception e4) {
                        s55.o("ReactNative", e4.getMessage(), e4);
                    }
                }
                if (writableMapN != null) {
                    callback.invoke(writableMapN);
                } else {
                    callback.invoke(new Object[0]);
                }
            } finally {
                try {
                    asyncStorageModule.mReactDatabaseSupplier.p().endTransaction();
                } catch (Exception e22) {
                    s55.o("ReactNative", e22.getMessage(), e22);
                    ie7.n(e22.getMessage());
                }
            }
        }
    }

    public class c extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback a;
        public final /* synthetic */ ReadableArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ReactApplicationContext reactApplicationContext, Callback callback, ReadableArray readableArray) {
            super(reactApplicationContext);
            this.a = callback;
            this.b = readableArray;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final void doInBackgroundGuarded(Void[] voidArr) {
            WritableMap writableMapN;
            ReadableArray readableArray = this.b;
            AsyncStorageModule asyncStorageModule = AsyncStorageModule.this;
            boolean zEnsureDatabase = asyncStorageModule.ensureDatabase();
            Callback callback = this.a;
            if (!zEnsureDatabase) {
                callback.invoke(ie7.n("Database Error"));
                return;
            }
            try {
                try {
                    asyncStorageModule.mReactDatabaseSupplier.p().beginTransaction();
                    for (int i = 0; i < readableArray.size(); i += AsyncStorageModule.MAX_SQL_KEYS) {
                        int iMin = Math.min(readableArray.size() - i, AsyncStorageModule.MAX_SQL_KEYS);
                        SQLiteDatabase sQLiteDatabaseP = asyncStorageModule.mReactDatabaseSupplier.p();
                        String strA = sv0.a(iMin);
                        String[] strArr = new String[iMin];
                        for (int i2 = 0; i2 < iMin; i2++) {
                            strArr[i2] = readableArray.getString(i + i2);
                        }
                        sQLiteDatabaseP.delete("catalystLocalStorage", strA, strArr);
                    }
                    asyncStorageModule.mReactDatabaseSupplier.p().setTransactionSuccessful();
                    try {
                        asyncStorageModule.mReactDatabaseSupplier.p().endTransaction();
                        writableMapN = null;
                    } catch (Exception e) {
                        s55.o("ReactNative", e.getMessage(), e);
                        writableMapN = ie7.n(e.getMessage());
                    }
                } catch (Exception e2) {
                    s55.o("ReactNative", e2.getMessage(), e2);
                    writableMapN = ie7.n(e2.getMessage());
                    try {
                        asyncStorageModule.mReactDatabaseSupplier.p().endTransaction();
                    } catch (Exception e3) {
                        s55.o("ReactNative", e3.getMessage(), e3);
                    }
                }
                if (writableMapN != null) {
                    callback.invoke(writableMapN);
                } else {
                    callback.invoke(new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    asyncStorageModule.mReactDatabaseSupplier.p().endTransaction();
                } catch (Exception e4) {
                    s55.o("ReactNative", e4.getMessage(), e4);
                    ie7.n(e4.getMessage());
                }
                throw th;
            }
        }
    }

    public class d extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback a;
        public final /* synthetic */ ReadableArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ReactApplicationContext reactApplicationContext, Callback callback, ReadableArray readableArray) {
            super(reactApplicationContext);
            this.a = callback;
            this.b = readableArray;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final void doInBackgroundGuarded(Void[] voidArr) {
            WritableMap writableMapN;
            SQLiteDatabase sQLiteDatabaseP;
            ReadableArray readableArray = this.b;
            AsyncStorageModule asyncStorageModule = AsyncStorageModule.this;
            boolean zEnsureDatabase = asyncStorageModule.ensureDatabase();
            Callback callback = this.a;
            if (!zEnsureDatabase) {
                callback.invoke(ie7.n("Database Error"));
                return;
            }
            try {
                try {
                    asyncStorageModule.mReactDatabaseSupplier.p().beginTransaction();
                    for (int i = 0; i < readableArray.size(); i++) {
                        try {
                            if (readableArray.getArray(i).size() != 2) {
                                ie7.n("Invalid Value");
                                sQLiteDatabaseP = asyncStorageModule.mReactDatabaseSupplier.p();
                            } else if (readableArray.getArray(i).getString(0) == null) {
                                ie7.n("Invalid key");
                                sQLiteDatabaseP = asyncStorageModule.mReactDatabaseSupplier.p();
                            } else if (readableArray.getArray(i).getString(1) == null) {
                                ie7.n("Invalid Value");
                                sQLiteDatabaseP = asyncStorageModule.mReactDatabaseSupplier.p();
                            } else if (!sv0.c(asyncStorageModule.mReactDatabaseSupplier.p(), readableArray.getArray(i).getString(0), readableArray.getArray(i).getString(1))) {
                                ie7.n("Database Error");
                                sQLiteDatabaseP = asyncStorageModule.mReactDatabaseSupplier.p();
                            }
                            sQLiteDatabaseP.endTransaction();
                            return;
                        } catch (Exception e) {
                            s55.o("ReactNative", e.getMessage(), e);
                            return;
                        }
                    }
                    asyncStorageModule.mReactDatabaseSupplier.p().setTransactionSuccessful();
                    try {
                        writableMapN = null;
                    } catch (Exception e2) {
                    }
                } catch (Exception e3) {
                    s55.o("ReactNative", e3.getMessage(), e3);
                    writableMapN = ie7.n(e3.getMessage());
                    try {
                        asyncStorageModule.mReactDatabaseSupplier.p().endTransaction();
                    } catch (Exception e4) {
                        s55.o("ReactNative", e4.getMessage(), e4);
                    }
                }
                if (writableMapN != null) {
                    callback.invoke(writableMapN);
                } else {
                    callback.invoke(new Object[0]);
                }
            } finally {
                try {
                    asyncStorageModule.mReactDatabaseSupplier.p().endTransaction();
                } catch (Exception e22) {
                    s55.o("ReactNative", e22.getMessage(), e22);
                    ie7.n(e22.getMessage());
                }
            }
        }
    }

    public class e extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ReactApplicationContext reactApplicationContext, Callback callback) {
            super(reactApplicationContext);
            this.a = callback;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final void doInBackgroundGuarded(Void[] voidArr) {
            AsyncStorageModule.this.mReactDatabaseSupplier.h();
            try {
                ckc ckcVar = AsyncStorageModule.this.mReactDatabaseSupplier;
                synchronized (ckcVar) {
                    ckcVar.p().delete("catalystLocalStorage", null, null);
                }
                this.a.invoke(new Object[0]);
            } catch (Exception e) {
                s55.o("ReactNative", e.getMessage(), e);
                this.a.invoke(ie7.n(e.getMessage()));
            }
        }
    }

    public class f extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ Callback a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ReactApplicationContext reactApplicationContext, Callback callback) {
            super(reactApplicationContext);
            this.a = callback;
        }

        /* JADX WARN: Finally extract failed */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final void doInBackgroundGuarded(Void[] voidArr) {
            AsyncStorageModule asyncStorageModule = AsyncStorageModule.this;
            boolean zEnsureDatabase = asyncStorageModule.ensureDatabase();
            Callback callback = this.a;
            if (!zEnsureDatabase) {
                callback.invoke(ie7.n("Database Error"), null);
                return;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Cursor cursorQuery = asyncStorageModule.mReactDatabaseSupplier.p().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            writableArrayCreateArray.pushString(cursorQuery.getString(0));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                    callback.invoke(null, writableArrayCreateArray);
                } catch (Exception e) {
                    s55.o("ReactNative", e.getMessage(), e);
                    callback.invoke(ie7.n(e.getMessage()), null);
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) throws Throwable {
        File file;
        long millis;
        FileChannel channel;
        FileChannel channel2;
        super(reactApplicationContext);
        this.mShuttingDown = false;
        if (!reactApplicationContext.getDatabasePath("RKStorage").exists()) {
            ArrayList<File> arrayList = new ArrayList();
            try {
                File[] fileArrListFiles = reactApplicationContext.getDatabasePath("noop").getParentFile().listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.getName().startsWith("RKStorage-scoped-experience-") && !file2.getName().endsWith("-journal")) {
                            arrayList.add(file2);
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (arrayList.size() == 0) {
                file = null;
            } else {
                file = null;
                long j = -1;
                for (File file3 : arrayList) {
                    try {
                        millis = Files.readAttributes(file3.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
                    } catch (Exception unused) {
                        millis = -1;
                    }
                    if (millis > j) {
                        j = millis;
                        file = file3;
                    }
                }
                if (file == null) {
                    file = (File) arrayList.get(0);
                }
            }
            if (file == null) {
                Log.v("AsyncStorageExpoMigration", "No scoped database found");
            } else {
                try {
                    if (ckc.d == null) {
                        Context applicationContext = reactApplicationContext.getApplicationContext();
                        ckc ckcVar = new ckc(applicationContext, "RKStorage", null, 1);
                        ckcVar.c = 6291456L;
                        ckcVar.a = applicationContext;
                        ckc.d = ckcVar;
                    }
                    ckc.d.p();
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileOutputStream fileOutputStream = new FileOutputStream(reactApplicationContext.getDatabasePath("RKStorage"));
                    try {
                        channel = fileInputStream.getChannel();
                        try {
                            channel2 = fileOutputStream.getChannel();
                        } catch (Throwable th) {
                            th = th;
                            channel2 = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        channel = null;
                        channel2 = null;
                    }
                    try {
                        channel.transferTo(0L, channel.size(), channel2);
                        try {
                            channel.close();
                            if (channel2 != null) {
                                channel2.close();
                            }
                            Log.v("AsyncStorageExpoMigration", "Migrated most recently modified database " + file.getName() + " to RKStorage");
                            try {
                                for (File file4 : arrayList) {
                                    if (file4.delete()) {
                                        Log.v("AsyncStorageExpoMigration", "Deleted scoped database " + file4.getName());
                                    } else {
                                        Log.v("AsyncStorageExpoMigration", "Failed to delete scoped database " + file4.getName());
                                    }
                                }
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                            Log.v("AsyncStorageExpoMigration", "Completed the scoped AsyncStorage migration");
                        } finally {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (channel != null) {
                            try {
                                channel.close();
                            } finally {
                            }
                        }
                        if (channel2 != null) {
                            channel2.close();
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    Log.v("AsyncStorageExpoMigration", "Failed to migrate scoped database " + file.getName());
                    e4.printStackTrace();
                }
            }
        }
        this.executor = new j7e(executor);
        if (ckc.d == null) {
            Context applicationContext2 = reactApplicationContext.getApplicationContext();
            ckc ckcVar2 = new ckc(applicationContext2, "RKStorage", null, 1);
            ckcVar2.c = 6291456L;
            ckcVar2.a = applicationContext2;
            ckc.d = ckcVar2;
        }
        this.mReactDatabaseSupplier = ckc.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        if (this.mShuttingDown) {
            return false;
        }
        this.mReactDatabaseSupplier.h();
        return true;
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCAsyncStorage";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
        this.mReactDatabaseSupplier.a();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(ie7.n("Invalid key"), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }
}
