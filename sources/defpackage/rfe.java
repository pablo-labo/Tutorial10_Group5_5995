package defpackage;

import android.net.Uri;
import com.facebook.imagepipeline.request.a;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class rfe extends jx5 {
    public static final /* synthetic */ int W = 0;

    public a2 getControllerBuilder() {
        return null;
    }

    public void setActualImageResource(int i) {
        Uri uri = rhg.a;
        new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
        throw null;
    }

    public void setImageRequest(a aVar) {
        throw null;
    }

    @Override // defpackage.kc4, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public void setImageURI(String str) {
        if (str != null) {
            Uri.parse(str);
        }
        throw null;
    }

    @Override // defpackage.kc4, android.widget.ImageView
    public void setImageURI(Uri uri) {
        throw null;
    }
}
