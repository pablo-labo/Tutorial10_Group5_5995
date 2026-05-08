package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.FileUtils;
import android.os.Trace;
import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.documentpicker.DocumentInfo;
import expo.modules.documentpicker.DocumentPickerOptions;
import expo.modules.documentpicker.DocumentPickerResult;
import expo.modules.documentpicker.FailedToReadDocumentException;
import expo.modules.documentpicker.PickingInProgressException;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions$ReactContextLost;
import expo.modules.kotlin.exception.UnexpectedException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln84;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo-document-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n84 extends sx9 {
    public p3c c;
    public boolean d = true;

    public static final class a implements gu5<zf8> {
        public static final a a = new a();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(DocumentPickerOptions.class);
        }
    }

    public static final class b implements Function2<Object[], p3c, j6g> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws PickingInProgressException {
            String str;
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            DocumentPickerOptions documentPickerOptions = (DocumentPickerOptions) objArr2[0];
            n84 n84Var = n84.this;
            if (n84Var.c != null) {
                throw new PickingInProgressException();
            }
            n84Var.c = p3cVar2;
            n84Var.d = documentPickerOptions.getCopyToCacheDirectory();
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", documentPickerOptions.getMultiple());
            if (documentPickerOptions.getType().size() > 1) {
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) documentPickerOptions.getType().toArray(new String[0]));
                str = "*/*";
            } else {
                str = documentPickerOptions.getType().get(0);
            }
            intent.setType(str);
            n84Var.b().e().startActivityForResult(intent, 4137);
            return j6g.a;
        }
    }

    public static final class c implements Function2<Activity, spa, j6g> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Activity activity, spa spaVar) {
            n84 n84Var;
            p3c p3cVar;
            CodedException unexpectedException;
            CodedException codedException;
            ClipData clipData;
            Uri data;
            j6g j6gVar;
            spa spaVar2 = spaVar;
            activity.getClass();
            spaVar2.getClass();
            int i = spaVar2.a;
            int i2 = spaVar2.b;
            Intent intent = spaVar2.c;
            if (i == 4137 && (p3cVar = (n84Var = n84.this).c) != null) {
                if (i2 == -1) {
                    if (intent != null) {
                        try {
                            clipData = intent.getClipData();
                        } catch (Exception e) {
                            if (e instanceof CodedException) {
                                codedException = (CodedException) e;
                            } else {
                                if (e instanceof expo.modules.core.errors.CodedException) {
                                    expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) e;
                                    unexpectedException = new CodedException(codedException2.a(), codedException2.getMessage(), codedException2.getCause());
                                } else {
                                    unexpectedException = new UnexpectedException(e);
                                }
                                codedException = unexpectedException;
                            }
                            p3cVar.g(codedException);
                        }
                    } else {
                        clipData = null;
                    }
                    if (clipData == null) {
                        if (intent != null && (data = intent.getData()) != null) {
                            DocumentPickerResult documentPickerResult = new DocumentPickerResult(false, u63.Z(n84Var.f(data)), 1, null);
                            p3c p3cVar2 = n84Var.c;
                            if (p3cVar2 != null) {
                                p3cVar2.resolve(documentPickerResult);
                                j6gVar = j6g.a;
                            } else {
                                j6gVar = null;
                            }
                            if (j6gVar != null) {
                            }
                        }
                        throw new FailedToReadDocumentException();
                    }
                    n84.e(n84Var, intent);
                } else {
                    p3cVar.resolve(new DocumentPickerResult(true, null, 2, null));
                }
                n84Var.c = null;
            }
            return j6g.a;
        }
    }

    public static final void e(n84 n84Var, Intent intent) throws FailedToReadDocumentException {
        ClipData clipData;
        ClipData.Item itemAt;
        Uri uri;
        ClipData clipData2;
        int itemCount = (intent == null || (clipData2 = intent.getClipData()) == null) ? 0 : clipData2.getItemCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < itemCount; i++) {
            if (intent == null || (clipData = intent.getClipData()) == null || (itemAt = clipData.getItemAt(i)) == null || (uri = itemAt.getUri()) == null) {
                throw new FailedToReadDocumentException();
            }
            arrayList.add(n84Var.f(uri));
        }
        p3c p3cVar = n84Var.c;
        if (p3cVar != null) {
            p3cVar.resolve(new DocumentPickerResult(false, arrayList, 1, null));
        }
    }

    @Override // defpackage.sx9
    public final wx9 a() {
        Trace.beginSection(jpf.g("[ExpoModulesCore] ".concat(n84.class + ".ModuleDefinition")));
        try {
            vx9 vx9Var = new vx9(this, 2);
            vx9Var.l = "ExpoDocumentPicker";
            hb9 hb9Var = tf0.a;
            iwc iwcVar = fwc.a;
            rf0 rf0Var = (rf0) tf0.a.get(new Pair(iwcVar.b(DocumentPickerOptions.class), Boolean.FALSE));
            if (rf0Var == null) {
                rf0Var = new rf0(new xp8(iwcVar.b(DocumentPickerOptions.class), false, a.a), null);
            }
            vx9Var.f.put("getDocumentAsync", new ev0("getDocumentAsync", new rf0[]{rf0Var}, new b()));
            vx9Var.n.put(i05.V, new fz4(new c()));
            return vx9Var.k();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final DocumentInfo f(Uri uri) throws IOException, Exceptions$ReactContextLost {
        long jCurrentTimeMillis;
        int i;
        String strSubstring = "";
        ReactApplicationContext reactApplicationContextD = b().d();
        if (reactApplicationContextD == null) {
            throw new Exceptions$ReactContextLost();
        }
        Cursor cursorQuery = reactApplicationContextD.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            r40.h(p6.d(uri, "Failed to read document details for URI: "));
            return null;
        }
        try {
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
            int columnIndex = cursorQuery.getColumnIndex("_size");
            Long lValueOf = !cursorQuery.isNull(columnIndex) ? Long.valueOf(cursorQuery.getLong(columnIndex)) : null;
            String type = reactApplicationContextD.getContentResolver().getType(uri);
            try {
                int columnIndex2 = cursorQuery.getColumnIndex("last_modified");
                if (columnIndex2 == -1 || cursorQuery.isNull(columnIndex2)) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    File file = new File(path);
                    jCurrentTimeMillis = file.exists() ? file.lastModified() : System.currentTimeMillis();
                } else {
                    jCurrentTimeMillis = cursorQuery.getLong(columnIndex2);
                }
            } catch (Exception unused) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            string.getClass();
            DocumentInfo documentInfo = new DocumentInfo(uri, string, type, lValueOf, jCurrentTimeMillis);
            cursorQuery.close();
            if (!this.d) {
                return documentInfo;
            }
            String name = documentInfo.getName();
            ReactApplicationContext reactApplicationContextD2 = b().d();
            if (reactApplicationContextD2 == null) {
                throw new Exceptions$ReactContextLost();
            }
            File cacheDir = reactApplicationContextD2.getCacheDir();
            if (name == null) {
                char c2 = fb5.a;
                strSubstring = null;
            } else {
                char c3 = fb5.a;
                if (c3 == '\\') {
                    int iLastIndexOf = name.lastIndexOf(c3);
                    int iLastIndexOf2 = name.lastIndexOf(fb5.b);
                    if (iLastIndexOf == -1) {
                        i = iLastIndexOf2 == -1 ? 0 : iLastIndexOf2 + 1;
                    } else {
                        if (iLastIndexOf2 != -1) {
                            iLastIndexOf = Math.max(iLastIndexOf, iLastIndexOf2);
                        }
                        i = iLastIndexOf + 1;
                    }
                    if (name.indexOf(58, i) != -1) {
                        l5.q("NTFS ADS separator (':') in file name is forbidden.");
                        return null;
                    }
                }
                int iLastIndexOf3 = name.lastIndexOf(46);
                if (Math.max(name.lastIndexOf(47), name.lastIndexOf(92)) > iLastIndexOf3) {
                    iLastIndexOf3 = -1;
                }
                if (iLastIndexOf3 != -1) {
                    strSubstring = name.substring(iLastIndexOf3 + 1);
                }
            }
            File file2 = new File(pg8.u(cacheDir, "DocumentPicker", strSubstring));
            ReactApplicationContext reactApplicationContextD3 = b().d();
            if (reactApplicationContextD3 == null) {
                throw new Exceptions$ReactContextLost();
            }
            InputStream inputStreamOpenInputStream = reactApplicationContextD3.getContentResolver().openInputStream(uri);
            try {
                if (inputStreamOpenInputStream == null) {
                    throw new FileNotFoundException("Inputstream for " + uri + " was null.");
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        FileUtils.copy(inputStreamOpenInputStream, fileOutputStream);
                    } else {
                        wg2.u(inputStreamOpenInputStream, fileOutputStream);
                    }
                    fileOutputStream.close();
                    inputStreamOpenInputStream.close();
                    Uri uriFromFile = Uri.fromFile(file2);
                    uriFromFile.getClass();
                    return DocumentInfo.copy$default(documentInfo, uriFromFile, null, null, null, 0L, 30, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        c0h.q(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    c0h.q(inputStreamOpenInputStream, th3);
                    throw th4;
                }
            }
        } finally {
            try {
                throw th;
            } catch (Throwable th5) {
                c0h.q(cursorQuery, th);
            }
        }
    }
}
