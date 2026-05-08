package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.filesystem.legacy.DeletingOptions;
import expo.modules.filesystem.legacy.DownloadOptionsLegacy;
import expo.modules.filesystem.legacy.EncodingType;
import expo.modules.filesystem.legacy.FileSystemCannotCreateDirectoryException;
import expo.modules.filesystem.legacy.FileSystemCannotCreateFileException;
import expo.modules.filesystem.legacy.FileSystemCannotFindTaskException;
import expo.modules.filesystem.legacy.FileSystemCannotMoveFileException;
import expo.modules.filesystem.legacy.FileSystemCannotReadDirectoryException;
import expo.modules.filesystem.legacy.FileSystemCopyFailedException;
import expo.modules.filesystem.legacy.FileSystemFileNotFoundException;
import expo.modules.filesystem.legacy.FileSystemOkHttpNullException;
import expo.modules.filesystem.legacy.FileSystemPendingPermissionsRequestException;
import expo.modules.filesystem.legacy.FileSystemUnreadableDirectoryException;
import expo.modules.filesystem.legacy.FileSystemUnsupportedSchemeException;
import expo.modules.filesystem.legacy.FileSystemUploadOptions;
import expo.modules.filesystem.legacy.FileSystemUploadType;
import expo.modules.filesystem.legacy.InfoOptionsLegacy;
import expo.modules.filesystem.legacy.MakeDirectoryOptions;
import expo.modules.filesystem.legacy.ReadingOptions;
import expo.modules.filesystem.legacy.RelocatingOptions;
import expo.modules.filesystem.legacy.WritingOptions;
import expo.modules.kotlin.exception.Exceptions$AppContextLost;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URLConnection;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$asRequestBody$1;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0005\u0007\b\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lqa5;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "d", "b", "c", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class qa5 extends sx9 {
    public OkHttpClient c;
    public p3c d;
    public final HashMap e = new HashMap();
    public final eu2 f = f13.a(a74.a);

    public static final class a {
        public final DownloadOptionsLegacy a;
        public final RealCall b;
        public final File c;
        public final boolean d;
        public final p3c e;

        public a(DownloadOptionsLegacy downloadOptionsLegacy, RealCall realCall, File file, boolean z, p3c p3cVar) {
            p3cVar.getClass();
            this.a = downloadOptionsLegacy;
            this.b = realCall;
            this.c = file;
            this.d = z;
            this.e = p3cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a.equals(aVar.a) && this.b == aVar.b && this.c.equals(aVar.c) && this.d == aVar.d && wl7.b(this.e, aVar.e)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + ia.f((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            return "DownloadResumableTaskParams(options=" + this.a + ", call=" + this.b + ", file=" + this.c + ", isResume=" + this.d + ", promise=" + this.e + ")";
        }
    }

    public static final class a0 implements Function1<Object[], j6g> {
        public a0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws FileSystemCannotCreateDirectoryException, IOException, Exceptions$AppContextLost {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            MakeDirectoryOptions makeDirectoryOptions = (MakeDirectoryOptions) objArr2[1];
            Uri uri = Uri.parse(ta5.a((String) obj));
            uri.getClass();
            qa5.this.m(uri, e8b.b);
            if (!wl7.b(uri.getScheme(), "file")) {
                r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
                return null;
            }
            File fileT = qa5.t(uri);
            boolean zIsDirectory = fileT.isDirectory();
            boolean intermediates = makeDirectoryOptions.getIntermediates();
            if ((intermediates ? fileT.mkdirs() : fileT.mkdir()) || (intermediates && zIsDirectory)) {
                return j6g.a;
            }
            throw new FileSystemCannotCreateDirectoryException(uri);
        }
    }

    public static final class a1 implements Function1<Object[], Bundle> {
        public a1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Bundle invoke(Object[] objArr) throws FileSystemCannotFindTaskException, IOException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            String str = (String) objArr2[0];
            HashMap map = qa5.this.e;
            d dVar = (d) map.get(str);
            if (dVar == null) {
                r40.h("No download object available");
                return null;
            }
            if (!(dVar instanceof b)) {
                throw new FileSystemCannotFindTaskException();
            }
            dVar.a.cancel();
            map.remove(str);
            File fileT = qa5.t(((b) dVar).b);
            Bundle bundle = new Bundle();
            bundle.putString("resumeData", String.valueOf(fileT.length()));
            return bundle;
        }
    }

    public static final class a2 implements gu5<zf8> {
        public static final a2 a = new a2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class b extends d {
        public final Uri b;

        public b(Uri uri, RealCall realCall) {
            super(realCall);
            this.b = uri;
        }
    }

    public static final class b0 implements Function2<Object[], p3c, j6g> {
        public b0() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws FileSystemCannotReadDirectoryException, IOException, FileSystemUnsupportedSchemeException, Exceptions$AppContextLost {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            Uri uri = Uri.parse(ta5.a((String) p3cVar2));
            uri.getClass();
            qa5.this.m(uri, e8b.a);
            if (!wl7.b(uri.getScheme(), "file")) {
                if (qa5.r(uri)) {
                    throw new FileSystemUnsupportedSchemeException();
                }
                r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
                return null;
            }
            File[] fileArrListFiles = qa5.t(uri).listFiles();
            if (fileArrListFiles == null) {
                throw new FileSystemCannotReadDirectoryException(uri);
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            int length = fileArrListFiles.length;
            for (int i = 0; i < length; i++) {
                File file = fileArrListFiles[i];
                arrayList.add(file != null ? file.getName() : null);
            }
            return j6g.a;
        }
    }

    public static final class b1 implements gu5<zf8> {
        public static final b1 a = new b1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class b2 implements gu5<zf8> {
        public static final b2 a = new b2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class c extends ResponseBody {
        public final ResponseBody c;
        public final m d;

        public c(ResponseBody responseBody, m mVar) {
            this.c = responseBody;
            this.d = mVar;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: K1 */
        public final to1 getE() {
            ResponseBody responseBody = this.c;
            responseBody.getClass();
            return new uqc(new ra5(responseBody.getE(), this));
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: p */
        public final long getD() {
            ResponseBody responseBody = this.c;
            if (responseBody != null) {
                return responseBody.getD();
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: s */
        public final MediaType getC() {
            ResponseBody responseBody = this.c;
            if (responseBody != null) {
                return responseBody.getC();
            }
            return null;
        }
    }

    public static final class c0 implements gu5<zf8> {
        public static final c0 a = new c0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(String.class);
        }
    }

    public static final class c1 implements gu5<zf8> {
        public static final c1 a = new c1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ReadingOptions.class);
        }
    }

    public static final class c2 implements gu5<String> {
        public c2() {
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return Uri.fromFile(qa5.this.o().getFilesDir()) + "/";
        }
    }

    public static class d {
        public final RealCall a;

        public d(RealCall realCall) {
            this.a = realCall;
        }
    }

    public static final class d0 implements Function1<Object[], List<? extends String>> {
        public d0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends String> invoke(Object[] objArr) throws FileSystemCannotReadDirectoryException, IOException, FileSystemUnsupportedSchemeException, Exceptions$AppContextLost {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Uri uri = Uri.parse(ta5.a((String) objArr2[0]));
            uri.getClass();
            qa5.this.m(uri, e8b.a);
            if (!wl7.b(uri.getScheme(), "file")) {
                if (qa5.r(uri)) {
                    throw new FileSystemUnsupportedSchemeException();
                }
                r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
                return null;
            }
            File[] fileArrListFiles = qa5.t(uri).listFiles();
            if (fileArrListFiles == null) {
                throw new FileSystemCannotReadDirectoryException(uri);
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            int length = fileArrListFiles.length;
            for (int i = 0; i < length; i++) {
                File file = fileArrListFiles[i];
                arrayList.add(file != null ? file.getName() : null);
            }
            return arrayList;
        }
    }

    public static final class d1 implements Function1<Object[], String> {
        public d1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Object[] objArr) throws IOException, Exceptions$AppContextLost {
            InputStream inputStreamOpenInputStream;
            String strEncodeToString;
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            ReadingOptions readingOptions = (ReadingOptions) objArr2[1];
            String str = (String) obj;
            Uri uri = Uri.parse(ta5.a(str));
            uri.getClass();
            e8b e8bVar = e8b.a;
            qa5 qa5Var = qa5.this;
            qa5Var.m(uri, e8bVar);
            if (readingOptions.getEncoding() != EncodingType.BASE64) {
                if (wl7.b(uri.getScheme(), "file")) {
                    return sn6.b(new FileInputStream(qa5.t(uri)));
                }
                if (wl7.b(uri.getScheme(), "asset")) {
                    return sn6.b(qa5Var.s(uri));
                }
                if (uri.getScheme() == null) {
                    return sn6.b(qa5.k(qa5Var, str));
                }
                if (qa5.r(uri)) {
                    return sn6.b(qa5Var.o().getContentResolver().openInputStream(uri));
                }
                r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
                return null;
            }
            if (wl7.b(uri.getScheme(), "file")) {
                inputStreamOpenInputStream = new FileInputStream(qa5.t(uri));
            } else if (wl7.b(uri.getScheme(), "asset")) {
                inputStreamOpenInputStream = qa5Var.s(uri);
            } else {
                if (!qa5.r(uri)) {
                    r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
                    return null;
                }
                inputStreamOpenInputStream = qa5Var.o().getContentResolver().openInputStream(uri);
                inputStreamOpenInputStream.getClass();
            }
            try {
                if (readingOptions.getLength() == null || readingOptions.getPosition() == null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                    while (true) {
                        try {
                            int i = inputStreamOpenInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        } finally {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    strEncodeToString = Base64.encodeToString(byteArray, 2);
                } else {
                    byte[] bArr2 = new byte[readingOptions.getLength().intValue()];
                    inputStreamOpenInputStream.skip(readingOptions.getPosition().intValue());
                    strEncodeToString = Base64.encodeToString(bArr2, 0, inputStreamOpenInputStream.read(bArr2, 0, readingOptions.getLength().intValue()), 2);
                }
                j6g j6gVar = j6g.a;
                inputStreamOpenInputStream.close();
                return strEncodeToString;
            } finally {
            }
        }
    }

    public static final class d2 implements gu5<String> {
        public d2() {
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return Uri.fromFile(qa5.this.o().getCacheDir()) + "/";
        }
    }

    public /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FileSystemUploadType.values().length];
            try {
                iArr[FileSystemUploadType.BINARY_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FileSystemUploadType.MULTIPART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class e0 implements Function1<Object[], Double> {
        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Object[] objArr) {
            objArr.getClass();
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            double dDoubleValue = BigInteger.valueOf(statFs.getBlockCountLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue();
            double dPow = Math.pow(2.0d, 53.0d) - 1.0d;
            if (dDoubleValue > dPow) {
                dDoubleValue = dPow;
            }
            return Double.valueOf(dDoubleValue);
        }
    }

    public static final class e1 implements gu5<zf8> {
        public static final e1 a = new e1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class e2 implements gu5<String> {
        @Override // defpackage.gu5
        public final String invoke() {
            return "asset:///";
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ p3c a;
        public final /* synthetic */ qa5 b;

        public f(p3c p3cVar, qa5 qa5Var) {
            this.a = p3cVar;
            this.b = qa5Var;
        }

        @Override // okhttp3.Callback
        public final void h(Call call, IOException iOException) {
            String str = ta5.a;
            Log.e(str, String.valueOf(iOException.getMessage()));
            this.a.reject(str, iOException.getMessage(), iOException);
        }

        @Override // okhttp3.Callback
        public final void p(Call call, Response response) {
            Bundle bundle = new Bundle();
            ResponseBody responseBody = response.V;
            bundle.putString("body", responseBody != null ? responseBody.v() : null);
            bundle.putInt("status", response.d);
            bundle.putBundle("headers", qa5.l(this.b, response.f));
            response.close();
            this.a.resolve(bundle);
        }
    }

    public static final class f0 implements Function1<Object[], Double> {
        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Object[] objArr) {
            objArr.getClass();
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            double dDoubleValue = BigInteger.valueOf(statFs.getAvailableBlocksLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue();
            double dPow = Math.pow(2.0d, 53.0d) - 1.0d;
            if (dDoubleValue > dPow) {
                dDoubleValue = dPow;
            }
            return Double.valueOf(dDoubleValue);
        }
    }

    public static final class f1 implements gu5<zf8> {
        public static final f1 a = new f1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class f2 implements Function2<Activity, spa, j6g> {
        public f2() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Activity activity, spa spaVar) {
            spa spaVar2 = spaVar;
            activity.getClass();
            spaVar2.getClass();
            int i = spaVar2.a;
            int i2 = spaVar2.b;
            Intent intent = spaVar2.c;
            if (i == 5394) {
                qa5 qa5Var = qa5.this;
                if (qa5Var.d != null) {
                    Bundle bundle = new Bundle();
                    if (i2 != -1 || intent == null) {
                        bundle.putBoolean("granted", false);
                    } else {
                        Uri data = intent.getData();
                        int flags = intent.getFlags() & 3;
                        if (data != null) {
                            qa5Var.b().e().getContentResolver().takePersistableUriPermission(data, flags);
                        }
                        bundle.putBoolean("granted", true);
                        bundle.putString("directoryUri", String.valueOf(data));
                    }
                    p3c p3cVar = qa5Var.d;
                    if (p3cVar != null) {
                        p3cVar.resolve(bundle);
                    }
                    qa5Var.d = null;
                }
            }
            return j6g.a;
        }
    }

    public static final class g implements p3d {
        public static final g a = new g();

        @Override // defpackage.p3d
        public final RequestBody a(RequestBody$Companion$asRequestBody$1 requestBody$Companion$asRequestBody$1) {
            return requestBody$Companion$asRequestBody$1;
        }
    }

    public static final class g0 implements Function2<Object[], p3c, j6g> {
        public g0() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws IOException, FileSystemUnreadableDirectoryException, Exceptions$AppContextLost {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            String str = (String) p3cVar2;
            Uri uri = Uri.parse(ta5.a(str));
            uri.getClass();
            e8b e8bVar = e8b.b;
            qa5 qa5Var = qa5.this;
            qa5Var.m(uri, e8bVar);
            qa5Var.m(uri, e8b.a);
            qa5.e(uri);
            if (!wl7.b(uri.getScheme(), "file")) {
                throw new FileSystemUnreadableDirectoryException(str);
            }
            qa5.f(qa5Var, qa5.t(uri)).toString();
            return j6g.a;
        }
    }

    public static final class g1 implements gu5<zf8> {
        public static final g1 a = new g1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(WritingOptions.class);
        }
    }

    public static final class g2 implements gu5<j6g> {
        public g2() {
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            qa5 qa5Var = qa5.this;
            try {
                File filesDir = qa5Var.o().getFilesDir();
                filesDir.getClass();
                qa5.h(qa5Var, filesDir);
                File cacheDir = qa5Var.o().getCacheDir();
                cacheDir.getClass();
                qa5.h(qa5Var, cacheDir);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return j6g.a;
        }
    }

    public static final class h implements Callback {
        public final /* synthetic */ p3c a;
        public final /* synthetic */ qa5 b;

        public h(p3c p3cVar, qa5 qa5Var) {
            this.a = p3cVar;
            this.b = qa5Var;
        }

        @Override // okhttp3.Callback
        public final void h(Call call, IOException iOException) {
            boolean e0 = call.getE0();
            p3c p3cVar = this.a;
            if (e0) {
                p3cVar.resolve((Object) null);
                return;
            }
            String str = ta5.a;
            Log.e(str, String.valueOf(iOException.getMessage()));
            p3cVar.reject(str, iOException.getMessage(), iOException);
        }

        @Override // okhttp3.Callback
        public final void p(Call call, Response response) {
            Bundle bundle = new Bundle();
            ResponseBody responseBody = response.V;
            bundle.putString("body", responseBody != null ? responseBody.v() : null);
            bundle.putInt("status", response.d);
            bundle.putBundle("headers", qa5.l(this.b, response.f));
            response.close();
            this.a.resolve(bundle);
        }
    }

    public static final class h0 implements gu5<zf8> {
        public static final h0 a = new h0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class h1 implements gu5<zf8> {
        public static final h1 a = new h1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemUploadOptions.class);
        }
    }

    public static final class h2 implements gu5<j6g> {
        public h2() {
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            try {
                f13.c(qa5.this.f, new ModuleDestroyedException());
            } catch (IllegalStateException unused) {
                Log.e(ta5.a, "The scope does not have a job in it");
            }
            return j6g.a;
        }
    }

    public static final class i implements w13 {
        public long a = -1;
        public final /* synthetic */ String b;
        public final /* synthetic */ qa5 c;

        public i(qa5 qa5Var, String str) {
            this.b = str;
            this.c = qa5Var;
        }

        @Override // defpackage.w13
        public final void a(long j, long j2) {
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis > this.a + 100 || j == j2) {
                this.a = jCurrentTimeMillis;
                bundle2.putDouble("totalBytesSent", j);
                bundle2.putDouble("totalBytesExpectedToSend", j2);
                bundle.putString("uuid", this.b);
                bundle.putBundle("data", bundle2);
                this.c.d("expo-file-system.uploadProgress", bundle);
            }
        }
    }

    public static final class i0 implements gu5<zf8> {
        public static final i0 a = new i0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(InfoOptionsLegacy.class);
        }
    }

    public static final class i1 implements Function2<Object[], p3c, j6g> {
        public i1() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws IOException, Exceptions$AppContextLost {
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            FileSystemUploadOptions fileSystemUploadOptions = (FileSystemUploadOptions) objArr2[3];
            String str = (String) obj3;
            qa5 qa5Var = qa5.this;
            Request requestG = qa5.g(qa5Var, (String) obj, (String) obj2, fileSystemUploadOptions, new j(new i(qa5Var, str)));
            OkHttpClient okHttpClientI = qa5.i(qa5Var);
            okHttpClientI.getClass();
            RealCall realCall = new RealCall(okHttpClientI, requestG, false);
            qa5Var.e.put(str, new d(realCall));
            realCall.R0(new h(p3cVar2, qa5Var));
            return j6g.a;
        }
    }

    public static final class i2 implements Interceptor {
        public final /* synthetic */ m a;

        public i2(m mVar) {
            this.a = mVar;
        }

        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
            Response responseB = realInterceptorChain.b(realInterceptorChain.e);
            Response.Builder builderP = responseB.p();
            builderP.g = new c(responseB.V, this.a);
            return builderP.a();
        }
    }

    public static final class j implements p3d {
        public final /* synthetic */ i a;

        public j(i iVar) {
            this.a = iVar;
        }

        @Override // defpackage.p3d
        public final RequestBody a(RequestBody$Companion$asRequestBody$1 requestBody$Companion$asRequestBody$1) {
            return new v13(requestBody$Companion$asRequestBody$1, this.a);
        }
    }

    public static final class j0 implements Function1<Object[], String> {
        public j0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Object[] objArr) throws IOException, FileSystemUnreadableDirectoryException, Exceptions$AppContextLost {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            String str = (String) objArr2[0];
            Uri uri = Uri.parse(ta5.a(str));
            uri.getClass();
            e8b e8bVar = e8b.b;
            qa5 qa5Var = qa5.this;
            qa5Var.m(uri, e8bVar);
            qa5Var.m(uri, e8b.a);
            qa5.e(uri);
            if (wl7.b(uri.getScheme(), "file")) {
                return qa5.f(qa5Var, qa5.t(uri)).toString();
            }
            throw new FileSystemUnreadableDirectoryException(str);
        }
    }

    public static final class j1 implements gu5<zf8> {
        public static final j1 a = new j1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class k implements Callback {
        public final /* synthetic */ p3c a;
        public final /* synthetic */ qa5 b;
        public final /* synthetic */ Uri c;
        public final /* synthetic */ DownloadOptionsLegacy d;

        public k(p3c p3cVar, qa5 qa5Var, Uri uri, DownloadOptionsLegacy downloadOptionsLegacy) {
            this.a = p3cVar;
            this.b = qa5Var;
            this.c = uri;
            this.d = downloadOptionsLegacy;
        }

        @Override // okhttp3.Callback
        public final void h(Call call, IOException iOException) {
            String str = ta5.a;
            Log.e(str, String.valueOf(iOException.getMessage()));
            this.a.reject(str, iOException.getMessage(), iOException);
        }

        @Override // okhttp3.Callback
        public final void p(Call call, Response response) throws Throwable {
            File fileT = qa5.t(this.c);
            fileT.delete();
            tqc tqcVar = new tqc(c0h.Q(fileT));
            ResponseBody responseBody = response.V;
            responseBody.getClass();
            tqcVar.a1(responseBody.getE());
            tqcVar.close();
            Bundle bundle = new Bundle();
            bundle.putString("uri", Uri.fromFile(fileT).toString());
            bundle.putInt("status", response.d);
            Headers headers = response.f;
            qa5 qa5Var = this.b;
            bundle.putBundle("headers", qa5.l(qa5Var, headers));
            if (this.d.getMd5()) {
                bundle.putString("md5", qa5.j(qa5Var, fileT));
            }
            response.close();
            this.a.resolve(bundle);
        }
    }

    public static final class k0 implements Function2<Object[], p3c, j6g> {
        public k0() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws FileSystemCannotReadDirectoryException, IOException, Exceptions$AppContextLost {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            Uri uri = Uri.parse(ta5.a((String) p3cVar2));
            uri.getClass();
            e8b e8bVar = e8b.a;
            qa5 qa5Var = qa5.this;
            qa5Var.m(uri, e8bVar);
            if (!qa5.r(uri)) {
                r40.h(z3.l("The URI '", "' is not a Storage Access Framework URI. Try using FileSystem.readDirectoryAsync instead.", uri));
                return null;
            }
            mtf mtfVarG = m84.g(qa5Var.o(), uri);
            if (!mtfVarG.f() || !mtfVarG.k()) {
                throw new FileSystemCannotReadDirectoryException(uri);
            }
            m84[] m84VarArrO = mtfVarG.o();
            ArrayList arrayList = new ArrayList(m84VarArrO.length);
            for (m84 m84Var : m84VarArrO) {
                arrayList.add(m84Var.j().toString());
            }
            return j6g.a;
        }
    }

    public static final class k1 implements gu5<zf8> {
        public static final k1 a = new k1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(String.class);
        }
    }

    @uh3(c = "expo.modules.filesystem.legacy.FileSystemLegacyModule$definition$1$24$3", f = "FileSystemLegacyModule.kt", l = {693}, m = "invokeSuspend")
    public static final class l extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ a $params;
        int label;
        final /* synthetic */ qa5 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(lu2 lu2Var, a aVar, qa5 qa5Var) {
            super(2, lu2Var);
            this.this$0 = qa5Var;
            this.$params = aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new l(lu2Var, this.$params, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((l) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                qa5 qa5Var = this.this$0;
                a aVar = this.$params;
                this.label = 1;
                qa5Var.getClass();
                eq3 eq3Var = a74.a;
                Object objQ0 = u63.q0(no3.c, new sa5(null, aVar, qa5Var), this);
                g13 g13Var = g13.a;
                if (objQ0 == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public static final class l0 implements gu5<zf8> {
        public static final l0 a = new l0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class l1 implements gu5<zf8> {
        public static final l1 a = new l1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(DownloadOptionsLegacy.class);
        }
    }

    public static final class m {
        public long a = -1;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ qa5 d;

        public m(String str, String str2, qa5 qa5Var) {
            this.b = str;
            this.c = str2;
            this.d = qa5Var;
        }
    }

    public static final class m0 implements Function1<Object[], List<? extends String>> {
        public m0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends String> invoke(Object[] objArr) throws FileSystemCannotReadDirectoryException, IOException, Exceptions$AppContextLost {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Uri uri = Uri.parse(ta5.a((String) objArr2[0]));
            uri.getClass();
            e8b e8bVar = e8b.a;
            qa5 qa5Var = qa5.this;
            qa5Var.m(uri, e8bVar);
            if (!qa5.r(uri)) {
                r40.h(z3.l("The URI '", "' is not a Storage Access Framework URI. Try using FileSystem.readDirectoryAsync instead.", uri));
                return null;
            }
            mtf mtfVarG = m84.g(qa5Var.o(), uri);
            if (!mtfVarG.f() || !mtfVarG.k()) {
                throw new FileSystemCannotReadDirectoryException(uri);
            }
            m84[] m84VarArrO = mtfVarG.o();
            ArrayList arrayList = new ArrayList(m84VarArrO.length);
            for (m84 m84Var : m84VarArrO) {
                arrayList.add(m84Var.j().toString());
            }
            return arrayList;
        }
    }

    public static final class m1 implements Function2<Object[], p3c, j6g> {
        public m1() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws Throwable {
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            DownloadOptionsLegacy downloadOptionsLegacy = (DownloadOptionsLegacy) objArr2[2];
            String str = (String) obj;
            Uri uri = Uri.parse(ta5.a((String) obj2));
            uri.getClass();
            e8b e8bVar = e8b.b;
            qa5 qa5Var = qa5.this;
            qa5Var.m(uri, e8bVar);
            qa5.e(uri);
            if (!zve.L(str, ":", false)) {
                ReactApplicationContext reactApplicationContextO = qa5Var.o();
                InputStream inputStreamOpenRawResource = reactApplicationContextO.getResources().openRawResource(reactApplicationContextO.getResources().getIdentifier(str, "raw", reactApplicationContextO.getPackageName()));
                inputStreamOpenRawResource.getClass();
                uqc uqcVar = new uqc(c0h.S(inputStreamOpenRawResource));
                File fileT = qa5.t(uri);
                fileT.delete();
                tqc tqcVar = new tqc(c0h.Q(fileT));
                tqcVar.a1(uqcVar);
                tqcVar.close();
                Bundle bundle = new Bundle();
                bundle.putString("uri", Uri.fromFile(fileT).toString());
                boolean md5 = downloadOptionsLegacy.getMd5();
                if ((md5 ? Boolean.valueOf(md5) : null) != null) {
                    bundle.putString("md5", qa5.j(qa5Var, fileT));
                }
                p3cVar2.resolve(bundle);
            } else {
                if (!"file".equals(uri.getScheme())) {
                    r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
                    return null;
                }
                Request.Builder builder = new Request.Builder();
                builder.g(str);
                if (downloadOptionsLegacy.getHeaders() != null) {
                    for (Map.Entry<String, String> entry : downloadOptionsLegacy.getHeaders().entrySet()) {
                        builder.a(entry.getKey(), entry.getValue());
                    }
                }
                OkHttpClient okHttpClientI = qa5.i(qa5Var);
                if (okHttpClientI != null) {
                    new RealCall(okHttpClientI, builder.b(), false).R0(new k(p3cVar2, qa5Var, uri, downloadOptionsLegacy));
                } else {
                    p3cVar2.g(new FileSystemOkHttpNullException());
                }
            }
            return j6g.a;
        }
    }

    public static final class n implements Function1<Object[], j6g> {
        public n() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws IOException, Exceptions$AppContextLost {
            OutputStream outputStreamOpenOutputStream;
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            WritingOptions writingOptions = (WritingOptions) objArr2[2];
            String str = (String) obj2;
            Uri uri = Uri.parse(ta5.a((String) obj));
            uri.getClass();
            e8b e8bVar = e8b.b;
            qa5 qa5Var = qa5.this;
            qa5Var.m(uri, e8bVar);
            EncodingType encoding = writingOptions.getEncoding();
            if (wl7.b(uri.getScheme(), "file")) {
                outputStreamOpenOutputStream = new FileOutputStream(qa5.t(uri));
            } else {
                if (!qa5.r(uri)) {
                    r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
                    return null;
                }
                outputStreamOpenOutputStream = qa5Var.o().getContentResolver().openOutputStream(uri);
                outputStreamOpenOutputStream.getClass();
            }
            try {
                if (encoding == EncodingType.BASE64) {
                    outputStreamOpenOutputStream.write(Base64.decode(str, 0));
                } else {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamOpenOutputStream);
                    try {
                        outputStreamWriter.write(str);
                        j6g j6gVar = j6g.a;
                        outputStreamWriter.close();
                    } finally {
                    }
                }
                j6g j6gVar2 = j6g.a;
                outputStreamOpenOutputStream.close();
                return j6g.a;
            } finally {
            }
        }
    }

    public static final class n0 implements gu5<zf8> {
        public static final n0 a = new n0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class n1 implements gu5<zf8> {
        public static final n1 a = new n1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class o implements gu5<zf8> {
        public static final o a = new o();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class o0 implements gu5<zf8> {
        public static final o0 a = new o0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class o1 implements gu5<zf8> {
        public static final o1 a = new o1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class p implements gu5<zf8> {
        public static final p a = new p();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(DeletingOptions.class);
        }
    }

    public static final class p0 implements Function1<Object[], String> {
        public p0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Object[] objArr) throws FileSystemCannotCreateDirectoryException, IOException, Exceptions$AppContextLost {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            String str = (String) objArr2[1];
            Uri uri = Uri.parse(ta5.a((String) obj));
            uri.getClass();
            e8b e8bVar = e8b.b;
            qa5 qa5Var = qa5.this;
            qa5Var.m(uri, e8bVar);
            if (!qa5.r(uri)) {
                r40.h(z3.l("The URI '", "' is not a Storage Access Framework URI. Try using FileSystem.makeDirectoryAsync instead.", uri));
                return null;
            }
            m84 m84VarQ = qa5Var.q(uri);
            if (!m84VarQ.k()) {
                throw new FileSystemCannotCreateDirectoryException(uri);
            }
            m84 m84VarC = m84VarQ.c(str);
            if (m84VarC != null) {
                return m84VarC.j().toString();
            }
            throw new FileSystemCannotCreateDirectoryException("Unknown error", null);
        }
    }

    public static final class p1 implements gu5<zf8> {
        public static final p1 a = new p1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class q implements Function1<Object[], j6g> {
        public q() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            DeletingOptions deletingOptions = (DeletingOptions) objArr2[1];
            Uri uri = Uri.parse(ta5.a((String) obj));
            Uri uriWithAppendedPath = Uri.withAppendedPath(uri, "..");
            uriWithAppendedPath.getClass();
            String strL = z3.l("Location '", "' isn't deletable.", uri);
            qa5 qa5Var = qa5.this;
            qa5Var.n(uriWithAppendedPath, e8b.b, strL);
            if (wl7.b(uri.getScheme(), "file")) {
                File fileT = qa5.t(uri);
                if (fileT.exists()) {
                    int i = db5.a;
                    try {
                        p13 p13VarA = o6b.a(fileT.toPath(), o6b.b, are.a);
                        if (p13VarA.c.a < 1 && p13VarA.b.a < 1) {
                            throw new FileNotFoundException(l6.g(fileT, "File does not exist: "));
                        }
                    } catch (IOException e) {
                        throw new IOException(l6.g(fileT, "Cannot delete file: "), e);
                    }
                } else if (!deletingOptions.getIdempotent()) {
                    throw new FileSystemFileNotFoundException(uri);
                }
            } else {
                if (!qa5.r(uri)) {
                    r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
                    return null;
                }
                m84 m84VarQ = qa5Var.q(uri);
                if (m84VarQ.f()) {
                    m84VarQ.e();
                } else if (!deletingOptions.getIdempotent()) {
                    throw new FileSystemFileNotFoundException(uri);
                }
            }
            return j6g.a;
        }
    }

    public static final class q0 implements gu5<zf8> {
        public static final q0 a = new q0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class q1 implements gu5<zf8> {
        public static final q1 a = new q1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(DownloadOptionsLegacy.class);
        }
    }

    public static final class r implements Function2<Object[], p3c, j6g> {
        public r() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws FileSystemCannotMoveFileException, IOException, Exceptions$AppContextLost {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            RelocatingOptions relocatingOptions = (RelocatingOptions) p3cVar2;
            Uri uri = Uri.parse(ta5.a(relocatingOptions.getFrom()));
            Uri uriWithAppendedPath = Uri.withAppendedPath(uri, "..");
            uriWithAppendedPath.getClass();
            String strL = z3.l("Location '", "' isn't movable.", uri);
            qa5 qa5Var = qa5.this;
            e8b e8bVar = e8b.b;
            qa5Var.n(uriWithAppendedPath, e8bVar, strL);
            Uri uri2 = Uri.parse(ta5.a(relocatingOptions.getTo()));
            uri2.getClass();
            qa5Var.m(uri2, e8bVar);
            if (wl7.b(uri.getScheme(), "file")) {
                if (!qa5.t(uri).renameTo(qa5.t(uri2))) {
                    throw new FileSystemCannotMoveFileException(uri, uri2);
                }
            } else {
                if (!qa5.r(uri)) {
                    r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
                    return null;
                }
                m84 m84VarQ = qa5Var.q(uri);
                if (!m84VarQ.f()) {
                    throw new FileSystemCannotMoveFileException(uri, uri2);
                }
                qa5Var.u(m84VarQ, qa5.t(uri2), false);
            }
            return j6g.a;
        }
    }

    public static final class r0 implements gu5<zf8> {
        public static final r0 a = new r0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class r1 implements gu5<zf8> {
        public static final r1 a = new r1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(String.class);
        }
    }

    public static final class s implements gu5<zf8> {
        public static final s a = new s();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(RelocatingOptions.class);
        }
    }

    public static final class s0 implements gu5<zf8> {
        public static final s0 a = new s0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class s1 implements gu5<zf8> {
        public static final s1 a = new s1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(String.class);
        }
    }

    public static final class t implements Function1<Object[], j6g> {
        public t() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws FileSystemCannotMoveFileException, IOException, Exceptions$AppContextLost {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            RelocatingOptions relocatingOptions = (RelocatingOptions) objArr2[0];
            Uri uri = Uri.parse(ta5.a(relocatingOptions.getFrom()));
            Uri uriWithAppendedPath = Uri.withAppendedPath(uri, "..");
            uriWithAppendedPath.getClass();
            String strL = z3.l("Location '", "' isn't movable.", uri);
            qa5 qa5Var = qa5.this;
            e8b e8bVar = e8b.b;
            qa5Var.n(uriWithAppendedPath, e8bVar, strL);
            Uri uri2 = Uri.parse(ta5.a(relocatingOptions.getTo()));
            uri2.getClass();
            qa5Var.m(uri2, e8bVar);
            if (wl7.b(uri.getScheme(), "file")) {
                if (!qa5.t(uri).renameTo(qa5.t(uri2))) {
                    throw new FileSystemCannotMoveFileException(uri, uri2);
                }
            } else {
                if (!qa5.r(uri)) {
                    r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
                    return null;
                }
                m84 m84VarQ = qa5Var.q(uri);
                if (!m84VarQ.f()) {
                    throw new FileSystemCannotMoveFileException(uri, uri2);
                }
                qa5Var.u(m84VarQ, qa5.t(uri2), false);
            }
            return j6g.a;
        }
    }

    public static final class t0 implements Function1<Object[], Bundle> {
        public t0() {
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0116 A[Catch: FileNotFoundException -> 0x0159, TryCatch #0 {FileNotFoundException -> 0x0159, blocks: (B:27:0x00e2, B:29:0x00e8, B:34:0x00f7, B:36:0x00fd, B:43:0x011c, B:45:0x0142, B:47:0x0153, B:48:0x0158, B:37:0x010a, B:40:0x0111, B:41:0x0116), top: B:51:0x00e2 }] */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.os.Bundle invoke(java.lang.Object[] r15) throws java.io.IOException, expo.modules.kotlin.exception.Exceptions$AppContextLost {
            /*
                Method dump skipped, instruction units count: 357
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: qa5.t0.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final class t1 implements Function2<Object[], p3c, j6g> {
        public t1() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws IOException {
            OkHttpClient okHttpClient;
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            String str = (String) objArr2[4];
            DownloadOptionsLegacy downloadOptionsLegacy = (DownloadOptionsLegacy) obj4;
            String str2 = (String) obj3;
            String str3 = (String) obj;
            Uri uri = Uri.parse(ta5.a((String) obj2));
            uri.getClass();
            qa5.e(uri);
            if (!wl7.b(uri.getScheme(), "file")) {
                r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
                return null;
            }
            qa5 qa5Var = qa5.this;
            m mVar = new m(str, str2, qa5Var);
            OkHttpClient okHttpClientI = qa5.i(qa5Var);
            if (okHttpClientI != null) {
                OkHttpClient.Builder builderE = okHttpClientI.e();
                builderE.c.add(new i2(mVar));
                okHttpClient = new OkHttpClient(builderE);
            } else {
                okHttpClient = null;
            }
            if (okHttpClient == null) {
                p3cVar2.g(new FileSystemOkHttpNullException());
            } else {
                Request.Builder builder = new Request.Builder();
                if (str != null) {
                    builder.a("Range", "bytes=" + str + "-");
                }
                if (downloadOptionsLegacy.getHeaders() != null) {
                    for (Map.Entry<String, String> entry : downloadOptionsLegacy.getHeaders().entrySet()) {
                        builder.a(entry.getKey(), entry.getValue());
                    }
                }
                builder.g(str3);
                RealCall realCall = new RealCall(okHttpClient, builder.b(), false);
                qa5Var.e.put(str2, new b(uri, realCall));
                u63.Y(qa5Var.f, null, null, new l(null, new a(downloadOptionsLegacy, realCall, qa5.t(uri), str != null, p3cVar2), qa5Var), 3);
            }
            return j6g.a;
        }
    }

    public static final class u implements Function2<Object[], p3c, j6g> {
        public u() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws IOException, FileSystemCopyFailedException, Exceptions$AppContextLost {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            RelocatingOptions relocatingOptions = (RelocatingOptions) p3cVar2;
            Uri uri = Uri.parse(ta5.a(relocatingOptions.getFrom()));
            uri.getClass();
            String strL = z3.l("Location '", "' isn't readable.", uri);
            qa5 qa5Var = qa5.this;
            qa5Var.n(uri, e8b.a, strL);
            Uri uri2 = Uri.parse(ta5.a(relocatingOptions.getTo()));
            uri2.getClass();
            qa5Var.m(uri2, e8b.b);
            if (wl7.b(uri.getScheme(), "file")) {
                File fileT = qa5.t(uri);
                File fileT2 = qa5.t(uri2);
                if (fileT.isDirectory()) {
                    db5.b(fileT, fileT2);
                } else {
                    int i = db5.a;
                    db5.c(fileT, fileT2, StandardCopyOption.REPLACE_EXISTING);
                }
            } else if (qa5.r(uri)) {
                m84 m84VarQ = qa5Var.q(uri);
                if (!m84VarQ.f()) {
                    throw new FileSystemCopyFailedException(uri);
                }
                qa5Var.u(m84VarQ, qa5.t(uri2), true);
            } else if (wl7.b(uri.getScheme(), "content")) {
                sn6.a(qa5Var.o().getContentResolver().openInputStream(uri), new FileOutputStream(qa5.t(uri2)));
            } else if (wl7.b(uri.getScheme(), "asset")) {
                sn6.a(qa5Var.s(uri), new FileOutputStream(qa5.t(uri2)));
            } else {
                if (uri.getScheme() != null) {
                    r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
                    return null;
                }
                sn6.a(qa5.k(qa5Var, relocatingOptions.getFrom()), new FileOutputStream(qa5.t(uri2)));
            }
            return j6g.a;
        }
    }

    public static final class u0 implements Function1<Object[], String> {
        public u0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Object[] objArr) throws IOException, FileSystemCannotCreateFileException, Exceptions$AppContextLost {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            String str = (String) objArr2[2];
            String str2 = (String) obj2;
            Uri uri = Uri.parse(ta5.a((String) obj));
            uri.getClass();
            e8b e8bVar = e8b.b;
            qa5 qa5Var = qa5.this;
            qa5Var.m(uri, e8bVar);
            if (!qa5.r(uri)) {
                r40.h(z3.l("The URI '", "' is not a Storage Access Framework URI.", uri));
                return null;
            }
            m84 m84VarQ = qa5Var.q(uri);
            if (!m84VarQ.k()) {
                throw new FileSystemCannotCreateFileException(z3.l("Provided uri '", "' is not pointing to a directory", uri), null);
            }
            m84 m84VarD = m84VarQ.d(str, str2);
            if (m84VarD != null) {
                return m84VarD.j().toString();
            }
            throw new FileSystemCannotCreateFileException("Unknown error", null);
        }
    }

    public static final class u1 implements Function2<Object[], p3c, j6g> {
        public u1() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws FileSystemPendingPermissionsRequestException {
            Uri uri;
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            String str = (String) objArr2[0];
            qa5 qa5Var = qa5.this;
            if (qa5Var.d != null) {
                throw new FileSystemPendingPermissionsRequestException();
            }
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (str != null && (uri = Uri.parse(ta5.a(str))) != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            qa5Var.d = p3cVar2;
            qa5Var.b().e().startActivityForResult(intent, 5394);
            return j6g.a;
        }
    }

    public static final class v implements gu5<zf8> {
        public static final v a = new v();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(RelocatingOptions.class);
        }
    }

    public static final class v0 implements Function2<Object[], p3c, j6g> {
        public v0() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            d dVar = (d) qa5.this.e.get((String) p3cVar2);
            if (dVar != null) {
                dVar.a.cancel();
            }
            return j6g.a;
        }
    }

    public static final class v1 implements gu5<zf8> {
        public static final v1 a = new v1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class w implements Function1<Object[], Object> {
        public w() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws IOException, FileSystemCopyFailedException, Exceptions$AppContextLost {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            RelocatingOptions relocatingOptions = (RelocatingOptions) objArr2[0];
            Uri uri = Uri.parse(ta5.a(relocatingOptions.getFrom()));
            uri.getClass();
            String strL = z3.l("Location '", "' isn't readable.", uri);
            qa5 qa5Var = qa5.this;
            qa5Var.n(uri, e8b.a, strL);
            Uri uri2 = Uri.parse(ta5.a(relocatingOptions.getTo()));
            uri2.getClass();
            qa5Var.m(uri2, e8b.b);
            if (wl7.b(uri.getScheme(), "file")) {
                File fileT = qa5.t(uri);
                File fileT2 = qa5.t(uri2);
                if (fileT.isDirectory()) {
                    db5.b(fileT, fileT2);
                    return j6g.a;
                }
                int i = db5.a;
                db5.c(fileT, fileT2, StandardCopyOption.REPLACE_EXISTING);
                return j6g.a;
            }
            if (qa5.r(uri)) {
                m84 m84VarQ = qa5Var.q(uri);
                if (!m84VarQ.f()) {
                    throw new FileSystemCopyFailedException(uri);
                }
                qa5Var.u(m84VarQ, qa5.t(uri2), true);
                return j6g.a;
            }
            if (wl7.b(uri.getScheme(), "content")) {
                return Integer.valueOf(sn6.a(qa5Var.o().getContentResolver().openInputStream(uri), new FileOutputStream(qa5.t(uri2))));
            }
            if (wl7.b(uri.getScheme(), "asset")) {
                return Integer.valueOf(sn6.a(qa5Var.s(uri), new FileOutputStream(qa5.t(uri2))));
            }
            if (uri.getScheme() == null) {
                return Integer.valueOf(sn6.a(qa5.k(qa5Var, relocatingOptions.getFrom()), new FileOutputStream(qa5.t(uri2))));
            }
            r40.h(z3.l("Unsupported scheme for location '", "'.", uri));
            return null;
        }
    }

    public static final class w0 implements gu5<zf8> {
        public static final w0 a = new w0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class w1 implements gu5<zf8> {
        public static final w1 a = new w1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class x implements gu5<zf8> {
        public static final x a = new x();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class x0 implements Function1<Object[], j6g> {
        public x0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            d dVar = (d) qa5.this.e.get((String) objArr2[0]);
            if (dVar == null) {
                return null;
            }
            dVar.a.cancel();
            return j6g.a;
        }
    }

    public static final class x1 implements gu5<zf8> {
        public static final x1 a = new x1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemUploadOptions.class);
        }
    }

    public static final class y implements gu5<zf8> {
        public static final y a = new y();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class y0 implements Function2<Object[], p3c, j6g> {
        public y0() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws FileSystemCannotFindTaskException, IOException {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            String str = (String) p3cVar2;
            HashMap map = qa5.this.e;
            d dVar = (d) map.get(str);
            if (dVar == null) {
                r40.h("No download object available");
                return null;
            }
            if (!(dVar instanceof b)) {
                throw new FileSystemCannotFindTaskException();
            }
            dVar.a.cancel();
            map.remove(str);
            new Bundle().putString("resumeData", String.valueOf(qa5.t(((b) dVar).b).length()));
            return j6g.a;
        }
    }

    public static final class y1 implements Function2<Object[], p3c, j6g> {
        public y1(vx9 vx9Var) {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws IOException, Exceptions$AppContextLost {
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            FileSystemUploadOptions fileSystemUploadOptions = (FileSystemUploadOptions) objArr2[2];
            g gVar = g.a;
            qa5 qa5Var = qa5.this;
            Request requestG = qa5.g(qa5Var, (String) obj, (String) obj2, fileSystemUploadOptions, gVar);
            OkHttpClient okHttpClientI = qa5.i(qa5Var);
            if (okHttpClientI != null) {
                new RealCall(okHttpClientI, requestG, false).R0(new f(p3cVar2, qa5Var));
            } else {
                p3cVar2.g(new FileSystemOkHttpNullException());
            }
            return j6g.a;
        }
    }

    public static final class z implements gu5<zf8> {
        public static final z a = new z();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(MakeDirectoryOptions.class);
        }
    }

    public static final class z0 implements gu5<zf8> {
        public static final z0 a = new z0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class z1 implements gu5<zf8> {
        public static final z1 a = new z1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final void e(Uri uri) throws IOException {
        File fileT = t(uri);
        File parentFile = fileT.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            r40.h(akb.k("Directory for '", fileT.getPath(), "' doesn't exist. Please make sure directory '", fileT.getParent(), "' exists before calling downloadAsync."));
        }
    }

    public static final Uri f(qa5 qa5Var, File file) {
        Uri uriD = FileProvider.d(qa5Var.b().e().getApplication(), qa5Var.b().e().getApplication().getPackageName() + ".FileSystemFileProvider", file);
        uriD.getClass();
        return uriD;
    }

    public static final Request g(qa5 qa5Var, String str, String str2, FileSystemUploadOptions fileSystemUploadOptions, p3d p3dVar) throws IOException, Exceptions$AppContextLost {
        RequestBody requestBodyA;
        Uri uri = Uri.parse(ta5.a(str2));
        uri.getClass();
        qa5Var.m(uri, e8b.a);
        File fileT = t(uri);
        MediaType mediaTypeA = null;
        if (!fileT.exists()) {
            r40.h(l5.m("Directory for '", fileT.getPath(), "' doesn't exist."));
            return null;
        }
        Request.Builder builder = new Request.Builder();
        builder.g(str);
        Map<String, String> headers = fileSystemUploadOptions.getHeaders();
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                builder.a(entry.getKey(), entry.getValue());
            }
        }
        File fileT2 = t(uri);
        int i3 = e.a[fileSystemUploadOptions.getUploadType().ordinal()];
        if (i3 == 1) {
            RequestBody.INSTANCE.getClass();
            requestBodyA = p3dVar.a(new RequestBody$Companion$asRequestBody$1(null, fileT2));
        } else {
            if (i3 != 2) {
                defpackage.l.g();
                return null;
            }
            MultipartBody.Builder builder2 = new MultipartBody.Builder(0);
            builder2.b(MultipartBody.g);
            Map<String, String> parameters = fileSystemUploadOptions.getParameters();
            ArrayList arrayList = builder2.c;
            if (parameters != null) {
                for (Map.Entry<String, String> entry2 : parameters.entrySet()) {
                    String key = entry2.getKey();
                    String string = entry2.getValue().toString();
                    key.getClass();
                    string.getClass();
                    MultipartBody.Part.c.getClass();
                    RequestBody.INSTANCE.getClass();
                    arrayList.add(MultipartBody.Part.Companion.b(key, null, RequestBody.Companion.a(string, null)));
                }
            }
            String mimeType = fileSystemUploadOptions.getMimeType();
            if (mimeType == null) {
                mimeType = URLConnection.guessContentTypeFromName(fileT2.getName());
                mimeType.getClass();
            }
            String fieldName = fileSystemUploadOptions.getFieldName();
            if (fieldName == null) {
                fieldName = fileT2.getName();
            }
            fieldName.getClass();
            String name = fileT2.getName();
            RequestBody.Companion companion = RequestBody.INSTANCE;
            MediaType.e.getClass();
            try {
                mediaTypeA = MediaType.Companion.a(mimeType);
            } catch (IllegalArgumentException unused) {
            }
            companion.getClass();
            RequestBody requestBodyA2 = p3dVar.a(new RequestBody$Companion$asRequestBody$1(mediaTypeA, fileT2));
            MultipartBody.Part.c.getClass();
            arrayList.add(MultipartBody.Part.Companion.b(fieldName, name, requestBodyA2));
            requestBodyA = builder2.a();
        }
        builder.e(fileSystemUploadOptions.getHttpMethod().getValue(), requestBodyA);
        return builder.b();
    }

    public static final void h(qa5 qa5Var, File file) throws IOException {
        if (file.isDirectory() || file.mkdirs()) {
            return;
        }
        throw new IOException("Couldn't create directory '" + file + "'");
    }

    public static final OkHttpClient i(qa5 qa5Var) {
        OkHttpClient okHttpClient;
        synchronized (qa5Var) {
            try {
                if (qa5Var.c == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    builder.c(60L, timeUnit);
                    builder.z = Util.b(60L, timeUnit);
                    builder.A = Util.b(60L, timeUnit);
                    qa5Var.c = new OkHttpClient(builder);
                }
                okHttpClient = qa5Var.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return okHttpClient;
    }

    public static final String j(qa5 qa5Var, File file) throws IOException {
        qa5Var.getClass();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            String str = new String(rh6.a(ee3.r(fileInputStream)));
            fileInputStream.close();
            return str;
        } finally {
        }
    }

    public static final InputStream k(qa5 qa5Var, String str) throws FileNotFoundException {
        int identifier = qa5Var.o().getResources().getIdentifier(str, "raw", qa5Var.o().getPackageName());
        if (identifier == 0 && (identifier = qa5Var.o().getResources().getIdentifier(str, "drawable", qa5Var.o().getPackageName())) == 0) {
            throw new FileNotFoundException(l5.m("No resource found with the name '", str, "'"));
        }
        InputStream inputStreamOpenRawResource = qa5Var.o().getResources().openRawResource(identifier);
        inputStreamOpenRawResource.getClass();
        return inputStreamOpenRawResource;
    }

    public static final Bundle l(qa5 qa5Var, Headers headers) {
        qa5Var.getClass();
        Bundle bundle = new Bundle();
        int size = headers.size();
        for (int i3 = 0; i3 < size; i3++) {
            String strB = headers.b(i3);
            if (bundle.containsKey(strB)) {
                bundle.putString(strB, bundle.getString(strB) + ", " + headers.g(i3));
            } else {
                bundle.putString(strB, headers.g(i3));
            }
        }
        return bundle;
    }

    public static long p(File file) {
        Object obj;
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file2 : fileArrListFiles) {
            file2.getClass();
            arrayList.add(Long.valueOf(p(file2)));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() + ((Number) it.next()).longValue());
            }
            obj = next;
        } else {
            obj = null;
        }
        Long l2 = (Long) obj;
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    public static boolean r(Uri uri) {
        if (wl7.b(uri.getScheme(), "content")) {
            String host = uri.getHost();
            if (host != null ? wve.K(host, "com.android.externalstorage", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static File t(Uri uri) throws IOException {
        if (uri.getPath() == null) {
            r40.h(p6.d(uri, "Invalid Uri: "));
            return null;
        }
        String path = uri.getPath();
        path.getClass();
        return new File(path);
    }

    @Override // defpackage.sx9
    @SuppressLint({"WrongConstant", "DiscouragedApi"})
    public final wx9 a() {
        Class cls;
        Class cls2;
        Class cls3;
        vx9 vx9Var;
        Object obj;
        Object obj2;
        Class cls4;
        Object obj3;
        Boolean bool;
        Boolean bool2;
        qf0 ch7Var;
        Boolean bool3;
        qf0 ch7Var2;
        Boolean bool4;
        qf0 ch7Var3;
        Boolean bool5;
        qf0 ch7Var4;
        qf0 ch7Var5;
        Object obj4;
        Class cls5;
        Class cls6;
        vx9 vx9Var2;
        Class cls7;
        qf0 o7gVar;
        Class cls8;
        qf0 ch7Var6;
        jpf.b("[ExpoModulesCore] ".concat(getClass() + ".ModuleDefinition"));
        try {
            vx9 vx9Var3 = new vx9(this);
            vx9Var3.i("ExponentFileSystem");
            tp2 tp2Var = new tp2("documentDirectory");
            tp2Var.a(new c2());
            vx9Var3.e().put("documentDirectory", tp2Var);
            tp2 tp2Var2 = new tp2("cacheDirectory");
            tp2Var2.a(new d2());
            vx9Var3.e().put("cacheDirectory", tp2Var2);
            tp2 tp2Var3 = new tp2("bundleDirectory");
            tp2Var3.a(new e2());
            vx9Var3.e().put("bundleDirectory", tp2Var3);
            vx9Var3.b("expo-file-system.downloadProgress", "expo-file-system.uploadProgress");
            LinkedHashMap linkedHashMapM = vx9Var3.m();
            i05 i05Var = i05.a;
            linkedHashMapM.put(i05Var, new nc1(i05Var, new g2()));
            pwf pwfVarF = vx9Var3.f();
            hb9 hb9Var = tf0.a;
            yd8 yd8VarA = fwc.a(String.class);
            Boolean bool6 = Boolean.FALSE;
            rf0 rf0Var = (rf0) tf0.a().get(new Pair(yd8VarA, bool6));
            if (rf0Var == null) {
                cls = InfoOptionsLegacy.class;
                cls2 = DownloadOptionsLegacy.class;
                cls3 = FileSystemUploadOptions.class;
                rf0Var = new rf0(new xp8(fwc.a(String.class), false, x.a), pwfVarF);
            } else {
                cls = InfoOptionsLegacy.class;
                cls2 = DownloadOptionsLegacy.class;
                cls3 = FileSystemUploadOptions.class;
            }
            rf0 rf0Var2 = (rf0) tf0.a().get(new Pair(fwc.a(cls), bool6));
            if (rf0Var2 == null) {
                i0 i0Var = i0.a;
                yd8 yd8VarA2 = fwc.a(cls);
                vx9Var = vx9Var3;
                rf0Var2 = new rf0(new xp8(yd8VarA2, false, i0Var), pwfVarF);
            } else {
                vx9Var = vx9Var3;
            }
            rf0[] rf0VarArr = {rf0Var, rf0Var2};
            t0 t0Var = new t0();
            Class cls9 = Integer.TYPE;
            boolean zB = wl7.b(Bundle.class, cls9);
            Class cls10 = Float.TYPE;
            Class cls11 = Double.TYPE;
            Class cls12 = Boolean.TYPE;
            vx9Var.d().put("getInfoAsync", zB ? new ch7("getInfoAsync", rf0VarArr, t0Var) : wl7.b(Bundle.class, cls12) ? new hi1("getInfoAsync", rf0VarArr, t0Var) : wl7.b(Bundle.class, cls11) ? new s84("getInfoAsync", rf0VarArr, t0Var) : wl7.b(Bundle.class, cls10) ? new ci5("getInfoAsync", rf0VarArr, t0Var) : wl7.b(Bundle.class, String.class) ? new zue("getInfoAsync", rf0VarArr, t0Var) : new o7g("getInfoAsync", rf0VarArr, t0Var));
            pwf pwfVarF2 = vx9Var.f();
            rf0 rf0Var3 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool6));
            if (rf0Var3 == null) {
                obj2 = Bundle.class;
                obj = Double.class;
                cls4 = RelocatingOptions.class;
                rf0Var3 = new rf0(new xp8(fwc.a(String.class), false, b1.a), pwfVarF2);
            } else {
                obj = Double.class;
                obj2 = Bundle.class;
                cls4 = RelocatingOptions.class;
            }
            rf0 rf0Var4 = (rf0) tf0.a().get(new Pair(fwc.a(ReadingOptions.class), bool6));
            if (rf0Var4 == null) {
                obj3 = p3c.class;
                rf0Var4 = new rf0(new xp8(fwc.a(ReadingOptions.class), false, c1.a), pwfVarF2);
            } else {
                obj3 = p3c.class;
            }
            vx9Var.d().put("readAsStringAsync", new o7g("readAsStringAsync", new rf0[]{rf0Var3, rf0Var4}, new d1()));
            pwf pwfVarF3 = vx9Var.f();
            rf0 rf0Var5 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool6));
            if (rf0Var5 == null) {
                rf0Var5 = new rf0(new xp8(fwc.a(String.class), false, e1.a), pwfVarF3);
            }
            rf0 rf0Var6 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool6));
            if (rf0Var6 == null) {
                rf0Var6 = new rf0(new xp8(fwc.a(String.class), false, f1.a), pwfVarF3);
            }
            rf0 rf0Var7 = (rf0) tf0.a().get(new Pair(fwc.a(WritingOptions.class), bool6));
            if (rf0Var7 == null) {
                bool = bool6;
                rf0Var7 = new rf0(new xp8(fwc.a(WritingOptions.class), false, g1.a), pwfVarF3);
            } else {
                bool = bool6;
            }
            rf0[] rf0VarArr2 = {rf0Var5, rf0Var6, rf0Var7};
            n nVar = new n();
            vx9Var.d().put("writeAsStringAsync", wl7.b(j6g.class, cls9) ? new ch7("writeAsStringAsync", rf0VarArr2, nVar) : wl7.b(j6g.class, cls12) ? new hi1("writeAsStringAsync", rf0VarArr2, nVar) : wl7.b(j6g.class, cls11) ? new s84("writeAsStringAsync", rf0VarArr2, nVar) : wl7.b(j6g.class, cls10) ? new ci5("writeAsStringAsync", rf0VarArr2, nVar) : wl7.b(j6g.class, String.class) ? new zue("writeAsStringAsync", rf0VarArr2, nVar) : new o7g("writeAsStringAsync", rf0VarArr2, nVar));
            pwf pwfVarF4 = vx9Var.f();
            Boolean bool7 = bool;
            rf0 rf0Var8 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool7));
            if (rf0Var8 == null) {
                rf0Var8 = new rf0(new xp8(fwc.a(String.class), false, o.a), pwfVarF4);
            }
            rf0 rf0Var9 = (rf0) tf0.a().get(new Pair(fwc.a(DeletingOptions.class), bool7));
            if (rf0Var9 == null) {
                rf0Var9 = new rf0(new xp8(fwc.a(DeletingOptions.class), false, p.a), pwfVarF4);
            }
            rf0[] rf0VarArr3 = {rf0Var8, rf0Var9};
            q qVar = new q();
            vx9Var.d().put("deleteAsync", wl7.b(j6g.class, cls9) ? new ch7("deleteAsync", rf0VarArr3, qVar) : wl7.b(j6g.class, cls12) ? new hi1("deleteAsync", rf0VarArr3, qVar) : wl7.b(j6g.class, cls11) ? new s84("deleteAsync", rf0VarArr3, qVar) : wl7.b(j6g.class, cls10) ? new ci5("deleteAsync", rf0VarArr3, qVar) : wl7.b(j6g.class, String.class) ? new zue("deleteAsync", rf0VarArr3, qVar) : new o7g("deleteAsync", rf0VarArr3, qVar));
            Object obj5 = obj3;
            Class cls13 = cls4;
            if (wl7.b(cls13, obj5)) {
                ch7Var = new ev0("moveAsync", new rf0[0], new r());
                bool2 = bool7;
            } else {
                pwf pwfVarF5 = vx9Var.f();
                rf0 rf0Var10 = (rf0) tf0.a().get(new Pair(fwc.a(cls13), bool7));
                if (rf0Var10 == null) {
                    bool2 = bool7;
                    rf0Var10 = new rf0(new xp8(fwc.a(cls13), false, s.a), pwfVarF5);
                } else {
                    bool2 = bool7;
                }
                rf0[] rf0VarArr4 = {rf0Var10};
                t tVar = new t();
                ch7Var = wl7.b(j6g.class, cls9) ? new ch7("moveAsync", rf0VarArr4, tVar) : wl7.b(j6g.class, cls12) ? new hi1("moveAsync", rf0VarArr4, tVar) : wl7.b(j6g.class, cls11) ? new s84("moveAsync", rf0VarArr4, tVar) : wl7.b(j6g.class, cls10) ? new ci5("moveAsync", rf0VarArr4, tVar) : wl7.b(j6g.class, String.class) ? new zue("moveAsync", rf0VarArr4, tVar) : new o7g("moveAsync", rf0VarArr4, tVar);
            }
            vx9Var.d().put("moveAsync", ch7Var);
            if (wl7.b(cls13, obj5)) {
                ch7Var2 = new ev0("copyAsync", new rf0[0], new u());
                bool3 = bool2;
            } else {
                pwf pwfVarF6 = vx9Var.f();
                bool3 = bool2;
                rf0 rf0Var11 = (rf0) tf0.a().get(new Pair(fwc.a(cls13), bool3));
                if (rf0Var11 == null) {
                    rf0Var11 = new rf0(new xp8(fwc.a(cls13), false, v.a), pwfVarF6);
                }
                rf0[] rf0VarArr5 = {rf0Var11};
                w wVar = new w();
                ch7Var2 = wl7.b(Object.class, cls9) ? new ch7("copyAsync", rf0VarArr5, wVar) : wl7.b(Object.class, cls12) ? new hi1("copyAsync", rf0VarArr5, wVar) : wl7.b(Object.class, cls11) ? new s84("copyAsync", rf0VarArr5, wVar) : wl7.b(Object.class, cls10) ? new ci5("copyAsync", rf0VarArr5, wVar) : wl7.b(Object.class, String.class) ? new zue("copyAsync", rf0VarArr5, wVar) : new o7g("copyAsync", rf0VarArr5, wVar);
            }
            vx9Var.d().put("copyAsync", ch7Var2);
            pwf pwfVarF7 = vx9Var.f();
            rf0 rf0Var12 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool3));
            if (rf0Var12 == null) {
                rf0Var12 = new rf0(new xp8(fwc.a(String.class), false, y.a), pwfVarF7);
            }
            rf0 rf0Var13 = (rf0) tf0.a().get(new Pair(fwc.a(MakeDirectoryOptions.class), bool3));
            if (rf0Var13 == null) {
                bool4 = bool3;
                rf0Var13 = new rf0(new xp8(fwc.a(MakeDirectoryOptions.class), false, z.a), pwfVarF7);
            } else {
                bool4 = bool3;
            }
            rf0[] rf0VarArr6 = {rf0Var12, rf0Var13};
            a0 a0Var = new a0();
            vx9Var.d().put("makeDirectoryAsync", wl7.b(j6g.class, cls9) ? new ch7("makeDirectoryAsync", rf0VarArr6, a0Var) : wl7.b(j6g.class, cls12) ? new hi1("makeDirectoryAsync", rf0VarArr6, a0Var) : wl7.b(j6g.class, cls11) ? new s84("makeDirectoryAsync", rf0VarArr6, a0Var) : wl7.b(j6g.class, cls10) ? new ci5("makeDirectoryAsync", rf0VarArr6, a0Var) : wl7.b(j6g.class, String.class) ? new zue("makeDirectoryAsync", rf0VarArr6, a0Var) : new o7g("makeDirectoryAsync", rf0VarArr6, a0Var));
            if (wl7.b(String.class, obj5)) {
                ch7Var3 = new ev0("readDirectoryAsync", new rf0[0], new b0());
            } else {
                pwf pwfVarF8 = vx9Var.f();
                rf0 rf0Var14 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), Boolean.TRUE));
                if (rf0Var14 == null) {
                    rf0Var14 = new rf0(new xp8(fwc.a(String.class), true, c0.a), pwfVarF8);
                }
                rf0[] rf0VarArr7 = {rf0Var14};
                d0 d0Var = new d0();
                ch7Var3 = wl7.b(List.class, cls9) ? new ch7("readDirectoryAsync", rf0VarArr7, d0Var) : wl7.b(List.class, cls12) ? new hi1("readDirectoryAsync", rf0VarArr7, d0Var) : wl7.b(List.class, cls11) ? new s84("readDirectoryAsync", rf0VarArr7, d0Var) : wl7.b(List.class, cls10) ? new ci5("readDirectoryAsync", rf0VarArr7, d0Var) : wl7.b(List.class, String.class) ? new zue("readDirectoryAsync", rf0VarArr7, d0Var) : new o7g("readDirectoryAsync", rf0VarArr7, d0Var);
            }
            vx9Var.d().put("readDirectoryAsync", ch7Var3);
            rf0[] rf0VarArr8 = new rf0[0];
            e0 e0Var = new e0();
            Object obj6 = obj;
            vx9Var.d().put("getTotalDiskCapacityAsync", wl7.b(obj6, cls9) ? new ch7("getTotalDiskCapacityAsync", rf0VarArr8, e0Var) : wl7.b(obj6, cls12) ? new hi1("getTotalDiskCapacityAsync", rf0VarArr8, e0Var) : wl7.b(obj6, cls11) ? new s84("getTotalDiskCapacityAsync", rf0VarArr8, e0Var) : wl7.b(obj6, cls10) ? new ci5("getTotalDiskCapacityAsync", rf0VarArr8, e0Var) : wl7.b(obj6, String.class) ? new zue("getTotalDiskCapacityAsync", rf0VarArr8, e0Var) : new o7g("getTotalDiskCapacityAsync", rf0VarArr8, e0Var));
            rf0[] rf0VarArr9 = new rf0[0];
            f0 f0Var = new f0();
            vx9Var.d().put("getFreeDiskStorageAsync", wl7.b(obj6, cls9) ? new ch7("getFreeDiskStorageAsync", rf0VarArr9, f0Var) : wl7.b(obj6, cls12) ? new hi1("getFreeDiskStorageAsync", rf0VarArr9, f0Var) : wl7.b(obj6, cls11) ? new s84("getFreeDiskStorageAsync", rf0VarArr9, f0Var) : wl7.b(obj6, cls10) ? new ci5("getFreeDiskStorageAsync", rf0VarArr9, f0Var) : wl7.b(obj6, String.class) ? new zue("getFreeDiskStorageAsync", rf0VarArr9, f0Var) : new o7g("getFreeDiskStorageAsync", rf0VarArr9, f0Var));
            if (wl7.b(String.class, obj5)) {
                ch7Var4 = new ev0("getContentUriAsync", new rf0[0], new g0());
                bool5 = bool4;
            } else {
                pwf pwfVarF9 = vx9Var.f();
                bool5 = bool4;
                rf0 rf0Var15 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
                if (rf0Var15 == null) {
                    rf0Var15 = new rf0(new xp8(fwc.a(String.class), false, h0.a), pwfVarF9);
                }
                rf0[] rf0VarArr10 = {rf0Var15};
                j0 j0Var = new j0();
                ch7Var4 = wl7.b(String.class, cls9) ? new ch7("getContentUriAsync", rf0VarArr10, j0Var) : wl7.b(String.class, cls12) ? new hi1("getContentUriAsync", rf0VarArr10, j0Var) : wl7.b(String.class, cls11) ? new s84("getContentUriAsync", rf0VarArr10, j0Var) : wl7.b(String.class, cls10) ? new ci5("getContentUriAsync", rf0VarArr10, j0Var) : wl7.b(String.class, String.class) ? new zue("getContentUriAsync", rf0VarArr10, j0Var) : new o7g("getContentUriAsync", rf0VarArr10, j0Var);
            }
            vx9Var.d().put("getContentUriAsync", ch7Var4);
            if (wl7.b(String.class, obj5)) {
                ch7Var5 = new ev0("readSAFDirectoryAsync", new rf0[0], new k0());
            } else {
                pwf pwfVarF10 = vx9Var.f();
                rf0 rf0Var16 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
                if (rf0Var16 == null) {
                    rf0Var16 = new rf0(new xp8(fwc.a(String.class), false, l0.a), pwfVarF10);
                }
                rf0[] rf0VarArr11 = {rf0Var16};
                m0 m0Var = new m0();
                ch7Var5 = wl7.b(List.class, cls9) ? new ch7("readSAFDirectoryAsync", rf0VarArr11, m0Var) : wl7.b(List.class, cls12) ? new hi1("readSAFDirectoryAsync", rf0VarArr11, m0Var) : wl7.b(List.class, cls11) ? new s84("readSAFDirectoryAsync", rf0VarArr11, m0Var) : wl7.b(List.class, cls10) ? new ci5("readSAFDirectoryAsync", rf0VarArr11, m0Var) : wl7.b(List.class, String.class) ? new zue("readSAFDirectoryAsync", rf0VarArr11, m0Var) : new o7g("readSAFDirectoryAsync", rf0VarArr11, m0Var);
            }
            vx9Var.d().put("readSAFDirectoryAsync", ch7Var5);
            pwf pwfVarF11 = vx9Var.f();
            rf0 rf0Var17 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var17 == null) {
                rf0Var17 = new rf0(new xp8(fwc.a(String.class), false, n0.a), pwfVarF11);
            }
            rf0 rf0Var18 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var18 == null) {
                rf0Var18 = new rf0(new xp8(fwc.a(String.class), false, o0.a), pwfVarF11);
            }
            rf0[] rf0VarArr12 = {rf0Var17, rf0Var18};
            p0 p0Var = new p0();
            vx9Var.d().put("makeSAFDirectoryAsync", wl7.b(String.class, cls9) ? new ch7("makeSAFDirectoryAsync", rf0VarArr12, p0Var) : wl7.b(String.class, cls12) ? new hi1("makeSAFDirectoryAsync", rf0VarArr12, p0Var) : wl7.b(String.class, cls11) ? new s84("makeSAFDirectoryAsync", rf0VarArr12, p0Var) : wl7.b(String.class, cls10) ? new ci5("makeSAFDirectoryAsync", rf0VarArr12, p0Var) : wl7.b(String.class, String.class) ? new zue("makeSAFDirectoryAsync", rf0VarArr12, p0Var) : new o7g("makeSAFDirectoryAsync", rf0VarArr12, p0Var));
            pwf pwfVarF12 = vx9Var.f();
            rf0 rf0Var19 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var19 == null) {
                rf0Var19 = new rf0(new xp8(fwc.a(String.class), false, q0.a), pwfVarF12);
            }
            rf0 rf0Var20 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var20 == null) {
                rf0Var20 = new rf0(new xp8(fwc.a(String.class), false, r0.a), pwfVarF12);
            }
            rf0 rf0Var21 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var21 == null) {
                obj4 = obj5;
                rf0Var21 = new rf0(new xp8(fwc.a(String.class), false, s0.a), pwfVarF12);
            } else {
                obj4 = obj5;
            }
            rf0[] rf0VarArr13 = {rf0Var19, rf0Var20, rf0Var21};
            u0 u0Var = new u0();
            vx9Var.d().put("createSAFFileAsync", wl7.b(String.class, cls9) ? new ch7("createSAFFileAsync", rf0VarArr13, u0Var) : wl7.b(String.class, cls12) ? new hi1("createSAFFileAsync", rf0VarArr13, u0Var) : wl7.b(String.class, cls11) ? new s84("createSAFFileAsync", rf0VarArr13, u0Var) : wl7.b(String.class, cls10) ? new ci5("createSAFFileAsync", rf0VarArr13, u0Var) : wl7.b(String.class, String.class) ? new zue("createSAFFileAsync", rf0VarArr13, u0Var) : new o7g("createSAFFileAsync", rf0VarArr13, u0Var));
            pwf pwfVarF13 = vx9Var.f();
            yd8 yd8VarA3 = fwc.a(String.class);
            Boolean bool8 = Boolean.TRUE;
            rf0 rf0Var22 = (rf0) tf0.a().get(new Pair(yd8VarA3, bool8));
            if (rf0Var22 == null) {
                rf0Var22 = new rf0(new xp8(fwc.a(String.class), true, r1.a), pwfVarF13);
            }
            vx9Var.d().put("requestDirectoryPermissionsAsync", new ev0("requestDirectoryPermissionsAsync", new rf0[]{rf0Var22}, new u1()));
            pwf pwfVarF14 = vx9Var.f();
            rf0 rf0Var23 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var23 == null) {
                rf0Var23 = new rf0(new xp8(fwc.a(String.class), false, v1.a), pwfVarF14);
            }
            rf0 rf0Var24 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var24 == null) {
                cls5 = cls10;
                rf0Var24 = new rf0(new xp8(fwc.a(String.class), false, w1.a), pwfVarF14);
            } else {
                cls5 = cls10;
            }
            rf0 rf0Var25 = (rf0) tf0.a().get(new Pair(fwc.a(cls3), bool5));
            if (rf0Var25 == null) {
                cls6 = cls11;
                rf0Var25 = new rf0(new xp8(fwc.a(cls3), false, x1.a), pwfVarF14);
            } else {
                cls6 = cls11;
            }
            rf0[] rf0VarArr14 = {rf0Var23, rf0Var24, rf0Var25};
            vx9 vx9Var4 = vx9Var;
            vx9Var4.d().put("uploadAsync", new ev0("uploadAsync", rf0VarArr14, new y1(vx9Var4)));
            pwf pwfVarF15 = vx9Var4.f();
            rf0 rf0Var26 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var26 == null) {
                rf0Var26 = new rf0(new xp8(fwc.a(String.class), false, z1.a), pwfVarF15);
            }
            rf0 rf0Var27 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var27 == null) {
                rf0Var27 = new rf0(new xp8(fwc.a(String.class), false, a2.a), pwfVarF15);
            }
            rf0 rf0Var28 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var28 == null) {
                vx9Var2 = vx9Var4;
                rf0Var28 = new rf0(new xp8(fwc.a(String.class), false, b2.a), pwfVarF15);
            } else {
                vx9Var2 = vx9Var4;
            }
            rf0 rf0Var29 = (rf0) tf0.a().get(new Pair(fwc.a(cls3), bool5));
            if (rf0Var29 == null) {
                h1 h1Var = h1.a;
                yd8 yd8VarA4 = fwc.a(cls3);
                cls7 = cls12;
                rf0Var29 = new rf0(new xp8(yd8VarA4, false, h1Var), pwfVarF15);
            } else {
                cls7 = cls12;
            }
            vx9Var2.d().put("uploadTaskStartAsync", new ev0("uploadTaskStartAsync", new rf0[]{rf0Var26, rf0Var27, rf0Var28, rf0Var29}, new i1()));
            pwf pwfVarF16 = vx9Var2.f();
            rf0 rf0Var30 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var30 == null) {
                rf0Var30 = new rf0(new xp8(fwc.a(String.class), false, j1.a), pwfVarF16);
            }
            rf0 rf0Var31 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool8));
            if (rf0Var31 == null) {
                rf0Var31 = new rf0(new xp8(fwc.a(String.class), true, k1.a), pwfVarF16);
            }
            rf0 rf0Var32 = (rf0) tf0.a().get(new Pair(fwc.a(cls2), bool5));
            if (rf0Var32 == null) {
                rf0Var32 = new rf0(new xp8(fwc.a(cls2), false, l1.a), pwfVarF16);
            }
            vx9Var2.d().put("downloadAsync", new ev0("downloadAsync", new rf0[]{rf0Var30, rf0Var31, rf0Var32}, new m1()));
            Object obj7 = obj4;
            if (wl7.b(String.class, obj7)) {
                o7gVar = new ev0("networkTaskCancelAsync", new rf0[0], new v0());
            } else {
                pwf pwfVarF17 = vx9Var2.f();
                rf0 rf0Var33 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
                if (rf0Var33 == null) {
                    rf0Var33 = new rf0(new xp8(fwc.a(String.class), false, w0.a), pwfVarF17);
                }
                o7gVar = new o7g("networkTaskCancelAsync", new rf0[]{rf0Var33}, new x0());
            }
            vx9Var2.d().put("networkTaskCancelAsync", o7gVar);
            pwf pwfVarF18 = vx9Var2.f();
            rf0 rf0Var34 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var34 == null) {
                rf0Var34 = new rf0(new xp8(fwc.a(String.class), false, n1.a), pwfVarF18);
            }
            rf0 rf0Var35 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var35 == null) {
                rf0Var35 = new rf0(new xp8(fwc.a(String.class), false, o1.a), pwfVarF18);
            }
            rf0 rf0Var36 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
            if (rf0Var36 == null) {
                rf0Var36 = new rf0(new xp8(fwc.a(String.class), false, p1.a), pwfVarF18);
            }
            rf0 rf0Var37 = (rf0) tf0.a().get(new Pair(fwc.a(cls2), bool5));
            if (rf0Var37 == null) {
                cls8 = cls9;
                rf0Var37 = new rf0(new xp8(fwc.a(cls2), false, q1.a), pwfVarF18);
            } else {
                cls8 = cls9;
            }
            rf0 rf0Var38 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool8));
            if (rf0Var38 == null) {
                rf0Var38 = new rf0(new xp8(fwc.a(String.class), true, s1.a), pwfVarF18);
            }
            vx9Var2.d().put("downloadResumableStartAsync", new ev0("downloadResumableStartAsync", new rf0[]{rf0Var34, rf0Var35, rf0Var36, rf0Var37, rf0Var38}, new t1()));
            if (wl7.b(String.class, obj7)) {
                ch7Var6 = new ev0("downloadResumablePauseAsync", new rf0[0], new y0());
            } else {
                pwf pwfVarF19 = vx9Var2.f();
                rf0 rf0Var39 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool5));
                if (rf0Var39 == null) {
                    rf0Var39 = new rf0(new xp8(fwc.a(String.class), false, z0.a), pwfVarF19);
                }
                rf0[] rf0VarArr15 = {rf0Var39};
                a1 a1Var = new a1();
                Object obj8 = obj2;
                ch7Var6 = wl7.b(obj8, cls8) ? new ch7("downloadResumablePauseAsync", rf0VarArr15, a1Var) : wl7.b(obj8, cls7) ? new hi1("downloadResumablePauseAsync", rf0VarArr15, a1Var) : wl7.b(obj8, cls6) ? new s84("downloadResumablePauseAsync", rf0VarArr15, a1Var) : wl7.b(obj8, cls5) ? new ci5("downloadResumablePauseAsync", rf0VarArr15, a1Var) : wl7.b(obj8, String.class) ? new zue("downloadResumablePauseAsync", rf0VarArr15, a1Var) : new o7g("downloadResumablePauseAsync", rf0VarArr15, a1Var);
            }
            vx9Var2.d().put("downloadResumablePauseAsync", ch7Var6);
            vx9Var2.m().put(i05.V, new fz4(new f2()));
            LinkedHashMap linkedHashMapM2 = vx9Var2.m();
            i05 i05Var2 = i05.b;
            linkedHashMapM2.put(i05Var2, new nc1(i05Var2, new h2()));
            return vx9Var2.k();
        } finally {
            jpf.d();
        }
    }

    public final void m(Uri uri, e8b e8bVar) throws IOException, Exceptions$AppContextLost {
        if (e8bVar == e8b.a) {
            n(uri, e8bVar, z3.l("Location '", "' isn't readable.", uri));
        }
        if (e8bVar == e8b.b) {
            n(uri, e8bVar, z3.l("Location '", "' isn't writable.", uri));
        }
        n(uri, e8bVar, "Location '" + uri + "' doesn't have permission '" + e8bVar.name() + "'.");
    }

    public final void n(Uri uri, e8b e8bVar, String str) throws IOException, Exceptions$AppContextLost {
        EnumSet enumSetOf;
        Object obj;
        boolean zR = r(uri);
        e8b e8bVar2 = e8b.a;
        if (zR) {
            m84 m84VarQ = q(uri);
            enumSetOf = EnumSet.noneOf(e8b.class);
            if (m84VarQ.a()) {
                enumSetOf.add(e8bVar2);
            }
            if (m84VarQ.b()) {
                enumSetOf.add(e8b.b);
            }
            enumSetOf.getClass();
        } else if (wl7.b(uri.getScheme(), "content") || wl7.b(uri.getScheme(), "asset")) {
            enumSetOf = EnumSet.of(e8bVar2);
        } else if (wl7.b(uri.getScheme(), "file")) {
            String path = uri.getPath();
            try {
                obj = b().a.a.get(ha5.class);
            } catch (Exception unused) {
                obj = null;
            }
            ha5 ha5Var = (ha5) obj;
            enumSetOf = ha5Var != null ? ha5Var.a(o(), path) : null;
        } else {
            enumSetOf = uri.getScheme() == null ? EnumSet.of(e8bVar2) : EnumSet.noneOf(e8b.class);
        }
        if (enumSetOf == null || !enumSetOf.contains(e8bVar)) {
            r40.h(str);
        }
    }

    public final ReactApplicationContext o() throws Exceptions$AppContextLost {
        ReactApplicationContext reactApplicationContextD = b().d();
        if (reactApplicationContextD != null) {
            return reactApplicationContextD;
        }
        throw new Exceptions$AppContextLost();
    }

    public final m84 q(Uri uri) throws Exceptions$AppContextLost {
        ReactApplicationContext reactApplicationContextO = o();
        sge sgeVar = new sge();
        sgeVar.a = reactApplicationContextO;
        sgeVar.b = uri;
        return sgeVar.l() ? sgeVar : m84.g(o(), uri);
    }

    public final InputStream s(Uri uri) throws IOException {
        String path = uri.getPath();
        if (path == null) {
            l5.q("Required value was null.");
            return null;
        }
        InputStream inputStreamOpen = o().getAssets().open(path.substring(1));
        inputStreamOpen.getClass();
        return inputStreamOpen;
    }

    public final void u(m84 m84Var, File file, boolean z2) throws IOException {
        if (!m84Var.f()) {
            return;
        }
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                r40.h("Couldn't create folder in output dir.");
                return;
            }
        } else if (!file.exists() && !file.mkdirs()) {
            r40.h("Couldn't create folder in output dir.");
            return;
        }
        if (m84Var.k()) {
            for (m84 m84Var2 : m84Var.o()) {
                m84Var2.getClass();
                u(m84Var2, file, z2);
            }
            if (z2) {
                return;
            }
            m84Var.e();
            return;
        }
        String strH = m84Var.h();
        if (strH == null) {
            return;
        }
        File file2 = file.isDirectory() ? new File(file.getPath(), strH) : new File(file.getPath());
        InputStream inputStreamOpenInputStream = o().getContentResolver().openInputStream(m84Var.j());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                sn6.a(inputStreamOpenInputStream, fileOutputStream);
                fileOutputStream.close();
                inputStreamOpenInputStream.close();
                if (z2) {
                    return;
                }
                m84Var.e();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0h.q(inputStreamOpenInputStream, th);
                throw th2;
            }
        }
    }
}
