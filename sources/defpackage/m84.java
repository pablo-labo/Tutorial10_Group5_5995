package defpackage;

import android.net.Uri;
import android.provider.DocumentsContract;
import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class m84 {
    public static mtf g(ReactApplicationContext reactApplicationContext, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(reactApplicationContext, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        if (treeDocumentId == null) {
            l5.q(p6.d(uri, "Could not get document ID from Uri: "));
            return null;
        }
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId);
        if (uriBuildDocumentUriUsingTree != null) {
            return new mtf(reactApplicationContext, uriBuildDocumentUriUsingTree);
        }
        ja.k(p6.d(uri, "Failed to build documentUri from a tree: "));
        return null;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract m84 c(String str);

    public abstract m84 d(String str, String str2);

    public abstract boolean e();

    public abstract boolean f();

    public abstract String h();

    public abstract String i();

    public abstract Uri j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract long m();

    public abstract long n();

    public abstract m84[] o();
}
