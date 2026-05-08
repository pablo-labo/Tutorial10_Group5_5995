package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class zm2 extends w07 {
    public final /* synthetic */ Bitmap d;
    public final /* synthetic */ bn2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm2(File file, Bitmap bitmap, bn2 bn2Var, int i, int i2) {
        super(i, i2, file);
        this.d = bitmap;
        this.e = bn2Var;
    }

    @Override // defpackage.w07
    public final Object a(ContentResolver contentResolver, fj9 fj9Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.d.compress(Bitmap.CompressFormat.JPEG, this.e.b, byteArrayOutputStream);
        return byteArrayOutputStream;
    }
}
