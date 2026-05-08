package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.request.a;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class je3 extends q09 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je3(Executor executor, yn9 yn9Var, int i) {
        super(executor, yn9Var);
        this.c = i;
    }

    @Override // defpackage.q09
    public final vs4 d(a aVar) {
        boolean zEquals;
        byte[] bytes;
        switch (this.c) {
            case 0:
                String string = aVar.b.toString();
                web.e(Boolean.valueOf(string.substring(0, 5).equals("data:")));
                int iIndexOf = string.indexOf(44);
                String strSubstring = string.substring(iIndexOf + 1, string.length());
                String strSubstring2 = string.substring(0, iIndexOf);
                if (strSubstring2.contains(";")) {
                    zEquals = strSubstring2.split(";")[r5.length - 1].equals("base64");
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    bytes = Base64.decode(strSubstring, 0);
                } else {
                    String strDecode = Uri.decode(strSubstring);
                    strDecode.getClass();
                    bytes = strDecode.getBytes();
                }
                return c(new ByteArrayInputStream(bytes), bytes.length);
            default:
                aVar.getClass();
                return c(new FileInputStream(aVar.b().toString()), (int) aVar.b().length());
        }
    }

    @Override // defpackage.q09
    public final String e() {
        switch (this.c) {
            case 0:
                return "DataFetchProducer";
            default:
                return "LocalFileFetchProducer";
        }
    }
}
