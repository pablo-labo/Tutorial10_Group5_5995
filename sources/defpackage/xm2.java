package defpackage;

import android.graphics.Bitmap;
import defpackage.u47;
import expo.modules.imagepicker.FailedToWriteFileException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xm2 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xm2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws FailedToWriteFileException, IOException {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                File file = (File) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) obj2;
                bn2 bn2Var = (bn2) obj;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        boolean zCompress = bitmap.compress(compressFormat, bn2Var.b, fileOutputStream);
                        fileOutputStream.close();
                        return Boolean.valueOf(zCompress);
                    } finally {
                    }
                } catch (FileNotFoundException e) {
                    throw new FailedToWriteFileException(file, e);
                }
            default:
                Function1 function1 = (Function1) obj2;
                u63.Y((e13) obj4, null, null, new t47((hee) obj, null), 3);
                function1.invoke(u47.a.a[((w47) obj3).ordinal()] == 1 ? w47.ARCHIVE : w47.INBOX);
                return j6g.a;
        }
    }
}
