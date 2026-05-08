package com.indeed.android.jobsearch.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import defpackage.j6g;
import defpackage.jc1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/appwidget/RecentSearchAppWidgetProvider;", "Ljc1;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecentSearchAppWidgetProvider extends jc1 {
    public final String c = "RecentSearch";

    public static RemoteViews b(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) RecentSearchAppWidgetService.class);
        intent.putExtra("appWidgetId", i);
        intent.setData(Uri.parse(intent.toUri(1)));
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.app_widget_recent_search);
        remoteViews.setRemoteAdapter(R.id.recent_search_app_widget_content, intent);
        remoteViews.setEmptyView(R.id.recent_search_app_widget_content, R.id.recent_search_app_widget_no_result);
        int i2 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
        Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
        intent2.setFlags(268468224);
        intent2.putExtra("recent_search_app_widget_clicked", true);
        intent2.setAction("recent_search_app_widget_action");
        j6g j6gVar = j6g.a;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent2, i2);
        remoteViews.setOnClickPendingIntent(R.id.app_widget, activity);
        remoteViews.setPendingIntentTemplate(R.id.recent_search_app_widget_content, activity);
        return remoteViews;
    }

    @Override // defpackage.jc1
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        context.getClass();
        appWidgetManager.getClass();
        appWidgetManager.updateAppWidget(i, b(context, i));
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        for (int i : iArr) {
            appWidgetManager.updateAppWidget(i, b(context, i));
        }
        super.onUpdate(context, appWidgetManager, iArr);
    }
}
