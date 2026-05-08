package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ylb {
    public static String a(Context context) {
        Exception exc;
        String string;
        ProviderInfo providerInfo;
        String str;
        Cursor cursorQuery;
        Throwable th;
        Throwable th2;
        String str2;
        context.getClass();
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("com.appsflyer.referrer.INSTALL_PROVIDER");
            List<ResolveInfo> listQueryIntentContentProviders = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentContentProviders(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentContentProviders(intent, 0);
            listQueryIntentContentProviders.getClass();
            ResolveInfo resolveInfo = (ResolveInfo) z92.Q0(listQueryIntentContentProviders);
            if (resolveInfo != null && (providerInfo = resolveInfo.providerInfo) != null && (str = providerInfo.authority) != null) {
                string = "content://" + str + "/transaction_id";
                Uri uri = Uri.parse(string);
                if (uri != null) {
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            try {
                                cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, null, null);
                            } catch (Throwable th3) {
                                th = th3;
                                string = null;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    pi3.d(contentProviderClientAcquireUnstableContentProviderClient, th);
                                    throw th4;
                                }
                            }
                        } else {
                            cursorQuery = null;
                        }
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.moveToFirst();
                                int columnIndex = cursorQuery.getColumnIndex("transaction_id");
                                if (columnIndex < 0 || cursorQuery.getCount() <= 0) {
                                    ArrayList arrayList = lz2.a;
                                    lz2.d("PreloadCampaignUtils", "No preload campaign TransactionID found", false, null);
                                    string = null;
                                } else {
                                    string = cursorQuery.getString(columnIndex);
                                    try {
                                        ArrayList arrayList2 = lz2.a;
                                        lz2.d("PreloadCampaignUtils", "Preload campaign TransactionID: " + ((Object) string), false, null);
                                    } catch (Throwable th5) {
                                        str2 = string;
                                        th2 = th5;
                                        try {
                                            throw th2;
                                        } catch (Throwable th6) {
                                            try {
                                                c0h.q(cursorQuery, th2);
                                                throw th6;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                string = str2;
                                                throw th;
                                            }
                                        }
                                    }
                                }
                                j6g j6gVar = j6g.a;
                                try {
                                    cursorQuery.close();
                                } catch (Throwable th8) {
                                    th = th8;
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th2 = th9;
                                str2 = null;
                            }
                        } else {
                            string = null;
                        }
                        pi3.d(contentProviderClientAcquireUnstableContentProviderClient, null);
                        return string;
                    } catch (Exception e) {
                        exc = e;
                        ArrayList arrayList3 = lz2.a;
                        lz2.c("PreloadCampaignUtils", bg.e(exc, "Preload Campaign TransactionId retrieval failed: "), false, null, 12);
                        return string;
                    }
                }
            }
            return null;
        } catch (Exception e2) {
            exc = e2;
            string = null;
        }
    }
}
