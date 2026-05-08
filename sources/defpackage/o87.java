package defpackage;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.c;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import defpackage.lx5;
import defpackage.s87;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
public final class o87 implements DownloadListener, xh8 {
    public final LaunchActivity a;
    public final Lazy b = boa.E(qt8.a, new a(this));
    public final tx5 c = new tx5();
    public final d2f d = new d2f(new cn0(6));

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o87 o87Var) {
            super(0);
            this.$this_inject = o87Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public o87(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    public final void a(Activity activity, c94 c94Var, Function1<? super Integer, j6g> function1) {
        c94Var.getClass();
        String str = c94Var.a;
        String str2 = c94Var.b;
        String str3 = c94Var.c;
        if (!URLUtil.isNetworkUrl(str)) {
            function1.invoke(Integer.valueOf(R.string.download_url_not_supported));
            return;
        }
        if (str2.length() <= 0 || str3.length() <= 0) {
            OkHttpClient okHttpClient = (OkHttpClient) this.d.getValue();
            Request.Builder builder = new Request.Builder();
            builder.e("HEAD", null);
            builder.g(str);
            Request requestB = builder.b();
            okHttpClient.getClass();
            new RealCall(okHttpClient, requestB, false).R0(new n87(str, activity, this, function1));
            return;
        }
        String strGuessFileName = URLUtil.guessFileName(str, str2, str3);
        strGuessFileName.getClass();
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(strGuessFileName);
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie != null) {
            request.addRequestHeader("Cookie", cookie);
        }
        request.setVisibleInDownloadsUi(true);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
        Object systemService = activity.getSystemService("download");
        systemService.getClass();
        DownloadManager downloadManager = (DownloadManager) systemService;
        try {
            function1.invoke(Integer.valueOf(R.string.downloading_file));
            downloadManager.enqueue(request);
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.a("IndeedDownloadListener", "Downloading file failed: " + e.getMessage(), str);
            function1.invoke(Integer.valueOf(R.string.download_failed_please_retry));
            j6g j6gVar = j6g.a;
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        c94 c94Var = new c94(str, str3, str4);
        int i = Build.VERSION.SDK_INT;
        LaunchActivity launchActivity = this.a;
        if (i > 28 || launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            a(launchActivity, c94Var, new nf(15));
            return;
        }
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        au8 au8Var = bu8.e0;
        qf8<Object>[] qf8VarArr = bu8.b;
        final boolean zBooleanValue = ((Boolean) au8Var.a(qf8VarArr[14], bu8Var)).booleanValue();
        final boolean zShouldShowRequestPermissionRationale = launchActivity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE");
        tx5 tx5Var = this.c;
        Lazy lazy = this.b;
        if (zBooleanValue || zShouldShowRequestPermissionRationale) {
            Lazy<s87> lazy2 = s87.f;
            s87.a.a((gz4) lazy.getValue(), tx5.g(tx5Var, "download-listener-permission-request", new Function1() { // from class: l87
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    lx5.b bVar = (lx5.b) obj;
                    bVar.getClass();
                    bVar.c("firstTime", Boolean.valueOf(zBooleanValue));
                    bVar.c("shouldShowPermission", Boolean.valueOf(zShouldShowRequestPermissionRationale));
                    return j6g.a;
                }
            }, 2));
            launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            au8Var.b(qf8VarArr[14], bu8Var, Boolean.FALSE);
        } else {
            Lazy<s87> lazy3 = s87.f;
            s87.a.a((gz4) lazy.getValue(), tx5.g(tx5Var, "download-listener-go-to-settings", null, 6));
            c.a aVar = new c.a(launchActivity);
            AlertController.b bVar = aVar.a;
            bVar.f = bVar.a.getText(R.string.request_storage_permission_to_download);
            aVar.setPositiveButton(R.string.permission_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: j87
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Lazy<s87> lazy4 = s87.f;
                    o87 o87Var = this.a;
                    s87.a.a((gz4) o87Var.b.getValue(), tx5.k(o87Var.c, "download-listener-go-to-settings", "go-to-settings", null, 12));
                    LaunchActivity launchActivity2 = o87Var.a;
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", launchActivity2.getPackageName(), null));
                    launchActivity2.Q0 = true;
                    launchActivity2.startActivity(intent);
                }
            }).setNegativeButton(R.string.permission_dialog_negative_button, new k87(this, 0)).b();
        }
        launchActivity.P0 = c94Var;
    }
}
