package com.datadog.android.trace.sqlite;

import android.database.sqlite.SQLiteDatabase;
import com.datadog.android.trace.SpanExtKt;
import defpackage.doe;
import defpackage.qka;
import defpackage.vka;
import io.opentracing.util.GlobalTracer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"T", "Landroid/database/sqlite/SQLiteDatabase;", "", "operationName", "", "exclusive", "Lkotlin/Function2;", "Ldoe;", "body", "transactionTraced", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "dd-sdk-android-trace_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class SqliteDatabaseExtKt {
    public static final <T> T transactionTraced(SQLiteDatabase sQLiteDatabase, String str, boolean z, Function2<? super doe, ? super SQLiteDatabase, ? extends T> function2) {
        sQLiteDatabase.getClass();
        str.getClass();
        function2.getClass();
        GlobalTracer globalTracer = GlobalTracer.a;
        globalTracer.activeSpan();
        globalTracer.buildSpan(str);
        vka vkaVar = qka.a;
        GlobalTracer.b.getClass();
        try {
            if (z) {
                sQLiteDatabase.beginTransaction();
            } else {
                sQLiteDatabase.beginTransactionNonExclusive();
            }
            try {
                T tInvoke = function2.invoke(vkaVar, sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
                return tInvoke;
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } catch (Throwable th) {
            SpanExtKt.setError(vkaVar, th);
            throw th;
        }
    }

    public static Object transactionTraced$default(SQLiteDatabase sQLiteDatabase, String str, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        sQLiteDatabase.getClass();
        str.getClass();
        function2.getClass();
        GlobalTracer globalTracer = GlobalTracer.a;
        globalTracer.activeSpan();
        globalTracer.buildSpan(str);
        vka vkaVar = qka.a;
        GlobalTracer.b.getClass();
        try {
            if (z) {
                sQLiteDatabase.beginTransaction();
            } else {
                sQLiteDatabase.beginTransactionNonExclusive();
            }
            try {
                Object objInvoke = function2.invoke(vkaVar, sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
                return objInvoke;
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } catch (Throwable th) {
            SpanExtKt.setError(vkaVar, th);
            throw th;
        }
    }
}
