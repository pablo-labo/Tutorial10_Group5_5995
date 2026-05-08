package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.o7d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class du0 implements e6g {
    public final ReactApplicationContext a;
    public final Uri b;
    public final String c;

    @uh3(c = "expo.modules.filesystem.unifiedfile.AssetFile$walkTopDown$1", f = "AssetFile.kt", l = {130, 136}, m = "invokeSuspend")
    public static final class a extends n7d implements Function2<t6e<? super du0>, lu2<? super j6g>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = du0.this.new a(lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(t6e<? super du0> t6eVar, lu2<? super j6g> lu2Var) {
            return ((a) create(t6eVar, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
        
            if (r11 != r2) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a3 A[RETURN] */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 1
                g13 r2 = defpackage.g13.a
                if (r0 == 0) goto La9
                r3 = 2
                if (r0 == r1) goto L28
                if (r0 != r3) goto L21
                int r0 = r10.I$1
                int r4 = r10.I$0
                java.lang.Object r5 = r10.L$2
                du0 r5 = (defpackage.du0) r5
                java.lang.Object r6 = r10.L$1
                java.lang.String[] r6 = (java.lang.String[]) r6
                java.lang.Object r7 = r10.L$0
                t6e r7 = (defpackage.t6e) r7
                defpackage.r7d.b(r11)
                goto La4
            L21:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r10)
                r10 = 0
                return r10
            L28:
                java.lang.Object r0 = r10.L$0
                t6e r0 = (defpackage.t6e) r0
                defpackage.r7d.b(r11)
                du0 r11 = defpackage.du0.this
                boolean r11 = r11.isDirectory()
                if (r11 == 0) goto La6
                du0 r11 = defpackage.du0.this
                com.facebook.react.bridge.ReactApplicationContext r11 = r11.a
                android.content.res.AssetManager r11 = r11.getAssets()
                du0 r4 = defpackage.du0.this
                java.lang.String r4 = r4.c
                java.lang.String[] r11 = r11.list(r4)
                if (r11 == 0) goto La6
                du0 r4 = defpackage.du0.this
                int r5 = r11.length
                r6 = 0
                r7 = r0
                r0 = r5
                r5 = r4
                r4 = r6
                r6 = r11
            L52:
                if (r4 >= r0) goto La6
                r11 = r6[r4]
                android.net.Uri r8 = r5.b
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r8)
                java.lang.String r8 = "/"
                r9.append(r8)
                r9.append(r11)
                java.lang.String r11 = r9.toString()
                java.lang.String r9 = "//"
                java.lang.String r11 = defpackage.wve.I(r11, r9, r8)
                android.net.Uri r11 = android.net.Uri.parse(r11)
                du0 r8 = new du0
                com.facebook.react.bridge.ReactApplicationContext r9 = r5.a
                r8.<init>(r9, r11)
                r6e r11 = r8.f()
                r10.L$0 = r7
                r10.L$1 = r6
                r10.L$2 = r5
                r10.I$0 = r4
                r10.I$1 = r0
                r10.label = r3
                u6e r11 = (defpackage.u6e) r11
                r7.getClass()
                kotlin.jvm.functions.Function2 r11 = r11.a
                s6e r11 = defpackage.q92.w(r11)
                java.lang.Object r11 = r7.b(r11, r10)
                if (r11 != r2) goto L9f
                goto La1
            L9f:
                j6g r11 = defpackage.j6g.a
            La1:
                if (r11 != r2) goto La4
                return r2
            La4:
                int r4 = r4 + r1
                goto L52
            La6:
                j6g r10 = defpackage.j6g.a
                return r10
            La9:
                defpackage.r7d.b(r11)
                java.lang.Object r11 = r10.L$0
                t6e r11 = (defpackage.t6e) r11
                du0 r0 = defpackage.du0.this
                r10.L$0 = r11
                r10.label = r1
                r11.a(r10, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: du0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public du0(ReactApplicationContext reactApplicationContext, Uri uri) {
        String strV0;
        uri.getClass();
        this.a = reactApplicationContext;
        this.b = uri;
        String path = uri.getPath();
        if (path == null || (strV0 = zve.v0(path, '/')) == null) {
            l5.q(p6.d(uri, "Invalid asset URI: "));
            throw null;
        }
        this.c = strV0;
    }

    @Override // defpackage.e6g
    public final Uri a() {
        return this.b;
    }

    @Override // defpackage.e6g
    public final Uri c(gk0 gk0Var) throws IOException {
        InputStream inputStreamX = x();
        try {
            File file = new File(this.a.getCacheDir(), "expo_shared_assets/" + this.b.getLastPathSegment());
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                wg2.u(inputStreamX, fileOutputStream);
                fileOutputStream.close();
                Uri uriC = new cv7(Uri.fromFile(file)).c(gk0Var);
                inputStreamX.close();
                return uriC;
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.e6g
    public final boolean delete() {
        throw new UnsupportedOperationException("Asset files are not writable and cannot be deleted");
    }

    @Override // defpackage.e6g
    public final e6g e(String str, String str2) {
        throw new UnsupportedOperationException("Asset files are not writable and cannot be created");
    }

    @Override // defpackage.e6g
    public final boolean exists() {
        return isDirectory() || isFile();
    }

    @Override // defpackage.e6g
    public final r6e<du0> f() {
        return new u6e(new a(null));
    }

    @Override // defpackage.e6g
    public final Long getCreationTime() {
        return null;
    }

    @Override // defpackage.e6g
    public final String getFileName() {
        return this.b.getLastPathSegment();
    }

    @Override // defpackage.e6g
    public final String getType() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(this.b.toString());
        fileExtensionFromUrl.getClass();
        if (fileExtensionFromUrl.length() <= 0) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    @Override // defpackage.e6g
    public final e6g h(String str) {
        throw new UnsupportedOperationException("Asset directories are not writable and cannot be created");
    }

    @Override // defpackage.e6g
    public final boolean isDirectory() throws IOException {
        String[] list = this.a.getAssets().list(this.c);
        if (list != null) {
            if (!(list.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.e6g
    public final boolean isFile() {
        Object aVar;
        try {
            c0h.q(this.a.getAssets().open(this.c), null);
            aVar = Boolean.TRUE;
        } catch (Throwable th) {
            aVar = new o7d.a(th);
        }
        if (o7d.a(aVar) != null) {
            aVar = Boolean.FALSE;
        }
        return ((Boolean) aVar).booleanValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:33|4|5|(4:(2:7|8)(8:9|10|42|17|18|37|19|(3:20|(1:22)(4:43|23|24|25)|31))|37|19|(4:20|(0)(0)|31|22))|42|17|18) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b A[Catch: all -> 0x0044, LOOP:0: B:20:0x0034->B:22:0x003b, LOOP_END, TryCatch #2 {all -> 0x0044, blocks: (B:19:0x0031, B:20:0x0034, B:22:0x003b, B:23:0x003e), top: B:37:0x0031, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003e A[SYNTHETIC] */
    @Override // defpackage.e6g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long length() {
        /*
            r7 = this;
            java.lang.String r0 = r7.c
            com.facebook.react.bridge.ReactApplicationContext r7 = r7.a
            r1 = 0
            android.content.res.AssetManager r3 = r7.getAssets()     // Catch: java.lang.Throwable -> L27
            android.content.res.AssetFileDescriptor r3 = r3.openFd(r0)     // Catch: java.lang.Throwable -> L27
            long r4 = r3.getLength()     // Catch: java.lang.Throwable -> L20
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L1a
            r3.close()     // Catch: java.lang.Throwable -> L27
            return r4
        L1a:
            j6g r4 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L20
            r3.close()     // Catch: java.lang.Throwable -> L27
            goto L27
        L20:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L22
        L22:
            r5 = move-exception
            defpackage.c0h.q(r3, r4)     // Catch: java.lang.Throwable -> L27
            throw r5     // Catch: java.lang.Throwable -> L27
        L27:
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch: java.lang.Throwable -> L4b
            java.io.InputStream r7 = r7.open(r0)     // Catch: java.lang.Throwable -> L4b
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L44
            r3 = r1
        L34:
            int r5 = r7.read(r0)     // Catch: java.lang.Throwable -> L44
            r6 = -1
            if (r5 == r6) goto L3e
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L44
            long r3 = r3 + r5
            goto L34
        L3e:
            j6g r0 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L44
            r7.close()     // Catch: java.lang.Throwable -> L4b
            return r3
        L44:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L46
        L46:
            r3 = move-exception
            defpackage.c0h.q(r7, r0)     // Catch: java.lang.Throwable -> L4b
            throw r3     // Catch: java.lang.Throwable -> L4b
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.du0.length():long");
    }

    @Override // defpackage.e6g
    public final List<e6g> m() throws IOException {
        ReactApplicationContext reactApplicationContext = this.a;
        AssetManager assets = reactApplicationContext.getAssets();
        String str = this.c;
        String[] list = assets.list(str);
        if (list == null) {
            return zr4.a;
        }
        ArrayList arrayList = new ArrayList(list.length);
        for (String str2 : list) {
            arrayList.add(new du0(reactApplicationContext, Uri.fromFile(new File(str, str2))));
        }
        return arrayList;
    }

    @Override // defpackage.e6g
    public final boolean n() {
        throw new UnsupportedOperationException("Asset files are not writable and cannot be deleted");
    }

    @Override // defpackage.e6g
    public final Long o() {
        return null;
    }

    @Override // defpackage.e6g
    public final OutputStream w() {
        throw new UnsupportedOperationException("Asset files are not writable");
    }

    @Override // defpackage.e6g
    public final InputStream x() throws IOException {
        InputStream inputStreamOpen = this.a.getAssets().open(this.c);
        inputStreamOpen.getClass();
        return inputStreamOpen;
    }
}
