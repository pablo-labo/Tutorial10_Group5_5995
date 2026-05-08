package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Base64;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.gg8;
import expo.modules.imagemanipulator.CropRect;
import expo.modules.imagemanipulator.FlipType;
import expo.modules.imagemanipulator.ImageFormat;
import expo.modules.imagemanipulator.ImageManipulatorContext;
import expo.modules.imagemanipulator.ImageRef;
import expo.modules.imagemanipulator.ImageWriteFailedException;
import expo.modules.imagemanipulator.ManipulateOptions;
import expo.modules.imagemanipulator.ResizeOptions;
import expo.modules.kotlin.exception.Exceptions$IllegalArgument;
import expo.modules.kotlin.exception.Exceptions$ReactContextLost;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.EitherOfThree;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw17;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo-image-manipulator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w17 extends sx9 {

    @uh3(c = "expo.modules.imagemanipulator.ImageManipulatorModule$definition$1$3$3$1", f = "ImageManipulatorModule.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ luc<String> $base64String;
        final /* synthetic */ int $compression;
        final /* synthetic */ ManipulateOptions $options;
        final /* synthetic */ String $path;
        final /* synthetic */ Bitmap $resultBitmap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ManipulateOptions manipulateOptions, Bitmap bitmap, int i, luc<String> lucVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$path = str;
            this.$options = manipulateOptions;
            this.$resultBitmap = bitmap;
            this.$compression = i;
            this.$base64String = lucVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$path, this.$options, this.$resultBitmap, this.$compression, this.$base64String, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws IOException {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            FileOutputStream fileOutputStream = new FileOutputStream(this.$path);
            ManipulateOptions manipulateOptions = this.$options;
            Bitmap bitmap = this.$resultBitmap;
            int i = this.$compression;
            luc<String> lucVar = this.$base64String;
            try {
                Bitmap.CompressFormat compressFormat = manipulateOptions.getFormat().getCompressFormat();
                bitmap.compress(compressFormat, i, fileOutputStream);
                if (manipulateOptions.getBase64()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(compressFormat, i, byteArrayOutputStream);
                        lucVar.element = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                        j6g j6gVar = j6g.a;
                        byteArrayOutputStream.close();
                    } finally {
                    }
                }
                j6g j6gVar2 = j6g.a;
                fileOutputStream.close();
                return j6g.a;
            } finally {
            }
        }
    }

    public static final class a0 implements gu5<zf8> {
        public static final a0 a = new a0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(FlipType.class);
        }
    }

    public static final class b implements gu5<zf8> {
        public static final b a = new b();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ImageManipulatorContext.class);
        }
    }

    public static final class b0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ImageManipulatorContext imageManipulatorContext = (ImageManipulatorContext) objArr2[0];
            imageManipulatorContext.Q(new rh5((FlipType) objArr2[1]));
            return imageManipulatorContext;
        }
    }

    public static final class c implements gu5<zf8> {
        public static final c a = new c();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ImageRef.class);
        }
    }

    public static final class d implements gu5<zf8> {
        public static final d a = new d();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            gg8 gg8Var = gg8.c;
            gg8[] gg8VarArr = {gg8.a.a(fwc.d(Uri.class)), gg8.a.a(fwc.e(SharedRef.class, gg8.a.a(fwc.d(Bitmap.class)))), gg8.a.a(fwc.e(SharedRef.class, gg8.a.a(fwc.d(Drawable.class))))};
            iwc iwcVar = fwc.a;
            return iwcVar.k(iwcVar.b(EitherOfThree.class), ut0.E0(gg8VarArr), false);
        }
    }

    public static final class e implements Function1<Object[], Object> {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws Exceptions$IllegalArgument {
            Bitmap bitmap;
            Object[] objArr2 = objArr;
            objArr2.getClass();
            EitherOfThree eitherOfThree = (EitherOfThree) objArr2[0];
            iwc iwcVar = fwc.a;
            iwcVar.b(Uri.class);
            eitherOfThree.getClass();
            boolean zB = eitherOfThree.b(0);
            w17 w17Var = w17.this;
            if (zB) {
                iwcVar.b(Uri.class);
                Object objA = eitherOfThree.a(0);
                objA.getClass();
                return new ImageManipulatorContext(w17Var.c(), new bb9(w17Var.b().e, new u17(w17Var, (Uri) objA, null)));
            }
            iwcVar.b(SharedRef.class);
            if (eitherOfThree.b(1)) {
                iwcVar.b(SharedRef.class);
                Object objA2 = eitherOfThree.a(1);
                objA2.getClass();
                return new ImageManipulatorContext(w17Var.c(), new bb9(w17Var.b().e, new v17((Bitmap) ((SharedRef) objA2).c, null)));
            }
            iwcVar.b(SharedRef.class);
            Object objA3 = eitherOfThree.a(2);
            objA3.getClass();
            Drawable drawable = (Drawable) ((SharedRef) objA3).c;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                throw new Exceptions$IllegalArgument("The drawable cannot be converted to a bitmap", null);
            }
            return new ImageManipulatorContext(w17Var.c(), new bb9(w17Var.b().e, new v17(bitmap, null)));
        }
    }

    public static final class f implements gu5<zf8> {
        public static final f a = new f();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ImageRef.class);
        }
    }

    public static final class g implements gu5<zf8> {
        public static final g a = new g();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(ManipulateOptions.class);
        }
    }

    @uh3(c = "expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$3", f = "ImageManipulatorModule.kt", l = {278}, m = "invokeSuspend")
    public static final class h extends c1f implements wu5<e13, Object[], lu2<? super Object>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ w17 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(lu2 lu2Var, w17 w17Var) {
            super(3, lu2Var);
            this.this$0 = w17Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            Bitmap bitmap;
            luc lucVar;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                Object[] objArr = (Object[]) this.L$0;
                Object obj2 = objArr[0];
                ManipulateOptions manipulateOptions = (ManipulateOptions) objArr[1];
                ImageRef imageRef = (ImageRef) obj2;
                if (manipulateOptions == null) {
                    manipulateOptions = new ManipulateOptions();
                }
                ManipulateOptions manipulateOptions2 = manipulateOptions;
                ReactApplicationContext reactApplicationContextD = this.this$0.b().d();
                if (reactApplicationContextD == null) {
                    throw new Exceptions$ReactContextLost();
                }
                ImageFormat format = manipulateOptions2.getFormat();
                format.getClass();
                File cacheDir = reactApplicationContextD.getCacheDir();
                String str2 = File.separator;
                File file = new File(cacheDir + str2 + "ImageManipulator");
                if (!file.isDirectory() && !file.mkdirs()) {
                    String path = file.getPath();
                    path.getClass();
                    throw new ImageWriteFailedException("Writing image data to the file has failed: ".concat(path), null);
                }
                String str3 = file + str2 + UUID.randomUUID() + format.getFileExtension();
                int compress = (int) (manipulateOptions2.getCompress() * 100.0d);
                Bitmap bitmap2 = (Bitmap) imageRef.c;
                luc lucVar2 = new luc();
                yr3 yr3VarL = u63.l(this.this$0.b().e, null, new a(str3, manipulateOptions2, bitmap2, compress, lucVar2, null), 3);
                this.L$0 = str3;
                this.L$1 = bitmap2;
                this.L$2 = lucVar2;
                this.label = 1;
                Object objO = yr3VarL.o(this);
                g13 g13Var = g13.a;
                if (objO == g13Var) {
                    return g13Var;
                }
                str = str3;
                bitmap = bitmap2;
                lucVar = lucVar2;
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lucVar = (luc) this.L$2;
                bitmap = (Bitmap) this.L$1;
                str = (String) this.L$0;
                r7d.b(obj);
            }
            return lc9.a0(new Pair("uri", Uri.fromFile(new File(str)).toString()), new Pair("width", new Integer(bitmap.getWidth())), new Pair("height", new Integer(bitmap.getHeight())), new Pair("base64", lucVar.element));
        }

        @Override // defpackage.wu5
        public final Object q(e13 e13Var, Object[] objArr, lu2<? super Object> lu2Var) {
            h hVar = new h(lu2Var, this.this$0);
            hVar.L$0 = objArr;
            return hVar.invokeSuspend(j6g.a);
        }
    }

    public static final class i implements Function1<Object[], Object> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Integer.valueOf(((Bitmap) ((ImageRef) objArr2[0]).c).getWidth());
        }
    }

    public static final class j implements Function1<Object[], Object> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Integer.valueOf(((Bitmap) ((ImageRef) objArr2[0]).c).getHeight());
        }
    }

    public static final class k implements gu5<zf8> {
        public static final k a = new k();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Uri.class);
        }
    }

    public static final class l implements Function1<Object[], Object> {
        public l() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Uri uri = (Uri) objArr2[0];
            w17 w17Var = w17.this;
            return new ImageManipulatorContext(w17Var.c(), new bb9(w17Var.b().e, new u17(w17Var, uri, null)));
        }
    }

    public static final class m implements gu5<zf8> {
        public static final m a = new m();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ImageManipulatorContext.class);
        }
    }

    @uh3(c = "expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$2", f = "ImageManipulatorModule.kt", l = {271}, m = "invokeSuspend")
    public static final class n extends c1f implements wu5<e13, Object[], lu2<? super Object>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ w17 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(lu2 lu2Var, w17 w17Var) {
            super(3, lu2Var);
            this.this$0 = w17Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                ImageManipulatorContext imageManipulatorContext = (ImageManipulatorContext) ((Object[]) this.L$0)[0];
                this.label = 1;
                obj = imageManipulatorContext.c.a(this);
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
            return new ImageRef((Bitmap) obj, this.this$0.c());
        }

        @Override // defpackage.wu5
        public final Object q(e13 e13Var, Object[] objArr, lu2<? super Object> lu2Var) {
            n nVar = new n(lu2Var, this.this$0);
            nVar.L$0 = objArr;
            return nVar.invokeSuspend(j6g.a);
        }
    }

    public static final class o implements gu5<zf8> {
        public static final o a = new o();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ImageManipulatorContext.class);
        }
    }

    public static final class p implements gu5<zf8> {
        public static final p a = new p();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(CropRect.class);
        }
    }

    public static final class q implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ImageManipulatorContext imageManipulatorContext = (ImageManipulatorContext) objArr2[0];
            imageManipulatorContext.Q(new bx1((CropRect) objArr2[1]));
            return imageManipulatorContext;
        }
    }

    public static final class r implements gu5<zf8> {
        public static final r a = new r();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ImageManipulatorContext.class);
        }
    }

    public static final class s implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ImageManipulatorContext imageManipulatorContext = (ImageManipulatorContext) objArr2[0];
            bb9 bb9Var = imageManipulatorContext.c;
            bb9Var.c.h(null);
            bb9Var.c = u63.l(bb9Var.a, null, new za9(bb9Var, null), 3);
            return imageManipulatorContext;
        }
    }

    public static final class t implements gu5<zf8> {
        public static final t a = new t();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ImageManipulatorContext.class);
        }
    }

    public static final class u implements gu5<zf8> {
        public static final u a = new u();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ResizeOptions.class);
        }
    }

    public static final class v implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ImageManipulatorContext imageManipulatorContext = (ImageManipulatorContext) objArr2[0];
            imageManipulatorContext.Q(new gm1((ResizeOptions) objArr2[1]));
            return imageManipulatorContext;
        }
    }

    public static final class w implements gu5<zf8> {
        public static final w a = new w();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ImageManipulatorContext.class);
        }
    }

    public static final class x implements gu5<zf8> {
        public static final x a = new x();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Float.TYPE);
        }
    }

    public static final class y implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ImageManipulatorContext imageManipulatorContext = (ImageManipulatorContext) objArr2[0];
            imageManipulatorContext.Q(new wfd(((Number) objArr2[1]).floatValue()));
            return imageManipulatorContext;
        }
    }

    public static final class z implements gu5<zf8> {
        public static final z a = new z();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(ImageManipulatorContext.class);
        }
    }

    @Override // defpackage.sx9
    public final wx9 a() {
        Class cls;
        Class cls2;
        rf0 rf0Var;
        Class cls3;
        Class cls4;
        Class cls5;
        rf0 rf0Var2;
        jpf.b("[ExpoModulesCore] ".concat(w17.class + ".ModuleDefinition"));
        try {
            vx9 vx9Var = new vx9(this);
            vx9Var.i("ExpoImageManipulator");
            pwf pwfVarF = vx9Var.f();
            hb9 hb9Var = tf0.a;
            yd8 yd8VarA = fwc.a(EitherOfThree.class);
            Boolean bool = Boolean.FALSE;
            rf0 rf0Var3 = (rf0) tf0.a().get(new Pair(yd8VarA, bool));
            if (rf0Var3 == null) {
                cls = ResizeOptions.class;
                cls2 = Uri.class;
                rf0Var3 = new rf0(new xp8(fwc.a(EitherOfThree.class), false, d.a), pwfVarF);
            } else {
                cls = ResizeOptions.class;
                cls2 = Uri.class;
            }
            rf0[] rf0VarArr = {rf0Var3};
            gad gadVar = (gad) had.a().get(fwc.a(ImageManipulatorContext.class));
            if (gadVar == null) {
                gadVar = new gad(fwc.a(ImageManipulatorContext.class));
                had.a().put(fwc.a(ImageManipulatorContext.class), gadVar);
            }
            vx9Var.h().put("manipulate", new a2f("manipulate", rf0VarArr, gadVar, new e()));
            yd8 yd8VarA2 = fwc.a(ImageManipulatorContext.class);
            sx9 sx9VarN = vx9Var.n();
            if (sx9VarN == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            gk0 gk0VarB = sx9VarN.b();
            rf0 rf0Var4 = (rf0) tf0.a().get(new Pair(fwc.a(ImageManipulatorContext.class), bool));
            if (rf0Var4 == null) {
                rf0Var = new rf0(new xp8(fwc.a(ImageManipulatorContext.class), false, b.a), null);
            } else {
                rf0Var = rf0Var4;
            }
            l52 l52Var = new l52(gk0VarB, "Context", yd8VarA2, rf0Var, vx9Var.f());
            pwf pwfVarF2 = l52Var.f();
            rf0 rf0Var5 = (rf0) tf0.a().get(new Pair(fwc.a(cls2), bool));
            if (rf0Var5 == null) {
                k kVar = k.a;
                cls3 = Object.class;
                yd8 yd8VarA3 = fwc.a(cls2);
                cls4 = ImageRef.class;
                rf0Var5 = new rf0(new xp8(yd8VarA3, false, kVar), pwfVarF2);
            } else {
                cls3 = Object.class;
                cls4 = ImageRef.class;
            }
            rf0[] rf0VarArr2 = {rf0Var5};
            gad gadVar2 = (gad) had.a().get(fwc.a(cls3));
            if (gadVar2 == null) {
                gadVar2 = new gad(fwc.a(cls3));
                had.a().put(fwc.a(cls3), gadVar2);
            }
            l52Var.l(new a2f("constructor", rf0VarArr2, gadVar2, new l()));
            pwf pwfVarF3 = l52Var.f();
            rf0 rf0Var6 = (rf0) tf0.a().get(new Pair(fwc.a(ImageManipulatorContext.class), bool));
            if (rf0Var6 == null) {
                rf0Var6 = new rf0(new xp8(fwc.a(ImageManipulatorContext.class), false, t.a), pwfVarF3);
            }
            rf0 rf0Var7 = (rf0) tf0.a().get(new Pair(fwc.a(cls), bool));
            if (rf0Var7 == null) {
                u uVar = u.a;
                yd8 yd8VarA4 = fwc.a(cls);
                cls5 = Integer.class;
                rf0Var7 = new rf0(new xp8(yd8VarA4, false, uVar), pwfVarF3);
            } else {
                cls5 = Integer.class;
            }
            rf0[] rf0VarArr3 = {rf0Var6, rf0Var7};
            gad gadVar3 = (gad) had.a().get(fwc.a(ImageManipulatorContext.class));
            if (gadVar3 == null) {
                gadVar3 = new gad(fwc.a(ImageManipulatorContext.class));
                had.a().put(fwc.a(ImageManipulatorContext.class), gadVar3);
            }
            l52Var.h().put("resize", new a2f("resize", rf0VarArr3, gadVar3, new v()));
            pwf pwfVarF4 = l52Var.f();
            rf0 rf0Var8 = (rf0) tf0.a().get(new Pair(fwc.a(ImageManipulatorContext.class), bool));
            if (rf0Var8 == null) {
                rf0Var8 = new rf0(new xp8(fwc.a(ImageManipulatorContext.class), false, w.a), pwfVarF4);
            }
            rf0 rf0Var9 = (rf0) tf0.a().get(new Pair(fwc.a(Float.class), bool));
            if (rf0Var9 == null) {
                rf0Var9 = new rf0(new xp8(fwc.a(Float.class), false, x.a), pwfVarF4);
            }
            rf0[] rf0VarArr4 = {rf0Var8, rf0Var9};
            gad gadVar4 = (gad) had.a().get(fwc.a(ImageManipulatorContext.class));
            if (gadVar4 == null) {
                gadVar4 = new gad(fwc.a(ImageManipulatorContext.class));
                had.a().put(fwc.a(ImageManipulatorContext.class), gadVar4);
            }
            l52Var.h().put("rotate", new a2f("rotate", rf0VarArr4, gadVar4, new y()));
            pwf pwfVarF5 = l52Var.f();
            rf0 rf0Var10 = (rf0) tf0.a().get(new Pair(fwc.a(ImageManipulatorContext.class), bool));
            if (rf0Var10 == null) {
                rf0Var10 = new rf0(new xp8(fwc.a(ImageManipulatorContext.class), false, z.a), pwfVarF5);
            }
            rf0 rf0Var11 = (rf0) tf0.a().get(new Pair(fwc.a(FlipType.class), bool));
            if (rf0Var11 == null) {
                rf0Var11 = new rf0(new xp8(fwc.a(FlipType.class), false, a0.a), pwfVarF5);
            }
            rf0[] rf0VarArr5 = {rf0Var10, rf0Var11};
            gad gadVar5 = (gad) had.a().get(fwc.a(ImageManipulatorContext.class));
            if (gadVar5 == null) {
                gadVar5 = new gad(fwc.a(ImageManipulatorContext.class));
                had.a().put(fwc.a(ImageManipulatorContext.class), gadVar5);
            }
            l52Var.h().put("flip", new a2f("flip", rf0VarArr5, gadVar5, new b0()));
            pwf pwfVarF6 = l52Var.f();
            rf0 rf0Var12 = (rf0) tf0.a().get(new Pair(fwc.a(ImageManipulatorContext.class), bool));
            if (rf0Var12 == null) {
                rf0Var12 = new rf0(new xp8(fwc.a(ImageManipulatorContext.class), false, o.a), pwfVarF6);
            }
            rf0 rf0Var13 = (rf0) tf0.a().get(new Pair(fwc.a(CropRect.class), bool));
            if (rf0Var13 == null) {
                rf0Var13 = new rf0(new xp8(fwc.a(CropRect.class), false, p.a), pwfVarF6);
            }
            rf0[] rf0VarArr6 = {rf0Var12, rf0Var13};
            gad gadVar6 = (gad) had.a().get(fwc.a(ImageManipulatorContext.class));
            if (gadVar6 == null) {
                gadVar6 = new gad(fwc.a(ImageManipulatorContext.class));
                had.a().put(fwc.a(ImageManipulatorContext.class), gadVar6);
            }
            l52Var.h().put("crop", new a2f("crop", rf0VarArr6, gadVar6, new q()));
            pwf pwfVarF7 = l52Var.f();
            rf0 rf0Var14 = (rf0) tf0.a().get(new Pair(fwc.a(ImageManipulatorContext.class), bool));
            if (rf0Var14 == null) {
                rf0Var14 = new rf0(new xp8(fwc.a(ImageManipulatorContext.class), false, r.a), pwfVarF7);
            }
            rf0[] rf0VarArr7 = {rf0Var14};
            gad gadVar7 = (gad) had.a().get(fwc.a(ImageManipulatorContext.class));
            if (gadVar7 == null) {
                gadVar7 = new gad(fwc.a(ImageManipulatorContext.class));
                had.a().put(fwc.a(ImageManipulatorContext.class), gadVar7);
            }
            l52Var.h().put("reset", new a2f("reset", rf0VarArr7, gadVar7, new s()));
            xu0 xu0VarA = l52Var.a("renderAsync");
            String strB = xu0VarA.b();
            pwf pwfVarA = xu0VarA.a();
            rf0 rf0Var15 = (rf0) tf0.a().get(new Pair(fwc.a(ImageManipulatorContext.class), bool));
            if (rf0Var15 == null) {
                rf0Var15 = new rf0(new xp8(fwc.a(ImageManipulatorContext.class), false, m.a), pwfVarA);
            }
            xu0VarA.c(new z0f(strB, new rf0[]{rf0Var15}, new n(null, this)));
            vx9Var.l().add(l52Var.j());
            yd8 yd8VarA5 = fwc.a(cls4);
            sx9 sx9VarN2 = vx9Var.n();
            if (sx9VarN2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            gk0 gk0VarB2 = sx9VarN2.b();
            rf0 rf0Var16 = (rf0) tf0.a().get(new Pair(fwc.a(cls4), bool));
            if (rf0Var16 == null) {
                rf0Var2 = new rf0(new xp8(fwc.a(cls4), false, c.a), null);
            } else {
                rf0Var2 = rf0Var16;
            }
            l52 l52Var2 = new l52(gk0VarB2, "Image", yd8VarA5, rf0Var2, vx9Var.f());
            c4c c4cVar = new c4c(l52Var2.k().a(), "width");
            rf0[] rf0VarArr8 = {new rf0(c4cVar.c())};
            gad gadVar8 = (gad) had.a().get(fwc.a(cls5));
            if (gadVar8 == null) {
                gadVar8 = new gad(fwc.a(cls5));
                had.a().put(fwc.a(cls5), gadVar8);
            }
            a2f a2fVar = new a2f("get", rf0VarArr8, gadVar8, new i());
            a2fVar.f(c4cVar.c());
            a2fVar.e();
            c4cVar.a(a2fVar);
            l52Var2.g().put("width", c4cVar);
            c4c c4cVar2 = new c4c(l52Var2.k().a(), "height");
            rf0[] rf0VarArr9 = {new rf0(c4cVar2.c())};
            gad gadVar9 = (gad) had.a().get(fwc.a(cls5));
            if (gadVar9 == null) {
                gadVar9 = new gad(fwc.a(cls5));
                had.a().put(fwc.a(cls5), gadVar9);
            }
            a2f a2fVar2 = new a2f("get", rf0VarArr9, gadVar9, new j());
            a2fVar2.f(c4cVar2.c());
            a2fVar2.e();
            c4cVar2.a(a2fVar2);
            l52Var2.g().put("height", c4cVar2);
            xu0 xu0VarA2 = l52Var2.a("saveAsync");
            String strB2 = xu0VarA2.b();
            pwf pwfVarA2 = xu0VarA2.a();
            rf0 rf0Var17 = (rf0) tf0.a().get(new Pair(fwc.a(cls4), bool));
            if (rf0Var17 == null) {
                rf0Var17 = new rf0(new xp8(fwc.a(cls4), false, f.a), pwfVarA2);
            }
            rf0 rf0Var18 = (rf0) tf0.a().get(new Pair(fwc.a(ManipulateOptions.class), Boolean.TRUE));
            if (rf0Var18 == null) {
                rf0Var18 = new rf0(new xp8(fwc.a(ManipulateOptions.class), true, g.a), pwfVarA2);
            }
            xu0VarA2.c(new z0f(strB2, new rf0[]{rf0Var17, rf0Var18}, new h(null, this)));
            vx9Var.l().add(l52Var2.j());
            return vx9Var.k();
        } finally {
            jpf.d();
        }
    }
}
