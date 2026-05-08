package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import defpackage.o17;
import defpackage.o7d;
import expo.modules.imagemanipulator.ImageLoaderNotFoundException;
import expo.modules.imagemanipulator.ImageLoadingFailedException;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.imagemanipulator.ImageManipulatorModule$createManipulatorContext$loader$1", f = "ImageManipulatorModule.kt", l = {150}, m = "invokeSuspend")
public final class u17 extends c1f implements Function1<lu2<? super Bitmap>, Object> {
    final /* synthetic */ Uri $url;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ w17 this$0;

    public static final class a implements o17.a {
        public final /* synthetic */ qw1 a;
        public final /* synthetic */ Uri b;

        public a(qw1 qw1Var, Uri uri) {
            this.a = qw1Var;
            this.b = uri;
        }

        @Override // o17.a
        public final void a(Bitmap bitmap) {
            this.a.resumeWith(bitmap);
        }

        @Override // o17.a
        public final void onFailure(Exception exc) {
            CodedException unexpectedException;
            CodedException codedException;
            String string = this.b.toString();
            string.getClass();
            if (exc instanceof CodedException) {
                codedException = (CodedException) exc;
            } else {
                if (exc instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) exc;
                    unexpectedException = new CodedException(codedException2.a(), codedException2.getMessage(), codedException2.getCause());
                } else {
                    unexpectedException = new UnexpectedException(exc);
                }
                codedException = unexpectedException;
            }
            this.a.resumeWith(new o7d.a(new ImageLoadingFailedException("Could not load the image: ".concat(string), codedException)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u17(w17 w17Var, Uri uri, lu2<? super u17> lu2Var) {
        super(1, lu2Var);
        this.this$0 = w17Var;
        this.$url = uri;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new u17(this.this$0, this.$url, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super Bitmap> lu2Var) {
        return ((u17) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        Object obj2 = null;
        if (i != 0) {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            return obj;
        }
        r7d.b(obj);
        try {
            obj2 = this.this$0.b().a.a.get(o17.class);
        } catch (Exception unused) {
        }
        o17 o17Var = (o17) obj2;
        if (o17Var == null) {
            throw new ImageLoaderNotFoundException();
        }
        Uri uri = this.$url;
        this.L$0 = o17Var;
        this.L$1 = uri;
        this.label = 1;
        qw1 qw1Var = new qw1(1, ewa.v(this));
        qw1Var.q();
        o17Var.a(uri.toString(), new a(qw1Var, uri));
        Object objP = qw1Var.p();
        g13 g13Var = g13.a;
        return objP == g13Var ? g13Var : objP;
    }
}
