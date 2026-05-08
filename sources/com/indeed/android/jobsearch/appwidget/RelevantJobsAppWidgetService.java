package com.indeed.android.jobsearch.appwidget;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import defpackage.czc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/appwidget/RelevantJobsAppWidgetService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RelevantJobsAppWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        intent.getClass();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        return new czc(applicationContext);
    }
}
