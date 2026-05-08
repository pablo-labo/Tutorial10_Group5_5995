package defpackage;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.facebook.react.bridge.Promise;

/* JADX INFO: loaded from: classes3.dex */
public final class zxa extends BroadcastReceiver {
    public final /* synthetic */ long a;
    public final /* synthetic */ yxa b;
    public final /* synthetic */ DownloadManager c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Promise e;

    public zxa(long j, yxa yxaVar, DownloadManager downloadManager, String str, Promise promise) {
        this.a = j;
        this.b = yxaVar;
        this.c = downloadManager;
        this.d = str;
        this.e = promise;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Long lValueOf = intent != null ? Long.valueOf(intent.getLongExtra("extra_download_id", -1L)) : null;
        if (lValueOf == null) {
            return;
        }
        long jLongValue = lValueOf.longValue();
        long j = this.a;
        if (jLongValue == j) {
            yxa yxaVar = this.b;
            yxaVar.b(j);
            Cursor cursorQuery = this.c.query(new DownloadManager.Query().setFilterById(j));
            boolean zMoveToFirst = cursorQuery.moveToFirst();
            Promise promise = this.e;
            if (zMoveToFirst) {
                int i = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                if (i == 8) {
                    try {
                        yxa.a(yxaVar, this.d, promise);
                    } catch (Exception e) {
                        ((np7) cr8.p(np7.class)).c("PDFDownloadManager", l5.l("Error opening PDF: ", e.getMessage()), false, e);
                        promise.reject("PDF_OPEN_ERROR", "Failed to open PDF: " + e.getMessage(), e);
                    }
                } else if (i != 16) {
                    promise.reject("DOWNLOAD_INCOMPLETE", "Download did not complete successfully. Status: " + i);
                } else {
                    int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("reason"));
                    promise.reject("DOWNLOAD_FAILED", "Download failed with reason code: " + i2);
                    ((np7) cr8.p(np7.class)).c("PDFDownloadManager", p6.c(i2, "Download failed with reason: "), false, null);
                }
            } else {
                promise.reject("DOWNLOAD_QUERY_FAILED", "Could not query download status");
            }
            cursorQuery.close();
        }
    }
}
