package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import defpackage.sp7;
import expo.modules.imagepicker.FailedToReadFileException;
import expo.modules.imagepicker.FailedToWriteFileException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s02 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s02(FragmentManager fragmentManager, String str, String str2) {
        this.a = 2;
        this.d = str;
        this.b = fragmentManager;
        this.c = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() throws FailedToWriteFileException, FailedToReadFileException, IOException {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Function2) obj3).invoke(((n97) obj2).a, (String) obj);
                return j6g.a;
            case 1:
                File file = (File) obj3;
                Uri uri = (Uri) obj2;
                ContentResolver contentResolver = (ContentResolver) obj;
                if (uri.compareTo(Uri.fromFile(file)) == 0) {
                    return j6g.a;
                }
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        throw new FailedToReadFileException(ojd.k(uri), null);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            wg2.u(inputStreamOpenInputStream, fileOutputStream);
                            j6g j6gVar = j6g.a;
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            return j6gVar;
                        } finally {
                        }
                    } finally {
                    }
                } catch (FileNotFoundException e) {
                    throw new FailedToWriteFileException(file, e);
                }
            case 2:
                kqg.a((String) obj, (FragmentManager) obj3, false, (String) obj2);
                return j6g.a;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-job-title-preference", "refresh", null, null, 12));
                Boolean bool = (Boolean) ((g4a) obj2).getValue();
                bool.booleanValue();
                ((Function2) obj3).invoke(bool, (List) ((g4a) obj).getValue());
                return j6g.a;
        }
    }

    public /* synthetic */ s02(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
