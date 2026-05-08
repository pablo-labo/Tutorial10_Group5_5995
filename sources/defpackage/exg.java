package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.webkit.WebView;
import defpackage.xh8;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class exg implements xh8 {
    public static final exg a = new exg();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(WebView webView, String str, Bundle bundle) {
        qpd qpdVarD;
        iwc iwcVar;
        webView.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            webView.restoreState(bundle2);
            return;
        }
        String string = bundle.getString(str.concat(":file"));
        if (string != null) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.getClass();
            try {
                try {
                    if (this instanceof ai8) {
                        qpdVarD = ((ai8) this).d();
                        iwcVar = fwc.a;
                    } else {
                        qpdVarD = (qpd) xh8.a.a().a.b;
                        iwcVar = fwc.a;
                    }
                    File file = new File(((Context) qpdVarD.a(null, iwcVar.b(Context.class), null)).getCacheDir(), string);
                    byte[] bArrS = hb5.S(file);
                    file.delete();
                    ArrayList arrayList = lz2.a;
                    lz2.d("WebViewStateStore", "Restoring webview state (" + bArrS.length + " bytes) from file " + string, false, null);
                    parcelObtain.unmarshall(bArrS, 0, bArrS.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle3 = parcelObtain.readBundle(webView.getClass().getClassLoader());
                    if (bundle3 != null) {
                        webView.restoreState(bundle3);
                    }
                    parcelObtain.recycle();
                } catch (Exception e) {
                    ArrayList arrayList2 = lz2.a;
                    lz2.c("WebViewStateStore", "failed to restore WebView state from file", false, e, 4);
                    parcelObtain.recycle();
                }
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(WebView webView, String str, Bundle bundle) {
        qpd qpdVarD;
        iwc iwcVar;
        webView.getClass();
        Bundle bundle2 = new Bundle();
        webView.saveState(bundle2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.getClass();
        try {
            try {
                parcelObtain.writeBundle(bundle2);
                int iDataSize = parcelObtain.dataSize();
                if (iDataSize > 307200) {
                    String str2 = "webview-state-" + str + "-" + UUID.randomUUID() + ".state";
                    ArrayList arrayList = lz2.a;
                    lz2.d("WebViewStateStore", "Saving webview state (" + iDataSize + " bytes) to file " + str2, false, null);
                    if (this instanceof ai8) {
                        qpdVarD = ((ai8) this).d();
                        iwcVar = fwc.a;
                    } else {
                        qpdVarD = (qpd) xh8.a.a().a.b;
                        iwcVar = fwc.a;
                    }
                    File file = new File(((Context) qpdVarD.a(null, iwcVar.b(Context.class), null)).getCacheDir(), str2);
                    byte[] bArrMarshall = parcelObtain.marshall();
                    bArrMarshall.getClass();
                    hb5.W(file, bArrMarshall);
                    bundle.putString(str.concat(":file"), file.getName());
                } else {
                    bundle.putBundle(str, bundle2);
                }
                parcelObtain.recycle();
            } catch (Exception e) {
                ArrayList arrayList2 = lz2.a;
                lz2.c("WebViewStateStore", "failed to save WebView state to file", false, e, 4);
                parcelObtain.recycle();
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
