package defpackage;

import android.content.Intent;
import android.webkit.MimeTypeMap;
import android.webkit.WebChromeClient;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sug {
    public static Intent a(WebChromeClient.FileChooserParams fileChooserParams) {
        Intent intentCreateIntent = fileChooserParams.createIntent();
        intentCreateIntent.getClass();
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        acceptTypes.getClass();
        List<String> listE0 = ut0.E0(acceptTypes);
        Intent intent = new Intent(intentCreateIntent);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        singleton.getClass();
        if (!singleton.hasMimeType(intent.getType())) {
            ArrayList arrayList = new ArrayList();
            for (String strGuessContentTypeFromName : listE0) {
                if (!singleton.hasMimeType(strGuessContentTypeFromName)) {
                    strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(strGuessContentTypeFromName);
                }
                if (strGuessContentTypeFromName != null) {
                    arrayList.add(strGuessContentTypeFromName);
                }
            }
            intent.setType("*/*");
            if (!arrayList.isEmpty()) {
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList.toArray(new String[0]));
            }
        }
        return intent;
    }
}
