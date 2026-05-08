package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ar1 implements fc9 {
    public final /* synthetic */ int a;

    public /* synthetic */ ar1(int i) {
        this.a = i;
    }

    @Override // defpackage.fc9
    public final Object a(Object obj, qva qvaVar) {
        switch (this.a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            default:
                int iIntValue = ((Number) obj).intValue();
                Context context = qvaVar.a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        Uri uri = Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                        uri.getClass();
                        return uri;
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
        }
    }
}
