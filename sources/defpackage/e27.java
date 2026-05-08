package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.c27;
import expo.modules.core.errors.ModuleNotFoundException;
import expo.modules.imagepicker.ImagePickerOptions;
import expo.modules.imagepicker.MediaType;
import expo.modules.imagepicker.MissingActivityToHandleIntent;
import expo.modules.kotlin.exception.Exceptions$PermissionsModuleNotFound;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le27;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e27 extends sx9 {
    public final ej9 c = new ej9(this);
    public lk0<bw1, c27> d;
    public lk0<i17, c27> e;
    public lk0<h73, c27> f;
    public u7b g;
    public boolean h;

    @uh3(c = "expo.modules.imagepicker.ImagePickerModule$definition$1$5$1", f = "ImagePickerModule.kt", l = {79}, m = "invokeSuspend")
    public static final class a extends c1f implements Function1<lu2<? super c27>, Object> {
        final /* synthetic */ bw1 $contractOptions;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bw1 bw1Var, lu2<? super a> lu2Var) {
            super(1, lu2Var);
            this.$contractOptions = bw1Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return e27.this.new a(this.$contractOptions, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super c27> lu2Var) {
            return ((a) create(lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            lk0<bw1, c27> lk0Var = e27.this.d;
            if (lk0Var == null) {
                wl7.g("cameraLauncher");
                throw null;
            }
            bw1 bw1Var = this.$contractOptions;
            this.label = 1;
            Object objA = lk0Var.a(bw1Var, this);
            g13 g13Var = g13.a;
            return objA == g13Var ? g13Var : objA;
        }
    }

    @uh3(c = "expo.modules.imagepicker.ImagePickerModule$definition$1$6$1", f = "ImagePickerModule.kt", l = {87}, m = "invokeSuspend")
    public static final class b extends c1f implements Function1<lu2<? super c27>, Object> {
        final /* synthetic */ i17 $contractOptions;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i17 i17Var, lu2<? super b> lu2Var) {
            super(1, lu2Var);
            this.$contractOptions = i17Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return e27.this.new b(this.$contractOptions, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super c27> lu2Var) {
            return ((b) create(lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            lk0<i17, c27> lk0Var = e27.this.e;
            if (lk0Var == null) {
                wl7.g("imageLibraryLauncher");
                throw null;
            }
            i17 i17Var = this.$contractOptions;
            this.label = 1;
            Object objA = lk0Var.a(i17Var, this);
            g13 g13Var = g13.a;
            return objA == g13Var ? g13Var : objA;
        }
    }

    @uh3(c = "expo.modules.imagepicker.ImagePickerModule$definition$1$8", f = "ImagePickerModule.kt", l = {101, 105, 109}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<hk0, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ e27 this$0;

        public static final class a<I extends Serializable, O> implements jk0 {
            public final /* synthetic */ e27 a;

            public a(e27 e27Var) {
                this.a = e27Var;
            }

            @Override // defpackage.jk0
            public final void a(Serializable serializable, Object obj) {
                c27 c27Var = (c27) obj;
                c27Var.getClass();
                e27.f(this.a, c27Var, ((bw1) serializable).a());
            }
        }

        public static final class b<I extends Serializable, O> implements jk0 {
            public final /* synthetic */ e27 a;

            public b(e27 e27Var) {
                this.a = e27Var;
            }

            @Override // defpackage.jk0
            public final void a(Serializable serializable, Object obj) {
                c27 c27Var = (c27) obj;
                c27Var.getClass();
                e27.f(this.a, c27Var, ((i17) serializable).a());
            }
        }

        /* JADX INFO: renamed from: e27$c$c, reason: collision with other inner class name */
        public static final class C0213c<I extends Serializable, O> implements jk0 {
            public final /* synthetic */ e27 a;

            public C0213c(e27 e27Var) {
                this.a = e27Var;
            }

            @Override // defpackage.jk0
            public final void a(Serializable serializable, Object obj) {
                c27 c27Var = (c27) obj;
                c27Var.getClass();
                e27.f(this.a, c27Var, ((h73) serializable).a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(lu2 lu2Var, e27 e27Var) {
            super(2, lu2Var);
            this.this$0 = e27Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            c cVar = new c(lu2Var, this.this$0);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hk0 hk0Var, lu2<? super j6g> lu2Var) {
            return ((c) create(hk0Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                g13 r5 = defpackage.g13.a
                if (r0 == 0) goto L37
                if (r0 == r4) goto L2b
                if (r0 == r3) goto L1f
                if (r0 != r2) goto L19
                java.lang.Object r10 = r10.L$0
                e27 r10 = (defpackage.e27) r10
                defpackage.r7d.b(r11)
                goto L9e
            L19:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r10)
                return r1
            L1f:
                java.lang.Object r0 = r10.L$1
                e27 r0 = (defpackage.e27) r0
                java.lang.Object r3 = r10.L$0
                hk0 r3 = (defpackage.hk0) r3
                defpackage.r7d.b(r11)
                goto L7c
            L2b:
                java.lang.Object r0 = r10.L$1
                e27 r0 = (defpackage.e27) r0
                java.lang.Object r4 = r10.L$0
                hk0 r4 = (defpackage.hk0) r4
                defpackage.r7d.b(r11)
                goto L5c
            L37:
                defpackage.r7d.b(r11)
                java.lang.Object r11 = r10.L$0
                hk0 r11 = (defpackage.hk0) r11
                e27 r0 = r10.this$0
                aw1 r6 = new aw1
                r6.<init>(r0)
                e27$c$a r7 = new e27$c$a
                e27 r8 = r10.this$0
                r7.<init>(r8)
                r10.L$0 = r11
                r10.L$1 = r0
                r10.label = r4
                java.lang.Object r4 = r11.a(r6, r7, r10)
                if (r4 != r5) goto L59
                goto L9a
            L59:
                r9 = r4
                r4 = r11
                r11 = r9
            L5c:
                lk0 r11 = (defpackage.lk0) r11
                r0.d = r11
                e27 r0 = r10.this$0
                h17 r11 = new h17
                r11.<init>(r0)
                e27$c$b r6 = new e27$c$b
                e27 r7 = r10.this$0
                r6.<init>(r7)
                r10.L$0 = r4
                r10.L$1 = r0
                r10.label = r3
                java.lang.Object r11 = r4.a(r11, r6, r10)
                if (r11 != r5) goto L7b
                goto L9a
            L7b:
                r3 = r4
            L7c:
                lk0 r11 = (defpackage.lk0) r11
                r0.e = r11
                e27 r11 = r10.this$0
                f73 r0 = new f73
                r0.<init>(r11)
                e27$c$c r4 = new e27$c$c
                e27 r6 = r10.this$0
                r4.<init>(r6)
                r10.L$0 = r11
                r10.L$1 = r1
                r10.label = r2
                java.lang.Object r10 = r3.a(r0, r4, r10)
                if (r10 != r5) goto L9b
            L9a:
                return r5
            L9b:
                r9 = r11
                r11 = r10
                r10 = r9
            L9e:
                lk0 r11 = (defpackage.lk0) r11
                r10.f = r11
                j6g r10 = defpackage.j6g.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: e27.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d implements Function2<Object[], p3c, j6g> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            h8b.i(e27.this.b().c(), p3cVar2, "android.permission.CAMERA");
            return j6g.a;
        }
    }

    public static final class e implements gu5<zf8> {
        public static final e a = new e();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(p3c.class);
        }
    }

    public static final class f implements Function1<Object[], j6g> {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            h8b.i(e27.this.b().c(), (p3c) objArr2[0], "android.permission.CAMERA");
            return j6g.a;
        }
    }

    public static final class g implements Function2<Object[], p3c, j6g> {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            h8b.e(e27.this.b().c(), p3cVar2, "android.permission.CAMERA");
            return j6g.a;
        }
    }

    public static final class h implements gu5<zf8> {
        public static final h a = new h();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(p3c.class);
        }
    }

    public static final class i implements Function1<Object[], j6g> {
        public i() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            h8b.e(e27.this.b().c(), (p3c) objArr2[0], "android.permission.CAMERA");
            return j6g.a;
        }
    }

    public static final class j implements gu5<zf8> {
        public static final j a = new j();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Boolean.TYPE);
        }
    }

    public static final class k implements Function2<Object[], p3c, j6g> {
        public k() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws Exceptions$PermissionsModuleNotFound {
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            boolean zBooleanValue = ((Boolean) objArr2[0]).booleanValue();
            e27 e27Var = e27.this;
            h8b h8bVarC = e27Var.b().c();
            if (h8bVarC == null) {
                throw new Exceptions$PermissionsModuleNotFound();
            }
            String[] strArrE = e27.e(e27Var, zBooleanValue);
            h8bVarC.b(new d27(p3cVar2, new WeakReference(e27Var.b().d()), e27Var), (String[]) Arrays.copyOf(strArrE, strArrE.length));
            return j6g.a;
        }
    }

    public static final class l implements gu5<zf8> {
        public static final l a = new l();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Boolean.TYPE);
        }
    }

    public static final class m implements Function2<Object[], p3c, j6g> {
        public m() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws Exceptions$PermissionsModuleNotFound {
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            boolean zBooleanValue = ((Boolean) objArr2[0]).booleanValue();
            e27 e27Var = e27.this;
            h8b h8bVarC = e27Var.b().c();
            if (h8bVarC == null) {
                throw new Exceptions$PermissionsModuleNotFound();
            }
            String[] strArrE = e27.e(e27Var, zBooleanValue);
            h8bVarC.d(new d27(p3cVar2, new WeakReference(e27Var.b().d()), e27Var), (String[]) Arrays.copyOf(strArrE, strArrE.length));
            return j6g.a;
        }
    }

    public static final class n implements gu5<zf8> {
        public static final n a = new n();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ImagePickerOptions.class);
        }
    }

    @uh3(c = "expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$Coroutine$2", f = "ImagePickerModule.kt", l = {272, 280}, m = "invokeSuspend")
    public static final class o extends c1f implements wu5<e13, Object[], lu2<? super Object>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e27 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(lu2 lu2Var, e27 e27Var) {
            super(3, lu2Var);
            this.this$0 = e27Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            ImagePickerOptions imagePickerOptions;
            File fileA;
            Throwable th;
            File file;
            Uri uriFromFile;
            int i = this.label;
            g13 g13Var = g13.a;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    ImagePickerOptions imagePickerOptions2 = (ImagePickerOptions) ((Object[]) this.L$0)[0];
                    e27 e27Var = this.this$0;
                    e27Var.getClass();
                    Intent intent = new Intent(imagePickerOptions2.getNativeMediaTypes().toCameraIntentAction());
                    if (intent.resolveActivity(e27Var.b().e().getApplication().getPackageManager()) == null) {
                        throw new MissingActivityToHandleIntent(l5.m("Failed to resolve activity to handle the intent of type '", intent.getType(), "'"), null);
                    }
                    e27 e27Var2 = this.this$0;
                    this.L$0 = imagePickerOptions2;
                    this.label = 1;
                    e27Var2.getClass();
                    qw1 qw1Var = new qw1(1, ewa.v(this));
                    qw1Var.q();
                    h8b h8bVarC = e27Var2.b().c();
                    if (h8bVarC == null) {
                        throw new ModuleNotFoundException("Permissions");
                    }
                    f27 f27Var = new f27(qw1Var);
                    String[] strArr = (String[]) ut0.i0(new String[]{Build.VERSION.SDK_INT < 29 ? "android.permission.WRITE_EXTERNAL_STORAGE" : null, "android.permission.CAMERA"}).toArray(new String[0]);
                    h8bVarC.b(f27Var, (String[]) Arrays.copyOf(strArr, strArr.length));
                    Object objP = qw1Var.p();
                    if (objP != g13Var) {
                        objP = j6g.a;
                    }
                    if (objP != g13Var) {
                        imagePickerOptions = imagePickerOptions2;
                    }
                    return g13Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    file = (File) this.L$0;
                    try {
                        r7d.b(obj);
                        file.delete();
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        file.delete();
                        throw th;
                    }
                }
                imagePickerOptions = (ImagePickerOptions) this.L$0;
                r7d.b(obj);
                ReactApplicationContext reactApplicationContextD = this.this$0.b().d();
                if (reactApplicationContextD == null) {
                    throw new IllegalArgumentException("React Application Context is null");
                }
                try {
                    uriFromFile = FileProvider.d(reactApplicationContextD, reactApplicationContextD.getPackageName() + ".ImagePickerFileProvider", fileA);
                    uriFromFile.getClass();
                } catch (Exception unused) {
                    uriFromFile = Uri.fromFile(fileA);
                    uriFromFile.getClass();
                }
                String string = uriFromFile.toString();
                string.getClass();
                bw1 cameraContractOptions = imagePickerOptions.toCameraContractOptions(string);
                e27 e27Var3 = this.this$0;
                a aVar = e27Var3.new a(cameraContractOptions, null);
                this.L$0 = fileA;
                this.label = 2;
                Object objG = e27.g(e27Var3, aVar, imagePickerOptions, this);
                if (objG != g13Var) {
                    obj = objG;
                    file = fileA;
                    file.delete();
                    return obj;
                }
                return g13Var;
            } catch (Throwable th3) {
                th = th3;
                file = fileA;
                file.delete();
                throw th;
            }
            fileA = j27.a(this.this$0.b().a(), imagePickerOptions.getNativeMediaTypes().toFileExtension());
        }

        @Override // defpackage.wu5
        public final Object q(e13 e13Var, Object[] objArr, lu2<? super Object> lu2Var) {
            o oVar = new o(lu2Var, this.this$0);
            oVar.L$0 = objArr;
            return oVar.invokeSuspend(j6g.a);
        }
    }

    public static final class p implements gu5<zf8> {
        public static final p a = new p();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ImagePickerOptions.class);
        }
    }

    @uh3(c = "expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$Coroutine$4", f = "ImagePickerModule.kt", l = {272}, m = "invokeSuspend")
    public static final class q extends c1f implements wu5<e13, Object[], lu2<? super Object>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e27 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(lu2 lu2Var, e27 e27Var) {
            super(3, lu2Var);
            this.this$0 = e27Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            ImagePickerOptions imagePickerOptions = (ImagePickerOptions) ((Object[]) this.L$0)[0];
            i17 imageLibraryContractOptions = imagePickerOptions.toImageLibraryContractOptions();
            e27 e27Var = this.this$0;
            b bVar = e27Var.new b(imageLibraryContractOptions, null);
            this.label = 1;
            Object objG = e27.g(e27Var, bVar, imagePickerOptions, this);
            g13 g13Var = g13.a;
            return objG == g13Var ? g13Var : objG;
        }

        @Override // defpackage.wu5
        public final Object q(e13 e13Var, Object[] objArr, lu2<? super Object> lu2Var) {
            q qVar = new q(lu2Var, this.this$0);
            qVar.L$0 = objArr;
            return qVar.invokeSuspend(j6g.a);
        }
    }

    @uh3(c = "expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$Coroutine$5", f = "ImagePickerModule.kt", l = {26}, m = "invokeSuspend")
    public static final class r extends c1f implements wu5<e13, Object[], lu2<? super Object>, Object> {
        int label;
        final /* synthetic */ e27 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(lu2 lu2Var, e27 e27Var) {
            super(3, lu2Var);
            this.this$0 = e27Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            e27 e27Var = this.this$0;
            u7b u7bVar = e27Var.g;
            if (u7bVar == null) {
                return null;
            }
            List<Pair<MediaType, Uri>> list = u7bVar.a;
            ImagePickerOptions imagePickerOptions = u7bVar.b;
            e27Var.g = null;
            ej9 ej9Var = e27Var.c;
            this.label = 1;
            Object objE = ej9Var.e(list, imagePickerOptions, this);
            g13 g13Var = g13.a;
            return objE == g13Var ? g13Var : objE;
        }

        @Override // defpackage.wu5
        public final Object q(e13 e13Var, Object[] objArr, lu2<? super Object> lu2Var) {
            return new r(lu2Var, this.this$0).invokeSuspend(j6g.a);
        }
    }

    public static final String[] e(e27 e27Var, boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            return new String[0];
        }
        return (String[]) ut0.i0(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", !z ? "android.permission.READ_EXTERNAL_STORAGE" : null}).toArray(new String[0]);
    }

    public static final void f(e27 e27Var, c27 c27Var, ImagePickerOptions imagePickerOptions) {
        e27Var.getClass();
        if (c27Var instanceof c27.c) {
            e27Var.g = new u7b(((c27.c) c27Var).a, imagePickerOptions);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
    
        if (r12 == r7) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(defpackage.e27 r9, kotlin.jvm.functions.Function1 r10, expo.modules.imagepicker.ImagePickerOptions r11, defpackage.pu2 r12) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e27.g(e27, kotlin.jvm.functions.Function1, expo.modules.imagepicker.ImagePickerOptions, pu2):java.lang.Object");
    }

    @Override // defpackage.sx9
    public final wx9 a() {
        Class cls;
        vx9 vx9Var;
        hb9 hb9Var;
        Boolean bool;
        qf0 ch7Var;
        Boolean bool2;
        qf0 ch7Var2;
        Trace.beginSection(jpf.g("[ExpoModulesCore] ".concat(e27.class + ".ModuleDefinition")));
        try {
            vx9 vx9Var2 = new vx9(this, 2);
            LinkedHashMap linkedHashMap = vx9Var2.f;
            vx9Var2.l = "ExponentImagePicker";
            hb9 hb9Var2 = tf0.a;
            iwc iwcVar = fwc.a;
            yd8 yd8VarB = iwcVar.b(Boolean.class);
            Boolean bool3 = Boolean.FALSE;
            Pair pair = new Pair(yd8VarB, bool3);
            hb9 hb9Var3 = tf0.a;
            rf0 rf0Var = (rf0) hb9Var3.get(pair);
            if (rf0Var == null) {
                rf0Var = new rf0(new xp8(iwcVar.b(Boolean.class), false, j.a), null);
            }
            linkedHashMap.put("requestMediaLibraryPermissionsAsync", new ev0("requestMediaLibraryPermissionsAsync", new rf0[]{rf0Var}, new k()));
            rf0 rf0Var2 = (rf0) hb9Var3.get(new Pair(iwcVar.b(Boolean.class), bool3));
            if (rf0Var2 == null) {
                rf0Var2 = new rf0(new xp8(iwcVar.b(Boolean.class), false, l.a), null);
            }
            linkedHashMap.put("getMediaLibraryPermissionsAsync", new ev0("getMediaLibraryPermissionsAsync", new rf0[]{rf0Var2}, new m()));
            boolean zEquals = p3c.class.equals(p3c.class);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            Class cls5 = Integer.TYPE;
            if (zEquals) {
                cls = ImagePickerOptions.class;
                vx9Var = vx9Var2;
                ch7Var = new ev0("requestCameraPermissionsAsync", new rf0[0], new d());
                hb9Var = hb9Var3;
                bool = bool3;
            } else {
                cls = ImagePickerOptions.class;
                vx9Var = vx9Var2;
                rf0 rf0Var3 = (rf0) hb9Var3.get(new Pair(iwcVar.b(p3c.class), bool3));
                if (rf0Var3 == null) {
                    hb9Var = hb9Var3;
                    bool = bool3;
                    rf0Var3 = new rf0(new xp8(iwcVar.b(p3c.class), false, e.a), null);
                } else {
                    hb9Var = hb9Var3;
                    bool = bool3;
                }
                rf0[] rf0VarArr = {rf0Var3};
                f fVar = new f();
                ch7Var = j6g.class.equals(cls5) ? new ch7("requestCameraPermissionsAsync", rf0VarArr, fVar) : j6g.class.equals(cls4) ? new hi1("requestCameraPermissionsAsync", rf0VarArr, fVar) : j6g.class.equals(cls3) ? new s84("requestCameraPermissionsAsync", rf0VarArr, fVar) : j6g.class.equals(cls2) ? new ci5("requestCameraPermissionsAsync", rf0VarArr, fVar) : j6g.class.equals(String.class) ? new zue("requestCameraPermissionsAsync", rf0VarArr, fVar) : new o7g("requestCameraPermissionsAsync", rf0VarArr, fVar);
            }
            linkedHashMap.put("requestCameraPermissionsAsync", ch7Var);
            if (p3c.class.equals(p3c.class)) {
                ch7Var2 = new ev0("getCameraPermissionsAsync", new rf0[0], new g());
                bool2 = bool;
            } else {
                bool2 = bool;
                hb9 hb9Var4 = hb9Var;
                rf0 rf0Var4 = (rf0) hb9Var4.get(new Pair(iwcVar.b(p3c.class), bool2));
                if (rf0Var4 == null) {
                    hb9Var = hb9Var4;
                    rf0Var4 = new rf0(new xp8(iwcVar.b(p3c.class), false, h.a), null);
                } else {
                    hb9Var = hb9Var4;
                }
                rf0[] rf0VarArr2 = {rf0Var4};
                i iVar = new i();
                ch7Var2 = j6g.class.equals(cls5) ? new ch7("getCameraPermissionsAsync", rf0VarArr2, iVar) : j6g.class.equals(cls4) ? new hi1("getCameraPermissionsAsync", rf0VarArr2, iVar) : j6g.class.equals(cls3) ? new s84("getCameraPermissionsAsync", rf0VarArr2, iVar) : j6g.class.equals(cls2) ? new ci5("getCameraPermissionsAsync", rf0VarArr2, iVar) : j6g.class.equals(String.class) ? new zue("getCameraPermissionsAsync", rf0VarArr2, iVar) : new o7g("getCameraPermissionsAsync", rf0VarArr2, iVar);
            }
            linkedHashMap.put("getCameraPermissionsAsync", ch7Var2);
            vx9 vx9Var3 = vx9Var;
            xu0 xu0VarA = vx9Var3.a("launchCameraAsync");
            String str = xu0VarA.a;
            pwf pwfVar = xu0VarA.b;
            Class cls6 = cls;
            hb9 hb9Var5 = hb9Var;
            rf0 rf0Var5 = (rf0) hb9Var5.get(new Pair(iwcVar.b(cls6), bool2));
            if (rf0Var5 == null) {
                rf0Var5 = new rf0(new xp8(iwcVar.b(cls6), false, n.a), pwfVar);
            }
            xu0VarA.c = new z0f(str, new rf0[]{rf0Var5}, new o(null, this));
            xu0 xu0VarA2 = vx9Var3.a("launchImageLibraryAsync");
            String str2 = xu0VarA2.a;
            pwf pwfVar2 = xu0VarA2.b;
            rf0 rf0Var6 = (rf0) hb9Var5.get(new Pair(iwcVar.b(cls6), bool2));
            if (rf0Var6 == null) {
                rf0Var6 = new rf0(new xp8(iwcVar.b(cls6), false, p.a), pwfVar2);
            }
            xu0VarA2.c = new z0f(str2, new rf0[]{rf0Var6}, new q(null, this));
            xu0 xu0VarA3 = vx9Var3.a("getPendingResultAsync");
            xu0VarA3.c = new z0f(xu0VarA3.a, new rf0[0], new r(null, this));
            vx9Var3.o = new c(null, this);
            return vx9Var3.k();
        } finally {
            Trace.endSection();
        }
    }
}
