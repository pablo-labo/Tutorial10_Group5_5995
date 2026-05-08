package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.fragment.app.g;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import defpackage.ns7;
import defpackage.sp7;
import defpackage.ur7;
import expo.modules.imagepicker.FailedToReadFileException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mr implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mr(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws FailedToReadFileException, IOException {
        int i = this.a;
        boolean z = true;
        b5g b5gVar = b5g.c;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                nr nrVar = (nr) obj2;
                zr7 zr7Var = new zr7((String) obj);
                nrVar.close();
                Function2<? super ps7, ? super zr7, j6g> function2 = nrVar.h0;
                if (function2 != null) {
                    function2.invoke(ps7.b, zr7Var);
                }
                return j6g.a;
            case 1:
                qr2 qr2Var = (qr2) obj;
                return ((b5g) obj2) == b5gVar ? "UI Loading Error" : qr2Var == qr2.b ? "Invalid Phone Number" : qr2Var == qr2.c ? "API Failure" : ViewUtilsKt.UNKNOWN_DESTINATION_URL;
            case 2:
                ((Function1) obj2).invoke((Locale) obj);
                return j6g.a;
            case 3:
                h64 h64Var = (h64) obj;
                h95 h95Var = (h95) ((g64) obj2).a.getValue();
                vfb vfbVar = h64Var.b;
                yn9 yn9VarB = vfbVar.b(h64Var.e);
                yn9VarB.getClass();
                cgb cgbVarC = vfbVar.c();
                cgbVarC.getClass();
                s15 s15Var = h64Var.c;
                ExecutorService executorServiceH = s15Var.h();
                executorServiceH.getClass();
                ExecutorService executorServiceC = s15Var.c();
                executorServiceC.getClass();
                return new po1(h95Var, yn9VarB, cgbVarC, executorServiceH, executorServiceC, h64Var.d);
            case 4:
                n76.h((g4a) obj2, (g4a) obj);
                return j6g.a;
            case 5:
                ((Function1) obj2).invoke(((vnd) obj).a);
                return j6g.a;
            case 6:
                File file = ((w07) obj).c;
                InputStream inputStreamOpenInputStream = ((ContentResolver) obj2).openInputStream(Uri.fromFile(file));
                if (inputStreamOpenInputStream == null) {
                    throw new FailedToReadFileException(file, null);
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        wg2.u(inputStreamOpenInputStream, byteArrayOutputStream);
                        byteArrayOutputStream.close();
                        inputStreamOpenInputStream.close();
                        return byteArrayOutputStream;
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
            case 7:
                e2b e2bVar = (e2b) obj2;
                e13 e13Var = (e13) obj;
                if (e2bVar.c()) {
                    u63.Y(e13Var, null, null, new l1b(e2bVar, null), 3);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj2).u();
                lr5VarU.getClass();
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", new ns7.h(null, new ozb((wu5) obj, 1)), ur7.a.a);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                x1c x1cVar = (x1c) obj2;
                ((gme) x1cVar.Y).setValue(b5gVar);
                ((gme) x1cVar.V).setValue(exb.a(x1cVar.o(), null, (cub) obj, null, null, false, false, false, null, false, false, false, false, false, false, 65533));
                return j6g.a;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("reg_promo_v1", "reg_promo_employer_link", null, null, 12));
                ((mhg) obj2).a((String) obj);
                return j6g.a;
        }
    }
}
