package defpackage;

import android.net.Uri;
import android.util.Base64;
import android.webkit.URLUtil;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.gg8;
import defpackage.ka5;
import defpackage.o7d;
import expo.modules.filesystem.CopyOrMoveDirectoryToFileException;
import expo.modules.filesystem.CreateOptions;
import expo.modules.filesystem.DestinationAlreadyExistsException;
import expo.modules.filesystem.DestinationDoesNotExistException;
import expo.modules.filesystem.DirectoryInfo;
import expo.modules.filesystem.DownloadOptions;
import expo.modules.filesystem.EncodingType;
import expo.modules.filesystem.FileInfo;
import expo.modules.filesystem.FileSystemDirectory;
import expo.modules.filesystem.FileSystemFile;
import expo.modules.filesystem.FileSystemFileHandle;
import expo.modules.filesystem.FileSystemPath;
import expo.modules.filesystem.InfoOptions;
import expo.modules.filesystem.InvalidTypeFileException;
import expo.modules.filesystem.InvalidTypeFolderException;
import expo.modules.filesystem.MissingAppContextException;
import expo.modules.filesystem.PathInfo;
import expo.modules.filesystem.PickerCancelledException;
import expo.modules.filesystem.UnableToCreateException;
import expo.modules.filesystem.UnableToDeleteException;
import expo.modules.filesystem.UnableToDownloadException;
import expo.modules.filesystem.UnableToReadHandleException;
import expo.modules.filesystem.UnableToWriteHandleException;
import expo.modules.filesystem.WriteOptions;
import expo.modules.kotlin.exception.Exceptions$AppContextLost;
import expo.modules.kotlin.types.Either;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lua5;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ua5 extends sx9 {

    @uh3(c = "expo.modules.filesystem.FileSystemModule$definition$1$7", f = "FileSystemModule.kt", l = {97}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<hk0, lu2<? super j6g>, Object> {
        final /* synthetic */ luc<lk0<ja5, ka5>> $filePickerLauncher;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ua5 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(luc<lk0<ja5, ka5>> lucVar, ua5 ua5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$filePickerLauncher = lucVar;
            this.this$0 = ua5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$filePickerLauncher, this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hk0 hk0Var, lu2<? super j6g> lu2Var) {
            return ((a) create(hk0Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            luc<lk0<ja5, ka5>> lucVar;
            T t;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hk0 hk0Var = (hk0) this.L$0;
                luc<lk0<ja5, ka5>> lucVar2 = this.$filePickerLauncher;
                ia5 ia5Var = new ia5(this.this$0);
                this.L$0 = lucVar2;
                this.label = 1;
                Object objA = hk0Var.a(ia5Var, new r40(1), this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
                    return g13Var;
                }
                lucVar = lucVar2;
                t = objA;
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lucVar = (luc) this.L$0;
                r7d.b(obj);
                t = obj;
            }
            lucVar.element = t;
            return j6g.a;
        }
    }

    public static final class a0 implements Function2<Object[], p3c, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws InvalidTypeFileException, IOException {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            ((FileSystemFile) p3cVar2).s0();
            return j6g.a;
        }
    }

    public static final class a1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws UnableToDeleteException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((FileSystemFile) objArr2[0]).b0();
            return j6g.a;
        }
    }

    public static final class a2 implements gu5<zf8> {
        public static final a2 a = new a2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFileHandle.class);
        }
    }

    public static final class a3 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws InvalidTypeFolderException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            FileSystemDirectory fileSystemDirectory = (FileSystemDirectory) objArr2[0];
            fileSystemDirectory.o0();
            fileSystemDirectory.m0(e8b.a);
            List<e6g> listM = fileSystemDirectory.d0().m();
            ArrayList arrayList = new ArrayList(t92.r0(listM, 10));
            for (e6g e6gVar : listM) {
                String string = e6gVar.a().toString();
                string.getClass();
                Pair pair = new Pair("isDirectory", Boolean.valueOf(e6gVar.isDirectory()));
                if (!wve.D(string, "/", false)) {
                    string = string.concat("/");
                }
                arrayList.add(lc9.a0(pair, new Pair("uri", string)));
            }
            return arrayList;
        }
    }

    public static final class b implements gu5<zf8> {
        public static final b a = new b();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class b0 implements gu5<zf8> {
        public static final b0 a = new b0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class b1 implements gu5<zf8> {
        public static final b1 a = new b1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class b2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws IOException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((FileSystemFileHandle) objArr2[0]).close();
            return j6g.a;
        }
    }

    public static final class b3 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws InvalidTypeFolderException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            FileSystemDirectory fileSystemDirectory = (FileSystemDirectory) objArr2[0];
            fileSystemDirectory.o0();
            fileSystemDirectory.m0(e8b.a);
            if (!fileSystemDirectory.d0().exists()) {
                return new DirectoryInfo(false, yid.i(fileSystemDirectory.d0().a().toString()), null, null, null, null, null, 124, null);
            }
            String strI = yid.i(fileSystemDirectory.d0().a().toString());
            List<e6g> listM = fileSystemDirectory.d0().m();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listM.iterator();
            while (it.hasNext()) {
                String fileName = ((e6g) it.next()).getFileName();
                if (fileName != null) {
                    arrayList.add(fileName);
                }
            }
            fileSystemDirectory.o0();
            return new DirectoryInfo(true, strI, arrayList, null, Long.valueOf(fileSystemDirectory.r0()), fileSystemDirectory.d0().o(), fileSystemDirectory.d0().getCreationTime(), 8, null);
        }
    }

    public static final class c implements gu5<zf8> {
        public static final c a = new c();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFileHandle.class);
        }
    }

    public static final class c0 implements Function1<Object[], byte[]> {
        @Override // kotlin.jvm.functions.Function1
        public final byte[] invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((FileSystemFile) objArr2[0]).s0();
        }
    }

    public static final class c1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return new FileSystemFileHandle((FileSystemFile) objArr2[0]);
        }
    }

    public static final class c2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            FileSystemFileHandle fileSystemFileHandle = (FileSystemFileHandle) objArr2[0];
            fileSystemFileHandle.getClass();
            try {
                return Long.valueOf(fileSystemFileHandle.e.position());
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final class c3 implements gu5<zf8> {
        public static final c3 a = new c3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemDirectory.class);
        }
    }

    public static final class d implements gu5<zf8> {
        public static final d a = new d();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemDirectory.class);
        }
    }

    public static final class d0 implements gu5<zf8> {
        public static final d0 a = new d0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Uri.class);
        }
    }

    public static final class d1 implements gu5<zf8> {
        public static final d1 a = new d1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class d2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            FileSystemFileHandle fileSystemFileHandle = (FileSystemFileHandle) objArr2[0];
            fileSystemFileHandle.getClass();
            try {
                return Long.valueOf(fileSystemFileHandle.e.size());
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final class d3 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws UnableToDeleteException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((FileSystemDirectory) objArr2[0]).b0();
            return j6g.a;
        }
    }

    public static final class e implements gu5<String> {
        public e() {
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return Uri.fromFile(ua5.e(ua5.this).getFilesDir()) + "/";
        }
    }

    public static final class e0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return new FileSystemFile((Uri) objArr2[0]);
        }
    }

    public static final class e1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((FileSystemFile) objArr2[0]).getClass();
            return j6g.a;
        }
    }

    public static final class e2 implements gu5<zf8> {
        public static final e2 a = new e2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Long.TYPE);
        }
    }

    public static final class e3 implements gu5<zf8> {
        public static final e3 a = new e3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemDirectory.class);
        }
    }

    public static final class f implements gu5<String> {
        public f() {
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return Uri.fromFile(ua5.e(ua5.this).getCacheDir()) + "/";
        }
    }

    public static final class f0 implements gu5<zf8> {
        public static final f0 a = new f0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(WriteOptions.class);
        }
    }

    public static final class f1 implements gu5<zf8> {
        public static final f1 a = new f1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class f2 implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws IOException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            if (obj2 == null) {
                ja.k("null cannot be cast to non-null type kotlin.Long");
                return null;
            }
            ((FileSystemFileHandle) obj).e.position(((Long) obj2).longValue());
            return j6g.a;
        }
    }

    public static final class f3 implements gu5<zf8> {
        public static final f3 a = new f3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(CreateOptions.class);
        }
    }

    public static final class g implements gu5<String> {
        @Override // defpackage.gu5
        public final String invoke() {
            return "asset://";
        }
    }

    public static final class g0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws InvalidTypeFileException, IOException, UnableToCreateException {
            FileOutputStream fileOutputStream;
            OutputStream outputStreamW;
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            WriteOptions writeOptions = (WriteOptions) objArr2[2];
            Either either = (Either) obj2;
            FileSystemFile fileSystemFile = (FileSystemFile) obj;
            iwc iwcVar = fwc.a;
            iwcVar.b(String.class);
            either.getClass();
            boolean zB = either.b(0);
            e8b e8bVar = e8b.b;
            if (zB) {
                iwcVar.b(String.class);
                Object objA = either.a(0);
                objA.getClass();
                String str = (String) objA;
                if ((writeOptions != null ? writeOptions.getEncoding() : null) == EncodingType.BASE64) {
                    byte[] bArrDecode = Base64.decode(str, 0);
                    bArrDecode.getClass();
                    fileSystemFile.getClass();
                    fileSystemFile.o0();
                    fileSystemFile.m0(e8bVar);
                    if (!fileSystemFile.L0()) {
                        fileSystemFile.B0(new CreateOptions(false, false, false, 7, null));
                    }
                    if (yid.g(fileSystemFile.c)) {
                        outputStreamW = fileSystemFile.d0().w();
                        try {
                            outputStreamW.write(bArrDecode);
                            j6g j6gVar = j6g.a;
                            outputStreamW.close();
                        } finally {
                        }
                    } else {
                        fileOutputStream = new FileOutputStream(fileSystemFile.f0());
                        try {
                            fileOutputStream.write(bArrDecode);
                            j6g j6gVar2 = j6g.a;
                            fileOutputStream.close();
                        } finally {
                        }
                    }
                } else {
                    fileSystemFile.getClass();
                    fileSystemFile.o0();
                    fileSystemFile.m0(e8bVar);
                    if (!fileSystemFile.L0()) {
                        fileSystemFile.B0(new CreateOptions(false, false, false, 7, null));
                    }
                    outputStreamW = fileSystemFile.d0().w();
                    try {
                        byte[] bytes = str.getBytes(a32.b);
                        bytes.getClass();
                        outputStreamW.write(bytes);
                        j6g j6gVar3 = j6g.a;
                        outputStreamW.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            }
            iwcVar.b(pyf.class);
            if (either.b(1)) {
                iwcVar.b(pyf.class);
                Object objA2 = either.a(1);
                objA2.getClass();
                pyf pyfVar = (pyf) objA2;
                fileSystemFile.getClass();
                fileSystemFile.o0();
                fileSystemFile.m0(e8bVar);
                if (!fileSystemFile.L0()) {
                    fileSystemFile.B0(new CreateOptions(false, false, false, 7, null));
                }
                if (yid.g(fileSystemFile.c)) {
                    outputStreamW = fileSystemFile.d0().w();
                    try {
                        byte[] bArr = new byte[pyfVar.getLength()];
                        pyfVar.toDirectBuffer().get(bArr);
                        outputStreamW.write(bArr);
                        j6g j6gVar4 = j6g.a;
                        outputStreamW.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    fileOutputStream = new FileOutputStream(fileSystemFile.f0());
                    try {
                        fileOutputStream.getChannel().write(pyfVar.toDirectBuffer());
                        fileOutputStream.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            }
            return j6g.a;
        }
    }

    public static final class g1 implements gu5<zf8> {
        public static final g1 a = new g1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(CreateOptions.class);
        }
    }

    public static final class g2 implements gu5<zf8> {
        public static final g2 a = new g2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Uri.class);
        }
    }

    public static final class g3 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws InvalidTypeFolderException, UnableToCreateException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            CreateOptions createOptions = (CreateOptions) objArr2[1];
            FileSystemDirectory fileSystemDirectory = (FileSystemDirectory) obj;
            if (createOptions == null) {
                createOptions = new CreateOptions(false, false, false, 7, null);
            }
            fileSystemDirectory.getClass();
            fileSystemDirectory.o0();
            fileSystemDirectory.m0(e8b.b);
            if (!fileSystemDirectory.d0().exists() || !createOptions.getIdempotent()) {
                if (yid.g(fileSystemDirectory.c)) {
                    throw new UnableToCreateException("create function does not work with SAF Uris, use `createDirectory` and `createFile` instead");
                }
                if (!createOptions.getOverwrite() && fileSystemDirectory.d0().exists()) {
                    throw new UnableToCreateException("it already exists");
                }
                if (createOptions.getOverwrite() && fileSystemDirectory.d0().exists()) {
                    fileSystemDirectory.d0().delete();
                }
                if (!(createOptions.getIntermediates() ? fileSystemDirectory.f0().mkdirs() : fileSystemDirectory.f0().mkdir())) {
                    throw new UnableToCreateException("directory already exists or could not be created");
                }
            }
            return j6g.a;
        }
    }

    public static final class h implements gu5<zf8> {
        public static final h a = new h();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(URI.class);
        }
    }

    public static final class h0 implements gu5<zf8> {
        public static final h0 a = new h0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class h1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws InvalidTypeFileException, UnableToCreateException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            CreateOptions createOptions = (CreateOptions) objArr2[1];
            FileSystemFile fileSystemFile = (FileSystemFile) obj;
            if (createOptions == null) {
                createOptions = new CreateOptions(false, false, false, 7, null);
            }
            fileSystemFile.B0(createOptions);
            return j6g.a;
        }
    }

    public static final class h2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return new FileSystemDirectory((Uri) objArr2[0]);
        }
    }

    public static final class h3 implements gu5<zf8> {
        public static final h3 a = new h3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemDirectory.class);
        }
    }

    public static final class i implements gu5<zf8> {
        public static final i a = new i();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemPath.class);
        }
    }

    public static final class i0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((FileSystemFile) objArr2[0]).P0();
        }
    }

    public static final class i1 implements gu5<zf8> {
        public static final i1 a = new i1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class i2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws InvalidTypeFolderException, UnableToCreateException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            String str = (String) objArr2[1];
            FileSystemDirectory fileSystemDirectory = (FileSystemDirectory) obj;
            fileSystemDirectory.getClass();
            str.getClass();
            fileSystemDirectory.o0();
            fileSystemDirectory.m0(e8b.b);
            e6g e6gVarH = fileSystemDirectory.d0().h(str);
            if (e6gVarH != null) {
                return new FileSystemDirectory(e6gVarH.a());
            }
            throw new UnableToCreateException("directory could not be created");
        }
    }

    public static final class i3 implements gu5<zf8> {
        public static final i3 a = new i3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class j implements gu5<zf8> {
        public static final j a = new j();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(DownloadOptions.class);
        }
    }

    public static final class j0 implements gu5<zf8> {
        public static final j0 a = new j0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class j1 implements gu5<zf8> {
        public static final j1 a = new j1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            gg8 gg8Var = gg8.c;
            gg8 gg8VarA = gg8.a.a(fwc.d(String.class));
            gg8 gg8VarA2 = gg8.a.a(fwc.d(pyf.class));
            iwc iwcVar = fwc.a;
            return iwcVar.k(iwcVar.b(Either.class), Arrays.asList(gg8VarA, gg8VarA2), false);
        }
    }

    public static final class j2 implements gu5<zf8> {
        public static final j2 a = new j2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemDirectory.class);
        }
    }

    public static final class j3 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            FileSystemDirectory fileSystemDirectory = (FileSystemDirectory) objArr2[0];
            return Boolean.valueOf(fileSystemDirectory.Q(e8b.a) ? fileSystemDirectory.d0().isDirectory() : false);
        }
    }

    @uh3(c = "expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$4", f = "FileSystemModule.kt", l = {283}, m = "invokeSuspend")
    public static final class k extends c1f implements wu5<e13, Object[], lu2<? super Object>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        public k() {
            super(3, null);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            DownloadOptions downloadOptions;
            URI uri;
            FileSystemPath fileSystemPath;
            Map<String, String> headers;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                Object[] objArr = (Object[]) this.L$0;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                DownloadOptions downloadOptions2 = (DownloadOptions) objArr[2];
                FileSystemPath fileSystemPath2 = (FileSystemPath) obj3;
                URI uri2 = (URI) obj2;
                fileSystemPath2.m0(e8b.b);
                Request.Builder builder = new Request.Builder();
                URL url = uri2.toURL();
                url.getClass();
                HttpUrl.Companion companion = HttpUrl.k;
                String string = url.toString();
                string.getClass();
                companion.getClass();
                builder.a = HttpUrl.Companion.c(string);
                if (downloadOptions2 != null && (headers = downloadOptions2.getHeaders()) != null) {
                    for (Map.Entry<String, String> entry : headers.entrySet()) {
                        builder.a(entry.getKey(), entry.getValue());
                    }
                }
                Request requestB = builder.b();
                OkHttpClient okHttpClient = new OkHttpClient();
                this.L$0 = downloadOptions2;
                this.L$1 = fileSystemPath2;
                this.L$2 = uri2;
                this.L$3 = okHttpClient;
                this.L$4 = requestB;
                this.L$5 = this;
                this.label = 1;
                qw1 qw1Var = new qw1(1, ewa.v(this));
                qw1Var.q();
                new RealCall(okHttpClient, requestB, false).R0(new m3(qw1Var));
                Object objP = qw1Var.p();
                g13 g13Var = g13.a;
                if (objP == g13Var) {
                    return g13Var;
                }
                obj = objP;
                downloadOptions = downloadOptions2;
                uri = uri2;
                fileSystemPath = fileSystemPath2;
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (URI) this.L$2;
                fileSystemPath = (FileSystemPath) this.L$1;
                downloadOptions = (DownloadOptions) this.L$0;
                r7d.b(obj);
            }
            Response response = (Response) obj;
            boolean zH = response.h();
            Headers headers2 = response.f;
            if (!zH) {
                throw new UnableToDownloadException(p6.c(response.d, "response has status: "));
            }
            File file = fileSystemPath instanceof FileSystemDirectory ? new File(fileSystemPath.f0(), URLUtil.guessFileName(uri.toString(), headers2.a("content-disposition"), headers2.a("content-type"))) : fileSystemPath.f0();
            if ((downloadOptions == null || !downloadOptions.getIdempotent()) && file.exists()) {
                throw new DestinationAlreadyExistsException();
            }
            ResponseBody responseBody = response.V;
            if (responseBody == null) {
                throw new UnableToDownloadException("response body is null");
            }
            InputStream inputStreamA = responseBody.a();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    wg2.u(inputStreamA, fileOutputStream);
                    fileOutputStream.close();
                    inputStreamA.close();
                    return file.toURI();
                } finally {
                }
            } finally {
            }
        }

        @Override // defpackage.wu5
        public final Object q(e13 e13Var, Object[] objArr, lu2<? super Object> lu2Var) {
            k kVar = new k(3, lu2Var);
            kVar.L$0 = objArr;
            return kVar.invokeSuspend(j6g.a);
        }
    }

    public static final class k0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((FileSystemFile) objArr2[0]).r0();
        }
    }

    public static final class k1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Boolean.valueOf(((FileSystemFile) objArr2[0]).L0());
        }
    }

    public static final class k2 implements gu5<zf8> {
        public static final k2 a = new k2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class k3 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            String string = ((FileSystemDirectory) objArr2[0]).d0().a().toString();
            string.getClass();
            return wve.D(string, "/", false) ? string : string.concat("/");
        }
    }

    public static final class l implements gu5<zf8> {
        public static final l a = new l();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(Uri.class);
        }
    }

    public static final class l0 implements gu5<zf8> {
        public static final l0 a = new l0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class l1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws InvalidTypeFileException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            FileSystemFile fileSystemFile = (FileSystemFile) objArr2[0];
            fileSystemFile.o0();
            return fileSystemFile.d0().o();
        }
    }

    public static final class l2 implements gu5<zf8> {
        public static final l2 a = new l2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(String.class);
        }
    }

    public static final class l3 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Long.valueOf(((FileSystemDirectory) objArr2[0]).r0());
        }
    }

    @uh3(c = "expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$6", f = "FileSystemModule.kt", l = {271}, m = "invokeSuspend")
    public static final class m extends c1f implements wu5<e13, Object[], lu2<? super Object>, Object> {
        final /* synthetic */ luc $filePickerLauncher$inlined;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(lu2 lu2Var, luc lucVar) {
            super(3, lu2Var);
            this.$filePickerLauncher$inlined = lucVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws PickerCancelledException {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                Uri uri = (Uri) ((Object[]) this.L$0)[0];
                T t = this.$filePickerLauncher$inlined.element;
                if (t == 0) {
                    wl7.g("filePickerLauncher");
                    throw null;
                }
                ja5 ja5Var = new ja5(uri, null, eab.b);
                this.label = 1;
                obj = ((lk0) t).a(ja5Var, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            ka5 ka5Var = (ka5) obj;
            if (ka5Var instanceof ka5.b) {
                FileSystemPath fileSystemPath = ((ka5.b) ka5Var).a;
                fileSystemPath.getClass();
                return (FileSystemDirectory) fileSystemPath;
            }
            if (ka5Var instanceof ka5.a) {
                throw new PickerCancelledException();
            }
            defpackage.l.g();
            return null;
        }

        @Override // defpackage.wu5
        public final Object q(e13 e13Var, Object[] objArr, lu2<? super Object> lu2Var) {
            m mVar = new m(lu2Var, this.$filePickerLauncher$inlined);
            mVar.L$0 = objArr;
            return mVar.invokeSuspend(j6g.a);
        }
    }

    public static final class m0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((FileSystemFile) objArr2[0]).s0();
        }
    }

    public static final class m1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((FileSystemFile) objArr2[0]).d0().getCreationTime();
        }
    }

    public static final class m2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            String str = (String) objArr2[2];
            String str2 = (String) obj2;
            FileSystemDirectory fileSystemDirectory = (FileSystemDirectory) obj;
            fileSystemDirectory.getClass();
            str2.getClass();
            fileSystemDirectory.o0();
            fileSystemDirectory.m0(e8b.b);
            e6g e6gVarD0 = fileSystemDirectory.d0();
            if (str == null) {
                str = "text/plain";
            }
            e6g e6gVarE = e6gVarD0.e(str, str2);
            if (e6gVarE != null) {
                return new FileSystemFile(e6gVarE.a());
            }
            throw new UnableToCreateException("file could not be created");
        }
    }

    public static final class m3 implements Callback {
        public final /* synthetic */ qw1 a;

        public m3(qw1 qw1Var) {
            this.a = qw1Var;
        }

        @Override // okhttp3.Callback
        public final void h(Call call, IOException iOException) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qw1.V;
            qw1 qw1Var = this.a;
            if (atomicReferenceFieldUpdater.get(qw1Var) instanceof uw1) {
                return;
            }
            qw1Var.resumeWith(new o7d.a(iOException));
        }

        @Override // okhttp3.Callback
        public final void p(Call call, Response response) {
            this.a.resumeWith(response);
        }
    }

    public static final class n implements gu5<zf8> {
        public static final n a = new n();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(Uri.class);
        }
    }

    public static final class n0 implements gu5<zf8> {
        public static final n0 a = new n0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class n1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            String string = ((FileSystemFile) objArr2[0]).d0().a().toString();
            string.getClass();
            return wve.D(string, "/", false) ? awe.x0(1, string) : string;
        }
    }

    public static final class n2 implements gu5<zf8> {
        public static final n2 a = new n2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemDirectory.class);
        }
    }

    public static final class o implements gu5<zf8> {
        public static final o a = new o();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(String.class);
        }
    }

    public static final class o0 implements gu5<zf8> {
        public static final o0 a = new o0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(InfoOptions.class);
        }
    }

    public static final class o1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            FileSystemFile fileSystemFile = (FileSystemFile) objArr2[0];
            fileSystemFile.o0();
            fileSystemFile.m0(e8b.a);
            e6g e6gVarD0 = fileSystemFile.d0();
            gk0 gk0VarN = fileSystemFile.N();
            if (gk0VarN != null) {
                return e6gVarD0.c(gk0VarN);
            }
            throw new MissingAppContextException();
        }
    }

    public static final class o2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((FileSystemDirectory) objArr2[0]).getClass();
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$9", f = "FileSystemModule.kt", l = {271}, m = "invokeSuspend")
    public static final class p extends c1f implements wu5<e13, Object[], lu2<? super Object>, Object> {
        final /* synthetic */ luc $filePickerLauncher$inlined;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(lu2 lu2Var, luc lucVar) {
            super(3, lu2Var);
            this.$filePickerLauncher$inlined = lucVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws PickerCancelledException {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                Object[] objArr = (Object[]) this.L$0;
                Object obj2 = objArr[0];
                String str = (String) objArr[1];
                Uri uri = (Uri) obj2;
                T t = this.$filePickerLauncher$inlined.element;
                if (t == 0) {
                    wl7.g("filePickerLauncher");
                    throw null;
                }
                ja5 ja5Var = new ja5(uri, str, eab.a);
                this.label = 1;
                obj = ((lk0) t).a(ja5Var, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            ka5 ka5Var = (ka5) obj;
            if (ka5Var instanceof ka5.b) {
                FileSystemPath fileSystemPath = ((ka5.b) ka5Var).a;
                fileSystemPath.getClass();
                return (FileSystemFile) fileSystemPath;
            }
            if (ka5Var instanceof ka5.a) {
                throw new PickerCancelledException();
            }
            defpackage.l.g();
            return null;
        }

        @Override // defpackage.wu5
        public final Object q(e13 e13Var, Object[] objArr, lu2<? super Object> lu2Var) {
            p pVar = new p(lu2Var, this.$filePickerLauncher$inlined);
            pVar.L$0 = objArr;
            return pVar.invokeSuspend(j6g.a);
        }
    }

    public static final class p0 implements gu5<zf8> {
        public static final p0 a = new p0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class p1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            try {
                return ((FileSystemFile) objArr2[0]).N0();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final class p2 implements gu5<zf8> {
        public static final p2 a = new p2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemDirectory.class);
        }
    }

    public static final class q implements gu5<zf8> {
        public static final q a = new q();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(URI.class);
        }
    }

    public static final class q0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws InvalidTypeFileException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            InfoOptions infoOptions = (InfoOptions) objArr2[1];
            FileSystemFile fileSystemFile = (FileSystemFile) obj;
            fileSystemFile.o0();
            fileSystemFile.m0(e8b.a);
            if (!fileSystemFile.d0().exists()) {
                return new FileInfo(false, yid.i(fileSystemFile.d0().a().toString()), null, null, null, null, 60, null);
            }
            String strI = yid.i(fileSystemFile.d0().a().toString());
            Long lValueOf = fileSystemFile.d0().exists() ? Long.valueOf(fileSystemFile.d0().length()) : null;
            fileSystemFile.o0();
            FileInfo fileInfo = new FileInfo(true, strI, null, lValueOf, fileSystemFile.d0().o(), fileSystemFile.d0().getCreationTime(), 4, null);
            if (infoOptions != null && wl7.b(infoOptions.getMd5(), Boolean.TRUE)) {
                fileInfo.setMd5(fileSystemFile.N0());
            }
            return fileInfo;
        }
    }

    public static final class q1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            FileSystemFile fileSystemFile = (FileSystemFile) objArr2[0];
            try {
                if (fileSystemFile.d0().exists()) {
                    return Long.valueOf(fileSystemFile.d0().length());
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public static final class q2 implements gu5<zf8> {
        public static final q2 a = new q2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemPath.class);
        }
    }

    public static final class r implements Function1<Object[], Object> {
        public r() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object obj;
            Object[] objArr2 = objArr;
            objArr2.getClass();
            File file = new File((URI) objArr2[0]);
            ua5 ua5Var = ua5.this;
            try {
                obj = ua5Var.b().a.a.get(ha5.class);
            } catch (Exception unused) {
                obj = null;
            }
            ha5 ha5Var = (ha5) obj;
            return ((ha5Var != null ? ha5Var.a(ua5Var.b().d(), file.getPath()) : EnumSet.noneOf(e8b.class)).contains(e8b.a) && file.exists()) ? new PathInfo(file.exists(), Boolean.valueOf(file.isDirectory())) : new PathInfo(false, null);
        }
    }

    public static final class r0 implements gu5<zf8> {
        public static final r0 a = new r0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class r1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((FileSystemFile) objArr2[0]).d0().getType();
        }
    }

    public static final class r2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((FileSystemDirectory) objArr2[0]).W((FileSystemPath) objArr2[1]);
            return j6g.a;
        }
    }

    public static final class s implements Function1<Object[], Object> {
        public s() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            return Long.valueOf(new File(ua5.e(ua5.this).getFilesDir().getPath()).getTotalSpace());
        }
    }

    public static final class s0 implements gu5<zf8> {
        public static final s0 a = new s0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemPath.class);
        }
    }

    public static final class s1 implements gu5<zf8> {
        public static final s1 a = new s1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class s2 implements gu5<zf8> {
        public static final s2 a = new s2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemDirectory.class);
        }
    }

    public static final class t implements Function1<Object[], Object> {
        public t() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            return Long.valueOf(new File(ua5.e(ua5.this).getFilesDir().getPath()).getFreeSpace());
        }
    }

    public static final class t0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((FileSystemFile) objArr2[0]).W((FileSystemPath) objArr2[1]);
            return j6g.a;
        }
    }

    public static final class t1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return new FileSystemFileHandle((FileSystemFile) objArr2[0]);
        }
    }

    public static final class t2 implements gu5<zf8> {
        public static final t2 a = new t2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemDirectory.class);
        }
    }

    public static final class u implements Function2<Object[], p3c, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws InvalidTypeFileException, IOException {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            ((FileSystemFile) p3cVar2).P0();
            return j6g.a;
        }
    }

    public static final class u0 implements gu5<zf8> {
        public static final u0 a = new u0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class u1 implements gu5<zf8> {
        public static final u1 a = new u1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFileHandle.class);
        }
    }

    public static final class u2 implements gu5<zf8> {
        public static final u2 a = new u2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemPath.class);
        }
    }

    public static final class v implements gu5<zf8> {
        public static final v a = new v();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class v0 implements gu5<zf8> {
        public static final v0 a = new v0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemPath.class);
        }
    }

    public static final class v1 implements gu5<zf8> {
        public static final v1 a = new v1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Integer.TYPE);
        }
    }

    public static final class v2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws CopyOrMoveDirectoryToFileException, DestinationDoesNotExistException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((FileSystemDirectory) objArr2[0]).j0((FileSystemPath) objArr2[1]);
            return j6g.a;
        }
    }

    public static final class w implements Function1<Object[], String> {
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((FileSystemFile) objArr2[0]).P0();
        }
    }

    public static final class w0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws CopyOrMoveDirectoryToFileException, DestinationDoesNotExistException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((FileSystemFile) objArr2[0]).j0((FileSystemPath) objArr2[1]);
            return j6g.a;
        }
    }

    public static final class w1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws UnableToReadHandleException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            int iIntValue = ((Number) objArr2[1]).intValue();
            FileChannel fileChannel = ((FileSystemFileHandle) obj).e;
            if (!fileChannel.isOpen()) {
                throw new UnableToReadHandleException("file handle is closed");
            }
            try {
                int size = (int) (fileChannel.size() - fileChannel.position());
                if (iIntValue > size) {
                    iIntValue = size;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iIntValue);
                fileChannel.read(byteBufferAllocate);
                byte[] bArrArray = byteBufferAllocate.array();
                bArrArray.getClass();
                return bArrArray;
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                throw new UnableToReadHandleException(message);
            }
        }
    }

    public static final class w2 implements gu5<zf8> {
        public static final w2 a = new w2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemDirectory.class);
        }
    }

    public static final class x implements Function2<Object[], p3c, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws InvalidTypeFileException, IOException {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            ((FileSystemFile) p3cVar2).r0();
            return j6g.a;
        }
    }

    public static final class x0 implements gu5<zf8> {
        public static final x0 a = new x0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class x1 implements gu5<zf8> {
        public static final x1 a = new x1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFileHandle.class);
        }
    }

    public static final class x2 implements gu5<zf8> {
        public static final x2 a = new x2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class y implements gu5<zf8> {
        public static final y a = new y();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemFile.class);
        }
    }

    public static final class y0 implements gu5<zf8> {
        public static final y0 a = new y0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class y1 implements gu5<zf8> {
        public static final y1 a = new y1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(byte[].class);
        }
    }

    public static final class y2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((FileSystemDirectory) objArr2[0]).k0((String) objArr2[1]);
            return j6g.a;
        }
    }

    public static final class z implements Function1<Object[], String> {
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((FileSystemFile) objArr2[0]).r0();
        }
    }

    public static final class z0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((FileSystemFile) objArr2[0]).k0((String) objArr2[1]);
            return j6g.a;
        }
    }

    public static final class z1 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws UnableToReadHandleException, UnableToWriteHandleException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            byte[] bArr = (byte[]) objArr2[1];
            FileSystemFileHandle fileSystemFileHandle = (FileSystemFileHandle) obj;
            fileSystemFileHandle.getClass();
            bArr.getClass();
            FileChannel fileChannel = fileSystemFileHandle.e;
            if (!fileChannel.isOpen()) {
                throw new UnableToReadHandleException("file handle is closed");
            }
            try {
                fileChannel.write(ByteBuffer.wrap(bArr));
                return j6g.a;
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                throw new UnableToWriteHandleException(l5.m("Unable to write to a file handle: '", message, "'"), null);
            }
        }
    }

    public static final class z2 implements gu5<zf8> {
        public static final z2 a = new z2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FileSystemDirectory.class);
        }
    }

    public static final ReactApplicationContext e(ua5 ua5Var) throws Exceptions$AppContextLost {
        ReactApplicationContext reactApplicationContextD = ua5Var.b().d();
        if (reactApplicationContextD != null) {
            return reactApplicationContextD;
        }
        throw new Exceptions$AppContextLost();
    }

    @Override // defpackage.sx9
    public final wx9 a() {
        Object obj;
        String str;
        String str2;
        Class cls;
        String str3;
        String str4;
        String str5;
        vx9 vx9Var;
        l52 l52Var;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Class cls2;
        qf0 ch7Var;
        String str11;
        Boolean bool;
        qf0 ch7Var2;
        qf0 ch7Var3;
        Class cls3;
        Class cls4;
        Class cls5;
        String str12;
        String str13;
        l52 l52Var2;
        String str14;
        String str15;
        jpf.b("[ExpoModulesCore] ".concat(ua5.class + ".ModuleDefinition"));
        try {
            vx9 vx9Var2 = new vx9(this);
            vx9Var2.i("FileSystem");
            tp2 tp2Var = new tp2("documentDirectory");
            tp2Var.a(new e());
            vx9Var2.e().put("documentDirectory", tp2Var);
            tp2 tp2Var2 = new tp2("cacheDirectory");
            tp2Var2.a(new f());
            vx9Var2.e().put("cacheDirectory", tp2Var2);
            tp2 tp2Var3 = new tp2("bundleDirectory");
            tp2Var3.a(new g());
            vx9Var2.e().put("bundleDirectory", tp2Var3);
            b4c b4cVar = new b4c("totalDiskSpace");
            rf0[] rf0VarArr = new rf0[0];
            gad gadVar = (gad) had.a().get(fwc.a(Long.class));
            if (gadVar == null) {
                gadVar = new gad(fwc.a(Long.class));
                obj = p3c.class;
                had.a().put(fwc.a(Long.class), gadVar);
            } else {
                obj = p3c.class;
            }
            b4cVar.a(new a2f("get", rf0VarArr, gadVar, new s()));
            vx9Var2.g().put("totalDiskSpace", b4cVar);
            b4c b4cVar2 = new b4c("availableDiskSpace");
            rf0[] rf0VarArr2 = new rf0[0];
            gad gadVar2 = (gad) had.a().get(fwc.a(Long.class));
            if (gadVar2 == null) {
                gadVar2 = new gad(fwc.a(Long.class));
                had.a().put(fwc.a(Long.class), gadVar2);
            }
            b4cVar2.a(new a2f("get", rf0VarArr2, gadVar2, new t()));
            vx9Var2.g().put("availableDiskSpace", b4cVar2);
            xu0 xu0VarA = vx9Var2.a("downloadFileAsync");
            String strB = xu0VarA.b();
            pwf pwfVarA = xu0VarA.a();
            hb9 hb9Var = tf0.a;
            yd8 yd8VarA = fwc.a(URI.class);
            Boolean bool2 = Boolean.FALSE;
            rf0 rf0Var = (rf0) tf0.a().get(new Pair(yd8VarA, bool2));
            if (rf0Var == null) {
                str2 = "get";
                cls = FileSystemFile.class;
                str = "create";
                rf0Var = new rf0(new xp8(fwc.a(URI.class), false, h.a), pwfVarA);
            } else {
                str = "create";
                str2 = "get";
                cls = FileSystemFile.class;
            }
            rf0 rf0Var2 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemPath.class), bool2));
            if (rf0Var2 == null) {
                str3 = "validatePath";
                rf0Var2 = new rf0(new xp8(fwc.a(FileSystemPath.class), false, i.a), pwfVarA);
            } else {
                str3 = "validatePath";
            }
            yd8 yd8VarA2 = fwc.a(DownloadOptions.class);
            Boolean bool3 = Boolean.TRUE;
            rf0 rf0Var3 = (rf0) tf0.a().get(new Pair(yd8VarA2, bool3));
            if (rf0Var3 == null) {
                str5 = "delete";
                str4 = "constructor";
                rf0Var3 = new rf0(new xp8(fwc.a(DownloadOptions.class), true, j.a), pwfVarA);
            } else {
                str4 = "constructor";
                str5 = "delete";
            }
            xu0VarA.c(new z0f(strB, new rf0[]{rf0Var, rf0Var2, rf0Var3}, new k()));
            luc lucVar = new luc();
            vx9Var2.j(new a(lucVar, this, null));
            xu0 xu0VarA2 = vx9Var2.a("pickDirectoryAsync");
            String strB2 = xu0VarA2.b();
            pwf pwfVarA2 = xu0VarA2.a();
            rf0 rf0Var4 = (rf0) tf0.a().get(new Pair(fwc.a(Uri.class), bool3));
            if (rf0Var4 == null) {
                rf0Var4 = new rf0(new xp8(fwc.a(Uri.class), true, l.a), pwfVarA2);
            }
            xu0VarA2.c(new z0f(strB2, new rf0[]{rf0Var4}, new m(null, lucVar)));
            xu0 xu0VarA3 = vx9Var2.a("pickFileAsync");
            String strB3 = xu0VarA3.b();
            pwf pwfVarA3 = xu0VarA3.a();
            rf0 rf0Var5 = (rf0) tf0.a().get(new Pair(fwc.a(Uri.class), bool3));
            if (rf0Var5 == null) {
                rf0Var5 = new rf0(new xp8(fwc.a(Uri.class), true, n.a), pwfVarA3);
            }
            rf0 rf0Var6 = (rf0) tf0.a().get(new Pair(fwc.a(String.class), bool3));
            if (rf0Var6 == null) {
                rf0Var6 = new rf0(new xp8(fwc.a(String.class), true, o.a), pwfVarA3);
            }
            xu0VarA3.c(new z0f(strB3, new rf0[]{rf0Var5, rf0Var6}, new p(null, lucVar)));
            pwf pwfVarF = vx9Var2.f();
            rf0 rf0Var7 = (rf0) tf0.a().get(new Pair(fwc.a(URI.class), bool2));
            if (rf0Var7 == null) {
                rf0Var7 = new rf0(new xp8(fwc.a(URI.class), false, q.a), pwfVarF);
            }
            rf0[] rf0VarArr3 = {rf0Var7};
            gad gadVar3 = (gad) had.a().get(fwc.a(PathInfo.class));
            if (gadVar3 == null) {
                gadVar3 = new gad(fwc.a(PathInfo.class));
                had.a().put(fwc.a(PathInfo.class), gadVar3);
            }
            vx9Var2.h().put("info", new a2f("info", rf0VarArr3, gadVar3, new r()));
            yd8 yd8VarA3 = fwc.a(cls);
            sx9 sx9VarN = vx9Var2.n();
            if (sx9VarN == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            gk0 gk0VarB = sx9VarN.b();
            String simpleName = jh2.p(yd8VarA3).getSimpleName();
            rf0 rf0Var8 = (rf0) tf0.a().get(new Pair(fwc.a(cls), bool2));
            l52 l52Var3 = new l52(gk0VarB, simpleName, yd8VarA3, rf0Var8 == null ? new rf0(new xp8(fwc.a(cls), false, b.a), null) : rf0Var8, vx9Var2.f());
            pwf pwfVarF2 = l52Var3.f();
            rf0 rf0Var9 = (rf0) tf0.a().get(new Pair(fwc.a(Uri.class), bool2));
            if (rf0Var9 == null) {
                rf0Var9 = new rf0(new xp8(fwc.a(Uri.class), false, d0.a), pwfVarF2);
            }
            rf0[] rf0VarArr4 = {rf0Var9};
            gad gadVar4 = (gad) had.a().get(fwc.a(Object.class));
            if (gadVar4 == null) {
                gadVar4 = new gad(fwc.a(Object.class));
                had.a().put(fwc.a(Object.class), gadVar4);
            }
            String str16 = str4;
            l52Var3.l(new a2f(str16, rf0VarArr4, gadVar4, new e0()));
            pwf pwfVarF3 = l52Var3.f();
            rf0 rf0Var10 = (rf0) tf0.a().get(new Pair(fwc.a(cls), bool2));
            if (rf0Var10 == null) {
                rf0Var10 = new rf0(new xp8(fwc.a(cls), false, p0.a), pwfVarF3);
            }
            rf0[] rf0VarArr5 = {rf0Var10};
            gad gadVar5 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar5 == null) {
                gadVar5 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar5);
            }
            String str17 = str5;
            l52Var3.h().put(str17, new a2f(str17, rf0VarArr5, gadVar5, new a1()));
            pwf pwfVarF4 = l52Var3.f();
            rf0 rf0Var11 = (rf0) tf0.a().get(new Pair(fwc.a(cls), bool2));
            if (rf0Var11 == null) {
                rf0Var11 = new rf0(new xp8(fwc.a(cls), false, d1.a), pwfVarF4);
            }
            rf0[] rf0VarArr6 = {rf0Var11};
            gad gadVar6 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar6 == null) {
                gadVar6 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar6);
            }
            String str18 = str3;
            l52Var3.h().put(str18, new a2f(str18, rf0VarArr6, gadVar6, new e1()));
            pwf pwfVarF5 = l52Var3.f();
            rf0 rf0Var12 = (rf0) tf0.a().get(new Pair(fwc.a(cls), bool2));
            if (rf0Var12 == null) {
                rf0Var12 = new rf0(new xp8(fwc.a(cls), false, f1.a), pwfVarF5);
            }
            rf0 rf0Var13 = (rf0) tf0.a().get(new Pair(fwc.a(CreateOptions.class), bool3));
            if (rf0Var13 == null) {
                vx9Var = vx9Var2;
                rf0Var13 = new rf0(new xp8(fwc.a(CreateOptions.class), true, g1.a), pwfVarF5);
            } else {
                vx9Var = vx9Var2;
            }
            rf0[] rf0VarArr7 = {rf0Var12, rf0Var13};
            gad gadVar7 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar7 == null) {
                gadVar7 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar7);
            }
            String str19 = str;
            l52Var3.h().put(str19, new a2f(str19, rf0VarArr7, gadVar7, new h1()));
            pwf pwfVarF6 = l52Var3.f();
            rf0 rf0Var14 = (rf0) tf0.a().get(new Pair(fwc.a(cls), bool2));
            if (rf0Var14 == null) {
                l52Var = l52Var3;
                rf0Var14 = new rf0(new xp8(fwc.a(cls), false, i1.a), pwfVarF6);
            } else {
                l52Var = l52Var3;
            }
            rf0 rf0Var15 = (rf0) tf0.a().get(new Pair(fwc.a(Either.class), bool2));
            if (rf0Var15 == null) {
                str6 = "Required value was null.";
                rf0Var15 = new rf0(new xp8(fwc.a(Either.class), false, j1.a), pwfVarF6);
            } else {
                str6 = "Required value was null.";
            }
            rf0 rf0Var16 = (rf0) tf0.a().get(new Pair(fwc.a(WriteOptions.class), bool3));
            if (rf0Var16 == null) {
                str7 = str18;
                rf0Var16 = new rf0(new xp8(fwc.a(WriteOptions.class), true, f0.a), pwfVarF6);
            } else {
                str7 = str18;
            }
            rf0[] rf0VarArr8 = {rf0Var14, rf0Var15, rf0Var16};
            gad gadVar8 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar8 == null) {
                gadVar8 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar8);
            }
            l52Var.h().put("write", new a2f("write", rf0VarArr8, gadVar8, new g0()));
            Object obj2 = obj;
            Class cls6 = cls;
            boolean zB = wl7.b(cls6, obj2);
            Class cls7 = Float.TYPE;
            Class cls8 = Double.TYPE;
            Class cls9 = Boolean.TYPE;
            Class cls10 = Integer.TYPE;
            if (zB) {
                ch7Var = new ev0("text", new rf0[0], new u());
                str8 = str19;
                str9 = str16;
                str10 = str17;
                cls2 = String.class;
            } else {
                pwf pwfVarF7 = l52Var.f();
                rf0 rf0Var17 = (rf0) tf0.a().get(new Pair(fwc.a(cls6), bool2));
                if (rf0Var17 == null) {
                    str8 = str19;
                    str10 = str17;
                    str9 = str16;
                    rf0Var17 = new rf0(new xp8(fwc.a(cls6), false, v.a), pwfVarF7);
                } else {
                    str8 = str19;
                    str9 = str16;
                    str10 = str17;
                }
                rf0[] rf0VarArr9 = {rf0Var17};
                w wVar = new w();
                cls2 = String.class;
                ch7Var = wl7.b(cls2, cls10) ? new ch7("text", rf0VarArr9, wVar) : wl7.b(cls2, cls9) ? new hi1("text", rf0VarArr9, wVar) : wl7.b(cls2, cls8) ? new s84("text", rf0VarArr9, wVar) : wl7.b(cls2, cls7) ? new ci5("text", rf0VarArr9, wVar) : wl7.b(cls2, cls2) ? new zue("text", rf0VarArr9, wVar) : new o7g("text", rf0VarArr9, wVar);
            }
            l52Var.d().put("text", ch7Var);
            pwf pwfVarF8 = l52Var.f();
            rf0 rf0Var18 = (rf0) tf0.a().get(new Pair(fwc.a(cls6), bool2));
            if (rf0Var18 == null) {
                str11 = "info";
                bool = bool3;
                rf0Var18 = new rf0(new xp8(fwc.a(cls6), false, h0.a), pwfVarF8);
            } else {
                str11 = "info";
                bool = bool3;
            }
            rf0[] rf0VarArr10 = {rf0Var18};
            gad gadVar9 = (gad) had.a().get(fwc.a(cls2));
            if (gadVar9 == null) {
                gadVar9 = new gad(fwc.a(cls2));
                had.a().put(fwc.a(cls2), gadVar9);
            }
            l52Var.h().put("textSync", new a2f("textSync", rf0VarArr10, gadVar9, new i0()));
            if (wl7.b(cls6, obj2)) {
                ch7Var2 = new ev0("base64", new rf0[0], new x());
            } else {
                pwf pwfVarF9 = l52Var.f();
                rf0 rf0Var19 = (rf0) tf0.a().get(new Pair(fwc.a(cls6), bool2));
                if (rf0Var19 == null) {
                    rf0Var19 = new rf0(new xp8(fwc.a(cls6), false, y.a), pwfVarF9);
                }
                rf0[] rf0VarArr11 = {rf0Var19};
                z zVar = new z();
                ch7Var2 = wl7.b(cls2, cls10) ? new ch7("base64", rf0VarArr11, zVar) : wl7.b(cls2, cls9) ? new hi1("base64", rf0VarArr11, zVar) : wl7.b(cls2, cls8) ? new s84("base64", rf0VarArr11, zVar) : wl7.b(cls2, cls7) ? new ci5("base64", rf0VarArr11, zVar) : wl7.b(cls2, cls2) ? new zue("base64", rf0VarArr11, zVar) : new o7g("base64", rf0VarArr11, zVar);
            }
            l52Var.d().put("base64", ch7Var2);
            pwf pwfVarF10 = l52Var.f();
            rf0 rf0Var20 = (rf0) tf0.a().get(new Pair(fwc.a(cls6), bool2));
            if (rf0Var20 == null) {
                rf0Var20 = new rf0(new xp8(fwc.a(cls6), false, j0.a), pwfVarF10);
            }
            rf0[] rf0VarArr12 = {rf0Var20};
            gad gadVar10 = (gad) had.a().get(fwc.a(cls2));
            if (gadVar10 == null) {
                gadVar10 = new gad(fwc.a(cls2));
                had.a().put(fwc.a(cls2), gadVar10);
            }
            l52Var.h().put("base64Sync", new a2f("base64Sync", rf0VarArr12, gadVar10, new k0()));
            if (wl7.b(cls6, obj2)) {
                ch7Var3 = new ev0("bytes", new rf0[0], new a0());
            } else {
                pwf pwfVarF11 = l52Var.f();
                rf0 rf0Var21 = (rf0) tf0.a().get(new Pair(fwc.a(cls6), bool2));
                if (rf0Var21 == null) {
                    rf0Var21 = new rf0(new xp8(fwc.a(cls6), false, b0.a), pwfVarF11);
                }
                rf0[] rf0VarArr13 = {rf0Var21};
                c0 c0Var = new c0();
                ch7Var3 = wl7.b(byte[].class, cls10) ? new ch7("bytes", rf0VarArr13, c0Var) : wl7.b(byte[].class, cls9) ? new hi1("bytes", rf0VarArr13, c0Var) : wl7.b(byte[].class, cls8) ? new s84("bytes", rf0VarArr13, c0Var) : wl7.b(byte[].class, cls7) ? new ci5("bytes", rf0VarArr13, c0Var) : wl7.b(byte[].class, cls2) ? new zue("bytes", rf0VarArr13, c0Var) : new o7g("bytes", rf0VarArr13, c0Var);
            }
            l52Var.d().put("bytes", ch7Var3);
            pwf pwfVarF12 = l52Var.f();
            rf0 rf0Var22 = (rf0) tf0.a().get(new Pair(fwc.a(cls6), bool2));
            if (rf0Var22 == null) {
                rf0Var22 = new rf0(new xp8(fwc.a(cls6), false, l0.a), pwfVarF12);
            }
            rf0[] rf0VarArr14 = {rf0Var22};
            gad gadVar11 = (gad) had.a().get(fwc.a(byte[].class));
            if (gadVar11 == null) {
                gadVar11 = new gad(fwc.a(byte[].class));
                had.a().put(fwc.a(byte[].class), gadVar11);
            }
            l52Var.h().put("bytesSync", new a2f("bytesSync", rf0VarArr14, gadVar11, new m0()));
            pwf pwfVarF13 = l52Var.f();
            rf0 rf0Var23 = (rf0) tf0.a().get(new Pair(fwc.a(cls6), bool2));
            if (rf0Var23 == null) {
                rf0Var23 = new rf0(new xp8(fwc.a(cls6), false, n0.a), pwfVarF13);
            }
            Boolean bool4 = bool;
            rf0 rf0Var24 = (rf0) tf0.a().get(new Pair(fwc.a(InfoOptions.class), bool4));
            if (rf0Var24 == null) {
                rf0Var24 = new rf0(new xp8(fwc.a(InfoOptions.class), true, o0.a), pwfVarF13);
            }
            rf0[] rf0VarArr15 = {rf0Var23, rf0Var24};
            gad gadVar12 = (gad) had.a().get(fwc.a(FileInfo.class));
            if (gadVar12 == null) {
                gadVar12 = new gad(fwc.a(FileInfo.class));
                had.a().put(fwc.a(FileInfo.class), gadVar12);
            }
            String str20 = str11;
            l52Var.h().put(str20, new a2f(str20, rf0VarArr15, gadVar12, new q0()));
            c4c c4cVar = new c4c(l52Var.k().a(), "exists");
            rf0[] rf0VarArr16 = {new rf0(c4cVar.c())};
            gad gadVar13 = (gad) had.a().get(fwc.a(Boolean.class));
            if (gadVar13 == null) {
                gadVar13 = new gad(fwc.a(Boolean.class));
                had.a().put(fwc.a(Boolean.class), gadVar13);
            }
            String str21 = str2;
            a2f a2fVar = new a2f(str21, rf0VarArr16, gadVar13, new k1());
            a2fVar.f(c4cVar.c());
            a2fVar.e();
            c4cVar.a(a2fVar);
            l52Var.g().put("exists", c4cVar);
            c4c c4cVar2 = new c4c(l52Var.k().a(), "modificationTime");
            rf0[] rf0VarArr17 = {new rf0(c4cVar2.c())};
            gad gadVar14 = (gad) had.a().get(fwc.a(Long.class));
            if (gadVar14 == null) {
                gadVar14 = new gad(fwc.a(Long.class));
                had.a().put(fwc.a(Long.class), gadVar14);
            }
            a2f a2fVar2 = new a2f(str21, rf0VarArr17, gadVar14, new l1());
            a2fVar2.f(c4cVar2.c());
            a2fVar2.e();
            c4cVar2.a(a2fVar2);
            l52Var.g().put("modificationTime", c4cVar2);
            c4c c4cVar3 = new c4c(l52Var.k().a(), "creationTime");
            rf0[] rf0VarArr18 = {new rf0(c4cVar3.c())};
            gad gadVar15 = (gad) had.a().get(fwc.a(Long.class));
            if (gadVar15 == null) {
                gadVar15 = new gad(fwc.a(Long.class));
                had.a().put(fwc.a(Long.class), gadVar15);
            }
            a2f a2fVar3 = new a2f(str21, rf0VarArr18, gadVar15, new m1());
            a2fVar3.f(c4cVar3.c());
            a2fVar3.e();
            c4cVar3.a(a2fVar3);
            l52Var.g().put("creationTime", c4cVar3);
            pwf pwfVarF14 = l52Var.f();
            rf0 rf0Var25 = (rf0) tf0.a().get(new Pair(fwc.a(cls6), bool2));
            if (rf0Var25 == null) {
                rf0Var25 = new rf0(new xp8(fwc.a(cls6), false, r0.a), pwfVarF14);
            }
            rf0 rf0Var26 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemPath.class), bool2));
            if (rf0Var26 == null) {
                rf0Var26 = new rf0(new xp8(fwc.a(FileSystemPath.class), false, s0.a), pwfVarF14);
            }
            rf0[] rf0VarArr19 = {rf0Var25, rf0Var26};
            gad gadVar16 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar16 == null) {
                gadVar16 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar16);
            }
            l52Var.h().put("copy", new a2f("copy", rf0VarArr19, gadVar16, new t0()));
            pwf pwfVarF15 = l52Var.f();
            rf0 rf0Var27 = (rf0) tf0.a().get(new Pair(fwc.a(cls6), bool2));
            if (rf0Var27 == null) {
                rf0Var27 = new rf0(new xp8(fwc.a(cls6), false, u0.a), pwfVarF15);
            }
            rf0 rf0Var28 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemPath.class), bool2));
            if (rf0Var28 == null) {
                cls3 = cls6;
                rf0Var28 = new rf0(new xp8(fwc.a(FileSystemPath.class), false, v0.a), pwfVarF15);
            } else {
                cls3 = cls6;
            }
            rf0[] rf0VarArr20 = {rf0Var27, rf0Var28};
            gad gadVar17 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar17 == null) {
                gadVar17 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar17);
            }
            l52Var.h().put("move", new a2f("move", rf0VarArr20, gadVar17, new w0()));
            pwf pwfVarF16 = l52Var.f();
            rf0 rf0Var29 = (rf0) tf0.a().get(new Pair(fwc.a(cls3), bool2));
            if (rf0Var29 == null) {
                rf0Var29 = new rf0(new xp8(fwc.a(cls3), false, x0.a), pwfVarF16);
            }
            rf0 rf0Var30 = (rf0) tf0.a().get(new Pair(fwc.a(cls2), bool2));
            if (rf0Var30 == null) {
                cls4 = byte[].class;
                rf0Var30 = new rf0(new xp8(fwc.a(cls2), false, y0.a), pwfVarF16);
            } else {
                cls4 = byte[].class;
            }
            rf0[] rf0VarArr21 = {rf0Var29, rf0Var30};
            gad gadVar18 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar18 == null) {
                gadVar18 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar18);
            }
            l52Var.h().put("rename", new a2f("rename", rf0VarArr21, gadVar18, new z0()));
            c4c c4cVar4 = new c4c(l52Var.k().a(), "uri");
            rf0[] rf0VarArr22 = {new rf0(c4cVar4.c())};
            gad gadVar19 = (gad) had.a().get(fwc.a(cls2));
            if (gadVar19 == null) {
                gadVar19 = new gad(fwc.a(cls2));
                had.a().put(fwc.a(cls2), gadVar19);
            }
            a2f a2fVar4 = new a2f(str21, rf0VarArr22, gadVar19, new n1());
            a2fVar4.f(c4cVar4.c());
            a2fVar4.e();
            c4cVar4.a(a2fVar4);
            l52Var.g().put("uri", c4cVar4);
            c4c c4cVar5 = new c4c(l52Var.k().a(), "contentUri");
            rf0[] rf0VarArr23 = {new rf0(c4cVar5.c())};
            gad gadVar20 = (gad) had.a().get(fwc.a(Uri.class));
            if (gadVar20 == null) {
                gadVar20 = new gad(fwc.a(Uri.class));
                cls5 = cls2;
                had.a().put(fwc.a(Uri.class), gadVar20);
            } else {
                cls5 = cls2;
            }
            a2f a2fVar5 = new a2f(str21, rf0VarArr23, gadVar20, new o1());
            a2fVar5.f(c4cVar5.c());
            a2fVar5.e();
            c4cVar5.a(a2fVar5);
            l52Var.g().put("contentUri", c4cVar5);
            c4c c4cVar6 = new c4c(l52Var.k().a(), "md5");
            rf0[] rf0VarArr24 = {new rf0(c4cVar6.c())};
            gad gadVar21 = (gad) had.a().get(fwc.a(cls5));
            if (gadVar21 == null) {
                gadVar21 = new gad(fwc.a(cls5));
                had.a().put(fwc.a(cls5), gadVar21);
            }
            a2f a2fVar6 = new a2f(str21, rf0VarArr24, gadVar21, new p1());
            a2fVar6.f(c4cVar6.c());
            a2fVar6.e();
            c4cVar6.a(a2fVar6);
            l52Var.g().put("md5", c4cVar6);
            c4c c4cVar7 = new c4c(l52Var.k().a(), "size");
            rf0[] rf0VarArr25 = {new rf0(c4cVar7.c())};
            gad gadVar22 = (gad) had.a().get(fwc.a(Long.class));
            if (gadVar22 == null) {
                gadVar22 = new gad(fwc.a(Long.class));
                had.a().put(fwc.a(Long.class), gadVar22);
            }
            a2f a2fVar7 = new a2f(str21, rf0VarArr25, gadVar22, new q1());
            a2fVar7.f(c4cVar7.c());
            a2fVar7.e();
            c4cVar7.a(a2fVar7);
            l52Var.g().put("size", c4cVar7);
            c4c c4cVar8 = new c4c(l52Var.k().a(), "type");
            rf0[] rf0VarArr26 = {new rf0(c4cVar8.c())};
            gad gadVar23 = (gad) had.a().get(fwc.a(cls5));
            if (gadVar23 == null) {
                gadVar23 = new gad(fwc.a(cls5));
                str12 = "uri";
                had.a().put(fwc.a(cls5), gadVar23);
            } else {
                str12 = "uri";
            }
            a2f a2fVar8 = new a2f(str21, rf0VarArr26, gadVar23, new r1());
            a2fVar8.f(c4cVar8.c());
            a2fVar8.e();
            c4cVar8.a(a2fVar8);
            l52Var.g().put("type", c4cVar8);
            pwf pwfVarF17 = l52Var.f();
            rf0 rf0Var31 = (rf0) tf0.a().get(new Pair(fwc.a(cls3), bool2));
            if (rf0Var31 == null) {
                str13 = "rename";
                rf0Var31 = new rf0(new xp8(fwc.a(cls3), false, b1.a), pwfVarF17);
            } else {
                str13 = "rename";
            }
            rf0[] rf0VarArr27 = {rf0Var31};
            gad gadVar24 = (gad) had.a().get(fwc.a(FileSystemFileHandle.class));
            if (gadVar24 == null) {
                gadVar24 = new gad(fwc.a(FileSystemFileHandle.class));
                had.a().put(fwc.a(FileSystemFileHandle.class), gadVar24);
            }
            l52Var.h().put("open", new a2f("open", rf0VarArr27, gadVar24, new c1()));
            vx9Var.l().add(l52Var.j());
            yd8 yd8VarA4 = fwc.a(FileSystemFileHandle.class);
            sx9 sx9VarN2 = vx9Var.n();
            if (sx9VarN2 == null) {
                throw new IllegalArgumentException(str6);
            }
            gk0 gk0VarB2 = sx9VarN2.b();
            String simpleName2 = jh2.p(yd8VarA4).getSimpleName();
            rf0 rf0Var32 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemFileHandle.class), bool2));
            l52 l52Var4 = new l52(gk0VarB2, simpleName2, yd8VarA4, rf0Var32 == null ? new rf0(new xp8(fwc.a(FileSystemFileHandle.class), false, c.a), null) : rf0Var32, vx9Var.f());
            pwf pwfVarF18 = l52Var4.f();
            rf0 rf0Var33 = (rf0) tf0.a().get(new Pair(fwc.a(cls3), bool2));
            if (rf0Var33 == null) {
                rf0Var33 = new rf0(new xp8(fwc.a(cls3), false, s1.a), pwfVarF18);
            }
            rf0[] rf0VarArr28 = {rf0Var33};
            gad gadVar25 = (gad) had.a().get(fwc.a(Object.class));
            if (gadVar25 == null) {
                gadVar25 = new gad(fwc.a(Object.class));
                had.a().put(fwc.a(Object.class), gadVar25);
            }
            String str22 = str9;
            l52Var4.l(new a2f(str22, rf0VarArr28, gadVar25, new t1()));
            pwf pwfVarF19 = l52Var4.f();
            rf0 rf0Var34 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemFileHandle.class), bool2));
            if (rf0Var34 == null) {
                l52Var2 = l52Var4;
                str14 = "move";
                rf0Var34 = new rf0(new xp8(fwc.a(FileSystemFileHandle.class), false, u1.a), pwfVarF19);
            } else {
                l52Var2 = l52Var4;
                str14 = "move";
            }
            rf0 rf0Var35 = (rf0) tf0.a().get(new Pair(fwc.a(Integer.class), bool2));
            if (rf0Var35 == null) {
                str15 = "copy";
                rf0Var35 = new rf0(new xp8(fwc.a(Integer.class), false, v1.a), pwfVarF19);
            } else {
                str15 = "copy";
            }
            rf0[] rf0VarArr29 = {rf0Var34, rf0Var35};
            gad gadVar26 = (gad) had.a().get(fwc.a(cls4));
            if (gadVar26 == null) {
                gadVar26 = new gad(fwc.a(cls4));
                had.a().put(fwc.a(cls4), gadVar26);
            }
            l52Var2.h().put("readBytes", new a2f("readBytes", rf0VarArr29, gadVar26, new w1()));
            pwf pwfVarF20 = l52Var2.f();
            rf0 rf0Var36 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemFileHandle.class), bool2));
            if (rf0Var36 == null) {
                rf0Var36 = new rf0(new xp8(fwc.a(FileSystemFileHandle.class), false, x1.a), pwfVarF20);
            }
            rf0 rf0Var37 = (rf0) tf0.a().get(new Pair(fwc.a(cls4), bool2));
            if (rf0Var37 == null) {
                rf0Var37 = new rf0(new xp8(fwc.a(cls4), false, y1.a), pwfVarF20);
            }
            rf0[] rf0VarArr30 = {rf0Var36, rf0Var37};
            gad gadVar27 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar27 == null) {
                gadVar27 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar27);
            }
            l52Var2.h().put("writeBytes", new a2f("writeBytes", rf0VarArr30, gadVar27, new z1()));
            pwf pwfVarF21 = l52Var2.f();
            rf0 rf0Var38 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemFileHandle.class), bool2));
            if (rf0Var38 == null) {
                rf0Var38 = new rf0(new xp8(fwc.a(FileSystemFileHandle.class), false, a2.a), pwfVarF21);
            }
            rf0[] rf0VarArr31 = {rf0Var38};
            gad gadVar28 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar28 == null) {
                gadVar28 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar28);
            }
            l52Var2.h().put("close", new a2f("close", rf0VarArr31, gadVar28, new b2()));
            c4c c4cVar9 = new c4c(l52Var2.k().a(), "offset");
            rf0[] rf0VarArr32 = {new rf0(c4cVar9.c())};
            gad gadVar29 = (gad) had.a().get(fwc.a(Long.class));
            if (gadVar29 == null) {
                gadVar29 = new gad(fwc.a(Long.class));
                had.a().put(fwc.a(Long.class), gadVar29);
            }
            a2f a2fVar9 = new a2f(str21, rf0VarArr32, gadVar29, new c2());
            a2fVar9.f(c4cVar9.c());
            a2fVar9.e();
            c4cVar9.a(a2fVar9);
            l52Var2.g().put("offset", c4cVar9);
            rf0 rf0Var39 = new rf0(c4cVar9.c());
            rf0 rf0Var40 = (rf0) tf0.a().get(new Pair(fwc.a(Long.class), bool2));
            if (rf0Var40 == null) {
                rf0Var40 = new rf0(new xp8(fwc.a(Long.class), false, e2.a), null);
            }
            rf0[] rf0VarArr33 = {rf0Var39, rf0Var40};
            gad gadVar30 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar30 == null) {
                gadVar30 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar30);
            }
            a2f a2fVar10 = new a2f("set", rf0VarArr33, gadVar30, new f2());
            a2fVar10.f(c4cVar9.c());
            a2fVar10.e();
            c4cVar9.b(a2fVar10);
            c4c c4cVar10 = new c4c(l52Var2.k().a(), "size");
            rf0[] rf0VarArr34 = {new rf0(c4cVar10.c())};
            gad gadVar31 = (gad) had.a().get(fwc.a(Long.class));
            if (gadVar31 == null) {
                gadVar31 = new gad(fwc.a(Long.class));
                had.a().put(fwc.a(Long.class), gadVar31);
            }
            a2f a2fVar11 = new a2f(str21, rf0VarArr34, gadVar31, new d2());
            a2fVar11.f(c4cVar10.c());
            a2fVar11.e();
            c4cVar10.a(a2fVar11);
            l52Var2.g().put("size", c4cVar10);
            vx9Var.l().add(l52Var2.j());
            yd8 yd8VarA5 = fwc.a(FileSystemDirectory.class);
            sx9 sx9VarN3 = vx9Var.n();
            if (sx9VarN3 == null) {
                throw new IllegalArgumentException(str6);
            }
            gk0 gk0VarB3 = sx9VarN3.b();
            String simpleName3 = jh2.p(yd8VarA5).getSimpleName();
            rf0 rf0Var41 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemDirectory.class), bool2));
            l52 l52Var5 = new l52(gk0VarB3, simpleName3, yd8VarA5, rf0Var41 == null ? new rf0(new xp8(fwc.a(FileSystemDirectory.class), false, d.a), null) : rf0Var41, vx9Var.f());
            pwf pwfVarF22 = l52Var5.f();
            rf0 rf0Var42 = (rf0) tf0.a().get(new Pair(fwc.a(Uri.class), bool2));
            if (rf0Var42 == null) {
                rf0Var42 = new rf0(new xp8(fwc.a(Uri.class), false, g2.a), pwfVarF22);
            }
            rf0[] rf0VarArr35 = {rf0Var42};
            gad gadVar32 = (gad) had.a().get(fwc.a(Object.class));
            if (gadVar32 == null) {
                gadVar32 = new gad(fwc.a(Object.class));
                had.a().put(fwc.a(Object.class), gadVar32);
            }
            l52Var5.l(new a2f(str22, rf0VarArr35, gadVar32, new h2()));
            pwf pwfVarF23 = l52Var5.f();
            rf0 rf0Var43 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemDirectory.class), bool2));
            if (rf0Var43 == null) {
                rf0Var43 = new rf0(new xp8(fwc.a(FileSystemDirectory.class), false, s2.a), pwfVarF23);
            }
            rf0[] rf0VarArr36 = {rf0Var43};
            gad gadVar33 = (gad) had.a().get(fwc.a(DirectoryInfo.class));
            if (gadVar33 == null) {
                gadVar33 = new gad(fwc.a(DirectoryInfo.class));
                had.a().put(fwc.a(DirectoryInfo.class), gadVar33);
            }
            l52Var5.h().put(str20, new a2f(str20, rf0VarArr36, gadVar33, new b3()));
            pwf pwfVarF24 = l52Var5.f();
            rf0 rf0Var44 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemDirectory.class), bool2));
            if (rf0Var44 == null) {
                rf0Var44 = new rf0(new xp8(fwc.a(FileSystemDirectory.class), false, c3.a), pwfVarF24);
            }
            rf0[] rf0VarArr37 = {rf0Var44};
            gad gadVar34 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar34 == null) {
                gadVar34 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar34);
            }
            String str23 = str10;
            l52Var5.h().put(str23, new a2f(str23, rf0VarArr37, gadVar34, new d3()));
            pwf pwfVarF25 = l52Var5.f();
            rf0 rf0Var45 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemDirectory.class), bool2));
            if (rf0Var45 == null) {
                rf0Var45 = new rf0(new xp8(fwc.a(FileSystemDirectory.class), false, e3.a), pwfVarF25);
            }
            rf0 rf0Var46 = (rf0) tf0.a().get(new Pair(fwc.a(CreateOptions.class), bool4));
            if (rf0Var46 == null) {
                rf0Var46 = new rf0(new xp8(fwc.a(CreateOptions.class), true, f3.a), pwfVarF25);
            }
            rf0[] rf0VarArr38 = {rf0Var45, rf0Var46};
            gad gadVar35 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar35 == null) {
                gadVar35 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar35);
            }
            String str24 = str8;
            l52Var5.h().put(str24, new a2f(str24, rf0VarArr38, gadVar35, new g3()));
            pwf pwfVarF26 = l52Var5.f();
            rf0 rf0Var47 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemDirectory.class), bool2));
            if (rf0Var47 == null) {
                rf0Var47 = new rf0(new xp8(fwc.a(FileSystemDirectory.class), false, h3.a), pwfVarF26);
            }
            rf0 rf0Var48 = (rf0) tf0.a().get(new Pair(fwc.a(cls5), bool2));
            if (rf0Var48 == null) {
                rf0Var48 = new rf0(new xp8(fwc.a(cls5), false, i3.a), pwfVarF26);
            }
            rf0[] rf0VarArr39 = {rf0Var47, rf0Var48};
            gad gadVar36 = (gad) had.a().get(fwc.a(FileSystemDirectory.class));
            if (gadVar36 == null) {
                gadVar36 = new gad(fwc.a(FileSystemDirectory.class));
                had.a().put(fwc.a(FileSystemDirectory.class), gadVar36);
            }
            l52Var5.h().put("createDirectory", new a2f("createDirectory", rf0VarArr39, gadVar36, new i2()));
            pwf pwfVarF27 = l52Var5.f();
            rf0 rf0Var49 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemDirectory.class), bool2));
            if (rf0Var49 == null) {
                rf0Var49 = new rf0(new xp8(fwc.a(FileSystemDirectory.class), false, j2.a), pwfVarF27);
            }
            rf0 rf0Var50 = (rf0) tf0.a().get(new Pair(fwc.a(cls5), bool2));
            if (rf0Var50 == null) {
                rf0Var50 = new rf0(new xp8(fwc.a(cls5), false, k2.a), pwfVarF27);
            }
            rf0 rf0Var51 = (rf0) tf0.a().get(new Pair(fwc.a(cls5), bool4));
            if (rf0Var51 == null) {
                rf0Var51 = new rf0(new xp8(fwc.a(cls5), true, l2.a), pwfVarF27);
            }
            rf0[] rf0VarArr40 = {rf0Var49, rf0Var50, rf0Var51};
            gad gadVar37 = (gad) had.a().get(fwc.a(cls3));
            if (gadVar37 == null) {
                gadVar37 = new gad(fwc.a(cls3));
                had.a().put(fwc.a(cls3), gadVar37);
            }
            l52Var5.h().put("createFile", new a2f("createFile", rf0VarArr40, gadVar37, new m2()));
            c4c c4cVar11 = new c4c(l52Var5.k().a(), "exists");
            rf0[] rf0VarArr41 = {new rf0(c4cVar11.c())};
            gad gadVar38 = (gad) had.a().get(fwc.a(Boolean.class));
            if (gadVar38 == null) {
                gadVar38 = new gad(fwc.a(Boolean.class));
                had.a().put(fwc.a(Boolean.class), gadVar38);
            }
            a2f a2fVar12 = new a2f(str21, rf0VarArr41, gadVar38, new j3());
            a2fVar12.f(c4cVar11.c());
            a2fVar12.e();
            c4cVar11.a(a2fVar12);
            l52Var5.g().put("exists", c4cVar11);
            pwf pwfVarF28 = l52Var5.f();
            rf0 rf0Var52 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemDirectory.class), bool2));
            if (rf0Var52 == null) {
                rf0Var52 = new rf0(new xp8(fwc.a(FileSystemDirectory.class), false, n2.a), pwfVarF28);
            }
            rf0[] rf0VarArr42 = {rf0Var52};
            gad gadVar39 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar39 == null) {
                gadVar39 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar39);
            }
            String str25 = str7;
            l52Var5.h().put(str25, new a2f(str25, rf0VarArr42, gadVar39, new o2()));
            pwf pwfVarF29 = l52Var5.f();
            rf0 rf0Var53 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemDirectory.class), bool2));
            if (rf0Var53 == null) {
                rf0Var53 = new rf0(new xp8(fwc.a(FileSystemDirectory.class), false, p2.a), pwfVarF29);
            }
            rf0 rf0Var54 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemPath.class), bool2));
            if (rf0Var54 == null) {
                rf0Var54 = new rf0(new xp8(fwc.a(FileSystemPath.class), false, q2.a), pwfVarF29);
            }
            rf0[] rf0VarArr43 = {rf0Var53, rf0Var54};
            gad gadVar40 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar40 == null) {
                gadVar40 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar40);
            }
            String str26 = str15;
            l52Var5.h().put(str26, new a2f(str26, rf0VarArr43, gadVar40, new r2()));
            pwf pwfVarF30 = l52Var5.f();
            rf0 rf0Var55 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemDirectory.class), bool2));
            if (rf0Var55 == null) {
                rf0Var55 = new rf0(new xp8(fwc.a(FileSystemDirectory.class), false, t2.a), pwfVarF30);
            }
            rf0 rf0Var56 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemPath.class), bool2));
            if (rf0Var56 == null) {
                rf0Var56 = new rf0(new xp8(fwc.a(FileSystemPath.class), false, u2.a), pwfVarF30);
            }
            rf0[] rf0VarArr44 = {rf0Var55, rf0Var56};
            gad gadVar41 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar41 == null) {
                gadVar41 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar41);
            }
            String str27 = str14;
            l52Var5.h().put(str27, new a2f(str27, rf0VarArr44, gadVar41, new v2()));
            pwf pwfVarF31 = l52Var5.f();
            rf0 rf0Var57 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemDirectory.class), bool2));
            if (rf0Var57 == null) {
                rf0Var57 = new rf0(new xp8(fwc.a(FileSystemDirectory.class), false, w2.a), pwfVarF31);
            }
            rf0 rf0Var58 = (rf0) tf0.a().get(new Pair(fwc.a(cls5), bool2));
            if (rf0Var58 == null) {
                rf0Var58 = new rf0(new xp8(fwc.a(cls5), false, x2.a), pwfVarF31);
            }
            rf0[] rf0VarArr45 = {rf0Var57, rf0Var58};
            gad gadVar42 = (gad) had.a().get(fwc.a(j6g.class));
            if (gadVar42 == null) {
                gadVar42 = new gad(fwc.a(j6g.class));
                had.a().put(fwc.a(j6g.class), gadVar42);
            }
            String str28 = str13;
            l52Var5.h().put(str28, new a2f(str28, rf0VarArr45, gadVar42, new y2()));
            String str29 = str12;
            c4c c4cVar12 = new c4c(l52Var5.k().a(), str29);
            rf0[] rf0VarArr46 = {new rf0(c4cVar12.c())};
            gad gadVar43 = (gad) had.a().get(fwc.a(cls5));
            if (gadVar43 == null) {
                gadVar43 = new gad(fwc.a(cls5));
                had.a().put(fwc.a(cls5), gadVar43);
            }
            a2f a2fVar13 = new a2f(str21, rf0VarArr46, gadVar43, new k3());
            a2fVar13.f(c4cVar12.c());
            a2fVar13.e();
            c4cVar12.a(a2fVar13);
            l52Var5.g().put(str29, c4cVar12);
            c4c c4cVar13 = new c4c(l52Var5.k().a(), "size");
            rf0[] rf0VarArr47 = {new rf0(c4cVar13.c())};
            gad gadVar44 = (gad) had.a().get(fwc.a(Long.class));
            if (gadVar44 == null) {
                gadVar44 = new gad(fwc.a(Long.class));
                had.a().put(fwc.a(Long.class), gadVar44);
            }
            a2f a2fVar14 = new a2f(str21, rf0VarArr47, gadVar44, new l3());
            a2fVar14.f(c4cVar13.c());
            a2fVar14.e();
            c4cVar13.a(a2fVar14);
            l52Var5.g().put("size", c4cVar13);
            pwf pwfVarF32 = l52Var5.f();
            rf0 rf0Var59 = (rf0) tf0.a().get(new Pair(fwc.a(FileSystemDirectory.class), bool2));
            if (rf0Var59 == null) {
                rf0Var59 = new rf0(new xp8(fwc.a(FileSystemDirectory.class), false, z2.a), pwfVarF32);
            }
            rf0[] rf0VarArr48 = {rf0Var59};
            gad gadVar45 = (gad) had.a().get(fwc.a(List.class));
            if (gadVar45 == null) {
                gadVar45 = new gad(fwc.a(List.class));
                had.a().put(fwc.a(List.class), gadVar45);
            }
            l52Var5.h().put("listAsRecords", new a2f("listAsRecords", rf0VarArr48, gadVar45, new a3()));
            vx9Var.l().add(l52Var5.j());
            return vx9Var.k();
        } finally {
            jpf.d();
        }
    }
}
