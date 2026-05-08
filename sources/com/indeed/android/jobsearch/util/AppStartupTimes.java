package com.indeed.android.jobsearch.util;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import defpackage.boa;
import defpackage.cn0;
import defpackage.d2f;
import defpackage.dn0;
import defpackage.fn0;
import defpackage.lz2;
import defpackage.vh8;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class AppStartupTimes implements xh8 {
    public static boolean W;
    public static long c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static final AppStartupTimes a = new AppStartupTimes();
    public static final d2f b = new d2f(new cn0(0));
    public static final ConcurrentHashMap<String, Long> V = new ConcurrentHashMap<>();
    public static final boa X = new boa(14);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/util/AppStartupTimes$Provider;", "Landroid/content/ContentProvider;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Provider extends ContentProvider {
        @Override // android.content.ContentProvider
        public final int delete(Uri uri, String str, String[] strArr) {
            uri.getClass();
            throw new IllegalStateException("Not implemented");
        }

        @Override // android.content.ContentProvider
        public final String getType(Uri uri) {
            uri.getClass();
            throw new IllegalStateException("Not implemented");
        }

        @Override // android.content.ContentProvider
        public final Uri insert(Uri uri, ContentValues contentValues) {
            uri.getClass();
            throw new IllegalStateException("Not implemented");
        }

        @Override // android.content.ContentProvider
        public final boolean onCreate() {
            AppStartupTimes appStartupTimes = AppStartupTimes.a;
            AppStartupTimes.c = System.currentTimeMillis();
            return false;
        }

        @Override // android.content.ContentProvider
        public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            uri.getClass();
            throw new IllegalStateException("Not implemented");
        }

        @Override // android.content.ContentProvider
        public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            uri.getClass();
            throw new IllegalStateException("Not implemented");
        }
    }

    public static void a(String str) {
        byte b2 = 0;
        final fn0 fn0Var = new fn0(b2, b2);
        V.compute(str, new BiFunction() { // from class: gn0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (Long) fn0Var.invoke(obj, obj2);
            }
        });
    }

    public static void b() {
        if (e) {
            ArrayList arrayList = lz2.a;
            lz2.f("Skipping reporting cold initialization due to flag being set");
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = V;
        Long l = concurrentHashMap.get("launch_act_create_start");
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = concurrentHashMap.get("proctor_loaded");
            if (l2 != null) {
                long jLongValue2 = l2.longValue();
                Long l3 = concurrentHashMap.get("init_values_sync_started");
                if (l3 != null) {
                    long jLongValue3 = l3.longValue();
                    Long l4 = concurrentHashMap.get("init_values_synced");
                    if (l4 != null) {
                        long jLongValue4 = l4.longValue();
                        Long l5 = concurrentHashMap.get("homePageHTMLLoaded");
                        if (l5 != null) {
                            long jLongValue5 = l5.longValue();
                            Long l6 = concurrentHashMap.get("homePageHTMLRequest");
                            if (l6 != null) {
                                long jLongValue6 = l6.longValue();
                                Long l7 = concurrentHashMap.get("homePageRendered");
                                if (l7 != null) {
                                    final dn0 dn0Var = new dn0(jLongValue2, jLongValue4, jLongValue, jLongValue3, jLongValue5, jLongValue6, l7.longValue());
                                    concurrentHashMap.computeIfPresent("homePageReady", new BiFunction() { // from class: en0
                                        @Override // java.util.function.BiFunction
                                        public final Object apply(Object obj, Object obj2) {
                                            return (Long) dn0Var.invoke(obj, obj2);
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
