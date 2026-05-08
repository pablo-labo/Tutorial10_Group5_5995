package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class yxa {
    public final ReactApplicationContext a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap<Long, a> c = new ConcurrentHashMap<>();

    public static final class a {
        public final zxa a;
        public final xxa b;

        public a(zxa zxaVar, xxa xxaVar) {
            this.a = zxaVar;
            this.b = xxaVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ReceiverData(receiver=" + this.a + ", timeoutRunnable=" + this.b + ")";
        }
    }

    public yxa(ReactApplicationContext reactApplicationContext) {
        this.a = reactApplicationContext;
    }

    public static final void a(yxa yxaVar, String str, Promise promise) {
        ReactApplicationContext reactApplicationContext = yxaVar.a;
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir == null) {
            promise.reject("STORAGE_UNAVAILABLE", "External storage is not available");
            ((np7) cr8.p(np7.class)).c("PDFDownloadManager", "External storage unavailable when opening PDF", false, null);
            return;
        }
        File file = new File(externalFilesDir, str);
        if (!file.exists()) {
            promise.reject("FILE_NOT_FOUND", "Downloaded file not found at path: " + file.getAbsolutePath());
            return;
        }
        try {
            Uri uriD = FileProvider.d(reactApplicationContext, reactApplicationContext.getPackageName(), file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriD, "application/pdf");
            intent.addFlags(268435456);
            intent.addFlags(1);
            try {
                reactApplicationContext.startActivity(intent);
                promise.resolve(null);
            } catch (ActivityNotFoundException e) {
                promise.reject("NO_PDF_VIEWER", "No PDF viewer app found on device");
                ((np7) cr8.p(np7.class)).c("PDFDownloadManager", "No PDF viewer found", false, e);
            }
        } catch (IllegalArgumentException e2) {
            ((np7) cr8.p(np7.class)).c("PDFDownloadManager", t40.l("FileProvider error - file outside configured paths. Authority: ", reactApplicationContext.getPackageName(), ", Path: ", file.getAbsolutePath()), false, e2);
            promise.reject("FILEPROVIDER_ERROR", "File path not configured in FileProvider: " + e2.getMessage(), e2);
        }
    }

    public final void b(long j) {
        a aVarRemove = this.c.remove(Long.valueOf(j));
        if (aVarRemove != null) {
            try {
                this.a.unregisterReceiver(aVarRemove.a);
            } catch (Exception e) {
                ((np7) cr8.p(np7.class)).c("PDFDownloadManager", r6.c(j, "Error unregistering download receiver for downloadId: "), false, e);
            }
            this.b.removeCallbacks(aVarRemove.b);
        }
    }
}
