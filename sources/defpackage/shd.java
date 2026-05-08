package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class shd implements e6g {
    public final ReactApplicationContext a;
    public final Uri b;

    @uh3(c = "expo.modules.filesystem.unifiedfile.SAFDocumentFile$walkTopDown$1", f = "SAFDocumentFile.kt", l = {89, 92}, m = "invokeSuspend")
    public static final class a extends n7d implements Function2<t6e<? super shd>, lu2<? super j6g>, Object> {
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
            a aVar = shd.this.new a(lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(t6e<? super shd> t6eVar, lu2<? super j6g> lu2Var) {
            return ((a) create(t6eVar, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
        
            if (r11 != r2) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[RETURN] */
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
                if (r0 == 0) goto L89
                r3 = 2
                if (r0 == r1) goto L27
                if (r0 != r3) goto L20
                int r0 = r10.I$1
                int r4 = r10.I$0
                java.lang.Object r5 = r10.L$2
                shd r5 = (defpackage.shd) r5
                java.lang.Object r6 = r10.L$1
                m84[] r6 = (defpackage.m84[]) r6
                java.lang.Object r7 = r10.L$0
                t6e r7 = (defpackage.t6e) r7
                defpackage.r7d.b(r11)
                goto L84
            L20:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r10)
                r10 = 0
                return r10
            L27:
                java.lang.Object r0 = r10.L$0
                t6e r0 = (defpackage.t6e) r0
                defpackage.r7d.b(r11)
                shd r11 = defpackage.shd.this
                boolean r11 = r11.isDirectory()
                if (r11 == 0) goto L86
                shd r11 = defpackage.shd.this
                m84 r11 = r11.b()
                m84[] r11 = r11.o()
                if (r11 == 0) goto L86
                shd r4 = defpackage.shd.this
                int r5 = r11.length
                r6 = 0
                r7 = r0
                r0 = r5
                r5 = r4
                r4 = r6
                r6 = r11
            L4b:
                if (r4 >= r0) goto L86
                r11 = r6[r4]
                shd r8 = new shd
                com.facebook.react.bridge.ReactApplicationContext r9 = r5.a
                android.net.Uri r11 = r11.j()
                r11.getClass()
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
                if (r11 != r2) goto L7f
                goto L81
            L7f:
                j6g r11 = defpackage.j6g.a
            L81:
                if (r11 != r2) goto L84
                return r2
            L84:
                int r4 = r4 + r1
                goto L4b
            L86:
                j6g r10 = defpackage.j6g.a
                return r10
            L89:
                defpackage.r7d.b(r11)
                java.lang.Object r11 = r10.L$0
                t6e r11 = (defpackage.t6e) r11
                shd r0 = defpackage.shd.this
                r10.L$0 = r11
                r10.label = r1
                r11.a(r10, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: shd.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public shd(ReactApplicationContext reactApplicationContext, Uri uri) {
        uri.getClass();
        this.a = reactApplicationContext;
        this.b = uri;
    }

    @Override // defpackage.e6g
    public final Uri a() {
        return this.b;
    }

    public final m84 b() {
        Uri uri = this.b;
        List<String> pathSegments = uri.getPathSegments();
        pathSegments.getClass();
        String str = (String) z92.R0(0, pathSegments);
        if (str == null) {
            str = "tree";
        }
        boolean zEquals = str.equals("document");
        ReactApplicationContext reactApplicationContext = this.a;
        if (!zEquals) {
            return m84.g(reactApplicationContext, uri);
        }
        sge sgeVar = new sge();
        sgeVar.a = reactApplicationContext;
        sgeVar.b = uri;
        return sgeVar;
    }

    @Override // defpackage.e6g
    public final Uri c(gk0 gk0Var) {
        return this.b;
    }

    @Override // defpackage.e6g
    public final boolean delete() {
        return b().e();
    }

    @Override // defpackage.e6g
    public final e6g e(String str, String str2) {
        Uri uriJ;
        m84 m84VarD = b().d(str, str2);
        if (m84VarD == null || (uriJ = m84VarD.j()) == null) {
            return null;
        }
        return new shd(this.a, uriJ);
    }

    @Override // defpackage.e6g
    public final boolean exists() {
        return b().f();
    }

    @Override // defpackage.e6g
    public final r6e<shd> f() {
        return new u6e(new a(null));
    }

    @Override // defpackage.e6g
    public final Long getCreationTime() {
        return null;
    }

    @Override // defpackage.e6g
    public final String getFileName() {
        return b().h();
    }

    @Override // defpackage.e6g
    public final String getType() {
        return b().i();
    }

    @Override // defpackage.e6g
    public final e6g h(String str) {
        Uri uriJ;
        m84 m84VarC = b().c(str);
        if (m84VarC == null || (uriJ = m84VarC.j()) == null) {
            return null;
        }
        return new shd(this.a, uriJ);
    }

    @Override // defpackage.e6g
    public final boolean isDirectory() {
        return b().k();
    }

    @Override // defpackage.e6g
    public final boolean isFile() {
        return b().l();
    }

    @Override // defpackage.e6g
    public final long length() {
        return b().n();
    }

    @Override // defpackage.e6g
    public final List<e6g> m() {
        m84[] m84VarArrO = b().o();
        if (m84VarArrO == null) {
            return zr4.a;
        }
        ArrayList arrayList = new ArrayList(m84VarArrO.length);
        for (m84 m84Var : m84VarArrO) {
            Uri uriJ = m84Var.j();
            uriJ.getClass();
            arrayList.add(new shd(this.a, uriJ));
        }
        return arrayList;
    }

    @Override // defpackage.e6g
    public final boolean n() {
        return yid.c(b());
    }

    @Override // defpackage.e6g
    public final Long o() {
        return Long.valueOf(b().m());
    }

    @Override // defpackage.e6g
    public final OutputStream w() throws FileNotFoundException {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uri = this.b;
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        if (outputStreamOpenOutputStream != null) {
            return outputStreamOpenOutputStream;
        }
        r6.g(p6.d(uri, "Unable to open output stream for URI: "));
        return null;
    }

    @Override // defpackage.e6g
    public final InputStream x() throws FileNotFoundException {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uri = this.b;
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            return inputStreamOpenInputStream;
        }
        r6.g(p6.d(uri, "Unable to open output stream for URI: "));
        return null;
    }
}
