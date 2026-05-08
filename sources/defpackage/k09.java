package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.facebook.imagepipeline.request.a;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class k09 extends q09 {
    public final ContentResolver c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k09(Executor executor, yn9 yn9Var, ContentResolver contentResolver) {
        super(executor, yn9Var);
        executor.getClass();
        yn9Var.getClass();
        contentResolver.getClass();
        this.c = contentResolver;
    }

    @Override // defpackage.q09
    public final vs4 d(a aVar) throws IOException {
        vs4 vs4VarC;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        InputStream inputStreamCreateInputStream;
        aVar.getClass();
        Uri uri = aVar.b;
        uri.getClass();
        Uri uri2 = rhg.a;
        String path = uri.getPath();
        ContentResolver contentResolver = this.c;
        if (path == null || !"content".equals(rhg.b(uri)) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith(rhg.a.getPath())) {
            String string = uri.toString();
            if (string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                } catch (FileNotFoundException unused) {
                    vs4VarC = null;
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    r6.g("Required value was null.");
                    return null;
                }
                vs4VarC = c(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
                parcelFileDescriptorOpenFileDescriptor.close();
                if (vs4VarC != null) {
                    return vs4VarC;
                }
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                return c(inputStreamOpenInputStream, -1);
            }
            r6.g("Required value was null.");
            return null;
        }
        String string2 = uri.toString();
        string2.getClass();
        if (wve.D(string2, "/photo", false)) {
            inputStreamCreateInputStream = contentResolver.openInputStream(uri);
        } else {
            String string3 = uri.toString();
            string3.getClass();
            if (wve.D(string3, "/display_photo", false)) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException unused2) {
                    r40.h(p6.d(uri, "Contact photo does not exist: "));
                    return null;
                }
            } else {
                InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
                if (inputStreamOpenContactPhotoInputStream == null) {
                    r40.h(p6.d(uri, "Contact photo does not exist: "));
                    return null;
                }
                inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
            }
        }
        if (inputStreamCreateInputStream != null) {
            return c(inputStreamCreateInputStream, -1);
        }
        r6.g("Required value was null.");
        return null;
    }

    @Override // defpackage.q09
    public final String e() {
        return "LocalContentUriFetchProducer";
    }
}
