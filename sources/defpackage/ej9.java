package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.o7d;
import expo.modules.imagepicker.MediaType;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ej9 {
    public final e27 a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public ej9(e27 e27Var) {
        this.a = e27Var;
    }

    public final kz a(Uri uri) throws IOException {
        Object aVar;
        Cursor cursorQuery = b().getContentResolver().query(uri, (String[]) u63.a0("_display_name", "_size").toArray(new String[0]), null, null, null);
        Object obj = null;
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return null;
            }
            try {
                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                Integer numValueOf = Integer.valueOf(columnIndex);
                if (columnIndex == -1) {
                    numValueOf = null;
                }
                String string = numValueOf != null ? cursorQuery.getString(numValueOf.intValue()) : null;
                int columnIndex2 = cursorQuery.getColumnIndex("_size");
                Integer numValueOf2 = Integer.valueOf(columnIndex2);
                if (columnIndex2 == -1) {
                    numValueOf2 = null;
                }
                aVar = new kz(string, numValueOf2 != null ? Long.valueOf(cursorQuery.getLong(numValueOf2.intValue())) : null);
            } catch (Throwable th) {
                aVar = new o7d.a(th);
            }
            if (!(aVar instanceof o7d.a)) {
                obj = aVar;
            }
            kz kzVar = (kz) obj;
            cursorQuery.close();
            return kzVar;
        } finally {
        }
    }

    public final ReactApplicationContext b() {
        ReactApplicationContext reactApplicationContextD = this.a.b().d();
        if (reactApplicationContextD != null) {
            return reactApplicationContextD;
        }
        l5.q("React Application Context is null");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.net.Uri r25, expo.modules.imagepicker.ImagePickerOptions r26, defpackage.pu2 r27) throws expo.modules.core.errors.ModuleNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej9.c(android.net.Uri, expo.modules.imagepicker.ImagePickerOptions, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.net.Uri r23, defpackage.pu2 r24) throws java.io.IOException, expo.modules.imagepicker.FailedToExtractVideoMetadataException {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej9.d(android.net.Uri, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b0 -> B:31:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d1 -> B:40:0x00f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.util.List r26, expo.modules.imagepicker.ImagePickerOptions r27, defpackage.pu2 r28) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej9.e(java.util.List, expo.modules.imagepicker.ImagePickerOptions, pu2):java.lang.Object");
    }
}
