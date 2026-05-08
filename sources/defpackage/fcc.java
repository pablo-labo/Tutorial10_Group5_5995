package defpackage;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.webview.NativeRNCWebViewModuleSpec;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class fcc implements ActivityEventListener {
    public static final b V = new b();
    public final ReactApplicationContext a;
    public DownloadManager.Request b;
    public ValueCallback<Uri> c;
    public ValueCallback<Uri[]> d;
    public File e;
    public File f;

    public enum a {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND);

        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    public static class b {
        public double a = 1.0d;
        public final HashMap<Double, AtomicReference<a>> b = new HashMap<>();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a a;
            public static final a b;
            public static final a c;
            public static final /* synthetic */ a[] d;

            static {
                a aVar = new a("UNDECIDED", 0);
                a = aVar;
                a aVar2 = new a("SHOULD_OVERRIDE", 1);
                b = aVar2;
                a aVar3 = new a("DO_NOT_OVERRIDE", 2);
                c = aVar3;
                d = new a[]{aVar, aVar2, aVar3};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) d.clone();
            }
        }
    }

    public fcc(ReactApplicationContext reactApplicationContext) {
        this.a = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public static Boolean a(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String[] c(String[] strArr) {
        String str;
        if (strArr.length != 0) {
            if (strArr.length != 1 || (str = strArr[0]) == null || str.length() != 0) {
                String[] strArr2 = new String[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    if (str2.matches("\\.\\w+")) {
                        String strReplace = str2.replace(".", "");
                        String mimeTypeFromExtension = strReplace != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strReplace) : null;
                        if (mimeTypeFromExtension != null) {
                            strArr2[i] = mimeTypeFromExtension;
                        } else {
                            strArr2[i] = str2;
                        }
                    } else {
                        strArr2[i] = str2;
                    }
                }
                return strArr2;
            }
        }
        return new String[]{a.DEFAULT.value};
    }

    public final void b(String str) {
        ReactApplicationContext reactApplicationContext = this.a;
        try {
            ((DownloadManager) reactApplicationContext.getSystemService("download")).enqueue(this.b);
            Toast.makeText(reactApplicationContext, str, 1).show();
        } catch (IllegalArgumentException | SecurityException e) {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "Unsupported URI, aborting download", e);
        }
    }

    public final File d(a aVar) {
        String str;
        String str2;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (iOrdinal != 2) {
            str = "";
            str2 = "";
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        String.valueOf(System.currentTimeMillis());
        return File.createTempFile(str, str2, this.a.getExternalFilesDir(null));
    }

    public final Uri e(File file) {
        ReactApplicationContext reactApplicationContext = this.a;
        return FileProvider.d(reactApplicationContext, reactApplicationContext.getPackageName() + ".fileprovider", file);
    }

    public final Intent f() {
        Intent intent = null;
        try {
            File fileD = d(a.IMAGE);
            this.e = fileD;
            Uri uriE = e(fileD);
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent2.putExtra("output", uriE);
                return intent2;
            } catch (IOException | IllegalArgumentException e) {
                e = e;
                intent = intent2;
                Log.e("CREATE FILE", "Error occurred while creating the File", e);
                e.printStackTrace();
                return intent;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (IllegalArgumentException e3) {
            e = e3;
        }
    }

    public final Intent g() {
        Intent intent = null;
        try {
            File fileD = d(a.VIDEO);
            this.f = fileD;
            Uri uriE = e(fileD);
            Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent2.putExtra("output", uriE);
                return intent2;
            } catch (IOException | IllegalArgumentException e) {
                e = e;
                intent = intent2;
                Log.e("CREATE FILE", "Error occurred while creating the File", e);
                e.printStackTrace();
                return intent;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (IllegalArgumentException e3) {
            e = e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // com.facebook.react.bridge.ActivityEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(android.app.Activity r7, int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcc.onActivityResult(android.app.Activity, int, int, android.content.Intent):void");
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onNewIntent(Intent intent) {
    }
}
